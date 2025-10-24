CREATE TABLE users (
  id SERIAL PRIMARY KEY,
  name VARCHAR(100),
  email VARCHAR(100)
);

insert into  rallyes (id_rallye, nom, date_rallye) values
(1, 'rallye1', '2025-10-18'), 
(2, 'rallye2', '2025-10-28'), 
(3, 'rallye3', '2025-10-20'); 

insert into participants (id_participant, nom) values 
(1, 'tsiky1'), 
(2, 'tsiky2'), 
(3, 'tsiky3'); 

insert into  categories (id_categorie, valeur) values 
(1, 'A'),
(2, 'B'),
(3, 'C'),
(4, 'D');


-- 🔹 Table : categorie_rallyes
INSERT INTO categorie_rallyes (id_categorie_rallye, id_categorie, id_rallye) VALUES
(1, 1, 1),
(2, 2, 1),
(3, 3, 2),
(4, 4, 3);

-- 🔹 Table : epreuve_speciales
INSERT INTO epreuve_speciales (nom, distance, date_epreuve, id_rallye) VALUES
('ES1', 12.5, '2025-10-18', 1),
('ES2', 15.0, '2025-10-18', 1),
('ES3', 18.3, '2025-10-20', 2),
('ES4', 20.1, '2025-10-28', 3);

-- 🔹 Table : equipages
INSERT INTO equipages (nom, id_categorie_rallye, id_pilote, id_copilote) VALUES
('Team Alpha', 1, 1, 2),
('Team Beta', 2, 2, 3),
('Team Gamma', 3, 3, 1);

-- 🔹 Table : temps_epreuves
INSERT INTO temps_epreuves (id_epreuve_speciale, id_equipage, temps) VALUES
(1, 1, 12.35),
(1, 2, 13.12),
(2, 1, 11.95),
(2, 3, 14.20),
(3, 2, 15.00),
(4, 3, 16.50);

-- 🔹 Table : users
INSERT INTO users (name, email) VALUES
('Rivo', 'rivo@example.com'),
('Mina', 'mina@example.com'),
('Andry', 'andry@example.com');
