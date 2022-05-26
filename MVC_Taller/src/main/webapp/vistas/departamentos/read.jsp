<%@page import="java.util.Iterator"%>
<%@page import="modelo.Departamentos"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.DepartamentosDAO"%>
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
		<h1>Departamentos</h1>
		<a href="ServletDepartamentosControlador?accion=create" >Agregar Nuevo</a>
		<table border="1">
			<thead>
				<tr>
					<th>ID Departamento</th>
					<th>Codigo Departamento</th>
					<th>Nombre Departamento</th>
					<th>Fecha Creada</th>
					<th>Fecha Modificada</th>
					<th>Acciones</th>
				</tr>
			</thead>
				<%
					DepartamentosDAO dao=new DepartamentosDAO();
					List<Departamentos>list=dao.read();
					Iterator<Departamentos>iter=list.iterator();
					Departamentos dep=null;
					while(iter.hasNext()){
						dep=iter.next();
				%>
			<tbody>
				<tr>
					<td><%= dep.getId() %></td>
					<td><%= dep.getDepartamento_codigo() %></td>
					<td><%= dep.getDepartamento_nombre() %></td>
					<td><%= dep.getFecha_hora_crea() %></td>
					<td><%= dep.getFecha_hora_modifica() %></td>
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