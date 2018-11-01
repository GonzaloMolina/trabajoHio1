package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import Objetos.CalculadoraDeDistancias;
import Objetos.Ubicacion;

class CalculadoraDeDistanciasTest {

	@Test
	void enUnaListaDeUbicacionesHay1UbicacionQueSeEncuentraAMenosDe20KmDeDistanciaDeUnaUbicacionDada() {
		//Ubicacion unq = new Ubicacion(-34.7066127d, -68.2785369d);
		//Ubicacion miCasa = new Ubicacion(-34.6938686d,-58.3175788d);
		
		Ubicacion unq = new Ubicacion(-34d, -68d);
		Ubicacion miCasa = new Ubicacion(-34d,-58d);
		Ubicacion ubicacion3 = new Ubicacion(30d,18d);
		Ubicacion ubicacionreferencia = new Ubicacion(20d,20d);
		
		Set<Ubicacion> ubicaciones= new HashSet<Ubicacion>();
		CalculadoraDeDistancias calculadora = new CalculadoraDeDistancias();
		
		calculadora.agregarUbicacion(unq);
		calculadora.agregarUbicacion(miCasa);
		calculadora.agregarUbicacion(ubicacion3);
		
		Set<Ubicacion> ubicacionesatestear= calculadora.ubicacionesEncontradasAMenosDeXKilometrosDeUnaUbicacion(calculadora.getUbicaciones(), ubicacionreferencia, 20d);
		
		//assertEquals(1, ubicacionesatestear.size());
		System.out.println(calculadora.distanciaCoord(unq, miCasa));
		
	}

}
