package ar.edu.unju.fi.practico4.dominio;

public class Reserva {
	/**
	 * atributos de la clase reserva tipos de datos primivos
	 */
	private String origen;
	private String destino;
	private String fechaSalida;
	private String fechaRegreso;
	private String clase;
	private Pasajero pasajero;
	private String estado;

	/**
	 * constructor
	 */
	public Reserva() {
	}

	/**
	 * constructor sobrecargado
	 * 
	 * @param origen
	 * @param destino
	 * @param fechaSalida
	 * @param fechaRegreso
	 * @param clase
	 * @param pasajero
	 * @param estado
	 */
	public Reserva(String origen, String destino, String fechaSalida, String fechaRegreso, String clase,
			Pasajero pasajero, String estado) {

		this.origen = origen;
		this.destino = destino;
		this.fechaSalida = fechaSalida;
		this.fechaRegreso = fechaRegreso;
		this.clase = clase;
		this.pasajero = pasajero;
		this.estado = estado;

	}

	// METODOS GETERS Y SETERS

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getFechaRegreso() {
		return fechaRegreso;
	}

	public void setFechaRegreso(String fechaRegreso) {
		this.fechaRegreso = fechaRegreso;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Reserva \n origen = " + origen + "\n destino = " + destino + "\n fechaSalida = " + fechaSalida
				+ "\n fechaRegreso = " + fechaRegreso + "\n clase = " + clase + "\n pasajero = " + pasajero
				+ "\n estado = " + estado;
	}

}
