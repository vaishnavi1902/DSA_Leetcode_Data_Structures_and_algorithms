# Write your MySQL query statement below
-- select name
-- from employee
-- where id in  
-- (select managerid
-- from employee
-- group by managerid
-- having count(managerid)>=5) ;

select a.name
from employee a
left join employee b
on a.id = b.managerid
group by b.managerid
having count(b.managerid)>=5;