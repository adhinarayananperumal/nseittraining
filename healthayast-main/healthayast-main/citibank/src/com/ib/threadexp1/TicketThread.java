package com.ib.threadexp1;

public class TicketThread implements Runnable{
	
	TickerBookingManagerImpl  tickerBookingManagerImpl;

	
	TicketThread(TickerBookingManagerImpl tickerBookingManagerImpl){
		this.tickerBookingManagerImpl = tickerBookingManagerImpl;
	}
	
	
	public void run(){
		String ticket =  tickerBookingManagerImpl.issueTicket();
		System.out.println("Ticket details : " + ticket);
	}

}
