package exc1;

public class A {

	// 1. ArrayIndexOutOfBoundsException
	int a() {
//		try {}     
		//접속 코드
 		try {
			int[] arr = new int[3];
			System.out.println(arr[-1]); // 예외 발생
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught");
			e.printStackTrace();
		} finally {
			System.out.println("A a finally");
			return 2;
		}
	}

	// 2. ClassCastException
	void a2(Object o) {
		try {
			B b = (B) o; // 예외 발생
		} catch (ClassCastException e) {
			System.out.println("ClassCastException caught");
			e.printStackTrace();
		}
	}

	// 3. NullPointerException
	void a3(B b) {
		try {
			b.b(); // b가 null이면 예외 발생
		} catch (NullPointerException e) {
			System.out.println("NullPointerException caught");
			e.printStackTrace();
		}
	}

	// 4. 사용자 정의 예외 throw
	void a4() throws Nike {
		throw new Nike("no size");
	}

	// 5. 모든 예외를 한 번에 처리
	void a5() {
		try {
			int[] arr = new int[2];
			System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

			Object o = new Object();
			B b = (B) o; // ClassCastException

			B nullB = null;
			nullB.b(); // NullPointerException
		} catch (ArrayIndexOutOfBoundsException | ClassCastException | NullPointerException e) {
			System.out.println("예외 발생: " + e.getClass().getSimpleName());
			e.printStackTrace();
		}
	}
}



================================================
package exc1;

import java.io.IOException;

public class B implements Cloneable{
    void b() {}
    public void close() throws IOException {}
}

=========================================

  package exc1;

public class Exc2 {
	public static void main(String[] args) {
		A a = new A(); // 객체 생성

        a.a(); // ArrayIndexOutOfBoundsException 테스트
        a.a2(new Object()); // ClassCastException 테스트
        a.a3(null); // NullPointerException 테스트

        try {
            a.a4(); // 사용자 정의 예외 테스트
        } catch (Nike e) {
            System.out.println("Nike 예외 caught: " + e.getMessage());
        }

        a.a5(); // 모든 예외 한 번에 처리
    }
}
=================================================
  package exc1;

public class Nike extends Exception {
    public Nike(String message) {
        super(message);
    }
}

========================================

  package exc1;
public class Test {
public static void main(String[] args) {
	A a1= new A(2);
	A a2= new A(2);
//	boolean isSame =1==2;
	boolean isSame =a1.equals(a2);
	//객체가 같은지 확인하는
System.out.println(isSame);
}
}






ArithmeticException	0으로 나누기 등 수학 오류
ArrayIndexOutOfBoundsException	배열 인덱스 범위 초과
NullPointerException	null 객체를 접근할 때
NumberFormatException	숫자로 변환할 수 없는 문자열
IllegalArgumentException	잘못된 인자(값)를 메서드에 전달할 때
FileNotFoundException	파일이 존재하지 않을 때
IOException	입출력 중 일반적인 오류
ClassCastException	잘못된 형 변환
