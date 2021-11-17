import java.util.ArrayList;
import java.util.Arrays;

public class Controlador{
	
	private ArrayList<Float> FrecuenciasGuardadas;
	private ArrayList<Cancion> ListaDeReproduccion1;
	private ArrayList<Cancion> ListaDeReproduccion2;
	private ArrayList<String> Contactos;
	
	public Controlador(){
		
		FrecuenciasGuardadas = new ArrayList<Float>();
		ListaDeReproduccion1 = new ArrayList<Cancion>();
		ListaDeReproduccion2 = new ArrayList<Cancion>();
		Contactos = new ArrayList<String>();
		
	}
	
	public void MetodoPrincipal(){
		
		//Mandar a mostrar el mensaje de bienvenida
		Vista.MensajeBienvenida();
		
		//Se mandan a llenar las listas de reproducciones
		LlenarListaDeReproduccion1();
		LlenarListaDeReproduccion2();
		
		//Se manda a llenar la lista de contactos
		LlenarContactos();
		
		//Se manda a ejecutar el ciclo principal
		Ciclo();
	}
	
	
	private void LlenarListaDeReproduccion1(){
		
		ArrayList<String> DatosCancion1 = new ArrayList<>(Arrays.asList("Despacito","4.5","Luis Fonsi y Daddy Yankee", "Pop"));
		Cancion Cancion1 = new Cancion(DatosCancion1);
		ListaDeReproduccion1.add(Cancion1);
		
		ArrayList<String> DatosCancion2 = new ArrayList<>(Arrays.asList("Waka Waka","3.8","Shakira", "Pop"));
		Cancion Cancion2 = new Cancion(DatosCancion2);
		ListaDeReproduccion1.add(Cancion2);
		
		ArrayList<String> DatosCancion3 = new ArrayList<>(Arrays.asList("Dark Horse","5.9","Katy Perry", "Pop"));
		Cancion Cancion3 = new Cancion(DatosCancion3);
		ListaDeReproduccion1.add(Cancion3);
		
		ArrayList<String> DatosCancion4 = new ArrayList<>(Arrays.asList("Shape of You","6.1","Ed Sheeran", "Pop"));
		Cancion Cancion4 = new Cancion(DatosCancion4);
		ListaDeReproduccion1.add(Cancion4);
		
		ArrayList<String> DatosCancion5 = new ArrayList<>(Arrays.asList("We Found Love","4.2","Rihanna", "Pop"));
		Cancion Cancion5 = new Cancion(DatosCancion5);
		ListaDeReproduccion1.add(Cancion5);
		
	}
	
	private void LlenarListaDeReproduccion2(){
		
		ArrayList<String> DatosCancion1 = new ArrayList<>(Arrays.asList("What a wonderful world","5.7","Louis Armstrong", "Jazz"));
		Cancion Cancion1 = new Cancion(DatosCancion1);
		ListaDeReproduccion2.add(Cancion1);
		
		ArrayList<String> DatosCancion2 = new ArrayList<>(Arrays.asList("Blue in Green","4.6","Miles Davis", "Jazz"));
		Cancion Cancion2 = new Cancion(DatosCancion2);
		ListaDeReproduccion2.add(Cancion2);
		
		ArrayList<String> DatosCancion3 = new ArrayList<>(Arrays.asList("Donna Lee","7.0","Charlie Parker", "Jazz"));
		Cancion Cancion3 = new Cancion(DatosCancion3);
		ListaDeReproduccion2.add(Cancion3);
		
		
		ArrayList<String> DatosCancion4 = new ArrayList<>(Arrays.asList("Fly me to the Moon","5.3","Frank Sinatra", "Jazz"));
		Cancion Cancion4 = new Cancion(DatosCancion4);
		ListaDeReproduccion2.add(Cancion4);
		
		
		ArrayList<String> DatosCancion5 = new ArrayList<>(Arrays.asList("Let's Fall in Love","8.2","Diana Krall", "Jazz"));
		Cancion Cancion5 = new Cancion(DatosCancion5);
		ListaDeReproduccion2.add(Cancion5);
		
	}
	
	private void LlenarContactos(){
		
		String contacto1 = "Papa";
		String contacto2 = "Mama";
		String contacto3 = "Jefe";
		String contacto4 = "Luis";
		String contacto5 = "Tio Mario";
		
		Contactos.add(contacto1);
		Contactos.add(contacto2);
		Contactos.add(contacto3);
		Contactos.add(contacto4);
		Contactos.add(contacto5);
		
	}
	
	private void Ciclo(){
		
		//Se pide el tipo de auto a utilizar
		int TipoVehiculo = Vista.PedirTipoVehiculo();
		
		//Se instancia la radio del auto
		if (TipoVehiculo == 1){
			
			RadioClaseS Radio = new RadioClaseS(ListaDeReproduccion1);
			
			String mensaje = "\n****************************************************************************************";
			Vista.MostrarMensaje(mensaje);
			
			//Se pregunta si desea encender el radio
			int EncenderONo = Vista.PedirEncenderRadio();
		
			if(EncenderONo == 1){
				//Si desea encender el radio
				
				Radio.setEncendida(EncenderONo);
				mensaje = "\n(Encendiendo la radio...)";
				Vista.MostrarMensaje(mensaje);
				
				//Se pide el modo en el que desea tener la radio
				mensaje = "\n****************************************************************************************";
				Vista.MostrarMensaje(mensaje);
				int modo = Vista.PedirModo();
			
				Radio.setModo(modo);
			
				//Se ejecuta el ciclo correspondiente con el tipo de vehiculo
				CicloVehiculoS(Radio);
			}else if(EncenderONo == 2){
				//Si desea salir
				Vista.MensajeDespedida();
			}
			
		}else if(TipoVehiculo == 2){
			RadioClaseC Radio = new RadioClaseC(ListaDeReproduccion1);
			
			String mensaje = "\n****************************************************************************************";
			Vista.MostrarMensaje(mensaje);
			
			//Se pregunta si desea encender el radio
			int EncenderONo = Vista.PedirEncenderRadio();
		
			if(EncenderONo == 1){
				//Si desea encender el radio
			
				Radio.setEncendida(EncenderONo);
				
				mensaje = "\n(Encendiendo la radio...)";
				Vista.MostrarMensaje(mensaje);
				
				//Se pide el modo en el que desea tener la radio
				mensaje = "\n****************************************************************************************";
				Vista.MostrarMensaje(mensaje);
				int modo = Vista.PedirModo();
			
				Radio.setModo(modo);
			
				//Se ejecuta el ciclo correspondiente con el tipo de vehiculo
				CicloVehiculoC(Radio);
			}else if(EncenderONo == 2){
				//Si desea salir
				Vista.MensajeDespedida();
			}
			
		}else if(TipoVehiculo == 3){
			RadioClaseA Radio = new RadioClaseA(ListaDeReproduccion1);
			
			String mensaje = "\n****************************************************************************************";
			Vista.MostrarMensaje(mensaje);
			
			//Se pregunta si desea encender el radio
			int EncenderONo = Vista.PedirEncenderRadio();
		
			if(EncenderONo == 1){
				//Si desea encender el radio
			
				Radio.setEncendida(EncenderONo);
				mensaje = "\n(Encendiendo la radio...)";
				Vista.MostrarMensaje(mensaje);
				
				//Se pide el modo en el que desea tener la radio
				mensaje = "\n****************************************************************************************";
				Vista.MostrarMensaje(mensaje);
				int modo = Vista.PedirModo();
			
				Radio.setModo(modo);
			
				//Se ejecuta el ciclo correspondiente con el tipo de vehiculo
				CicloVehiculoA(Radio);
				
			}else if(EncenderONo == 2){
				//Si desea salir
				Vista.MensajeDespedida();
			}
		}
		
	}
	
	
	//*****************************************************************************************************************************************************************************************************************************
	//*****************************************************************************************************************************************************************************************************************************
	//*****************************************************************************************************************************************************************************************************************************
	//*****************************************************************************************************************************************************************************************************************************
	
	//METODOS DEDICADOS AL TIPO DE AUTO S
	
	
	private void CicloVehiculoS(RadioClaseS Radio){
		
		boolean salir = false;
		
		while(!salir){
			
			String mensaje = "\n-------------------------------------------------------------------------------------------------------------------------------------------------";
			Vista.MostrarMensaje(mensaje);
			
			//Se muestra el estado de la radio
			MostrarEstadoDeLaRadioClaseS(Radio);
			
			boolean EstadoDeLaRadio = Radio.getEncendida();
			
			if(EstadoDeLaRadio){
				String modo = Radio.getModo();
				
				if(modo == "Radio"){
					salir = AccionesModoRadioClaseS(Radio);
				}else if(modo == "Reproduccion"){
					salir = AccionesModoReproduccionClaseS(Radio);
				}else if(modo == "Telefono"){
					salir = AccionesModoTelefonoClaseS(Radio);
				}else if(modo == "Productividad"){
					salir = AccionesModoProductividadClaseS(Radio);
				}
			}else{
				//Si la radio esta apagada
				int accion = Vista.PedirEncenderRadio();
				
				if(accion==1){
					//Si desea encenderla
					Radio.setEncendida(accion);
					mensaje = "\nLa radio ha sido encendida";
					Vista.MostrarMensaje(mensaje);
				}else if(accion==2){
					//Si desea salir
					salir = true;
				}
			}
		}
		
		//Si desea salir
		Vista.MensajeDespedida();
		
	}
	
	private void MostrarEstadoDeLaRadioClaseS(RadioClaseS Radio){
		
		String modo = Radio.getModo();
		String mensaje;
		
		mensaje = "\nEl estado de la radio es el siguiente: \n";
		Vista.MostrarMensaje(mensaje);
		
		if(modo == "Radio"){
			//Se muestra el estado de la radio
			mensaje = Radio.getMensajeModoRadio();
			Vista.MostrarMensaje(mensaje);
		}else if(modo == "Reproduccion"){
			//Se muestra el estado de la radio
			mensaje = Radio.getMensajeModoReproduccion();
			Vista.MostrarMensaje(mensaje);
		}else if(modo == "Telefono"){
			//Se muestra el estado de la radio
			mensaje = Radio.getMensajeModoTelefono();
			Vista.MostrarMensaje(mensaje);
		}else if(modo == "Productividad"){
			//Se muestra el estado de la radio
			mensaje = Radio.getMensajeModoProductividad();
			Vista.MostrarMensaje(mensaje);
		}
	}
	
	private boolean AccionesModoRadioClaseS(RadioClaseS Radio){
		
		boolean DeseaSalir = false;
		
		String menuOpciones = Radio.MenuOpcionesModoRadio();
		int opcion = Vista.PedirOpcionModoRadio(menuOpciones);
		
		if(opcion == 1){
			
			//Si desea cambiar el modo de la radio
			int nuevoModo = Vista.PedirNuevoModo();
			Radio.setModo(nuevoModo);
			String mensaje = "\nAhora el radio esta en modo " + Radio.getModo();
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 2){
			
			//Si desea cambiar volumen
			
			int TipoCambioVolumen = Vista.PedirCambioVolumen();
			
			if(TipoCambioVolumen == 1){
				//Si desea subir volumen
				Radio.SubirVolumen();
				String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
				Vista.MostrarMensaje(mensaje);
				
			}else if(TipoCambioVolumen == 2){
				//Si desea bajar volumen
				
				int volumenActual = Radio.getVolumen();
				
				if(volumenActual>0){
					Radio.BajarVolumen();
					String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
					Vista.MostrarMensaje(mensaje);
				}else{
					String mensaje = "\nNo se puede realizar esta accion ya que el volumen no puede ser un numero negativo";
					Vista.MostrarMensaje(mensaje);
				}
			}
			
		}else if(opcion == 3){
			//Si desea cambiar el tipo de frecuencia (AM o FM)
			
			int TipoAMoFM = Vista.PedirAMoFM();
			
			if(TipoAMoFM == 1){
				//Si desea cambiar a AM
				Radio.setAMoFM(TipoAMoFM);
				String mensaje = "\nEl nuevo tipo de frecuencia es AM";
				Vista.MostrarMensaje(mensaje);
			}else if(TipoAMoFM == 2){
				//Si desea bajar volumen
				Radio.setAMoFM(TipoAMoFM);
				String mensaje = "\nEl nuevo tipo de frecuencia es FM";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 4){
			//Si desea cambiar emisora
			
			Radio.cambiarFrecuencia();
			String mensaje = "\nLa nueva emisora que esta escuchando es la " + Radio.getFrecuencia() + " " + Radio.getAMoFM();
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 5){
			//Si desea guardar una emisora
			
			int numEmisorasGuardadas = FrecuenciasGuardadas.size();
			
			if(numEmisorasGuardadas<50){
				float NuevaEmisora = Vista.PedirNuevaEmisora();
				FrecuenciasGuardadas.add(NuevaEmisora);
				String mensaje = "\nLa emisora " + NuevaEmisora + " ha sido guardada exitosamente.";
				Vista.MostrarMensaje(mensaje);
			}else{
				String mensaje = "\nNo se puede realizar esta accion, ya que se ha llegado al limite de 50 emisoras guardadas.";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 6){
			//Si desea cargar una emisora
			
			if(FrecuenciasGuardadas.size()>0){
				int posEmisoraACargar = Vista.PedirEmisoraACargar(FrecuenciasGuardadas);
				float emisoraACargar = FrecuenciasGuardadas.get(posEmisoraACargar);
				Radio.cargarFrecuencia(emisoraACargar);
				
				String mensaje = "\nOperacion realizada con exito. Actualmente esta escuchando la emisora: " + emisoraACargar;
				Vista.MostrarMensaje(mensaje);
			}else{
				String mensaje = "\nNo se puede realizar esta accion. Guarde primero una emisora para poder cargarla";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 7){
			//Si desea apagar la radio
			
			Radio.setEncendida(2);
			String mensaje = "\nLa radio ha sido apagada";
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 8){
			DeseaSalir = true;
		}
		
		return DeseaSalir;
		
	}
	
	private boolean AccionesModoReproduccionClaseS(RadioClaseS Radio){
		
		boolean DeseaSalir = false;
		
		String menuOpciones = Radio.MenuOpcionesModoReproduccion();
		int opcion = Vista.PedirOpcionModoReproduccion(menuOpciones);
		
		if(opcion == 1){
			//Si desea cambiar el modo de la radio
			int nuevoModo = Vista.PedirNuevoModo();
			Radio.setModo(nuevoModo);
			String mensaje = "\nAhora el radio esta en modo " + Radio.getModo();
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 2){
			//Si desea cambiar volumen
			
			int TipoCambioVolumen = Vista.PedirCambioVolumen();
			
			if(TipoCambioVolumen == 1){
				//Si desea subir volumen
				Radio.SubirVolumen();
				String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
				Vista.MostrarMensaje(mensaje);
				
			}else if(TipoCambioVolumen == 2){
				//Si desea bajar volumen
				
				int volumenActual = Radio.getVolumen();
				
				if(volumenActual>0){
					Radio.BajarVolumen();
					String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
					Vista.MostrarMensaje(mensaje);
				}else{
					String mensaje = "\nNo se puede realizar esta accion ya que el volumen no puede ser un numero negativo";
					Vista.MostrarMensaje(mensaje);
				}
			}
			
		}else if(opcion == 3){
			//Si desea seleccionar una lista de reproduccion
			String NombreListaReproduccion = Vista.PedirListaDeReproduccion();
			
			if(NombreListaReproduccion == "Canciones de Pop"){
				//Si selecciono la lista de canciones de pop
				
				Radio.setnombreListaDeReproduccionSeleccionada(NombreListaReproduccion);
				Radio.reiniciarposCancion();
				Radio.setListaDeReproduccionSeleccionada(ListaDeReproduccion1);
				Cancion NuevaCancion = ListaDeReproduccion1.get(0);
				Radio.setCancionSeleccionada(NuevaCancion);
				
				String mensaje = "\nHa seleccionado la lista de reproduccion '" + NombreListaReproduccion + "'";
				Vista.MostrarMensaje(mensaje);
				
			}else if(NombreListaReproduccion == "Canciones de Jazz"){
				//Si selecciono la lista de canciones de jazz
				
				Radio.setnombreListaDeReproduccionSeleccionada(NombreListaReproduccion);
				Radio.reiniciarposCancion();
				Radio.setListaDeReproduccionSeleccionada(ListaDeReproduccion2);
				Cancion NuevaCancion = ListaDeReproduccion2.get(0);
				Radio.setCancionSeleccionada(NuevaCancion);
				
				String mensaje = "\nHa seleccionado la lista de reproduccion '" + NombreListaReproduccion + "'";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 4){
			//Si desea cambiar cancion
			
			int AvanzarORetroceder = Vista.PedirFormaDeAvanzarEnLaLista();
			
			if(AvanzarORetroceder == 1){
				//Si desea poner la cancion anterior
				
				int posCancionActual = Radio.getposCancion();
				
				if(posCancionActual==0){
					String mensaje = "\nNo se puede realizar esta accion ya que la cancion que esta seleccionada actualmente es la primera de la lista de reproduccion";
					Vista.MostrarMensaje(mensaje);
				}else{
					
					Radio.DisminuirposCancion();
					int posNuevaCancionActual = Radio.getposCancion();
					ArrayList<Cancion> ListaDeReproduccion = Radio.getListaDeReproduccionSeleccionada();
					Cancion NuevaCancion = ListaDeReproduccion.get(posNuevaCancionActual);
					Radio.setCancionSeleccionada(NuevaCancion);
					
					String mensaje = "\nLa nueva cancion seleccionada es '" + NuevaCancion.getNombre() + "' de " + NuevaCancion.getAutor();
					Vista.MostrarMensaje(mensaje);
					
				}
				
			}else if(AvanzarORetroceder == 2){
				//Si desea poner la cancion posterior
				
				int posCancionActual = Radio.getposCancion();
				
				if(posCancionActual==4){
					String mensaje = "\nNo se puede realizar esta accion ya que la cancion que esta seleccionada actualmente es la ultima de la lista de reproduccion";
					Vista.MostrarMensaje(mensaje);
				}else{
					
					Radio.AumentarposCancion();
					int posNuevaCancionActual = Radio.getposCancion();
					ArrayList<Cancion> ListaDeReproduccion = Radio.getListaDeReproduccionSeleccionada();
					Cancion NuevaCancion = ListaDeReproduccion.get(posNuevaCancionActual);
					Radio.setCancionSeleccionada(NuevaCancion);
					
					String mensaje = "\nLa nueva cancion seleccionada es '" + NuevaCancion.getNombre() + "' de " + NuevaCancion.getAutor();
					Vista.MostrarMensaje(mensaje);
					
				}
				
			}
			
			
		}else if(opcion == 5){
			//Si desea escuchar la cancion
			
			Cancion CancionActual = Radio.getCancionSeleccionada();
			String InfoCancion = CancionActual.toString();
			Vista.EscucharCancion(InfoCancion);
			
			
		}else if(opcion == 6){
			//Si desea apagar la radio
			
			Radio.setEncendida(2);
			String mensaje = "\nLa radio ha sido apagada";
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 7){
			//Si desea salir
			DeseaSalir = true;
		}
		
		return DeseaSalir;
		
	}
	
	private boolean AccionesModoTelefonoClaseS(RadioClaseS Radio){
		
		boolean DeseaSalir = false;
		
		String menuOpciones = Radio.MenuOpcionesModoTelefono();
		int opcion = Vista.PedirOpcionModoTelefono(menuOpciones, 1, 8);
		
		if(opcion == 1){
			
			//Si desea cambiar el modo de la radio
			int nuevoModo = Vista.PedirNuevoModo();
			Radio.setModo(nuevoModo);
			String mensaje = "\nAhora el radio esta en modo " + Radio.getModo();
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 2){
			
			//Si desea cambiar volumen
			
			int TipoCambioVolumen = Vista.PedirCambioVolumen();
			
			if(TipoCambioVolumen == 1){
				//Si desea subir volumen
				Radio.SubirVolumen();
				String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
				Vista.MostrarMensaje(mensaje);
				
			}else if(TipoCambioVolumen == 2){
				//Si desea bajar volumen
				
				int volumenActual = Radio.getVolumen();
				
				if(volumenActual>0){
					Radio.BajarVolumen();
					String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
					Vista.MostrarMensaje(mensaje);
				}else{
					String mensaje = "\nNo se puede realizar esta accion ya que el volumen no puede ser un numero negativo";
					Vista.MostrarMensaje(mensaje);
				}
			}
			
		}else if(opcion == 3){
			//Si desea conectar o desconectar el telefono
			
			int DesicionSobreConectarTelefono = Vista.PedirConectarODesconectarTelefono();
			
			if(DesicionSobreConectarTelefono == 1){
				Radio.setTelefonoConectado(DesicionSobreConectarTelefono);
				String mensaje = "\nSe ha conectado el radio";
				Vista.MostrarMensaje(mensaje);
			}else if(DesicionSobreConectarTelefono == 2){
				Radio.setTelefonoConectado(DesicionSobreConectarTelefono);
				String mensaje = "\nSe ha desconectado el radio";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 4){
			//Si desea ver los contactos
			
			boolean ElTelefonoEstaConectado = Radio.getTelefonoConectado();
			
			if(ElTelefonoEstaConectado){
				
				Vista.MostrarContactos(Contactos);
				
			}else if(!ElTelefonoEstaConectado){
				String mensaje = "\nNo se puede realizar esta accion. Conecte primero el telefono para poder ver los contactos";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 5){
			//Si desea llamar a algun contacto
			
			boolean ElTelefonoEstaConectado = Radio.getTelefonoConectado();
			
			if(ElTelefonoEstaConectado){
				
				String ContactoALlamar = Vista.PedirContactoALlamar(Contactos);
				Vista.LlamarAContacto(ContactoALlamar);
				
			}else if(!ElTelefonoEstaConectado){
				String mensaje = "\nNo se puede realizar esta accion. Conecte primero el telefono para poder realizar una llamada";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 6){
			//Si desea cambiar a bocinas o auriculares
			boolean ElTelefonoEstaConectado = Radio.getTelefonoConectado();
			
			if(ElTelefonoEstaConectado){
				
				int SalidaDeAudio = Vista.PedirSalidaDeAudio();
				
				if(SalidaDeAudio == 1){
					
					Radio.setBocinas(SalidaDeAudio);
					String mensaje = "\nSe ha seleccionado la bocina como salida de audio";
					Vista.MostrarMensaje(mensaje);
					
				}else if(SalidaDeAudio == 2){
					
					Radio.setBocinas(SalidaDeAudio);
					String mensaje = "\nSe han seleccionado los auriculares como salida de audio";
					Vista.MostrarMensaje(mensaje);
					
				}
				
			}else if(!ElTelefonoEstaConectado){
				String mensaje = "\nNo se puede realizar esta accion. Conecte primero el telefono para poder cambiar la salida de audio";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 7){
			//Si desea apagar la radio
			
			Radio.setEncendida(2);
			String mensaje = "\nLa radio ha sido apagada";
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 8){
			DeseaSalir = true;
		}
		
		return DeseaSalir;
		
	}
	
	private boolean AccionesModoProductividadClaseS(RadioClaseS Radio){
		
		boolean DeseaSalir = false;
		
		String menuOpciones = Radio.MenuOpcionesModoProductividad();
		int opcion = Vista.PedirOpcionModoProductividad(menuOpciones);
		
		if(opcion == 1){
			
			//Si desea cambiar el modo de la radio
			int nuevoModo = Vista.PedirNuevoModo();
			Radio.setModo(nuevoModo);
			String mensaje = "\nAhora el radio esta en modo " + Radio.getModo();
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 2){
			
			//Si desea cambiar volumen
			
			int TipoCambioVolumen = Vista.PedirCambioVolumen();
			
			if(TipoCambioVolumen == 1){
				//Si desea subir volumen
				Radio.SubirVolumen();
				String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
				Vista.MostrarMensaje(mensaje);
				
			}else if(TipoCambioVolumen == 2){
				//Si desea bajar volumen
				
				int volumenActual = Radio.getVolumen();
				
				if(volumenActual>0){
					Radio.BajarVolumen();
					String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
					Vista.MostrarMensaje(mensaje);
				}else{
					String mensaje = "\nNo se puede realizar esta accion ya que el volumen no puede ser un numero negativo";
					Vista.MostrarMensaje(mensaje);
				}
			}
			
		}else if(opcion == 3){
			//Si desea planificar viajes
			
			Vista.PlanificarViajes();
			
		}else if(opcion == 4){
			//Si desea apagar la radio
			
			Radio.setEncendida(2);
			String mensaje = "\nLa radio ha sido apagada";
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 5){
			DeseaSalir = true;
		}
		
		return DeseaSalir;
		
	}
	
	
	//*****************************************************************************************************************************************************************************************************************************
	//*****************************************************************************************************************************************************************************************************************************
	//*****************************************************************************************************************************************************************************************************************************
	//*****************************************************************************************************************************************************************************************************************************
	
	//METODOS DEDICADOS AL TIPO DE AUTO C	
	
	
	private void CicloVehiculoC(RadioClaseC Radio){
		
		boolean salir = false;
		
		while(!salir){
			
			String mensaje = "\n-------------------------------------------------------------------------------------------------------------------------------------------------";
			Vista.MostrarMensaje(mensaje);
			
			//Se muestra el estado de la radio
			MostrarEstadoDeLaRadioClaseC(Radio);
			
			boolean EstadoDeLaRadio = Radio.getEncendida();
			
			if(EstadoDeLaRadio){
				String modo = Radio.getModo();
				
				if(modo == "Radio"){
					salir = AccionesModoRadioClaseC(Radio);
				}else if(modo == "Reproduccion"){
					salir = AccionesModoReproduccionClaseC(Radio);
				}else if(modo == "Telefono"){
					salir = AccionesModoTelefonoClaseC(Radio);
				}else if(modo == "Productividad"){
					salir = AccionesModoProductividadClaseC(Radio);
				}
			}else{
				//Si la radio esta apagada
				int accion = Vista.PedirEncenderRadio();
				
				if(accion==1){
					//Si desea encenderla
					Radio.setEncendida(accion);
					mensaje = "\nLa radio ha sido encendida";
					Vista.MostrarMensaje(mensaje);
				}else if(accion==2){
					//Si desea salir
					salir = true;
				}
			}
		}
		
		//Si desea salir
		Vista.MensajeDespedida();
		
	}
	
	private void MostrarEstadoDeLaRadioClaseC(RadioClaseC Radio){
		
		String modo = Radio.getModo();
		String mensaje;
		
		mensaje = "\nEl estado de la radio es el siguiente: \n";
		Vista.MostrarMensaje(mensaje);
		
		if(modo == "Radio"){
			//Se muestra el estado de la radio
			mensaje = Radio.getMensajeModoRadio();
			Vista.MostrarMensaje(mensaje);
		}else if(modo == "Reproduccion"){
			//Se muestra el estado de la radio
			mensaje = Radio.getMensajeModoReproduccion();
			Vista.MostrarMensaje(mensaje);
		}else if(modo == "Telefono"){
			//Se muestra el estado de la radio
			mensaje = Radio.getMensajeModoTelefono();
			Vista.MostrarMensaje(mensaje);
		}else if(modo == "Productividad"){
			//Se muestra el estado de la radio
			mensaje = Radio.getMensajeModoProductividad();
			Vista.MostrarMensaje(mensaje);
		}
	}
	
	private boolean AccionesModoRadioClaseC(RadioClaseC Radio){
		
		boolean DeseaSalir = false;
		
		String menuOpciones = Radio.MenuOpcionesModoRadio();
		int opcion = Vista.PedirOpcionModoRadio(menuOpciones);
		
		if(opcion == 1){
			
			//Si desea cambiar el modo de la radio
			int nuevoModo = Vista.PedirNuevoModo();
			Radio.setModo(nuevoModo);
			String mensaje = "\nAhora el radio esta en modo " + Radio.getModo();
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 2){
			
			//Si desea cambiar volumen
			
			int TipoCambioVolumen = Vista.PedirCambioVolumen();
			
			if(TipoCambioVolumen == 1){
				//Si desea subir volumen
				Radio.SubirVolumen();
				String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
				Vista.MostrarMensaje(mensaje);
				
			}else if(TipoCambioVolumen == 2){
				//Si desea bajar volumen
				
				int volumenActual = Radio.getVolumen();
				
				if(volumenActual>0){
					Radio.BajarVolumen();
					String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
					Vista.MostrarMensaje(mensaje);
				}else{
					String mensaje = "\nNo se puede realizar esta accion ya que el volumen no puede ser un numero negativo";
					Vista.MostrarMensaje(mensaje);
				}
			}
			
		}else if(opcion == 3){
			//Si desea cambiar el tipo de frecuencia (AM o FM)
			
			int TipoAMoFM = Vista.PedirAMoFM();
			
			if(TipoAMoFM == 1){
				//Si desea cambiar a AM
				Radio.setAMoFM(TipoAMoFM);
				String mensaje = "\nEl nuevo tipo de frecuencia es AM";
				Vista.MostrarMensaje(mensaje);
			}else if(TipoAMoFM == 2){
				//Si desea bajar volumen
				Radio.setAMoFM(TipoAMoFM);
				String mensaje = "\nEl nuevo tipo de frecuencia es FM";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 4){
			//Si desea cambiar emisora
			
			Radio.cambiarFrecuencia();
			String mensaje = "\nLa nueva emisora que esta escuchando es la " + Radio.getFrecuencia() + " " + Radio.getAMoFM();
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 5){
			//Si desea guardar una emisora
			
			int numEmisorasGuardadas = FrecuenciasGuardadas.size();
			
			if(numEmisorasGuardadas<50){
				float NuevaEmisora = Vista.PedirNuevaEmisora();
				FrecuenciasGuardadas.add(NuevaEmisora);
				String mensaje = "\nLa emisora " + NuevaEmisora + " ha sido guardada exitosamente.";
				Vista.MostrarMensaje(mensaje);
			}else{
				String mensaje = "\nNo se puede realizar esta accion, ya que se ha llegado al limite de 50 emisoras guardadas.";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 6){
			//Si desea cargar una emisora
			
			if(FrecuenciasGuardadas.size()>0){
				int posEmisoraACargar = Vista.PedirEmisoraACargar(FrecuenciasGuardadas);
				float emisoraACargar = FrecuenciasGuardadas.get(posEmisoraACargar);
				Radio.cargarFrecuencia(emisoraACargar);
				
				String mensaje = "\nOperacion realizada con exito. Actualmente esta escuchando la emisora: " + emisoraACargar;
				Vista.MostrarMensaje(mensaje);
			}else{
				String mensaje = "\nNo se puede realizar esta accion. Guarde primero una emisora para poder cargarla";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 7){
			//Si desea apagar la radio
			
			Radio.setEncendida(2);
			String mensaje = "\nLa radio ha sido apagada";
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 8){
			DeseaSalir = true;
		}
		
		return DeseaSalir;
		
	}
	
	private boolean AccionesModoReproduccionClaseC(RadioClaseC Radio){
		
		boolean DeseaSalir = false;
		
		String menuOpciones = Radio.MenuOpcionesModoReproduccion();
		int opcion = Vista.PedirOpcionModoReproduccion(menuOpciones);
		
		if(opcion == 1){
			//Si desea cambiar el modo de la radio
			int nuevoModo = Vista.PedirNuevoModo();
			Radio.setModo(nuevoModo);
			String mensaje = "\nAhora el radio esta en modo " + Radio.getModo();
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 2){
			//Si desea cambiar volumen
			
			int TipoCambioVolumen = Vista.PedirCambioVolumen();
			
			if(TipoCambioVolumen == 1){
				//Si desea subir volumen
				Radio.SubirVolumen();
				String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
				Vista.MostrarMensaje(mensaje);
				
			}else if(TipoCambioVolumen == 2){
				//Si desea bajar volumen
				
				int volumenActual = Radio.getVolumen();
				
				if(volumenActual>0){
					Radio.BajarVolumen();
					String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
					Vista.MostrarMensaje(mensaje);
				}else{
					String mensaje = "\nNo se puede realizar esta accion ya que el volumen no puede ser un numero negativo";
					Vista.MostrarMensaje(mensaje);
				}
			}
			
		}else if(opcion == 3){
			//Si desea seleccionar una lista de reproduccion
			String NombreListaReproduccion = Vista.PedirListaDeReproduccion();
			
			if(NombreListaReproduccion == "Canciones de Pop"){
				//Si selecciono la lista de canciones de pop
				
				Radio.setnombreListaDeReproduccionSeleccionada(NombreListaReproduccion);
				Radio.reiniciarposCancion();
				Radio.setListaDeReproduccionSeleccionada(ListaDeReproduccion1);
				Cancion NuevaCancion = ListaDeReproduccion1.get(0);
				Radio.setCancionSeleccionada(NuevaCancion);
				
				String mensaje = "\nHa seleccionado la lista de reproduccion '" + NombreListaReproduccion + "'";
				Vista.MostrarMensaje(mensaje);
				
			}else if(NombreListaReproduccion == "Canciones de Jazz"){
				//Si selecciono la lista de canciones de jazz
				
				Radio.setnombreListaDeReproduccionSeleccionada(NombreListaReproduccion);
				Radio.reiniciarposCancion();
				Radio.setListaDeReproduccionSeleccionada(ListaDeReproduccion2);
				Cancion NuevaCancion = ListaDeReproduccion2.get(0);
				Radio.setCancionSeleccionada(NuevaCancion);
				
				String mensaje = "\nHa seleccionado la lista de reproduccion '" + NombreListaReproduccion + "'";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 4){
			//Si desea cambiar cancion
			
			int AvanzarORetroceder = Vista.PedirFormaDeAvanzarEnLaLista();
			
			if(AvanzarORetroceder == 1){
				//Si desea poner la cancion anterior
				
				int posCancionActual = Radio.getposCancion();
				
				if(posCancionActual==0){
					String mensaje = "\nNo se puede realizar esta accion ya que la cancion que esta seleccionada actualmente es la primera de la lista de reproduccion";
					Vista.MostrarMensaje(mensaje);
				}else{
					
					Radio.DisminuirposCancion();
					int posNuevaCancionActual = Radio.getposCancion();
					ArrayList<Cancion> ListaDeReproduccion = Radio.getListaDeReproduccionSeleccionada();
					Cancion NuevaCancion = ListaDeReproduccion.get(posNuevaCancionActual);
					Radio.setCancionSeleccionada(NuevaCancion);
					
					String mensaje = "\nLa nueva cancion seleccionada es '" + NuevaCancion.getNombre() + "' de " + NuevaCancion.getAutor();
					Vista.MostrarMensaje(mensaje);
					
				}
				
			}else if(AvanzarORetroceder == 2){
				//Si desea poner la cancion posterior
				
				int posCancionActual = Radio.getposCancion();
				
				if(posCancionActual==4){
					String mensaje = "\nNo se puede realizar esta accion ya que la cancion que esta seleccionada actualmente es la ultima de la lista de reproduccion";
					Vista.MostrarMensaje(mensaje);
				}else{
					
					Radio.AumentarposCancion();
					int posNuevaCancionActual = Radio.getposCancion();
					ArrayList<Cancion> ListaDeReproduccion = Radio.getListaDeReproduccionSeleccionada();
					Cancion NuevaCancion = ListaDeReproduccion.get(posNuevaCancionActual);
					Radio.setCancionSeleccionada(NuevaCancion);
					
					String mensaje = "\nLa nueva cancion seleccionada es '" + NuevaCancion.getNombre() + "' de " + NuevaCancion.getAutor();
					Vista.MostrarMensaje(mensaje);
					
				}
				
			}
			
			
		}else if(opcion == 5){
			//Si desea escuchar la cancion
			
			Cancion CancionActual = Radio.getCancionSeleccionada();
			String InfoCancion = CancionActual.toString();
			Vista.EscucharCancion(InfoCancion);
			
			
		}else if(opcion == 6){
			//Si desea apagar la radio
			
			Radio.setEncendida(2);
			String mensaje = "\nLa radio ha sido apagada";
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 7){
			//Si desea salir
			DeseaSalir = true;
		}
		
		return DeseaSalir;
		
	}
	
	private boolean AccionesModoTelefonoClaseC(RadioClaseC Radio){
		
		boolean DeseaSalir = false;
		
		String menuOpciones = Radio.MenuOpcionesModoTelefono();
		int opcion = Vista.PedirOpcionModoTelefono(menuOpciones, 1, 8);
		
		if(opcion == 1){
			
			//Si desea cambiar el modo de la radio
			int nuevoModo = Vista.PedirNuevoModo();
			Radio.setModo(nuevoModo);
			String mensaje = "\nAhora el radio esta en modo " + Radio.getModo();
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 2){
			
			//Si desea cambiar volumen
			
			int TipoCambioVolumen = Vista.PedirCambioVolumen();
			
			if(TipoCambioVolumen == 1){
				//Si desea subir volumen
				Radio.SubirVolumen();
				String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
				Vista.MostrarMensaje(mensaje);
				
			}else if(TipoCambioVolumen == 2){
				//Si desea bajar volumen
				
				int volumenActual = Radio.getVolumen();
				
				if(volumenActual>0){
					Radio.BajarVolumen();
					String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
					Vista.MostrarMensaje(mensaje);
				}else{
					String mensaje = "\nNo se puede realizar esta accion ya que el volumen no puede ser un numero negativo";
					Vista.MostrarMensaje(mensaje);
				}
			}
			
		}else if(opcion == 3){
			//Si desea conectar o desconectar el telefono
			
			int DesicionSobreConectarTelefono = Vista.PedirConectarODesconectarTelefono();
			
			if(DesicionSobreConectarTelefono == 1){
				Radio.setTelefonoConectado(DesicionSobreConectarTelefono);
				String mensaje = "\nSe ha conectado el radio";
				Vista.MostrarMensaje(mensaje);
			}else if(DesicionSobreConectarTelefono == 2){
				Radio.setTelefonoConectado(DesicionSobreConectarTelefono);
				String mensaje = "\nSe ha desconectado el radio";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 4){
			//Si desea ver los contactos
			
			boolean ElTelefonoEstaConectado = Radio.getTelefonoConectado();
			
			if(ElTelefonoEstaConectado){
				
				Vista.MostrarContactos(Contactos);
				
			}else if(!ElTelefonoEstaConectado){
				String mensaje = "\nNo se puede realizar esta accion. Conecte primero el telefono para poder ver los contactos";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 5){
			//Si desea llamar a algun contacto
			
			boolean ElTelefonoEstaConectado = Radio.getTelefonoConectado();
			
			if(ElTelefonoEstaConectado){
				
				String ContactoALlamar = Vista.PedirContactoALlamar(Contactos);
				Vista.LlamarAContacto(ContactoALlamar);
				
			}else if(!ElTelefonoEstaConectado){
				String mensaje = "\nNo se puede realizar esta accion. Conecte primero el telefono para poder realizar una llamada";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 6){
			//Si desea cambiar llamada en espera
			boolean ElTelefonoEstaConectado = Radio.getTelefonoConectado();
			
			if(ElTelefonoEstaConectado){
				
				int DeseaHabilitarLlamadaEnEspera = Vista.PedirLlamadaEnEspera();
				
				if(DeseaHabilitarLlamadaEnEspera == 1){
					Radio.setTieneLlamadaEnEspera(DeseaHabilitarLlamadaEnEspera);
					
					String mensaje = "\nSe ha habilitado la funcion de llamada en espera. A partir de ahora, si usted esta ocupado en una llamda, y otra persona le llama, esa persona podra esperar a que usted se desocupe";
					Vista.MostrarMensaje(mensaje);
					
				}else if(DeseaHabilitarLlamadaEnEspera == 2){
					Radio.setTieneLlamadaEnEspera(DeseaHabilitarLlamadaEnEspera);
					
					String mensaje = "\nSe ha habilitado la funcion de llamada en espera. A partir de ahora, si usted esta ocupado en una llamda, y otra persona le llama, esa persona podra esperar a que usted se desocupe";
					Vista.MostrarMensaje(mensaje);
				}
				
			}else if(!ElTelefonoEstaConectado){
				String mensaje = "\nNo se puede realizar esta accion. Conecte primero el telefono para poder cambiar la llamada en espera";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 7){
			//Si desea apagar la radio
			
			Radio.setEncendida(2);
			String mensaje = "\nLa radio ha sido apagada";
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 8){
			DeseaSalir = true;
		}
		
		return DeseaSalir;
		
	}
	
	private boolean AccionesModoProductividadClaseC(RadioClaseC Radio){
		
		boolean DeseaSalir = false;
		
		String menuOpciones = Radio.MenuOpcionesModoProductividad();
		int opcion = Vista.PedirOpcionModoProductividad(menuOpciones);
		
		if(opcion == 1){
			
			//Si desea cambiar el modo de la radio
			int nuevoModo = Vista.PedirNuevoModo();
			Radio.setModo(nuevoModo);
			String mensaje = "\nAhora el radio esta en modo " + Radio.getModo();
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 2){
			
			//Si desea cambiar volumen
			
			int TipoCambioVolumen = Vista.PedirCambioVolumen();
			
			if(TipoCambioVolumen == 1){
				//Si desea subir volumen
				Radio.SubirVolumen();
				String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
				Vista.MostrarMensaje(mensaje);
				
			}else if(TipoCambioVolumen == 2){
				//Si desea bajar volumen
				
				int volumenActual = Radio.getVolumen();
				
				if(volumenActual>0){
					Radio.BajarVolumen();
					String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
					Vista.MostrarMensaje(mensaje);
				}else{
					String mensaje = "\nNo se puede realizar esta accion ya que el volumen no puede ser un numero negativo";
					Vista.MostrarMensaje(mensaje);
				}
			}
			
		}else if(opcion == 3){
			//Si desea planificar viajes
			
			Vista.VerPronosticoDelClima();
			
		}else if(opcion == 4){
			//Si desea apagar la radio
			
			Radio.setEncendida(2);
			String mensaje = "\nLa radio ha sido apagada";
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 5){
			DeseaSalir = true;
		}
		
		return DeseaSalir;
		
	}
	
	
	//*****************************************************************************************************************************************************************************************************************************
	//*****************************************************************************************************************************************************************************************************************************
	//*****************************************************************************************************************************************************************************************************************************
	//*****************************************************************************************************************************************************************************************************************************
	
	//METODOS DEDICADOS AL TIPO DE AUTO A
	
	
	private void CicloVehiculoA(RadioClaseA Radio){
		
		boolean salir = false;
		
		while(!salir){
			
			String mensaje = "\n-------------------------------------------------------------------------------------------------------------------------------------------------";
			Vista.MostrarMensaje(mensaje);
			
			//Se muestra el estado de la radio
			MostrarEstadoDeLaRadioClaseA(Radio);
			
			boolean EstadoDeLaRadio = Radio.getEncendida();
			
			if(EstadoDeLaRadio){
				String modo = Radio.getModo();
				
				if(modo == "Radio"){
					salir = AccionesModoRadioClaseA(Radio);
				}else if(modo == "Reproduccion"){
					salir = AccionesModoReproduccionClaseA(Radio);
				}else if(modo == "Telefono"){
					salir = AccionesModoTelefonoClaseA(Radio);
				}else if(modo == "Productividad"){
					salir = AccionesModoProductividadClaseA(Radio);
				}
			}else{
				//Si la radio esta apagada
				int accion = Vista.PedirEncenderRadio();
				
				if(accion==1){
					//Si desea encenderla
					Radio.setEncendida(accion);
					mensaje = "\nLa radio ha sido encendida";
					Vista.MostrarMensaje(mensaje);
				}else if(accion==2){
					//Si desea salir
					salir = true;
				}
			}
		}
		
		//Si desea salir
		Vista.MensajeDespedida();
		
	}
	
	private void MostrarEstadoDeLaRadioClaseA(RadioClaseA Radio){
		
		String modo = Radio.getModo();
		String mensaje;
		
		mensaje = "\nEl estado de la radio es el siguiente: \n";
		Vista.MostrarMensaje(mensaje);
		
		if(modo == "Radio"){
			//Se muestra el estado de la radio
			mensaje = Radio.getMensajeModoRadio();
			Vista.MostrarMensaje(mensaje);
		}else if(modo == "Reproduccion"){
			//Se muestra el estado de la radio
			mensaje = Radio.getMensajeModoReproduccion();
			Vista.MostrarMensaje(mensaje);
		}else if(modo == "Telefono"){
			//Se muestra el estado de la radio
			mensaje = Radio.getMensajeModoTelefono();
			Vista.MostrarMensaje(mensaje);
		}else if(modo == "Productividad"){
			//Se muestra el estado de la radio
			mensaje = Radio.getMensajeModoProductividad();
			Vista.MostrarMensaje(mensaje);
		}
	}
	
	private boolean AccionesModoRadioClaseA(RadioClaseA Radio){
		
		boolean DeseaSalir = false;
		
		String menuOpciones = Radio.MenuOpcionesModoRadio();
		int opcion = Vista.PedirOpcionModoRadio(menuOpciones);
		
		if(opcion == 1){
			
			//Si desea cambiar el modo de la radio
			int nuevoModo = Vista.PedirNuevoModo();
			Radio.setModo(nuevoModo);
			String mensaje = "\nAhora el radio esta en modo " + Radio.getModo();
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 2){
			
			//Si desea cambiar volumen
			
			int TipoCambioVolumen = Vista.PedirCambioVolumen();
			
			if(TipoCambioVolumen == 1){
				//Si desea subir volumen
				Radio.SubirVolumen();
				String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
				Vista.MostrarMensaje(mensaje);
				
			}else if(TipoCambioVolumen == 2){
				//Si desea bajar volumen
				
				int volumenActual = Radio.getVolumen();
				
				if(volumenActual>0){
					Radio.BajarVolumen();
					String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
					Vista.MostrarMensaje(mensaje);
				}else{
					String mensaje = "\nNo se puede realizar esta accion ya que el volumen no puede ser un numero negativo";
					Vista.MostrarMensaje(mensaje);
				}
			}
			
		}else if(opcion == 3){
			//Si desea cambiar el tipo de frecuencia (AM o FM)
			
			int TipoAMoFM = Vista.PedirAMoFM();
			
			if(TipoAMoFM == 1){
				//Si desea cambiar a AM
				Radio.setAMoFM(TipoAMoFM);
				String mensaje = "\nEl nuevo tipo de frecuencia es AM";
				Vista.MostrarMensaje(mensaje);
			}else if(TipoAMoFM == 2){
				//Si desea bajar volumen
				Radio.setAMoFM(TipoAMoFM);
				String mensaje = "\nEl nuevo tipo de frecuencia es FM";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 4){
			//Si desea cambiar emisora
			
			Radio.cambiarFrecuencia();
			String mensaje = "\nLa nueva emisora que esta escuchando es la " + Radio.getFrecuencia() + " " + Radio.getAMoFM();
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 5){
			//Si desea guardar una emisora
			
			int numEmisorasGuardadas = FrecuenciasGuardadas.size();
			
			if(numEmisorasGuardadas<50){
				float NuevaEmisora = Vista.PedirNuevaEmisora();
				FrecuenciasGuardadas.add(NuevaEmisora);
				String mensaje = "\nLa emisora " + NuevaEmisora + " ha sido guardada exitosamente.";
				Vista.MostrarMensaje(mensaje);
			}else{
				String mensaje = "\nNo se puede realizar esta accion, ya que se ha llegado al limite de 50 emisoras guardadas.";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 6){
			//Si desea cargar una emisora
			
			if(FrecuenciasGuardadas.size()>0){
				int posEmisoraACargar = Vista.PedirEmisoraACargar(FrecuenciasGuardadas);
				float emisoraACargar = FrecuenciasGuardadas.get(posEmisoraACargar);
				Radio.cargarFrecuencia(emisoraACargar);
				
				String mensaje = "\nOperacion realizada con exito. Actualmente esta escuchando la emisora: " + emisoraACargar;
				Vista.MostrarMensaje(mensaje);
			}else{
				String mensaje = "\nNo se puede realizar esta accion. Guarde primero una emisora para poder cargarla";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 7){
			//Si desea apagar la radio
			
			Radio.setEncendida(2);
			String mensaje = "\nLa radio ha sido apagada";
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 8){
			DeseaSalir = true;
		}
		
		return DeseaSalir;
		
	}
	
	private boolean AccionesModoReproduccionClaseA(RadioClaseA Radio){
		
		boolean DeseaSalir = false;
		
		String menuOpciones = Radio.MenuOpcionesModoReproduccion();
		int opcion = Vista.PedirOpcionModoReproduccion(menuOpciones);
		
		if(opcion == 1){
			//Si desea cambiar el modo de la radio
			int nuevoModo = Vista.PedirNuevoModo();
			Radio.setModo(nuevoModo);
			String mensaje = "\nAhora el radio esta en modo " + Radio.getModo();
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 2){
			//Si desea cambiar volumen
			
			int TipoCambioVolumen = Vista.PedirCambioVolumen();
			
			if(TipoCambioVolumen == 1){
				//Si desea subir volumen
				Radio.SubirVolumen();
				String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
				Vista.MostrarMensaje(mensaje);
				
			}else if(TipoCambioVolumen == 2){
				//Si desea bajar volumen
				
				int volumenActual = Radio.getVolumen();
				
				if(volumenActual>0){
					Radio.BajarVolumen();
					String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
					Vista.MostrarMensaje(mensaje);
				}else{
					String mensaje = "\nNo se puede realizar esta accion ya que el volumen no puede ser un numero negativo";
					Vista.MostrarMensaje(mensaje);
				}
			}
			
		}else if(opcion == 3){
			//Si desea seleccionar una lista de reproduccion
			String NombreListaReproduccion = Vista.PedirListaDeReproduccion();
			
			if(NombreListaReproduccion == "Canciones de Pop"){
				//Si selecciono la lista de canciones de pop
				
				Radio.setnombreListaDeReproduccionSeleccionada(NombreListaReproduccion);
				Radio.reiniciarposCancion();
				Radio.setListaDeReproduccionSeleccionada(ListaDeReproduccion1);
				Cancion NuevaCancion = ListaDeReproduccion1.get(0);
				Radio.setCancionSeleccionada(NuevaCancion);
				
				String mensaje = "\nHa seleccionado la lista de reproduccion '" + NombreListaReproduccion + "'";
				Vista.MostrarMensaje(mensaje);
				
			}else if(NombreListaReproduccion == "Canciones de Jazz"){
				//Si selecciono la lista de canciones de jazz
				
				Radio.setnombreListaDeReproduccionSeleccionada(NombreListaReproduccion);
				Radio.reiniciarposCancion();
				Radio.setListaDeReproduccionSeleccionada(ListaDeReproduccion2);
				Cancion NuevaCancion = ListaDeReproduccion2.get(0);
				Radio.setCancionSeleccionada(NuevaCancion);
				
				String mensaje = "\nHa seleccionado la lista de reproduccion '" + NombreListaReproduccion + "'";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 4){
			//Si desea cambiar cancion
			
			int AvanzarORetroceder = Vista.PedirFormaDeAvanzarEnLaLista();
			
			if(AvanzarORetroceder == 1){
				//Si desea poner la cancion anterior
				
				int posCancionActual = Radio.getposCancion();
				
				if(posCancionActual==0){
					String mensaje = "\nNo se puede realizar esta accion ya que la cancion que esta seleccionada actualmente es la primera de la lista de reproduccion";
					Vista.MostrarMensaje(mensaje);
				}else{
					
					Radio.DisminuirposCancion();
					int posNuevaCancionActual = Radio.getposCancion();
					ArrayList<Cancion> ListaDeReproduccion = Radio.getListaDeReproduccionSeleccionada();
					Cancion NuevaCancion = ListaDeReproduccion.get(posNuevaCancionActual);
					Radio.setCancionSeleccionada(NuevaCancion);
					
					String mensaje = "\nLa nueva cancion seleccionada es '" + NuevaCancion.getNombre() + "' de " + NuevaCancion.getAutor();
					Vista.MostrarMensaje(mensaje);
					
				}
				
			}else if(AvanzarORetroceder == 2){
				//Si desea poner la cancion posterior
				
				int posCancionActual = Radio.getposCancion();
				
				if(posCancionActual==4){
					String mensaje = "\nNo se puede realizar esta accion ya que la cancion que esta seleccionada actualmente es la ultima de la lista de reproduccion";
					Vista.MostrarMensaje(mensaje);
				}else{
					
					Radio.AumentarposCancion();
					int posNuevaCancionActual = Radio.getposCancion();
					ArrayList<Cancion> ListaDeReproduccion = Radio.getListaDeReproduccionSeleccionada();
					Cancion NuevaCancion = ListaDeReproduccion.get(posNuevaCancionActual);
					Radio.setCancionSeleccionada(NuevaCancion);
					
					String mensaje = "\nLa nueva cancion seleccionada es '" + NuevaCancion.getNombre() + "' de " + NuevaCancion.getAutor();
					Vista.MostrarMensaje(mensaje);
					
				}
				
			}
			
			
		}else if(opcion == 5){
			//Si desea escuchar la cancion
			
			Cancion CancionActual = Radio.getCancionSeleccionada();
			String InfoCancion = CancionActual.toString();
			Vista.EscucharCancion(InfoCancion);
			
			
		}else if(opcion == 6){
			//Si desea apagar la radio
			
			Radio.setEncendida(2);
			String mensaje = "\nLa radio ha sido apagada";
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 7){
			//Si desea salir
			DeseaSalir = true;
		}
		
		return DeseaSalir;
		
	}
	
	private boolean AccionesModoTelefonoClaseA(RadioClaseA Radio){
		
		boolean DeseaSalir = false;
		
		String menuOpciones = Radio.MenuOpcionesModoTelefono();
		int opcion = Vista.PedirOpcionModoTelefono(menuOpciones, 1, 8);
		
		if(opcion == 1){
			
			//Si desea cambiar el modo de la radio
			int nuevoModo = Vista.PedirNuevoModo();
			Radio.setModo(nuevoModo);
			String mensaje = "\nAhora el radio esta en modo " + Radio.getModo();
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 2){
			
			//Si desea cambiar volumen
			
			int TipoCambioVolumen = Vista.PedirCambioVolumen();
			
			if(TipoCambioVolumen == 1){
				//Si desea subir volumen
				Radio.SubirVolumen();
				String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
				Vista.MostrarMensaje(mensaje);
				
			}else if(TipoCambioVolumen == 2){
				//Si desea bajar volumen
				
				int volumenActual = Radio.getVolumen();
				
				if(volumenActual>0){
					Radio.BajarVolumen();
					String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
					Vista.MostrarMensaje(mensaje);
				}else{
					String mensaje = "\nNo se puede realizar esta accion ya que el volumen no puede ser un numero negativo";
					Vista.MostrarMensaje(mensaje);
				}
			}
			
		}else if(opcion == 3){
			//Si desea conectar o desconectar el telefono
			
			int DesicionSobreConectarTelefono = Vista.PedirConectarODesconectarTelefono();
			
			if(DesicionSobreConectarTelefono == 1){
				Radio.setTelefonoConectado(DesicionSobreConectarTelefono);
				String mensaje = "\nSe ha conectado el radio";
				Vista.MostrarMensaje(mensaje);
			}else if(DesicionSobreConectarTelefono == 2){
				Radio.setTelefonoConectado(DesicionSobreConectarTelefono);
				String mensaje = "\nSe ha desconectado el radio";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 4){
			//Si desea ver los contactos
			
			boolean ElTelefonoEstaConectado = Radio.getTelefonoConectado();
			
			if(ElTelefonoEstaConectado){
				
				Vista.MostrarContactos(Contactos);
				
			}else if(!ElTelefonoEstaConectado){
				String mensaje = "\nNo se puede realizar esta accion. Conecte primero el telefono para poder ver los contactos";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 5){
			//Si desea llamar a algun contacto
			
			boolean ElTelefonoEstaConectado = Radio.getTelefonoConectado();
			
			if(ElTelefonoEstaConectado){
				
				String ContactoALlamar = Vista.PedirContactoALlamar(Contactos);
				Radio.setNombreUltimoContacto(ContactoALlamar);
				Vista.LlamarAContacto(ContactoALlamar);
				
			}else if(!ElTelefonoEstaConectado){
				String mensaje = "\nNo se puede realizar esta accion. Conecte primero el telefono para poder realizar una llamada";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 6){
			//Si desea llamar al ultimo contacto con el que hablo
			
			boolean ElTelefonoEstaConectado = Radio.getTelefonoConectado();
			
			if(ElTelefonoEstaConectado){
				
				String NombreUltimoContacto = Radio.getNombreUltimoContacto();
				
				if(NombreUltimoContacto != null){
					
					Vista.LlamarAContacto(NombreUltimoContacto);
					
				}else if(NombreUltimoContacto == null){
					
					String mensaje = "\nNo se puede realizar esta accion. Primero debe llamar a alguien";
					Vista.MostrarMensaje(mensaje);
				}
				
			}else if(!ElTelefonoEstaConectado){
				String mensaje = "\nNo se puede realizar esta accion. Conecte primero el telefono para poder llamar al ultimo contacto";
				Vista.MostrarMensaje(mensaje);
			}
			
		}else if(opcion == 7){
			//Si desea apagar la radio
			
			Radio.setEncendida(2);
			String mensaje = "\nLa radio ha sido apagada";
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 8){
			DeseaSalir = true;
		}
		
		return DeseaSalir;
		
	}
	
	private boolean AccionesModoProductividadClaseA(RadioClaseA Radio){
		
		boolean DeseaSalir = false;
		
		String menuOpciones = Radio.MenuOpcionesModoProductividad();
		int opcion = Vista.PedirOpcionModoProductividad(menuOpciones);
		
		if(opcion == 1){
			
			//Si desea cambiar el modo de la radio
			int nuevoModo = Vista.PedirNuevoModo();
			Radio.setModo(nuevoModo);
			String mensaje = "\nAhora el radio esta en modo " + Radio.getModo();
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 2){
			
			//Si desea cambiar volumen
			
			int TipoCambioVolumen = Vista.PedirCambioVolumen();
			
			if(TipoCambioVolumen == 1){
				//Si desea subir volumen
				Radio.SubirVolumen();
				String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
				Vista.MostrarMensaje(mensaje);
				
			}else if(TipoCambioVolumen == 2){
				//Si desea bajar volumen
				
				int volumenActual = Radio.getVolumen();
				
				if(volumenActual>0){
					Radio.BajarVolumen();
					String mensaje = "\nEl nuevo volumen es " + Radio.getVolumen();
					Vista.MostrarMensaje(mensaje);
				}else{
					String mensaje = "\nNo se puede realizar esta accion ya que el volumen no puede ser un numero negativo";
					Vista.MostrarMensaje(mensaje);
				}
			}
			
		}else if(opcion == 3){
			//Si desea ver tarjetas de presentacion
			
			Vista.VerTarjetasDePresentacion();
			
		}else if(opcion == 4){
			//Si desea apagar la radio
			
			Radio.setEncendida(2);
			String mensaje = "\nLa radio ha sido apagada";
			Vista.MostrarMensaje(mensaje);
			
		}else if(opcion == 5){
			DeseaSalir = true;
		}
		
		return DeseaSalir;
		
	}
	
}