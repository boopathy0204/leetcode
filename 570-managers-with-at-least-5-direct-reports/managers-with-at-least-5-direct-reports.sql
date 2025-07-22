# Write your MySQL query statement below
select
    b.name
    from(
        select e.name , count(d.managerId) as c
        from  Employee e join Employee d  on e.id = d.managerId group  by d.managerId
    ) as b where b.c>4;