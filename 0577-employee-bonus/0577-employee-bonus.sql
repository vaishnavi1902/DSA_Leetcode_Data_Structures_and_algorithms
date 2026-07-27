# Write your MySQL query statement below
select e.name ,b.bonus 
FROM Employee e
LEFT JOIN Bonus b
using(empId)
WHERE bonus < 1000 OR bonus is null;