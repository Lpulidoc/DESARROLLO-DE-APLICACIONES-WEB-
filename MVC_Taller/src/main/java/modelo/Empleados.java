package modelo;

import java.util.Date;

public class Empleados {
	private int id;
	private String documento_tipo;
	private int documento_numero;
	private String nombres;
	private String apellidos;
	private int departamentos_id;
	private String correo_electrónico;
	private int Teléfono;
	private Date fecha_hora_crea;
	private Date fecha_hora_modifica;
	
	
	public Empleados() {
		super();
	}


	public Empleados(int id, String documento_tipo, int documento_numero, String nombres, String apellidos,
			int departamentos_id, String correo_electrónico, int teléfono, Date fecha_hora_crea,
			Date fecha_hora_modifica) {
		super();
		this.id = id;
		this.documento_tipo = documento_tipo;
		this.documento_numero = documento_numero;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.departamentos_id = departamentos_id;
		this.correo_electrónico = correo_electrónico;
		Teléfono = teléfono;
		this.fecha_hora_crea = fecha_hora_crea;
		this.fecha_hora_modifica = fecha_hora_modifica;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDocumento_tipo() {
		return documento_tipo;
	}


	public void setDocumento_tipo(String documento_tipo) {
		this.documento_tipo = documento_tipo;
	}


	public int getDocumento_numero() {
		return documento_numero;
	}


	public void setDocumento_numero(int documento_numero) {
		this.documento_numero = documento_numero;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public int getDepartamentos_id() {
		return departamentos_id;
	}


	public void setDepartamentos_id(int departamentos_id) {
		this.departamentos_id = departamentos_id;
	}


	public String getCorreo_electrónico() {
		return correo_electrónico;
	}


	public void setCorreo_electrónico(String correo_electrónico) {
		this.correo_electrónico = correo_electrónico;
	}


	public int getTeléfono() {
		return Teléfono;
	}


	public void setTeléfono(int teléfono) {
		Teléfono = teléfono;
	}


	public Date getFecha_hora_crea() {
		return fecha_hora_crea;
	}


	public void setFecha_hora_crea(Date fecha_hora_crea) {
		this.fecha_hora_crea = fecha_hora_crea;
	}


	public Date getFecha_hora_modifica() {
		return fecha_hora_modifica;
	}


	public void setFecha_hora_modifica(Date fecha_hora_modifica) {
		this.fecha_hora_modifica = fecha_hora_modifica;
	}
	
	
	
}
