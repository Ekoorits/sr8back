-- Created by Redgate Data Modeler (https://datamodeler.redgate-platform.com)
-- Last modification date: 2025-11-28 13:24:00.597

-- tables
-- Table: category
CREATE TABLE category (
                          id serial  NOT NULL,
                          name varchar(255)  NOT NULL,
                          description varchar(255)  NOT NULL,
                          CONSTRAINT category_pk PRIMARY KEY (id)
);

-- Table: contact
CREATE TABLE contact (
                         id serial  NOT NULL,
                         user_id int  NOT NULL,
                         first_name varchar(255)  NOT NULL,
                         last_name varchar(255)  NOT NULL,
                         email varchar(255)  NOT NULL,
                         CONSTRAINT contact_pk PRIMARY KEY (id)
);

-- Table: cooking_time
CREATE TABLE cooking_time (
                              id serial  NOT NULL,
                              minutes_max int  NOT NULL,
                              CONSTRAINT cooking_time_pk PRIMARY KEY (id)
);

-- Table: difficulty
CREATE TABLE difficulty (
                            id serial  NOT NULL,
                            level_name varchar(255)  NOT NULL,
                            level_number int  NOT NULL,
                            CONSTRAINT difficulty_pk PRIMARY KEY (id)
);

-- Table: ingredient
CREATE TABLE ingredient (
                            id serial  NOT NULL,
                            category_id int  NOT NULL,
                            name varchar(255)  NOT NULL,
                            measure_unit_id int  NOT NULL,
                            description varchar(255)  NULL,
                            conversion varchar(255)  NOT NULL,
                            status int  NOT NULL,
                            CONSTRAINT ingredient_pk PRIMARY KEY (id)
);

-- Table: meal_type
CREATE TABLE meal_type (
                           id serial  NOT NULL,
                           name varchar(255)  NOT NULL,
                           CONSTRAINT id PRIMARY KEY (id)
);

-- Table: measure_unit
CREATE TABLE measure_unit (
                              id serial  NOT NULL,
                              name varchar(255)  NOT NULL,
                              description int  NOT NULL,
                              CONSTRAINT measure_unit_pk PRIMARY KEY (id)
);

-- Table: receipe_image
CREATE TABLE receipe_image (
                               id serial  NOT NULL,
                               recipe_id int  NOT NULL,
                               image_data bytea  NOT NULL,
                               CONSTRAINT id PRIMARY KEY (id)
);

-- Table: recipe
CREATE TABLE recipe (
                        id serial  NOT NULL,
                        user_id int  NOT NULL,
                        meal_type_id int  NOT NULL,
                        cooking_time_id int  NOT NULL,
                        difficulty_id int  NOT NULL,
                        name varchar(255)  NOT NULL,
                        author varchar(255)  NOT NULL,
                        pax int  NOT NULL,
                        instructions varchar(500)  NOT NULL,
                        CONSTRAINT id PRIMARY KEY (id)
);

-- Table: recipe_ingredient
CREATE TABLE recipe_ingredient (
                                   id serial  NOT NULL,
                                   recipe_id int  NOT NULL,
                                   ingredient_id int  NOT NULL,
                                   amount decimal(8,3)  NOT NULL,
                                   CONSTRAINT recipe_ingredient_pk PRIMARY KEY (id)
);

-- Table: role
CREATE TABLE role (
                      id serial  NOT NULL,
                      name varchar(255)  NOT NULL,
                      CONSTRAINT role_pk PRIMARY KEY (id)
);

-- Table: shopping
CREATE TABLE shopping (
                          id serial  NOT NULL,
                          user_id int  NOT NULL,
                          title varchar(255)  NOT NULL,
                          description varchar(255)  NULL,
                          date date  NULL,
                          status varchar(3)  NOT NULL,
                          created_at timestamp  NOT NULL,
                          CONSTRAINT shopping_pk PRIMARY KEY (id)
);

-- Table: shopping_list
CREATE TABLE shopping_list (
                               id serial  NOT NULL,
                               shopping_id int  NOT NULL,
                               ingredient_id int  NOT NULL,
                               amount int  NOT NULL,
                               added_by varchar(1)  NOT NULL,
                               CONSTRAINT shopping_list_pk PRIMARY KEY (id)
);

-- Table: shopping_recipe
CREATE TABLE shopping_recipe (
                                 id serial  NOT NULL,
                                 recipe_id int  NOT NULL,
                                 shopping_id int  NOT NULL,
                                 pax int  NOT NULL,
                                 CONSTRAINT id PRIMARY KEY (id)
);

-- Table: user
CREATE TABLE "user" (
                        id serial  NOT NULL,
                        role_id int  NOT NULL,
                        username varchar(50)  NOT NULL,
                        password int  NOT NULL,
                        status varchar(1)  NOT NULL,
                        CONSTRAINT id PRIMARY KEY (id)
);

-- foreign keys
-- Reference: contact_user (table: contact)
ALTER TABLE contact ADD CONSTRAINT contact_user
    FOREIGN KEY (user_id)
        REFERENCES "user" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: ingredient_category (table: ingredient)
ALTER TABLE ingredient ADD CONSTRAINT ingredient_category
    FOREIGN KEY (category_id)
        REFERENCES category (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: ingredient_measure_unit (table: ingredient)
ALTER TABLE ingredient ADD CONSTRAINT ingredient_measure_unit
    FOREIGN KEY (measure_unit_id)
        REFERENCES measure_unit (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: receipe_image_recipe (table: receipe_image)
ALTER TABLE receipe_image ADD CONSTRAINT receipe_image_recipe
    FOREIGN KEY (recipe_id)
        REFERENCES recipe (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: recipe_cooking_time (table: recipe)
ALTER TABLE recipe ADD CONSTRAINT recipe_cooking_time
    FOREIGN KEY (cooking_time_id)
        REFERENCES cooking_time (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: recipe_difficulty (table: recipe)
ALTER TABLE recipe ADD CONSTRAINT recipe_difficulty
    FOREIGN KEY (difficulty_id)
        REFERENCES difficulty (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: recipe_ingredient_ingredient (table: recipe_ingredient)
ALTER TABLE recipe_ingredient ADD CONSTRAINT recipe_ingredient_ingredient
    FOREIGN KEY (ingredient_id)
        REFERENCES ingredient (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: recipe_ingredient_recipe (table: recipe_ingredient)
ALTER TABLE recipe_ingredient ADD CONSTRAINT recipe_ingredient_recipe
    FOREIGN KEY (recipe_id)
        REFERENCES recipe (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: recipe_meal_type (table: recipe)
ALTER TABLE recipe ADD CONSTRAINT recipe_meal_type
    FOREIGN KEY (meal_type_id)
        REFERENCES meal_type (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: recipe_user (table: recipe)
ALTER TABLE recipe ADD CONSTRAINT recipe_user
    FOREIGN KEY (user_id)
        REFERENCES "user" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: shopping_list_ingredient (table: shopping_list)
ALTER TABLE shopping_list ADD CONSTRAINT shopping_list_ingredient
    FOREIGN KEY (ingredient_id)
        REFERENCES ingredient (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: shopping_list_shopping (table: shopping_list)
ALTER TABLE shopping_list ADD CONSTRAINT shopping_list_shopping
    FOREIGN KEY (shopping_id)
        REFERENCES shopping (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: shopping_recipe_recipe (table: shopping_recipe)
ALTER TABLE shopping_recipe ADD CONSTRAINT shopping_recipe_recipe
    FOREIGN KEY (recipe_id)
        REFERENCES recipe (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: shopping_recipe_shopping (table: shopping_recipe)
ALTER TABLE shopping_recipe ADD CONSTRAINT shopping_recipe_shopping
    FOREIGN KEY (shopping_id)
        REFERENCES shopping (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: shopping_user (table: shopping)
ALTER TABLE shopping ADD CONSTRAINT shopping_user
    FOREIGN KEY (user_id)
        REFERENCES "user" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: user_role (table: user)
ALTER TABLE "user" ADD CONSTRAINT user_role
    FOREIGN KEY (role_id)
        REFERENCES role (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- End of file.

