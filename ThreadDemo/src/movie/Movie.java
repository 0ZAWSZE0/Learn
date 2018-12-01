package movie;
/**
 * µÁ”∞¿‡
 * @author Administrator
 *
 */
public class Movie {
	private String name;
	private String info;
	private boolean flag = true;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	public synchronized void set(String name,String info ) {
		if(!flag) {
			try {
				super.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.name = name;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.info = info;
		flag = false;
		super.notify();
	}
	
	public synchronized	 void get() {
		if(flag) {
			try {
				super.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(this.getName()+"-"+this.getInfo());
		flag = true;
		super.notify();
	}
	
}
