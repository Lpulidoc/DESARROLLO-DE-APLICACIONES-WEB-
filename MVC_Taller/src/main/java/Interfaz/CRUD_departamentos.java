package Interfaz;

import java.util.List;

import modelo.Departamentos;   

public interface CRUD_departamentos {
	public List read();
	public Departamentos list(int id);
	public boolean update (Departamentos Dep);
	public boolean create (Departamentos Dep);
	public boolean delete (int id);
}
