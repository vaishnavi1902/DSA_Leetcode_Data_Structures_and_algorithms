# Write your MySQL query statement below
-- 
SELECT DISTINCT num as ConsecutiveNums
FROM Logs a
WHERE num = (SELECT num from Logs WHERE id = a.id + 1) 
      AND 
      num = (SELECT num from Logs WHERE id = a.id + 2);