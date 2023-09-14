package ar.edu.unju.fi.practico4.manager;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.practico4.dominio.Pasajero;
import ar.edu.unju.fi.practico4.dominio.Reserva;

public class Manager {

	/**
	 * creacion de listas para luego ser cargadas
	 */
	public static List<Reserva> listaReservas = new ArrayList<Reserva>();
	public static List<String> listaOrigen = new ArrayList<String>();
	public static List<String> listaDestino = new ArrayList<String>();
	public static List<String> listaClase = new ArrayList<String>();
	public static List<String> listaNombresApellidos = new ArrayList<String>();
	/**
	 * se crea un objeto de tipo pasajero
	 */
	public static Pasajero pasajero = new Pasajero();

	/**
	 * metodo que sirve para craer listas de acuerdo a lo solicitado en el enunciado
	 */
	public static void cargarListas() {
// se carga una lista de lugares de origen
		listaOrigen.add("JUJUY");
		listaOrigen.add("SALTA");
		listaOrigen.add("TUCUMAN");
		listaOrigen.add("SANTIAGO DEL ESTERO");
		listaOrigen.add("CORDOBA");
// se carga una lista de lugares de destino
		listaDestino.add("BUENOS AIRES");
		listaDestino.add("FORMOSA");
		listaDestino.add("SAN JUAN");
		listaDestino.add("MENDOZA");
		listaDestino.add("MISIONES");
// se carga una lista de tipo de clase
		listaClase.add("Economy");
		listaClase.add("Business");
// se carga una lista de nombres y apellidos
		listaNombresApellidos.add("juan perez");
		listaNombresApellidos.add("FRANCO TOLABA");
		listaNombresApellidos.add("DIEGO TOLABA");
		listaNombresApellidos.add("JUAN TOLABA");
	}

	/**
	 * metodo "OPCIONAL" para registrar una reserva ( no utilizado en el test)
	 * 
	 * @param reserva
	 * @return retorna una reserva cargada
	 */
	public static Reserva registrarReserva(Reserva reserva) {
		cargarListas();

		reserva = new Reserva(listaOrigen.get(3), listaDestino.get(3), "2000-06-17", "2010-07-01", listaClase.get(0),
				new Pasajero(listaNombresApellidos.get(1), 1545858525, 58222555, "jtolababsd@gmail.com", null),
				"Reservada");
		System.out.println(reserva);

		return reserva;

	}

	/**
	 * metodo que sirve para agregar reservas
	 * 
	 * @param reserva
	 */
	public static void agregarReserva(Reserva reserva) {

		listaReservas.add(reserva);

	}

	/**
	 * metodo que devuelve una lista de reservas de acuerdo a un estado ingresado
	 * 
	 * @param estado
	 * @return una lista cargada
	 */
	public static List obtenerListaReservaEstado(String estado) {

		cargarListas();

		List<Reserva> listaEstado = new ArrayList<Reserva>();

		for (Reserva reserva : listaEstado) {
			if (reserva.getEstado() == "Pagada")
				listaEstado.add(reserva);
		}

		return listaEstado;
	}

	/**
	 * metodo que sirve para buscar una reserva determinada, en este caso de acuerdo
	 * al nombre del pasajero
	 * 
	 * @param nombre
	 * @return retorna el objeto que contiene el nombre del pasajero que realizo la
	 *         reserva
	 */
	public static Reserva buscarReserva(String nombre) {

		for (Reserva reservaBuscada : listaReservas)
			if (reservaBuscada.getPasajero().getNombreApellido().equalsIgnoreCase(nombre))
				return reservaBuscada;

		return null;
	}

	/**
	 * metodo que sirve para canselar una reserva
	 * 
	 * @param reserva
	 */
	public static void cancelarReserva(Reserva reserva) {

		reserva.setEstado("Canselado");
	}

	/**
	 * metodo que sirve para registrar como pagada una reserva
	 * 
	 * @param reserva
	 */
	public static void pagarReserva(Reserva reserva) {
		reserva.setEstado("Pagado");
	}

	/**
	 * metodo que sirve para obtener un listado de acuerdo a un determinado estado
	 * 
	 * @param estado
	 * @param listaCargada
	 * @return devuelve una lista
	 */
	public static List obtenerListaEstado(String estado, List<Reserva> listaCargada) {
		List<Reserva> nuevaListaReservas = new ArrayList<Reserva>();

		for (Reserva res : listaCargada)
			if (res.getEstado().equals(estado))
				nuevaListaReservas.add(res);

		return nuevaListaReservas;
	}

}
