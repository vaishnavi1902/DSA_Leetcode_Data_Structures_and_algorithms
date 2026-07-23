# Write your MySQL query statement below

SELECT distinct author_id AS id FROM Views
where author_id = viewer_id 
ORDER BY author_id ASC;