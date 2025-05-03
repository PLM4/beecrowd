select p.name, pr.name, c.name from categories c
inner join products p on p.id_categories = c.id
inner join providers pr on p.id_providers = pr.id
where c.name = 'Imported' and pr.name = 'Sansul SA'