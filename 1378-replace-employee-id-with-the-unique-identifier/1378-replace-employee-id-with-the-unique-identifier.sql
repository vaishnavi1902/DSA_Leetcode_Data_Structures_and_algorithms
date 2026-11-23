# Write your MySQL query statement below
select e.unique_id, q.name 
FROM Employees q
LEFT JOIN EmployeeUNI e
ON e.id = q.id;