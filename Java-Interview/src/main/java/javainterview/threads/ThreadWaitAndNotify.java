package javainterview.threads;

class Calculator extends Thread {
	long sum;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 1000000; i++) {
				sum += i;	//499999500000
			}
			notify();
		}
	}
}

public class ThreadWaitAndNotify {
	public static void main(String[] args) {
		Calculator thread = new Calculator();
		thread.start();
		synchronized (thread) {			// If synchronized block is commented, then the output will be 0. Because, the main method is not waiting for thread to complete.
			try {										// When synchronized block is uncommented, thread.wait() is called and the code in thread is executed and then notify() is called.
				thread.wait();					// When notify() is called, the thread.wait() stops waiting for the thread to complete and starts executing the below stmts.
			} catch (InterruptedException e) {	
				e.printStackTrace();
			}
		}
		System.out.println(thread.sum);
	}
}
