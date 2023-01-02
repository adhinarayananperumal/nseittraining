package com.ib.threadexp1;

public class TicketThreadSynchronization {

	public static void main(String[] args) {

		TickerBookingManagerImpl  tickerBookingManagerImpl = new TickerBookingManagerImpl();

		
		Runnable rthread = new TicketThread(tickerBookingManagerImpl);
		Thread t = new Thread(rthread);
		t.start();
		
		
		Runnable rthread2 = new TicketThread(tickerBookingManagerImpl);
		Thread t2 = new Thread(rthread2);
		t2.start();
		
		
		
	}

}
