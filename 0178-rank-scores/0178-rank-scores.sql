# Write your MySQL query statement below
-- The DENSE_RANK() function is a SQL window function that assigns a rank to each row within a result set partition without skipping any ranking numbers when ties occur.
SELECT score ,
       DENSE_RANK() OVER (ORDER BY score DESC) as 'rank'
FROM Scores;