import java.util.ArrayList;

public class Cancion{
	
	private String Nombre;
	private float DuracionEnMin;
	private String Autor;
	private String Genero;
	
	public Cancion(ArrayList<String> DatosNuevaCancion){
		
		Nombre = DatosNuevaCancion.get(0);
		DuracionEnMin = Float.parseFloat(DatosNuevaCancion.get(1));
		Autor = DatosNuevaCancion.get(2);
		Genero = DatosNuevaCancion.get(3);
		
	}
	
	public String getNombre(){
		return Nombre;
	}
	
	public float getDuracionEnMin(){
		return DuracionEnMin;
	}
	
	public String getAutor(){
		return Autor;
	}
	
	public String getGenero(){
		return Genero;
	}
	
	public String toString (){
		String mensaje = "\n\tNombre: " + Nombre + "\n\tDuracion: " + DuracionEnMin + " min\n\tAutor: " + Autor + "\n\tGenero: " + Genero;
		return mensaje;
	}
	
}