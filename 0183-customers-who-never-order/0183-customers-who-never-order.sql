# Write your MySQL query statement below
SELECT 
    name as Customers 
FROM 
    Customers c
-- WHERE id > (SELECT customerId FROM Orders);
LEFT JOIN
    Orders o
ON 
    c.id = o.customerId 
WHERE o.customerId IS NULL;
