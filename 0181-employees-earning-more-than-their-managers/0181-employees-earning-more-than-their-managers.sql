# Write your MySQL query statement below

SELECT 
    name AS Employee 
FROM 
    EMPLOYEE e
WHERE
    salary > (SELECT salary from EMPLOYEE WHERE id = e.managerId);