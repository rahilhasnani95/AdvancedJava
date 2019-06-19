package MultiThreadingPractice;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
// multi threading using runnable and using lambda expression
public class RunnableExample {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(() ->
		{
			for(int i = 0; i < 5; i++)
			{
				System.out.println("Hi" + i);
				try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
			}
		});
			
		Thread t2 = new Thread(() ->
		{
			for(int i = 0; i < 5; i++)
			{
				System.out.println("Hello" + i);
				try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
			}
		});
		
		t1.start(); 	
		try { Thread.sleep(10);	} catch (InterruptedException e) { e.printStackTrace(); }
		t2.start();
		
		//System.out.println(t1.isAlive());

		t1.join(); //waits for thread t1 to die and then joins with main thread
	//	System.out.println(t1.isAlive());

		t2.join();
		//System.out.println(t1.isAlive());

		System.out.println("Bye");
		
	
		
		
	}
}
