# Write your MySQL query statement below
-- Improved Improved approach
WITH CTE AS (SELECT * ,
       LEAD(NUM,1) OVER() AS FIRST_NUM,
       LEAD(NUM,2) OVER() AS SECOND_NUM
FROM Logs)

SELECT DISTINCT num AS ConsecutiveNums
FROM CTE
WHERE num = FIRST_NUM and num = SECOND_NUM;

-- My first approach
-- SELECT DISTINCT num as ConsecutiveNums
-- FROM Logs a
-- WHERE num = (SELECT num from Logs WHERE id = a.id + 1) 
--       AND 
--       num = (SELECT num from Logs WHERE id = a.id + 2);