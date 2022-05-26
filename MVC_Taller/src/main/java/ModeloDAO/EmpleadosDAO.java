/* DAO = Data, Access, Object */
package ModeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Config.Conexion;
import Interfaz.CRUD_empleados;
import modelo.Empleados;

public class EmpleadosDAO implements CRUD_empleados {
	Conexion cn=new  Conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	Empleados em=new Empleados();
	
	@Override
	public List read() {
		ArrayList<Empleados>list=new ArrayList<>();
		String sql="select * from empleados";
		try {
			con=cn.getConnection();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				Empleados em=new Empleados();
				em.setId(rs.getInt("id"));
				em.setDocumento_tipo(rs.getString("documento_tipo"));
				em.setDocumento_numero(rs.getInt("documento_numero"));
				em.setNombres(rs.getString("nombres"));
				em.setApellidos(rs.getString("apellidos"));
				em.setDepartamentos_id(rs.getInt("departamentos_id"));
				em.setCorreo_electrónico(rs.getString("correo_electrónico"));
				em.setTeléfono(rs.getInt("Teléfono"));
				em.setFecha_hora_crea(rs.getDate("fecha_hora_crea"));
				em.setFecha_hora_modifica(rs.getDate("fecha_hora_modifica"));
				list.add(em);
			}
			}catch (Exception e) {
			}
			return list;
	}

	@Override
	public Empleados list(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Empleados Emp) {
		
		return false;
	}

	@Override
	public boolean create(Empleados Emp) {
		String sql= "insert into empleados (id,documento_tipo,documento_numero,nombres ,apellidos,departamentos_id,correo_electrónico,Teléfono,fecha_hora_crea,fecha_hora_modifica) values('"+Emp.getId()+"','"+Emp.getDocumento_tipo()+"','"+Emp.getDocumento_numero()+"','"+Emp.getNombres()+"','"+Emp.getApellidos()+"','"+Emp.getDepartamentos_id()+"','"+Emp.getCorreo_electrónico()+"','"+Emp.getTeléfono()+"','"+Emp.getFecha_hora_crea()+"','"+Emp.getFecha_hora_modifica()+"')";
		try {
			con=cn.getConnection();
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
