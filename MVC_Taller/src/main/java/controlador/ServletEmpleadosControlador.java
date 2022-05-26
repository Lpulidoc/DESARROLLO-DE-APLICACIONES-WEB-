package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ModeloDAO.EmpleadosDAO;
import modelo.Empleados;

/**
 * Servlet implementation class ServletEmpleadosControlador
 */
@WebServlet("/ServletEmpleadosControlador")
public class ServletEmpleadosControlador extends HttpServlet {
	String read="vistas/empleados/read.jsp";
	String update="vistas/empleados/update.jsp";
	String create="vistas/empleados/create.jsp";
	Empleados emp=new Empleados();
	EmpleadosDAO dao=new EmpleadosDAO();
	//private static final long serialVersionUID = 1L;
    //private List<Empleados> listaEmpleados= new ArrayList<>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEmpleadosControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//this.listaEmpleados=null;
		//request.setAttribute("empleados", this.listaEmpleados);
		//request.getRequestDispatcher("empleados/listaempleados.jsp").forward(request, response);
		
		String acceso="";
		String action=request.getParameter("accion");
		if(action.equalsIgnoreCase("read")) {
			acceso=read;
		}else if (action.equalsIgnoreCase("create")) {
			acceso=create;
		}
		else if (action.equalsIgnoreCase("Agregar")) {
			String Documento_tipo=request.getParameter("txtDocumento_tipo");
			int Documento_numero=request.getIntHeader("txtDocumento_numero");
			String Nombres=request.getParameter("txtNombres");
			String Apellidos=request.getParameter("txtApellidos");
			int Departamentos_id=request.getIntHeader("txtDepartamentos_id");
			String Correo_electronico=request.getParameter("txtCorreo_electrónico");
			int Telefono=request.getIntHeader("txtTeléfono");
			long Fecha_hora_crea=request.getDateHeader("txtFecha_hora_crea");
			long Fecha_hora_modifica=request.getDateHeader("txtFecha_hora_crea");
			emp.setDocumento_tipo(Documento_tipo);
			emp.setDocumento_numero(Departamentos_id);
			emp.setNombres(Nombres);
			emp.setApellidos(Apellidos);
			emp.setDepartamentos_id(Departamentos_id);
			emp.setCorreo_electronico(Correo_electronico);
			emp.setTelefono(Telefono);
			emp.setFecha_hora_crea(null);
			emp.setFecha_hora_modifica(null);
			acceso=read;
		}
		RequestDispatcher vista=request.getRequestDispatcher(acceso);
		vista.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
