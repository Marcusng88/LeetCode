# Write your MySQL query statement below
SELECT e.name , b.bonus
FROM Employee e
left JOIN Bonus b
On e.empId = b.empid
where b.bonus < 1000 
or b.bonus is null;