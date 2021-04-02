package chap12.sec08.exam01_threadgroup;

import java.util.Map;
import java.util.Set;

import chap12.sec07.exam01_daemon.AutoSaveThread;

public class ThreadInfoExample {
	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		ast.setName("autoSaveThread");
		ast.setDaemon(true);
		ast.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {
			System.out.println("Name:" + thread.getName() + (thread.isDaemon() ? "데몬" : "메인"));
			System.out.println();
		}
	}
}
 