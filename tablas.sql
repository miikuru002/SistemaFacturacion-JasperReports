CREATE DATABASE sist_fact
USE sist_fact
------------------------------------
CREATE TABLE clientes(
idCliente INT PRIMARY KEY,
Apellidos VARCHAR(40),
Nombres VARCHAR(40),
Ruc VARCHAR(11))

SELECT * FROM clientes
------------------------------------
CREATE TABLE factura(
numero INT PRIMARY KEY,
fecha DATE,
igv DECIMAL (8,2),
precio_total DECIMAL (9,2),
Cliente_idCliente INT, 
FOREIGN KEY (Cliente_idCliente) REFERENCES clientes(idCliente))

SELECT * FROM factura
------------------------------------
Create Table producto(
idProducto INT PRIMARY KEY,
Descripcion varchar(45),
Precio DECIMAL(9,2)) 

SELECT * FROM producto
------------------------------------
CREATE TABLE detalle_factura(
cantidad INT,
precio DECIMAL(9,2),
producto_idProducto INT,
factura_numero INT,
subtotal DECIMAL (9,2),
FOREIGN KEY (producto_idProducto) REFERENCES producto(idProducto),
FOREIGN KEY (factura_numero) REFERENCES factura(numero))

select * FROM detalle_factura

------------------------------------------------PROCEDIMIENTO ALMACENADO 1 (INSERTAR PRODUCTOS)
delimiter $
CREATE PROCEDURE insertar_productos(
	IN idProducto INT,
	IN Descripcion VARCHAR(45),
	IN Precio DECIMAL(9,2)
)
BEGIN 
	INSERT INTO producto(idProducto,Descripcion,Precio)
	VALUES(idProducto,Descripcion,Precio);
END $

CALL insertar_productos(111,'Laptop',1500.50)

SELECT * FROM producto
------------------------------------------------PROCEDIMIENTO ALMACENADO 2 (REGISTRAR CLIENTE)
delimiter $
CREATE PROCEDURE registrar_clientes(
	IN idCliente INT,
	IN Apellidos VARCHAR(40),
	IN Nombres VARCHAR(40),
	IN Ruc VARCHAR(11)
)
BEGIN 
	INSERT INTO clientes(idCliente,Apellidos,Nombres,Ruc)
	VALUES(idCliente,Apellidos,Nombres,Ruc);
END $

CALL registrar_clientes(999,'Apellidos','Nombres','12345678987')

SELECT * FROM clientes
------------------------------------------------PROCEDIMIENTO ALMACENADO 3 (BUSCAR CLIENTE POR CODIGO)
delimiter $
CREATE PROCEDURE busqueda_codigo_cliente(
	IN cod INT)
BEGIN 
	SELECT * FROM clientes
	WHERE idCliente=cod;
END $

CALL busqueda_codigo_cliente(888)
------------------------------------------------PROCEDIMIENTO ALMACENADO 4 (BUSCAR CLIENTES POR RUC)
delimiter $
CREATE PROCEDURE busqueda_ruc_cliente(
	IN r VARCHAR(11))
BEGIN 
	SELECT * FROM clientes
	WHERE Ruc=r;
END $

CALL busqueda_ruc_cliente('12345678987')
------------------------------------------------PROCEDIMIENTO ALMACENADO 5 (BUSCAR PRODUCTO POR CODIGO)
delimiter $
CREATE PROCEDURE busqueda_codigo_producto(
	IN cod INT)
BEGIN 
	SELECT * FROM producto
	WHERE idProducto=cod;
END $

CALL busqueda_codigo_producto(111)
------------------------------------------------PROCEDIMIENTO ALMACENADO 6 (BUSCAR PRODUCTO POR PRECIO)
delimiter $
CREATE PROCEDURE busqueda_precio_producto(
	IN prc DECIMAL(9,2))
BEGIN 
	SELECT * FROM producto
	WHERE Precio=prc;
END $

CALL busqueda_precio_producto(1500.5)
------------------------------------------------PROCEDIMIENTO ALMACENADO 7 (ACTUALIZAR CLIENTE)
delimiter $
CREATE PROCEDURE actualizar_cliente(
	IN apell VARCHAR(40),
	IN nom VARCHAR(40),
	IN rc VARCHAR(11),
	IN cod INT)
BEGIN 
	UPDATE clientes SET Apellidos=apell, Nombres=nom, Ruc=rc
	WHERE idCliente=cod;
END $

CALL actualizar_cliente('Apellidos1','Nombres1','12345678999',999)

SELECT * FROM clientes
------------------------------------------------PROCEDIMIENTO ALMACENADO 8 (ACTUALIZAR PRODUCTO)
delimiter $
CREATE PROCEDURE actualizar_producto(
	IN des VARCHAR(45),
	IN prc DECIMAL(9,2),
	IN cod INT)
BEGIN 
	UPDATE producto SET Descripcion=des, Precio=prc
	WHERE idProducto=cod;
END $

CALL actualizar_producto('Raton',55.5,111)

SELECT * FROM producto
------------------------------------------------PROCEDIMIENTO ALMACENADO 9 (ELIMINAR CLIENTE)
delimiter $
CREATE PROCEDURE eliminar_cliente(
	IN cod INT)
BEGIN 
	DELETE FROM clientes
	WHERE idCliente=cod;
END $

CALL eliminar_cliente(999)

SELECT * FROM clientes
------------------------------------------------PROCEDIMIENTO ALMACENADO 10 (ELIMINAR PRODUCTO)
delimiter $
CREATE PROCEDURE eliminar_producto(
	IN cod INT)
BEGIN 
	DELETE FROM producto
	WHERE idProducto=cod;
END $

CALL eliminar_producto(111)

SELECT * FROM producto
------------------------------------------------PROCEDIMIENTO ALMACENADO 11 (CONSULTAR CLIENTES)
delimiter $
CREATE PROCEDURE mostrar_clientes()
BEGIN
	SELECT * FROM clientes;
END $

CALL mostrar_clientes
------------------------------------------------PROCEDIMIENTO ALMACENADO 12 (CONSULTAR PRODUCTOS)
delimiter $
CREATE PROCEDURE mostrar_productos()
BEGIN
	SELECT * FROM producto;
END $

CALL mostrar_productos
------------------------------------------------PROCEDIMIENTO ALMACENADO 13 (REGISTRAR BOLETA)
delimiter $
CREATE PROCEDURE registrar_factura(
	IN numero INT,
	IN fecha DATE,
	IN Cliente_idCliente INT)
BEGIN 
	INSERT INTO factura(numero,fecha,Cliente_idCliente)
	VALUES(numero,fecha,Cliente_idCliente);
END $

CALL registrar_factura(0001,'2020-07-19',111)

SELECT * FROM factura
------------------------------------------------PROCEDIMIENTO ALMACENADO 14 (REGISTRAR DETALLE BOLETA)
delimiter $
CREATE PROCEDURE registrar_detalle_factura(
	IN cantidad INT,
	IN precio DECIMAL(9,2),
	IN producto_idProducto INT,
	IN factura_numero INT,
	IN subtotal DECIMAL (9,2))
BEGIN 
	INSERT INTO detalle_factura(cantidad,precio,producto_idProducto,factura_numero,subtotal)
	VALUES(cantidad,precio,producto_idProducto,factura_numero,subtotal);
END $

CALL registrar_detalle_factura(3,20.50,1,1)

SELECT * FROM detalle_factura
------------------------------------------------PROCEDIMIENTO ALMACENADO 15 (REGISTRAR BOLETA 2)
delimiter $
CREATE PROCEDURE registrar_factura2(
	IN impuesto DECIMAL (8,2),
	IN prc_total DECIMAL (9,2),
	IN cod INT)
BEGIN 
	UPDATE factura SET igv=impuesto, precio_total=prc_total
	WHERE numero=cod;
END $

CALL registrar_factura2(11.07,61.5,1)

SELECT * FROM factura
------------------------------------------------PROCEDIMIENTO ALMACENADO 16 (CONSULTAR DETALLE)
delimiter $
CREATE PROCEDURE mostrar_detalle(
	IN num INT)
BEGIN
	SELECT producto_idProducto,cantidad,precio,subtotal
	FROM detalle_factura
	WHERE factura_numero=num;	
END $

CALL mostrar_detalle(3)

------------------------------------------------PROCEDIMIENTO ALMACENADO 17 (OBTENER PRECIO)
delimiter $
CREATE PROCEDURE obtener_precio(
	IN cod INT)
BEGIN
	SELECT precio FROM producto
	WHERE idProducto=cod;
END $

CALL obtener_precio(3)
------------------------------------------------PROCEDIMIENTO ALMACENADO 18 (ELIMINAR PRODUCTO DEL DETALLE)
delimiter $
CREATE PROCEDURE eliminar_producto_detalle(
	IN num INT,
	IN cod INT)
BEGIN 
	DELETE FROM detalle_factura
	WHERE factura_numero=num AND producto_idProducto=cod;
END $

CALL eliminar_producto_detalle(1,4)

SELECT * FROM detalle_factura
------------------------------------------------PROCEDIMIENTO ALMACENADO 19 (EDITAR PRODUCTO DEL DETALLE)
delimiter $
CREATE PROCEDURE editar_producto_detalle(
	IN cant INT,
	IN sub DECIMAL(9,2),
	IN num INT,
	IN cod INT)
BEGIN 
	UPDATE detalle_factura SET cantidad=cant,subtotal=sub
	WHERE factura_numero=num AND producto_idProducto=cod;
END $

CALL editar_producto_detalle(1,4)





------------------------------------------------PROCEDIMIENTO ALMACENADO (CONSULTAR factura completa)
delimiter $
CREATE PROCEDURE mostrar_factura()
BEGIN
	SELECT f.numero,f.Cliente_idCliente,f.fecha,d.producto_idProducto,d.cantidad,d.precio,f.precio_total,f.igv
	FROM factura f JOIN detalle_factura d
	ON (f.numero=d.factura_numero);	
END $

CALL mostrar_factura()
