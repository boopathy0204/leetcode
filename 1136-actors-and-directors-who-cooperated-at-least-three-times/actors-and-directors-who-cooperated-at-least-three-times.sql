# Write your MySQL query statement below
select  
    actor_id,
    director_id
from(
    select actor_id,
    director_id
    from ActorDirector  
    group by 
        actor_id,director_id
        having count(*) >= 3
) as s;