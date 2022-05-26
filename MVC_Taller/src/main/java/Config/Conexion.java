
package Config;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {
	public static void main (String[] args) {
		Conexion();
	}
	
	public static void Conexion() {
		Connection con=null;
		String driver="com.mysql.jdbc.Driver";
		try {
			Class.forName(driver);
			System.out.print("Driver cargado con exito");
			try {
				con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ManejoEmpleados?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","456123Cris");
				if (con!=null) {
					System.out.print("Conexion realizada con exito");
				}
			} catch (Exception e) {
				System.out.println("Ha ocurrido un error al intentar conectar con la base de datos");
			} 
		}catch (Exception e){
			System.out.println("Ha ocurrido un error al cargar el driver, " +e.getMessage());
		}
	}
}
