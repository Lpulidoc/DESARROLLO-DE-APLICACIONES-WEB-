/* DAO = Data, Access, Object */
package ModeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Config.Conexion;
import Interfaz.CRUD_departamentos;
import modelo.Departamentos;

public class DepartamentosDAO implements CRUD_departamentos {
	Conexion cn=new Conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	Departamentos dep=new Departamentos();
	
	@Override
	public List read() {
		ArrayList<Departamentos>list=new ArrayList<>();
		String sql="select * from departamentos";
		try {
			con=cn.getConnection();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				Departamentos dep=new Departamentos();
				dep.setId(rs.getInt("id"));
				dep.setDepartamento_codigo(rs.getString("departamento_codigo"));
				dep.setDepartamento_nombre(rs.getString("departamento_nombre"));
				dep.setFecha_hora_crea(rs.getDate("fecha_hora_crea"));
				dep.setFecha_hora_modifica(rs.getDate("fecha_hora_modifica"));
				list.add(dep);
			}
			}catch (Exception e) {
			}
			return list;
	}

	@Override
	public Departamentos list(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Departamentos Dep) {
		
		return false;
	}

	@Override
	public boolean create(Departamentos Dep) {
		String sql= "insert into departamentos (id,departamento_codigo,departamento_nombre,fecha_hora_crea,fecha_hora_modifica) values('"+Dep.getId()+"','"+Dep.getDepartamento_codigo() +"','"+Dep.getDepartamento_codigo() +"','"+Dep.getFecha_hora_crea() +"','"+Dep.getFecha_hora_modifica()+"')";
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
