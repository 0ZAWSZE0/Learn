package scheduledThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Test {
	public static void main(String[] args) {
		ScheduledExecutorService tpool = Executors.newScheduledThreadPool(3);
		System.out.println("*********��ʼִ��*********");
		tpool.scheduleAtFixedRate(new MyRunnable(), 5, 2, TimeUnit.SECONDS);
		
		
	}
}

class MyRunnable implements Runnable{
	

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+":"+"��ʱ5sִ��,ÿ2sִ��һ��!");
	}
	
}

