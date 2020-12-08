
public class Test {


	public static void main(String[] args) {
		
		Runnable r = new BeepTask();
		Thread thread = new Thread(r);
		
		thread.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("a");
			try{Thread.sleep(900);}catch(Exception e) {}

		}
	}
	
	
}
