# Write your MySQL query statement below
SELECT EVENT_DAY AS day, emp_id, SUM(OUT_TIME-IN_TIME) AS total_time
FROM EMPLOYEES
GROUP BY EVENT_DAY,EMP_ID;