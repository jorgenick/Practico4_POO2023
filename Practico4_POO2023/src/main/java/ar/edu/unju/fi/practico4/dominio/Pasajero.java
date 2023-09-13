package ar.edu.unju.fi.practico4.dominio;
//dd
public class Pasajero {
	
	private String nombreApellido;
	private long telefono;
	private long dni;
	private String correo;
	private Pasajero acompaniante;
	
	
	public Pasajero() {
		super();
	}

	public Pasajero(String nombreApellido, long telefono, long dni, String correo,Pasajero acompaniante) {
		super();
		this.nombreApellido = nombreApellido;
		this.telefono = telefono;
		this.dni = dni;
		this.correo = correo;
		this.acompaniante = acompaniante;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public Pasajero getAcompaniante() {
		return acompaniante;
	}
	
	public void setAcompaniante(Pasajero acompaniante) {
		this.acompaniante = acompaniante;
	}
	

	@Override
	public String toString() {
		return " \n	nombreApellido = " + nombreApellido + "\n	telefono = " + telefono + "\n	dni = " + dni + "\n 	correo = "
				+ correo + "\n 	acompañante = "+acompaniante;
	}
	
	
	
	
}
