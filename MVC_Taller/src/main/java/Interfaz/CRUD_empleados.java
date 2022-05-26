
package Interfaz;

import java.util.List;

import modelo.Empleados;

public interface CRUD_empleados {
		public List read();
		public Empleados list(int id);
		public boolean update (Empleados Emp);
		public boolean create (Empleados Emp);
		public boolean delete (int id);
}
