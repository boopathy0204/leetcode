# Write your MySQL query statement below
select 
    a.name,
    case 
    when d is null then 0
    else d
    end  as travelled_distance
    from(
        select name,sum(distance) as d
        from Users u left join Rides r 
        on u.id = r.user_id
        group by user_id 
    ) as a order by d desc ,name asc;