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

INSERT INTO smartrecipebook.user (id, role_id, username, password, status) VALUES (DEFAULT, 1, 'Peeter', '1234', 'A');
INSERT INTO smartrecipebook.user (id, role_id, username, password, status) VALUES (DEFAULT, 3, 'MariTamm', '1234', 'A');
INSERT INTO smartrecipebook.user (id, role_id, username, password, status) VALUES (DEFAULT, 3, 'KarlMaasik1', '1234', 'A');
INSERT INTO smartrecipebook.user (id, role_id, username, password, status) VALUES (DEFAULT, 3, 'AnnikaKask33', '1234', 'A');
INSERT INTO smartrecipebook.user (id, role_id, username, password, status) VALUES (DEFAULT, 3, 'JaanR', '1234', 'A');
INSERT INTO smartrecipebook.user (id, role_id, username, password, status) VALUES (DEFAULT, 3, 'HRand', '1234', 'A');

INSERT INTO smartrecipebook.contact (id, user_id, first_name, last_name, email) VALUES (DEFAULT, 1, 'Peeter', 'Tamm', 'ptamm@mail.com');
INSERT INTO smartrecipebook.contact (id, user_id, first_name, last_name, email) VALUES (DEFAULT, 2, 'Mari', 'Tamm', 'mtamm@mail.com');
INSERT INTO smartrecipebook.contact (id, user_id, first_name, last_name, email) VALUES (DEFAULT, 3, 'Karl', 'Maasik', 'karlmaasik@mail.com');
INSERT INTO smartrecipebook.contact (id, user_id, first_name, last_name, email) VALUES (DEFAULT, 4, 'Annika', 'Kask', 'kaskannika@mail.ee');
INSERT INTO smartrecipebook.contact (id, user_id, first_name, last_name, email) VALUES (DEFAULT, 5, 'Jaan', 'Reinsalu', 'reinsaluj@mail.com');
INSERT INTO smartrecipebook.contact (id, user_id, first_name, last_name, email) VALUES (DEFAULT, 6, 'Heli', 'Rand', 'helirand@mail.com');


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
VALUES (DEFAULT, 'Kurk', 2, 2, 'Värske kurk', '1 tk = 300 g', 'ACT');

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

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, status)
VALUES (DEFAULT, 'Basiilik', 2, 2, 'Värske basiilik', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, status)
VALUES (DEFAULT, 'Sai', 4, 2, 'Nisusai', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, status)
VALUES (DEFAULT, 'Oliiviõli', 3, 1, 'Külmpressitud', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, status)
VALUES (DEFAULT, 'Küüslaauk', 2, 2, 'Orgaaniline', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, status)
VALUES (DEFAULT, 'Vahukoor', 1, 1, 'Rasvane', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, status)
VALUES (DEFAULT, 'Veiseliha', 2, 2, 'Filee', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, status)
VALUES (DEFAULT, 'Avokaado', 2, 2, 'Söömisküps', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, status)
VALUES (DEFAULT, 'Kõrvits', 2, 2, 'Kollane', 'ACT');

INSERT INTO smartrecipebook.ingredient (id, name, category_id, measure_unit_id, description, status)
VALUES (DEFAULT, 'Toidukoor', 1, 1, 'Rasvane', 'ACT');


INSERT INTO smartrecipebook.recipe (id, user_id, meal_type_id, cooking_time_id, difficulty_id, name, author, pax, instructions)
VALUES (DEFAULT, 1, 1, 1, 1, 'Klassikaline bruschetta', 'Peeter Tamm', 2, 'Viiluta sai, rösti ja kata tomati-basiiliku seguga.');

INSERT INTO smartrecipebook.recipe (id, user_id, meal_type_id, cooking_time_id, difficulty_id, name, author, pax, instructions)
VALUES (DEFAULT, 2, 2, 2, 2, 'Ahjus küpsetatud kanafilee', 'Mari Tamm', 4, 'Maitsesta kana ja küpseta 60 min 180 kraadil.');

INSERT INTO smartrecipebook.recipe (id, user_id, meal_type_id, cooking_time_id, difficulty_id, name, author, pax, instructions)
VALUES (DEFAULT, 3, 3, 1, 1, 'Juustu-küüslaugu suupisted', 'Karl Maasik', 6, 'Sega juust ja küüslauk, määri saiaviiludele ja küpseta lühidalt.');

INSERT INTO smartrecipebook.recipe (id, user_id, meal_type_id, cooking_time_id, difficulty_id, name, author, pax, instructions)
VALUES (DEFAULT, 4, 4, 3, 2, 'Šokolaadimousse', 'Annika Kask', 4, 'Sulata šokolaad ja sega vahustatud koorega, jahuta 2 tundi.');

INSERT INTO smartrecipebook.recipe (id, user_id, meal_type_id, cooking_time_id, difficulty_id, name, author, pax, instructions)
VALUES (DEFAULT, 6, 5, 1, 1, 'Värske marjasmuuti', 'Heli Rand', 2, 'Blendi marjad, piim ja banaan kuni ühtlaseks.');

INSERT INTO smartrecipebook.recipe (id, user_id, meal_type_id, cooking_time_id, difficulty_id, name, author, pax, instructions)
VALUES (DEFAULT, 2, 2, 4, 3, 'Veiseliha guljašš', 'Mari Tamm', 5, 'Pruunista liha, lisa maitseained ja hauta 120 min.');

INSERT INTO smartrecipebook.recipe (id, user_id, meal_type_id, cooking_time_id, difficulty_id, name, author, pax, instructions)
VALUES (DEFAULT, 1, 3, 1, 1, 'Kurk-avokaado rullid', 'Peeter Tamm', 3, 'Viiluta kurk, täida avokaadoga ja vormi rullid.');

INSERT INTO smartrecipebook.recipe (id, user_id, meal_type_id, cooking_time_id, difficulty_id, name, author, pax, instructions)
VALUES (DEFAULT, 3, 1, 2, 1, 'Kreemine kõrvitsapüreesupp', 'Karl Maasik', 4, 'Keeda kõrvits, püreesta ja maitsesta koore ning vürtsidega.');

INSERT INTO smartrecipebook.recipe (id, user_id, meal_type_id, cooking_time_id, difficulty_id, name, author, pax, instructions)
VALUES (DEFAULT, 4, 4, 2, 2, 'Kohupiimakreem marjadega', 'Annika Kask', 3, 'Sega kohupiim suhkruga ja serveeri värskete marjadega.');

INSERT INTO smartrecipebook.recipe (id, user_id, meal_type_id, cooking_time_id, difficulty_id, name, author, pax, instructions)
VALUES (DEFAULT, 5, 2, 6, 3, 'Aeglaselt küpsetatud seapraad', 'Jaan Reinsalu', 8, 'Hauta sealiha 180 min madalal kuumusel kuni pehme.');


INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount, description) VALUES (DEFAULT, 3, 32, 500,'viilutatud sai');
INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 3, 31, 50);
INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 3, 21, 100);

INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount, description) VALUES (DEFAULT, 4, 8, 1000, 'Maitsestatud filee');

INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 5, 32, 750);
INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 5, 3, 300);
INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 5, 34, 100);

INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 6, 17, 1500);
INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 6, 35, 500);

INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 7, 1, 500);
INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 7, 16, 200);
INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 7, 29, 200);

INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 8, 36, 2000);
INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 8, 9, 500);

INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 9, 22, 800);
INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 9, 37, 300);

INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 10, 38, 5000);
INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 10, 39, 1000);

INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 11, 26, 750);
INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 11, 5, 150);
INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 11, 16, 250);

INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 12, 7, 2500);
INSERT INTO smartrecipebook.recipe_ingredient(id, recipe_id, ingredient_id, amount) VALUES (DEFAULT, 12, 33, 100);








