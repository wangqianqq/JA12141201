package XC;

/*
 * 以前同步关键字的方式，可以实现同步，并且是我们比较常见的方式。
 * 但是，我们老是需要考虑它使用的是哪个锁对象，比较麻烦。
 * 所以呢，在JDK5以后，它就提供了一种新的方式：Lock锁对象。
 * 这种方式在以前的代码中比较少见。以后，我们在开发中，可以这样用。
 * 
 * */
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
	private int tickets = 20;
	
	//定义一个琐对象
	private Lock lock = new ReentrantLock();//向上转型
	@Override
	public void run() {
		while(true){
			
			//加锁
			lock.lock();
			
			if(tickets >0){
				try{
					Thread.sleep(10);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName()+"正在售第"+(tickets--)+"张票");
			}
			
			//释放锁
			lock.unlock();
		}
	}
}
