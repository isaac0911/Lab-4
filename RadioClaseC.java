import java.util.ArrayList;

public class RadioClaseC implements MetodosClaseC{
	
	private boolean Encendida;
	private int volumen;
	private String modo;
	private String AMoFM;
	private float Frecuencia;
	private ArrayList<Cancion> ListaDeReproduccionSeleccionada;
	private String nombreListaDeReproduccionSeleccionada;
	private int posCancion;
	private Cancion CancionSeleccionada;
	private boolean TelefonoConectado;
	private boolean TieneLlamadaEnEspera;
	
	public RadioClaseC(ArrayList<Cancion> ListaDeReproduccion){
		
		Encendida = false;
		volumen = 20;
		modo = null;
		AMoFM = "AM";
		Frecuencia = 57.5f;
		ListaDeReproduccionSeleccionada = ListaDeReproduccion;
		nombreListaDeReproduccionSeleccionada = "Canciones de Pop";
		posCancion = 0;
		CancionSeleccionada = ListaDeReproduccion.get(0);
		TelefonoConectado = false;
		TieneLlamadaEnEspera = false;
	}
	
	public void setEncendida(int num){
		
		if(num==1){
			Encendida = true;
		}
		if(num==2){
			Encendida = false;
		}
	}
	
	public void setModo(int NumModo){
		
		if(NumModo==1){
			modo = "Radio";
		}else if(NumModo==2){
			modo = "Reproduccion";
		}else if(NumModo==3){
			modo = "Telefono";
		}else if(NumModo==4){
			modo = "Productividad";
		}
	}
	
	public void setAMoFM(int num){
		if(num==1){
			AMoFM = "AM";
		}
		if(num==2){
			AMoFM = "FM";
		}
	}
	
	public void setnombreListaDeReproduccionSeleccionada(String nuevoNombre){
		nombreListaDeReproduccionSeleccionada = nuevoNombre;
	}
	
	public void setListaDeReproduccionSeleccionada(ArrayList<Cancion> NuevaLista){
		ListaDeReproduccionSeleccionada = NuevaLista;
	}
	
	public void setCancionSeleccionada(Cancion NuevaCancion){
		CancionSeleccionada = NuevaCancion;
	}
	
	public void setTelefonoConectado(int num){
		if(num==1){
			TelefonoConectado = true;
		}
		if(num==2){
			TelefonoConectado = false;
		}
	}
	
	public void setTieneLlamadaEnEspera(int num){
		if(num==1){
			TieneLlamadaEnEspera = true;
		}
		if(num==2){
			TieneLlamadaEnEspera = false;
		}
	}
	
	public void cambiarFrecuencia(){
		Frecuencia = Frecuencia + 0.5f;
	}
	
	public void cargarFrecuencia(float nuevaFrecuencia){
		Frecuencia = nuevaFrecuencia;
	}
	
	public boolean getEncendida(){
		return Encendida;
	}
	
	public String getModo(){
		return modo;
	}
	
	public int getVolumen(){
		return volumen;
	}
	
	public float getFrecuencia(){
		return Frecuencia;
	}
	
	public String getAMoFM(){
		return AMoFM;
	}
	
	public int getposCancion(){
		return posCancion;
	}
	
	public ArrayList<Cancion> getListaDeReproduccionSeleccionada(){
		return ListaDeReproduccionSeleccionada;
	}
	
	public Cancion getCancionSeleccionada(){
		return CancionSeleccionada;
	}
	
	public boolean getTelefonoConectado(){
		return TelefonoConectado;
	}
	
	public void SubirVolumen(){
		volumen++;
	}
	
	public void BajarVolumen(){
		volumen--;
	}
	
	public void reiniciarposCancion(){
		posCancion = 0;
	}
	
	public void DisminuirposCancion(){
		posCancion--;
	}
	
	public void AumentarposCancion(){
		posCancion++;
	}
	
	public String getMensajeModoRadio(){
		
		String estado = "";
		if(Encendida){
			estado = "Encendida";
		}else{
			estado = "Apagada";
		}
		
		String mensaje = "\tEstado de la radio: " + estado + "\n\tModo:" + modo + "\n\tVolumen: " + volumen + "\n\tTipo de radio: " + AMoFM + "\n\tEmisora: " + Frecuencia;
		return mensaje;
	}
	
	public String getMensajeModoReproduccion(){
		
		String estado = "";
		if(Encendida){
			estado = "Encendida";
		}else{
			estado = "Apagada";
		}
		
		String mensaje = "\tEstado de la radio: " + estado + "\n\tModo:" + modo + "\n\tVolumen: " + volumen  + "\n\tLista de reproduccion seleccionada: " + nombreListaDeReproduccionSeleccionada + "\n\tNombre de la cancion: " + CancionSeleccionada.getNombre() + "\n\tAutor: " + CancionSeleccionada.getAutor();
		return mensaje;
	}
	
	public String getMensajeModoTelefono(){
		
		String estado = "";
		if(Encendida){
			estado = "Encendida";
		}else{
			estado = "Apagada";
		}
		
		String EstadoTelefono = "";
		if(TelefonoConectado){
			EstadoTelefono = "Conectado";
		}else if(!TelefonoConectado){
			EstadoTelefono = "Desconectado";
		}
		
		String FuncionDeLlamadaEnEspera = "";
		if(TieneLlamadaEnEspera){
			FuncionDeLlamadaEnEspera = "Habilidata";
		}else if(!TieneLlamadaEnEspera){
			FuncionDeLlamadaEnEspera = "Deshabilitada";
		}
		
		String mensaje = "\tEstado de la radio: " + estado + "\n\tModo:" + modo + "\n\tVolumen: " + volumen  + "\n\tEstado del telefono: " + EstadoTelefono + "\n\tFuncion de llamada en espera: " + FuncionDeLlamadaEnEspera;
		
		return mensaje;
	}
	
	public String getMensajeModoProductividad(){
		
		String estado = "";
		if(Encendida){
			estado = "Encendida";
		}else{
			estado = "Apagada";
		}
		
		String mensaje = "\tEstado de la radio: " + estado + "\n\tModo:" + modo + "\n\tVolumen: " + volumen ;
		return mensaje;
	}
	
	public String MenuOpcionesModoRadio(){
		String mensaje = "1.\tCambiar modo de la radio\n2.\tCambiar volumen a la radio\n3.\tCambiar de FM a AM o viceversa\n4.\tCambiar emisora\n5.\tGuardar emisora\n6.\tCargar emisora\n7.\tApagar la radio\n8.\tSalir";
		return mensaje;
	}
	
	public String MenuOpcionesModoReproduccion(){
		String mensaje = "1.\tCambiar modo de la radio\n2.\tCambiar volumen a la radio\n3.\tSeleccionar lista de reproduccion\n4.\tCambiar Cancion\n5.\tEscuchar cancion\n6.\tApagar la radio\n7.\tSalir";
		return mensaje;
	}
	
	public String MenuOpcionesModoTelefono(){
		String mensaje = "1.\tCambiar modo de la radio\n2.\tCambiar volumen a la radio\n3.\tConectar/Desconectar telefono\n4.\tMostrar contactos\n5.\tLlamar a contacto\n6.\tCambiar llamada en espera\n7.\tApagar la radio\n8.\tSalir";
		return mensaje;
	}
	
	public String MenuOpcionesModoProductividad(){
		String mensaje = "1.\tCambiar modo de la radio\n2.\tCambiar volumen a la radio\n3.\tVer pronostico del tiempo\n4.\tApagar la radio\n5.\tSalir";
		return mensaje;
	}
	
}