package com.learn;

public class LambdaThreadExamp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		Runnable rrun=new Runnable() {
//			@Override
//			public void run()
//			{
//				for(int i=0; i<=3;i++)
//				{
//					System.out.println("Hello World from Thread [" + Thread.currentThread().getName()+"]" );
//				}
//			}
//		};
		
		Runnable rrunlambda=() -> {
			
				for(int i=0; i<=3;i++)
				{
					System.out.println("Hello World from Thread [" + Thread.currentThread().getName()+"]" );
				}
			};
		
		Thread mythread =new Thread(rrunlambda);
		mythread.start();
		mythread.join();

	}

}
