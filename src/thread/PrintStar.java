package thread;

public class PrintStar {
	public static void main(String[] args) {
		
		//하나의 프로세스 내에서, 독립적으로 실행될 수 있는 세부 실행단위를 가리켜
		//[쓰레드]라고 함
		MyThread mt1=new MyThread(); //별도의 실행부 생성 ☆
		mt1.start(); //run()을 강제호출함
		
		MyThread2 mt2=new MyThread2(); //별도의 실행부 생성 ★
		mt2.start(); //run()을 강제호출함
		
		System.out.println("메인메서드에 의한 코드");
	
	}
}
