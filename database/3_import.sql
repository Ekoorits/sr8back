INSERT INTO smartrecipebook.meal_type (id, name) VALUES (default, 'Eelroog');
INSERT INTO smartrecipebook.meal_type (id, name) VALUES (default, 'Põhiroog');
INSERT INTO smartrecipebook.meal_type (id, name) VALUES (default, 'Suupiste');
INSERT INTO smartrecipebook.meal_type (id, name) VALUES (default, 'Magustoit');
INSERT INTO smartrecipebook.meal_type (id, name) VALUES (default, 'Jook');

INSERT INTO smartrecipebook.cooking_time (id, minutes_max) VALUES (default, 30);
INSERT INTO smartrecipebook.cooking_time (id, minutes_max) VALUES (default, 60);
INSERT INTO smartrecipebook.cooking_time (id, minutes_max) VALUES (default, 90);
INSERT INTO smartrecipebook.cooking_time (id, minutes_max) VALUES (default, 120);
INSERT INTO smartrecipebook.cooking_time (id, minutes_max) VALUES (default, 150);
INSERT INTO smartrecipebook.cooking_time (id, minutes_max) VALUES (default, 180);

INSERT INTO smartrecipebook.difficulty (id, level_name, level_number) VALUES (default, 'Lihtne', 1);
INSERT INTO smartrecipebook.difficulty (id, level_name, level_number) VALUES (default, 'Keskmine', 2);
INSERT INTO smartrecipebook.difficulty (id, level_name, level_number) VALUES (default, 'Raske', 3);

INSERT INTO smartrecipebook.measure_unit (id, name, description) VALUES (default, 'ml', 'Supilusikas on 10 ml');
INSERT INTO smartrecipebook.measure_unit (id, name) VALUES (default, 'g');

INSERT INTO smartrecipebook.role (id, name) VALUES (default, 'admin');
INSERT INTO smartrecipebook.role (id, name) VALUES (default, 'moderator');
INSERT INTO smartrecipebook.role (id, name) VALUES (default, 'customer');

INSERT INTO smartrecipebook.category (id, name, description) VALUES (default, 'Piimatooted','munad juust');
INSERT INTO smartrecipebook.category (id, name, description) VALUES (default, 'Värsked toidukaubad','puuviljad köögiviljad');
INSERT INTO smartrecipebook.category (id, name) VALUES (default, 'Kauasäilivad toidukaubad');
INSERT INTO smartrecipebook.category (id, name) VALUES (default, 'Kuivained');
INSERT INTO smartrecipebook.category (id, name) VALUES (default, 'Külmutatud toidukaubad');
INSERT INTO smartrecipebook.category (id, name, description) VALUES (default, 'Maiustused','snäkid kommid');
INSERT INTO smartrecipebook.category (id, name) VALUES (default, 'Alkohol');
INSERT INTO smartrecipebook.category (id, name) VALUES (default, 'Muu');

INSERT INTO smartrecipebook.user (id, role_id, username, password, status) VALUES (default, 1, 'Peeter', '1234', 'A');

INSERT INTO smartrecipebook.recipe (id, user_id, meal_type_id, cooking_time_id, difficulty_id, name, author, pax, instructions) VALUES (default, 2,1,3,2,'Makrooniga veiseliha', 'Enri Koorits', 10, 'aefefeswgfewfqewf');
INSERT INTO smartrecipebook.recipe (id, user_id, meal_type_id, cooking_time_id, difficulty_id, name, author, pax, instructions) VALUES (default, 2,1,3,2,'Piimasupp', 'Saber Kutter', 10, 'sgre5ety');
INSERT INTO smartrecipebook.recipe (id, user_id, meal_type_id, cooking_time_id, difficulty_id, name, author, pax, instructions) VALUES (default, 2,1,3,2,'Pada kalaga', 'Kaster Muhupea', 10, '1234dfsgraeg');
INSERT INTO smartrecipebook.recipe (id, user_id, meal_type_id, cooking_time_id, difficulty_id, name, author, pax, instructions) VALUES (default, 2,1,3,2,'Praekala', 'Kaster Muhupea', 7, '12efrewr34dfsgrag');





