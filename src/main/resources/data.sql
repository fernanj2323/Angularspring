insert into planets (name,rotation_period,orbital_period,diameter,climate,gravity,terrain,surface_water,population,created,click_count)values('Tatooine','23','304','10465','arid','1 standard','desert','1','200000', now(),'0');
insert into planets (name,rotation_period,orbital_period,diameter,climate,gravity,terrain,surface_water,population,created,click_count)values('Alderaan','24','364','12500','temperate','1 standard','grasslands, mountains','40','2000000000', now(),'0');
insert into planets (name,rotation_period,orbital_period,diameter,climate,gravity,terrain,surface_water,population,created,click_count)values('Yavin IV','24','4818','10200','temperate, tropical','1 standard','jungle, rainforests','8','1000', now(),'0');
insert into planets (name,rotation_period,orbital_period,diameter,climate,gravity,terrain,surface_water,population,created,click_count)values('Naboo','26','312','12120','temperate','1 standard','grassy hills, swamps, forests, mountains','12','4500000000', now(),'0');



insert into people (name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,created,PLANETS_ID,click_count)values('Luke Skywalker','172','77','blond','fair','blue','19BBY','male','https://swapi.co/api/planets/1/', now(),'1','0');
insert into people (name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,created,PLANETS_ID,click_count)values('C-3PO','167','72','n/a','gold','yellow','112BBY','n/a','https://swapi.co/api/planets/1/', now(),'1','0');
insert into people (name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,created,PLANETS_ID,click_count)values('R2-D2','96','322','n/a','white, blue','red','33BBY','n/a','https://swapi.co/api/planets/8/', now(),'4','0');
insert into people (name,height,mass,hair_color,skin_color,eye_color,birth_year,gender,homeworld,created,PLANETS_ID,click_count)values('Darth Vader','202','136','none','white, yellow','41.9BBY','male','n/a','https://swapi.co/api/planets/1/', now(),'1','0');