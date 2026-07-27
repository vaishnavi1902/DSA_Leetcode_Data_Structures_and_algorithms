SELECT
    e.machine_id,
    round(AVG(e.timestamp - f.timestamp),3) AS processing_time
FROM Activity f
JOIN Activity e
    ON f.machine_id = e.machine_id
   AND f.process_id = e.process_id
WHERE f.activity_type = 'start'
  AND e.activity_type = 'end'
GROUP BY e.machine_id;