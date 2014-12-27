package XCTX;


/*
 * 需求：有一个学生，我可以对其属性设置值，也可以获取其属性值。请用线程间通信的案例来实现。
 * 
 * 资源：Student
 * 设置线程：SetThread
 * 获取线程:GetThread
 * 测试类：StudentDemo
 * 
 * 问题1：每个线程操作的是自己的那一个学生对象。
 * 怎么解决：让多个线程操作同一个学生对象。
 * 
 * 问题2：一次赋值和获取值的操作，数据都出现了问题。
 * 原因：线程随机性。
 * 
 * 问题3：线程操作的东西一般都是比较复杂的操作,所以我们加入了循环操作。
 * 但是这个时候后，产生了更大的问题：
 * 	A：	wq---23
 *		wq---23
 *		wq---23
 * 	同一个数据出现多次：CPU的一点点时间足够我们执行很多次的操作。
 * 
 * B：fym---23
 *	  wq---25
 *
 *	数据出现了问题：由于CPU的每一次执行点应该是一个原子性的操作。
 * 
 * 解决线程问题：
 * 	分析：真的是线程安全问题吗？
 * 	A：是多线程环境吗？ 是
 * 	B：有共享数据吗？ 有，s对象
 * 	C：度共享数据有多条语句操作吗？ s.name,s.age...
 * 
 * 	如何解决呢？把会出现问题的代码块给包起来。
 * 
 * 问题4：加入同步后，一样出现了数据问题。
 * 	A：多种线程操作的时候，必须是每一种线程都必须同步。
 * 	B：即使是给多种类型的线程加锁，也必须要求是同一把锁。
 * 
 * 到此问题就解决了。也就是说我们解决了线程安全问题。
 * */
public class StudentDemo {
	public static void main(String[] args) {
		//创建一个资源
		Student s = new Student();
		
		SetThread st = new SetThread(s);
		GetThread gt =new GetThread(s);
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);
		
		t1.start();
		t2.start();
	}
	
	
}
