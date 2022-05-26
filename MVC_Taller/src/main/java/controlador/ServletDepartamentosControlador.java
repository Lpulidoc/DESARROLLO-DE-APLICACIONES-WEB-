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

import ModeloDAO.DepartamentosDAO;
import modelo.Departamentos;

/**
 * Servlet implementation class ServletDepartamentosControlador
 */
@WebServlet("/ServletDepartamentosControlador")
public class ServletDepartamentosControlador extends HttpServlet {
	String read="vistas/departamentos/read.jsp";
	String create="vistas/departamentos/create.jsp";
	String update="vistas/departamentos/update.jsp";
	Departamentos dep=new Departamentos();
	DepartamentosDAO dao=new DepartamentosDAO();
	//private static final long serialVersionUID = 1L;
    //private List<Departamentos> listaDepartamentos= new ArrayList<>();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDepartamentosControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//this.listaDepartamentos=null;
		//request.setAttribute("departamentos", this.listaDepartamentos);
		//request.getRequestDispatcher("departamentos/listadepartamentos.jsp").forward(request, response);
		String acceso="";
		String action=request.getParameter("accion");
		if(action.equalsIgnoreCase("read")) {
			acceso=read;
		}else if (action.equalsIgnoreCase("create")) {
			acceso=create;
		}
		else if (action.equalsIgnoreCase("Agregar")) {
			String Departamento_codigo=request.getParameter("txtDepartamento_codigo");
			String Departamento_nombre=request.getParameter("txtDepartamento_nombre");
			long Fecha_hora_crea=request.getDateHeader("txtFecha_hora_crea");
			long Fecha_hora_modifica=request.getDateHeader("txtFecha_hora_modifica");
			dep.setDepartamento_codigo(Departamento_codigo);
			dep.setDepartamento_nombre(Departamento_nombre);
			dep.setFecha_hora_crea(null);
			dep.setFecha_hora_modifica(null);
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
