package com.ib.threadexp1;

import java.util.ArrayList;
import java.util.List;

public class TickerBookingManagerImpl {

	List<String> ticketList = new ArrayList<String>();

	{
		ticketList.add("t1");
		ticketList.add("t2");
		ticketList.add("t3");
		ticketList.add("t4");
		ticketList.add("t5");
	}

	synchronized String issueTicket() {
		String tic = ticketList.get(0);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ticketList.remove(0);
		return tic;
	}

}
