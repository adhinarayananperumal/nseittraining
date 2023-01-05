select c.cus_id , cus_name , balance from cus c , cus_account_det a where 
c.cus_id = a.cus_id and a.balance>50000
