package Objetos;

import java.util.HashSet;
import java.util.Set;

public class CalculadoraDeDistancias {
	
	private Set<Ubicacion> ubicaciones;
	
	public CalculadoraDeDistancias() {
		this.ubicaciones= new HashSet<Ubicacion>();
	}
	
	public void agregarUbicacion(Ubicacion ubicacion) {
		this.ubicaciones.add(ubicacion);
	}

	public double distanciaCoord(Ubicacion ubicacion1, Ubicacion ubicacion2) {   
        double radioTierra= 6371;//en kilómetros  
        double dLat= Math.toRadians(ubicacion2.getLatitud() - ubicacion1.getLatitud());  
        double dLng= Math.toRadians(ubicacion2.getLongitud() - ubicacion1.getLatitud());  
        double sindLat= Math.sin(dLat / 2);  
        double sindLng= Math.sin(dLng / 2);  
        double va1= Math.pow(sindLat, 2) + Math.pow(sindLng, 2)  
                * Math.cos(Math.toRadians(ubicacion1.getLatitud())) 
                * Math.cos(Math.toRadians(ubicacion2.getLatitud()));  
        double va2= 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));  
        double distancia= radioTierra * va2;  
   
        return distancia;
	}
	
	public Set<Ubicacion> ubicacionesEncontradasAMenosDeXKilometrosDeUnaUbicacion(Set<Ubicacion> ubicaciones, Ubicacion ubicacionreferencia, Double distancia){
		Set<Ubicacion> resultado= new HashSet<Ubicacion>();
		for(Ubicacion ubicacion : ubicaciones) {
			if(this.distanciaCoord(ubicacion, ubicacionreferencia) <= distancia) {
				resultado.add(ubicacion);
				}
		}
		return resultado;
	}

	public Set<Ubicacion> getUbicaciones() {
		return this.ubicaciones;
	}
	
	/*
	public Set<Ubicacion> ubicacionesEncontradasAMenosDeXKilometros(Set<Ubicacion> ubicaciones, Double distancia){
		Set<Ubicacion> resultado= new HashSet<Ubicacion>();
		for(Ubicacion ubicacion : ubicaciones) {
			for(Ubicacion ubicacion2 : ubicaciones) {
				if(this.distanciaCoord(ubicacion, ubicacion2) == distancia) {
					
				}
			}
		}
		return ubicaciones;
		
	}
	*/
}
