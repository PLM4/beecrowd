select p.id, p.name from products p
inner join categories cat on p.id_categories = cat.id
where cat.name like 'super%'