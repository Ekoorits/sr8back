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

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Piim', 1, 1, 'Lehmapiim toiduvalmistamiseks', '100 ml = 103 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Muna', 1, 2, 'Kanamuna', '1 tk = 55 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Juust', 1, 2, 'Kõva juust', '1 viil = 25 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Jahu', 4, 2, 'Nisujahu', '1 dl = 60 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Suhkur', 4, 2, 'Valge kristallsuhkur', '1 dl = 85 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Sool', 4, 2, 'Peen sool', '1 tl = 5 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Sealiha', 2, 2, 'Värske sealiha', '1 lõik ~ 120 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Kanafilee', 2, 2, 'Värske kanafilee', '1 filee = 150 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Porgand', 2, 2, 'Värske porgand', '1 tk = 50 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Kartul', 2, 2, 'Värske kartul', '1 tk = 70 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Õun', 2, 2, 'Värske õun', '1 tk = 120 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Riis', 4, 2, 'Valge pikateraline riis', '1 dl = 80 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Makaronid', 4, 2, 'Kuivad makaronid', '1 dl = 50 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Õli', 3, 1, 'Taimne toiduõli', '1 spl = 15 ml', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Või', 1, 2, 'Lehmakoor või', '1 sl = 14 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Külmutatud marjad', 5, 2, 'Külmutatud segumarjad', '1 dl = 60 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Šokolaad', 6, 2, 'Tume šokolaad', '1 tahvel = 100 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Tortilla', 3, 2, 'Nisutortilla', '1 tk = 40 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Õlu', 7, 1, 'Lager õlu', '1 pudel = 500 ml', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Ketsup', 3, 1, 'Tomatiketsup', '1 spl = 15 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Tomat', 2, 2, 'Värske tomat', '1 tk = 80 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Kurkk', 2, 2, 'Värske kurk', '1 tk = 300 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Paprika', 2, 2, 'Värske paprika', '1 tk = 120 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Sidrun', 2, 2, 'Värske sidrun', '1 tk = 110 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Lõhe', 2, 2, 'Värske lõhefilee', '1 tükk = 150 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Kohupiim', 1, 2, 'Mahe kohupiim', '1 pakk = 200 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Kohv', 3, 2, 'Jahvatatud kohv', '1 sl = 7 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Tee', 3, 2, 'Musta tee lahtised lehed', '1 tl = 2 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Banaan', 2, 2, 'Kollane banaan', '1 tk = 120 g', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, conversion, status)
VALUES (DEFAULT, 'Pähklid', 3, 2, 'Segapähklid', '1 dl = 60 g', 'ACT');







