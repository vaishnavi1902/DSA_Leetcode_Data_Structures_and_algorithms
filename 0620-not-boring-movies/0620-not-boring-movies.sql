# Write your MySQL query statement below
select id, movie, description, rating 
from Cinema
Where description != 'boring' AND id%2!=0
order by rating desc;