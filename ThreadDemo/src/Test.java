 /**
  *Ä£ÄâËøËÀ                      
  * @author Administrator
  *
  */
public class Test {
	public static void main(String[] args) {
		Object bobby = new Object();
		Object duck = new Object();
		Thread tangtang = new Thread(new Tangtang(bobby,duck));
		Thread doudou = new Thread(new Doudou(bobby,duck));
		tangtang.start();
		doudou.start();
	}

}

class Tangtang implements Runnable{
	Object bobby ;
	Object duck ;
	public Tangtang(Object bobby, Object duck) {
		super();
		this.bobby = bobby;
		this.duck = duck;
	}
	@Override
	public void run() {
		synchronized(bobby) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (duck) {
				
			}
			System.out.println("ÌÇÌÇ°Ñ°Å±È¸ø¶¹¶¹Íæ!");
		}
	}
	
}

class Doudou implements Runnable{
	Object bobby = new Object();
	Object duck = new Object();
	
	public Doudou(Object bobby, Object duck) {
		super();
		this.bobby = bobby;
		this.duck = duck;
	}

	@Override
	public void run() {
		synchronized(duck) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (bobby) {
				
			}
			System.out.println("¶¹¶¹°ÑÍæ¾ßÑ¼¸øÌÇÌÇÍæ!");
		}
	}
	
}
