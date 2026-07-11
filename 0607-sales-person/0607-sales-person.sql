# Write your MySQL query statement below
select s.name
from SalesPerson as s
left join Orders as o
on s.sales_id=o.sales_id
left join Company as c
on c.com_id=o.com_id
and c.name="RED"
group by s.sales_id,s.name
having count(c.com_id)=0;