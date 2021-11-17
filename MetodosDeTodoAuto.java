import java.util.ArrayList;

public interface MetodosDeTodoAuto{
	
	public void setEncendida(int num);
	
	public void setModo(int NumModo);
	
	public void setAMoFM(int num);
	
	public void setnombreListaDeReproduccionSeleccionada(String nuevoNombre);
	
	public void setListaDeReproduccionSeleccionada(ArrayList<Cancion> NuevaLista);
	
	public void setCancionSeleccionada(Cancion NuevaCancion);
	
	public void setTelefonoConectado(int num);
	
	public void cambiarFrecuencia();
	
	public void cargarFrecuencia(float nuevaFrecuencia);
	
	public String getModo();
	
	public boolean getEncendida();
	
	public int getVolumen();
	
	public float getFrecuencia();
	
	public String getAMoFM();
	
	public int getposCancion();
	
	public ArrayList<Cancion> getListaDeReproduccionSeleccionada();
	
	public Cancion getCancionSeleccionada();
	
	public boolean getTelefonoConectado();
	
	public void SubirVolumen();
	
	public void BajarVolumen();
	
	public void reiniciarposCancion();
	
	public void DisminuirposCancion();
	
	public void AumentarposCancion();
	
	public String getMensajeModoRadio();
	
	public String getMensajeModoReproduccion();
	
	public String getMensajeModoTelefono();
	
	public String getMensajeModoProductividad();
	
	public String MenuOpcionesModoRadio();
	
	public String MenuOpcionesModoReproduccion();
	
	public String MenuOpcionesModoTelefono();
	
	public String MenuOpcionesModoProductividad();
}