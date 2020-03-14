package com;

public class PrintEvenOddUsingThread {
	public static void main(String args[]) {
		EvenOdd even=new EvenOdd(1,20);
		Thread t=new Thread(new EvenThread(even));
		t.setName("EVEN thead");
		Thread t2= new Thread(new OddThread(even));
		t2.setName("ODD thread");
		t.start();
		t2.start();
	}

}
class EvenOdd {
	int max,start;
	public EvenOdd(int max, int start) {
		super();
		this.max = max;
		this.start = start;
	}
	
	public void printEven()
	{
		while(this.start<=this.max)
		{
			synchronized (this) {
				if(this.start%2!=0)
				{
					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else {
					System.out.println(Thread.currentThread()+" "+start);
				start++;
				this.notify();
				}
			}
		}
	}
	
	public void printOdd()
	{
		while(this.start<=this.max)
		{
			synchronized (this) {
				if(this.start%2==0)
				{
					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else {
					System.out.println(Thread.currentThread()+" "+start);
				start++;
				this.notify();
				}
			}
		}
	}
}

class OddThread implements Runnable
{
	EvenOdd odd;
	
	public OddThread(EvenOdd odd) {
		super();
		this.odd = odd;
	}

	@Override
	public void run() {
		odd.printOdd();
	}
	
}


class EvenThread implements Runnable
{
	EvenOdd odd;
	
	public EvenThread(EvenOdd odd) {
		super();
		this.odd = odd;
	}

	@Override
	public void run() {
		odd.printEven();
	}
	
}