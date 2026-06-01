# Write your MySQL query statement below
-- approach 1 

-- SELECT 
--     (
--     SELECT DISTINCT salary
--     FROM Employee
--     ORDER BY SALARY DESC
--     LIMIT 1 OFFSET 1
--     ) AS SecondHighestSalary;

-- approach 2

SELECT MAX(salary) as SecondHighestSalary 
FROM Employee
WHERE salary < (SELECT MAX(Salary) FROM Employee);