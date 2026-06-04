# Write your MySQL query statement below
-- self join on email
-- delete from self join
-- keep smaller id record and delete the larger one
DELETE P1 FROM Person AS P1
INNER JOIN Person AS P2
ON P1.email = P2.email WHERE P1.id > P2.id;



