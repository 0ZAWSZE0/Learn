package singleTreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Test {
	public static void main(String[] args) {
		ExecutorService tpool = Executors.newSingleThreadExecutor();
		
		//在线程池中执行10个任务
		for (int i = 0; i < 10; i++) {
			tpool.execute(new MyRunnable(i));
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}

class MyRunnable implements Runnable{
	int num;
	
	public MyRunnable(int num) {
		super();
		this.num = num;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+":"+num);
	}
	
}

