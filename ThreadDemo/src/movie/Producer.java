package movie;

public class Producer implements Runnable{
	private Movie movie = null;
	private boolean flag = true; 
	
	public Producer(Movie movie) {
		super();
		this.movie = movie;
	}

	public void run() {
		//ѭ��¼��50���Ӱ����,������Ӱ����¼��
		for(int i = 0; i<50; i++) {
			if(flag) {
				this.movie.set("���ν��","һ���ƻõ�Ӱ");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				flag = false;
			}else {
				this.movie.set("��͵�̰�","һ��3D��Ӱ");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				flag = true;
			}
			
		}
	}
	
}
