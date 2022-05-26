<%@page import="java.util.Iterator"%>
<%@page import="modelo.Empleados"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.EmpleadosDAO"%>
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
		<h1>Empleados</h1>
		<a href="ServletEmpleadosControlador?accion=create" >Agregar Nuevo</a>
		<table border="1">
			<thead>
				<tr>
					<th>ID Empleado</th>
					<th>Tipo de Documento</th>
					<th>NUmero de Documento</th>
					<th>Nombres</th>
					<th>Apellidos</th>
					<th>ID Departamento</th>
					<th>Correo Electronico</th>
					<th>Telefono</th>
					<th>Fecha Creada</th>
					<th>Fecha Modificada</th>
					<th>Acciones</th>
				</tr>
			</thead>
				<%
					EmpleadosDAO dao=new EmpleadosDAO();
					List<Empleados>list=dao.read();
					Iterator<Empleados>iter=list.iterator();
					Empleados em=null;
					while(iter.hasNext()){
						em=iter.next();
				%> 
			<tbody>
				<tr>
					<td><%= em.getId() %></td>
					<td><%= em.getDocumento_tipo() %></td>
					<td><%= em.getDocumento_numero() %></td>
					<td><%= em.getNombres() %></td>
					<td><%= em.getApellidos() %></td>
					<td><%= em.getDepartamentos_id() %></td>
					<td><%= em.getCorreo_electrónico() %></td>
					<td><%= em.getTeléfono() %></td>
					<td><%= em.getFecha_hora_crea() %></td>
					<td><%= em.getFecha_hora_modifica() %></td>
					<td>
						<a>Editar</a>
						<a>Eliminar</a>
					</td>
				</tr>
				<% } %>
			</tbody>
		</table>
	</div>
</body>
</html>