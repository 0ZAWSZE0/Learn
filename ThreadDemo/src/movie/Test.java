package movie;

public class Test {
	public static void main(String[] args) {
		Movie movie = new Movie();
		Thread pThread = new Thread(new Producer(movie));
		Thread cThread = new Thread(new Consumer(movie));
		pThread.start();
		cThread.start();
	}

}
