package thread;

//쓰레드를 정의함
public class MyThread2 extends Thread{
	//쓰레드로 구현할 코드는 반드시 이미 정해진 run메서드에 넣어야함
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("★");
		}
	}
}
