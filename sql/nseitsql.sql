select c.cus_id , cus_name , balance from 
cus c , cus_account_det a 
where 
c.cus_id = a.cus_id and balance>50000

select * from 
cus c , cus_account_det a

select count(*) from 
cus c , cus_account_det a

select * from cus_account_det;

select * from cus;

select * from cus cs left join 
cus_account_det a 
on  
a.cus_id=cs.cus_id





select sum(balance) from cus_account_det;
