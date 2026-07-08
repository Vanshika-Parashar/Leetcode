# Write your MySQL query statement below
delete p from person as p
join person as p2
on p.Email=p2.Email
and p.id>p2.id;