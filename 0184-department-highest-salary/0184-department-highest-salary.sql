# Write your MySQL query statement below
 -- display columns
SELECT d.name  AS Department, 
       e.name AS Employee , 
       e.salary as Salary
FROM Employee e 
-- join deparment and employee on common field
JOIN Department d ON e.departmentId = d.id 
-- filter only those who match
WHERE e.salary = (SELECT MAX(salary) 
                 FROM Employee
                 WHERE departmentId = e.departmentID);