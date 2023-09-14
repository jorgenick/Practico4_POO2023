package ar.edu.unju.fi.practico4.Practico4_POO2023;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.practico4.dominio.Pasajero;
import ar.edu.unju.fi.practico4.dominio.Reserva;
import ar.edu.unju.fi.practico4.manager.Manager;

@DisplayName("Test Jorge")
class ReservaManagerTestCase {

	static Reserva reserva2;
	static Reserva reserva3;
	static Reserva reserva4;
	static Reserva reserva5;
	static Reserva reserva6;
	static Reserva reserva7;
	static Manager reservaManager;

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Configurando en SetUp...");

		reservaManager = new Manager();
		reservaManager.cargarListas();

		// se carga previamente una reserva sin acompañante
		reserva2 = new Reserva(reservaManager.listaOrigen.get(3), reservaManager.listaDestino.get(3), "2000-06-17",
				"2010-07-01", reservaManager.listaClase.get(0),
				new Pasajero(reservaManager.listaNombresApellidos.get(1), 1545858525, 58222555, "jtolababsd@gmail.com",
						null),
				"Reservada");

		// se carga previamente una reserva con acompañante
		reserva3 = new Reserva(reservaManager.listaOrigen.get(1), reservaManager.listaDestino.get(2), "2020-01-22",
				"2023-05-17", reservaManager.listaClase.get(1),
				new Pasajero(reservaManager.listaNombresApellidos.get(0), 1545858525, 58222555, "jtolababsd@gmail.com",
						new Pasajero(reservaManager.listaNombresApellidos.get(2), 1545858525, 58222555,
								"jtolababsd@gmail.com", null)),
				"Reservada");
		// se carga previamente una reserva sin acompañante
		reserva4 = new Reserva(reservaManager.listaOrigen.get(3), reservaManager.listaDestino.get(3), "2000-06-17",
				"2010-07-01", reservaManager.listaClase.get(0),
				new Pasajero(reservaManager.listaNombresApellidos.get(1), 1545858525, 58222555, "jtolababsd@gmail.com",
						null),
				"Reservada");
		// se carga previamente una reserva sin acompañante
		reserva5 = new Reserva(reservaManager.listaOrigen.get(3), reservaManager.listaDestino.get(3), "2000-06-17",
				"2010-07-01", reservaManager.listaClase.get(0),
				new Pasajero(reservaManager.listaNombresApellidos.get(1), 1545858525, 58222555, "jtolababsd@gmail.com",
						null),
				"Reservada");
		// se carga previamente una reserva sin acompañante
		reserva6 = new Reserva(reservaManager.listaOrigen.get(3), reservaManager.listaDestino.get(3), "2000-06-17",
				"2010-07-01", reservaManager.listaClase.get(0),
				new Pasajero(reservaManager.listaNombresApellidos.get(1), 1545858525, 58222555, "jtolababsd@gmail.com",
						null),
				"Canselado");
		// se carga previamente una reserva sin acompañante
		reserva7 = new Reserva(reservaManager.listaOrigen.get(3), reservaManager.listaDestino.get(3), "2000-06-17",
				"2010-07-01", reservaManager.listaClase.get(0),
				new Pasajero(reservaManager.listaNombresApellidos.get(1), 1545858525, 58222555, "jtolababsd@gmail.com",
						null),
				"Reservada");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Limpiando variables de jorge...");
		reserva2 = null;
		reserva3 = null;
		reserva4 = null;
		reserva5 = null;
		reserva6 = null;
		reserva7 = null;
		reservaManager = null;
	}

	@Test
	@DisplayName("Registrar Reserva sin acompañante")
//	@Disabled
	void agregarReservaTest() {

		System.out.println("iniciando prueba de registro de reserva sin acompañante");
		reservaManager.agregarReserva(reserva2);
		Reserva reservaBuscada = reservaManager.buscarReserva("FRANCO TOLABA");
		assertNotNull(reservaBuscada);
		assertNull(reservaBuscada.getPasajero().getAcompaniante());
		System.out.println("reserva sin acompañante registrada");
		assertEquals("Reservada", reserva2.getEstado());
		System.out.println("reserva sin acompañante verificada");

	}

	@Test
	@DisplayName("Registrar Reserva con acompañante")
//	@Disabled
	void agregarReservaAcompanianteTest() {
		System.out.println("iniciando prueba de registro de reserva con acompañante");
		reservaManager.agregarReserva(reserva3);
		Reserva reservaBuscada = reservaManager.buscarReserva("juan perez");
		assertNotNull(reservaBuscada);
		assertNotNull(reservaBuscada.getPasajero().getAcompaniante());
		System.out.println("reserva con acompañante registrada");
		assertEquals("Reservada", reserva3.getEstado());
		System.out.println("reserva con acompañante verificada");

	}

	@Test
	@DisplayName("cancelar reserva")
	void cancelarReserva() {
		System.out.println("Iniciando prueba de canselacion de reserva");
		reservaManager.cancelarReserva(reserva2);
		assertEquals("Canselado", reserva2.getEstado());
		System.out.println("Reserva canselada con exito");

	}

	@Test
	@DisplayName("pagar reserva")
	void pagarReserva() {
		System.out.println("Iniciando prueba de pago de reserva");
		reservaManager.pagarReserva(reserva2);
		assertEquals("Pagado", reserva2.getEstado());
		System.out.println("Pago de reserva exitoso");
	}

	@Test
	@DisplayName("obtener listado de reservas de un estado determinado")
	void listaDeReservas() {
		List<Reserva> listaReservas = new ArrayList<>();
		List<Reserva> listaEstado = new ArrayList<Reserva>();

		listaReservas.add(reserva2);
		listaReservas.add(reserva3);
		listaReservas.add(reserva4);
		listaReservas.add(reserva5);
		listaReservas.add(reserva6);
		listaReservas.add(reserva7);

		listaEstado = reservaManager.obtenerListaEstado("Reservada", listaReservas);
		assertEquals(5, listaEstado.size());
	}

}
