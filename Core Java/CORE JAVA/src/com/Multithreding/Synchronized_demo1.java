package com.Multithreding;
//as we have only one object d they need to wait for complete
class Display
{
	public synchronized void wish(String name)
	{
		for(int i=1;i<10;i++)
		{
			System.out.print("GOOD MORNING: ");
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}

class MyThread12 extends Thread
{
	Display d;
	String name;
	public MyThread12(Display d,String name)
	{
		this.d=d;
		this.name=name;
		
	}
	public void run()
	{
		d.wish(name);
	}
}

public class Synchronized_demo1 
{
	public static void main(String[] args) 
	{
		Display d=new Display();
		MyThread12 mt=new MyThread12(d,"SHUBHAM");
		MyThread12 mt1=new MyThread12(d,"KARTIK");
		mt.start();
		mt1.start();
		
		
		
	}

}
