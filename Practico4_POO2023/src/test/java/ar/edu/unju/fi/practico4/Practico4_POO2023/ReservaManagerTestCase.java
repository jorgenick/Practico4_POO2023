package ar.edu.unju.fi.practico4.Practico4_POO2023;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.practico4.dominio.Pasajero;
import ar.edu.unju.fi.practico4.dominio.Reserva;
import ar.edu.unju.fi.practico4.manager.Manager;


@DisplayName("Test Jorge")
class ReservaManagerTestCase {
	
	static Reserva reserva1;
	static Reserva reserva2;
	static Reserva reserva3;
	static Manager reservaManager;
	static List<Reserva> listaReservas = new ArrayList<>();
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Configurando en SetUp...");
		
		
		reservaManager = new Manager();
		reservaManager.cargarListas();
		
		reserva1 = reservaManager.registrarReserva(reserva1);
		// se carga previamente una reserva sin acompañante
		reserva2 = new Reserva(reservaManager.listaOrigen.get(3)
				, reservaManager.listaDestino.get(3)
				, "2000-06-17", "2010-07-01"
				, reservaManager.listaClase.get(0)
				,    new Pasajero(reservaManager.listaNombresApellidos.get(1)
						, 1545858525, 58222555
						, "jtolababsd@gmail.com", null),
				"Reservada");
		//se carga previamente una reserva con acompañante
		reserva3 = new Reserva(reservaManager.listaOrigen.get(1)
				, reservaManager.listaDestino.get(2)
				, "2020-01-22", "2023-05-17"
				, reservaManager.listaClase.get(1)
				,    new Pasajero(reservaManager.listaNombresApellidos.get(0)
						, 1545858525, 58222555
						, "jtolababsd@gmail.com",
						  new Pasajero(reservaManager.listaNombresApellidos.get(2)
									, 1545858525, 58222555
									, "jtolababsd@gmail.com",
									null)),
				"Reservada");
	}
	
	@Test
	@DisplayName("Registrar Reserva sin acompañante")
	@Disabled
	void agregarReservaTest() {
		
		System.out.println("iniciando prueba de registro de reserva");
		reservaManager.agregarReserva(reserva1);
		Reserva reservaBuscada = reservaManager.buscarReserva("FRANCO TOLABA");
		assertNotNull (reservaBuscada);
		assertNull(reservaBuscada.getPasajero().getAcompaniante());
	}
	
	@Test
	@DisplayName("Registrar Reserva con acompañante")
//	@Disabled
	void agregarReservaAcompanianteTest() {
		System.out.println("iniciando prueba de registro de reserva con acompaniante");
		reservaManager.agregarReserva(reserva3);
		Reserva reservaBuscada = reservaManager.buscarReserva("JORGE TOLABA");
//		assertNotNull (reservaBuscada);
//		assertNotNull(reservaBuscada.getPasajero().getAcompaniante());
	}
	
	
//	@Test
//	@DisplayName("hola")
//	void test() {
////		fail("Not yet implemented");
//	}

}
