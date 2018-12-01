package movie;
public class Consumer implements Runnable{
	private Movie movie = null;
	
	public Consumer(Movie movie) {
		super();
		this.movie = movie;
	}

	@Override
	public void run() {
		//—≠ª∑œ‘ æ50¥Œ
		for(int i=0;i<50;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.movie.get();
		}
	}

}
