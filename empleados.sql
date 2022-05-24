CREATE DATABASE ManejoEmpleados;
USE ManejoEmpleados;

CREATE TABLE Empleados
(
id INT AUTO_INCREMENT PRIMARY KEY,
documento_tipo ENUM ('RC','TI','CC','CE'),
documento_numero INT NOT NULL,
nombres VARCHAR (60) NOT NULL,
apellidos VARCHAR(60) NOT NULL,
departamentos_id INT NOT NULL,
correo_electrónico VARCHAR (60) NOT NULL,
Teléfono INT NOT NULL,
fecha_hora_crea DATETIME,
fecha_hora_modifica DATETIME
);

CREATE TABLE Departamentos
(
id INT AUTO_INCREMENT PRIMARY KEY,
departamento_codigo CHAR (3) NOT NULL,
departamento_nombre VARCHAR(30),
fecha_hora_crea DATETIME,
fecha_hora_modifica DATETIME
);

ALTER TABLE Empleados ADD FOREIGN KEY (departamentos_id) REFERENCES Departamentos(id);

INSERT INTO Departamentos (id,departamento_codigo,departamento_nombre,fecha_hora_crea,fecha_hora_modifica)
VALUES (1,"1","BOGOTA","2022/05/23","2022/05/23");



INSERT INTO Empleados (id, documento_tipo, documento_numero, nombres, apellidos, departamentos_id, correo_electrónico,Teléfono,fecha_hora_crea,fecha_hora_modifica) 
VALUES (1,"CC","1018513448","CRISTIAN","VALENCIA",123,"cristigmail.com","31424787","2022/05/23","2022/05/23");

SELECT  * FROM EMPLEADOS;
SELECT  * FROM Departamentos;