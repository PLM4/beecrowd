select cat.name, sum(p.amount) from products p
inner join categories cat on p.id_categories = cat.id
group by cat.id;