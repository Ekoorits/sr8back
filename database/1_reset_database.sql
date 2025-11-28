-- Kustutab ära schema 'bank' (mis põhimõtteliselt kustutab ära kõik tabelid tolles schemas)
DROP SCHEMA IF EXISTS smartrecipebook CASCADE;
-- Loob uue bank schema
CREATE SCHEMA smartrecipebook
-- ja taastab vajalikud andmebaasi õigused
    GRANT ALL ON SCHEMA smartrecipebook TO postgres;
GRANT ALL ON SCHEMA smartrecipebook TO PUBLIC;