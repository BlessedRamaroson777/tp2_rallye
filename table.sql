CREATE DATABASE rallye;
\c rallye;
CREATE TABLE rallyes(
   id_rallye INTEGER,
   nom VARCHAR(50)  NOT NULL,
   date_rallye DATE NOT NULL,
   PRIMARY KEY(id_rallye)
);

CREATE TABLE participants(
   id_participant INTEGER,
   nom VARCHAR(50)  NOT NULL,
   PRIMARY KEY(id_participant)
);

CREATE TABLE categories(
   id_categorie INTEGER,
   valeur VARCHAR(50) ,
   PRIMARY KEY(id_categorie)
);

CREATE TABLE categorie_rallyes(
   id_categorie_rallye INTEGER,
   id_categorie INTEGER NOT NULL,
   id_rallye INTEGER NOT NULL,
   PRIMARY KEY(id_categorie_rallye),
   FOREIGN KEY(id_categorie) REFERENCES categories(id_categorie),
   FOREIGN KEY(id_rallye) REFERENCES rallyes(id_rallye)
);

CREATE TABLE epreuve_speciales(
   id_epreuve_speciale SERIAL,
   nom VARCHAR(50)  NOT NULL,
   distance NUMERIC(15,2)   NOT NULL,
   date_epreuve DATE NOT NULL,
   id_rallye INTEGER NOT NULL,
   PRIMARY KEY(id_epreuve_speciale),
   FOREIGN KEY(id_rallye) REFERENCES rallyes(id_rallye)
);

CREATE TABLE equipages(
   id_equipage SERIAL,
   nom VARCHAR(50)  NOT NULL,
   id_categorie_rallye INTEGER NOT NULL,
   id_pilote INTEGER NOT NULL,
   id_copilote INTEGER NOT NULL,
   PRIMARY KEY(id_equipage),
   FOREIGN KEY(id_categorie_rallye) REFERENCES categorie_rallyes(id_categorie_rallye),
   FOREIGN KEY(id_pilote) REFERENCES participants(id_participant),
   FOREIGN KEY(id_copilote) REFERENCES participants(id_participant)
);

CREATE TABLE temps_epreuves(
   id_epreuve_speciale INTEGER,
   id_equipage INTEGER,
   temps NUMERIC(15,2)   NOT NULL,
   PRIMARY KEY(id_epreuve_speciale, id_equipage),
   FOREIGN KEY(id_epreuve_speciale) REFERENCES epreuve_speciales(id_epreuve_speciale),
   FOREIGN KEY(id_equipage) REFERENCES equipages(id_equipage)
);
