# Write your MySQL query statement below
select email as Email
from person 
GROUP BY email
HAVING count(email) > 1;