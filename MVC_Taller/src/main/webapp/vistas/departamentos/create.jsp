<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>Agregar Departamento</h1>
		<a href="ServletDepartamentosControlador?accion=create" > Agregar Nuevo </a>
		<form action="ServletDepartamentosControlador" >
			ID: <br>
			<input type="text" name="txtId"><br>
			Codigo de Departamento: <br>
			<input type="text" name="txtDepartamento_codigo"><br>
			Nombre Departamento: <br>
			<input type="text" name="txtDepartamento_nombre"><br>
			Fecha Creada: <br>
			<input type="text" name="txtFecha_hora_crea"><br>
			Fecha Modificada: <br>
			<input type="text" name="txtFecha_hora_modifica"><br>
			
			<input type="submit" name="accion" value="Agregar" ><br>
		</form>
	</div>
</body>
</html>