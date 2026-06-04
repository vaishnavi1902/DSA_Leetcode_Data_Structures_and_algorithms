# Write your MySQL query statement below
DELETE P1 FROM Person as P1 
INNER JOIN Person as p2
ON p1.email = p2.email AND p1.id > p2.id;


-- DELETE FROM Person
-- WHERE id NOT IN(
--     SELECT MIN(id)
--     FROM Person
--     GROUP BY email
-- );
