package ar.edu.unju.fi.practico4.manager;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.practico4.dominio.Pasajero;
import ar.edu.unju.fi.practico4.dominio.Reserva;

public class Manager {

	public static List<Reserva> listaReservas = new ArrayList<Reserva>();

	public static List<String> listaOrigen = new ArrayList<String>();
	public static List<String> listaDestino = new ArrayList<String>();
	public static List<String> listaClase = new ArrayList<String>();
	public static List<String> listaNombresApellidos = new ArrayList<String>();

	public static Pasajero pasajero = new Pasajero();

	public static void cargarListas() {

		listaOrigen.add("JUJUY");
		listaOrigen.add("SALTA");
		listaOrigen.add("TUCUMAN");
		listaOrigen.add("SANTIAGO DEL ESTERO");
		listaOrigen.add("CORDOBA");

		listaDestino.add("BUENOS AIRES");
		listaDestino.add("FORMOSA");
		listaDestino.add("SAN JUAN");
		listaDestino.add("MENDOZA");
		listaDestino.add("MISIONES");

		listaClase.add("Economy");
		listaClase.add("Business");

		listaNombresApellidos.add("JORGE T0LABA");
		listaNombresApellidos.add("FRANCO TOLABA");
		listaNombresApellidos.add("DIEGO TOLABA");
		listaNombresApellidos.add("JUAN TOLABA");

	}

	public static void registrarReserva() {
		cargarListas();

		Reserva reserva = new Reserva(listaOrigen.get(3), listaDestino.get(3), "2000-06-17", "2010-07-01",
				listaClase.get(0),
				new Pasajero(listaNombresApellidos.get(1), 1545858525, 58222555, "jtolababsd@gmail.com", null),
				"Reservada");

		System.out.println(reserva);

	}

	public static void agregarReserva(Reserva reserva) {

		listaReservas.add(reserva);

	}

	public static List obtenerListaReservaEstado(String estado) {

		cargarListas();

		List<Reserva> listaEstado = new ArrayList<Reserva>();

		for (Reserva reserva : listaEstado) {
			if (reserva.getEstado() == "Pagada")
				listaEstado.add(reserva);
		}

		return listaEstado;
	}

}
