package chap12.sec09.exam01_excute_submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteVsSubmitExample {
	public static void main(String[] args) throws InterruptedException {
		//스레드풀 생성
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		for(int i = 0; i < 10; i++) {
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					ThreadPoolExecutor tpe = (ThreadPoolExecutor) es;
					int poolSize = tpe.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println(" 총 스레드 개수:" + poolSize + "작업스레드 이름 " + threadName);
					
					int value = Integer.parseInt("삼");
				}
			};
			es.execute(runnable);
//			es.submit(runnable);
			
			Thread.sleep(10);
		}
		es.shutdown();
	}
}
