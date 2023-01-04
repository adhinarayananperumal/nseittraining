package expexample;

import java.net.UnknownServiceException;
import java.sql.SQLException;

public class BankTransaction {
	
	
	void doMoneyTransfer() throws UnknownServiceException, SQLException{
		
		//connect to database
		// connection failed so jvm throw expection( SQLException)
		throw new SQLException("Database error......");
		
		//connect to email server
		// email connection failed so jvm throw Exception
		 //throw new UnknownServiceException();
	}

}
