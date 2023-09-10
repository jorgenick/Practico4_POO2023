package ar.edu.unju.fi.practico4.dominio;

public class Pasajero {
	
	private String nombreApellido;
	private long telefono;
	private long dni;
	private String correo;
	
	
	public Pasajero() {
		super();
	}

	public Pasajero(String nombreApellido, long telefono, long dni, String correo) {
		super();
		this.nombreApellido = nombreApellido;
		this.telefono = telefono;
		this.dni = dni;
		this.correo = correo;
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

	@Override
	public String toString() {
		return "Pasajero [nombreApellido=" + nombreApellido + ", telefono=" + telefono + ", dni=" + dni + ", correo="
				+ correo + "]";
	}
	
	
	
	
}
