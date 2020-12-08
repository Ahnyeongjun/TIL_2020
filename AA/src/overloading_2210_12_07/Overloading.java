//package overloading_2210_12_07;
//
//import java.awt.Toolkit;
//public class Overloading {
//	public static void main(String[] args) {
//		//리턴 타입은 달라도 상관 없음 (이름 동일, 타입 변수 달라야됨(타입,갯수,순서))
////		A a = new A();
////		a.run("a");
////		a.run("a",1);
////		a.run(2,"a");
//		
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask);
//		
////		for(int i=0;i<5;i++) {
////			toolkit.beep();
////			try{Thread.sleep(500);}catch(Exception e) {}
////		}
//		for(int i=0;i<5;i++) {
//			System.out.println("a");
//			try{Thread.sleep(900);}catch(Exception e) {}
//
//		}
//	}
//
//	
//}
//////class A{
//////	A(){
//////		System.out.println("A");
//////	}
//////	void a() {
//////		System.out.println("a");
//////	}
//////	void run(String a) {
//////		System.out.println(a);
//////	}
//////	void run(String a,int a1) {
//////		System.out.println(a+a1);
//////	}
//////	void run(int a1,String a) {
//////		System.out.println(a1+a);
//////	}
//////}
////////자바는 정적 필드의 초기화 작업을 위해 정적 블록을 제공
////////정적 블록은 ㅋ클래스가 메모리로 로딩될때 자동적으로 실행된다.
//////class B extends A{
//////	void A() {
//////		System.out.println("a");
//////	}
//////	void B() {
//////		System.out.println("B");
//////		a();
//////		super.a();
//////	}
//////	
//////}
