/*Se crea la base de datos */
drop schema if exists practica;
drop user if exists usuario_practica;
CREATE SCHEMA practica;

/*Se crea un usuario para la base de datos llamado "usuario_prueba" y tiene la contraseña "Usuario_Clave."*/
create user 'usuario_practica'@'%' identified by 'palomitas';

/*Se asignan los prvilegios sobr ela base de datos TechShop al usuario creado */
grant all privileges on practica.* to 'usuario_practica'@'%';
flush privileges;

CREATE TABLE practica.arbol (
    id_arbol INT PRIMARY KEY AUTO_INCREMENT,
    nombre_comun VARCHAR(255),
    tipo_flor VARCHAR(255),
    dureza_madera INT,
    otro_campo_numerico INT,
    otro_campo_texto VARCHAR(255),
    ruta_imagen TEXT
);

arbolINSERT INTO practica.arbol (nombre_comun, tipo_flor, dureza_madera, otro_campo_numerico, otro_campo_texto, ruta_imagen)
VALUES 
('Pino', 'Conífera', 70, 5, 'Ejemplo 1', 'ruta/imagen1.jpg'),
('Roble', 'Caducifolio', 85, 8, 'Ejemplo 2', 'ruta/imagen2.jpg'),
('Manzano', 'Frutal', 60, 3, 'Ejemplo 3', 'ruta/imagen3.jpg'),
('Cerezo', 'Frutal', 55, 4, 'Ejemplo 4', 'ruta/imagen4.jpg'),
('Fresno', 'Caducifolio', 75, 6, 'Ejemplo 5', 'ruta/imagen5.jpg');


select * from practica.arbol;