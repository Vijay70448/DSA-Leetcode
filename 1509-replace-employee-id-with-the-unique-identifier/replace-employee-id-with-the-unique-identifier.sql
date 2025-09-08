# Write your MySQL query statement below
select et.unique_id , e.name from employees e left join employeeuni et on
e.id = et.id ;