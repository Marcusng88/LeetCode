# Write your MySQL query statement below
select(
with ranked as (
    select * , dense_rank() over (order by salary desc ) as ranking
    from Employee
    )
    select salary from ranked where ranking = 2
    limit 1
)
 as SecondHighestSalary 