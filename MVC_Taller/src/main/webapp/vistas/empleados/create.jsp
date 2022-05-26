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
		<h1>Agregar Empleado</h1>
		<a href="ServletEmpleadosControlador?accion=create" > Agregar Nuevo </a>
		<form action="ServletEmpleadosControlador" >
			ID: <br>
			<input type="text" name="txtId"><br>
			Tipo de Documento: <br>
			<input type="text" name="txtDocumento_tipo"><br>
			Numero de documento: <br>
			<input type="text" name="txtDocumento_numero"><br>
			Nombres: <br>
			<input type="text" name="txtNombres"><br>
			Apellidos: <br>
			<input type="text" name="txtApellidos"><br>
			ID Departamento: <br>
			<input type="text" name="txtDepartamentos_id"><br>
			Correo Electronico: <br>
			<input type="text" name="txtCorreo_electrónico"><br>
			Telefono: <br>
			<input type="text" name="txtTeléfono"><br>
			Fecha Creada: <br>
			<input type="text" name="txtFecha_hora_crea"><br>
			Fecha modificada: <br>
			<input type="text" name="txtFecha_hora_modifica"><br>
			
			<input type="submit" name="accion" value="Agregar" ><br>
		</form>
	</div>
</body>
</html>