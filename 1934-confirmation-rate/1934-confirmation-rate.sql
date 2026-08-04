# Write your MySQL query statement below
-- select s.user_id, count(c.action='confirmed') as conf
-- FROM signups s
-- LEFT JOIN confirmations c
-- using(user_id)
-- group by s.user_id;

select s.user_id, round(count(case when c.action='confirmed' then 1 end)/count(*),2) as confirmation_rate
from signups as s
left join confirmations as c
using(user_id)
group by s.user_id;