import java.util.*;
class NewThread implements Runnable
{
String name;
Thread t;
NewThread(String threadname)
{	
	name = threadname;
	t = new Thread(this , name);
	t.start();	
}

public void run() 
{
	try {
	while(true)
	{	System.out.println(name);
		Thread.sleep(2000);
	} }
	catch (InterruptedException e) {
	System.out.println(name + " Interrupted");
	}
}
}

class MainThread 
{
public static void main(String args[]) 
{
	new NewThread("Computer Science Engineering");
	try 
	{
		while(true){
		System.out.println("BMS College of Engineering");
		Thread.sleep(10000);
		Syste m.out.print("\n");
	}	
	} 
	catch (InterruptedException e) {
	System.out.println("BMS Interrupted");
	}

System.out.println("Main thread exiting.");

}

}