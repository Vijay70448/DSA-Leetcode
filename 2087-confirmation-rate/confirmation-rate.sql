# Write your MySQL query statement below
select s.user_id ,coalesce(round(sum(c.action like 'confirmed')/count(*),2) ,0)
as confirmation_rate from signups s left join confirmations c 
on s.user_id =c.user_id group by s.user_id;