    select ss.product_id,
    case
    when round(sum(s)/sum(units),2) is not null then round(sum(s)/sum(units),2)
    else 0
    end as average_price
    from(
    select p.product_id,p.price*u.units as s,u.units
    from Prices p left join UnitsSold u 
    on u.purchase_date between p.start_date and p.end_date and p.product_id = u.product_id
    ) as ss group by ss.product_id;  
