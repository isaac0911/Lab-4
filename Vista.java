import java.util.Scanner;
import java.util.ArrayList;

public class Vista{
	
	/**
	 * Muestra el mensaje de bienvenida
	 * @version 08/11/2021
	 */
	public static void MensajeBienvenida(){
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------------\nBIENVENIDO AL SIMULADOR DE RADIOS DE MERCEDEZ BENZ");
	}
	
	/**
	 * Muestra el mensaje de despedida
	 * @version 08/11/2021
	 */
	public static void MensajeDespedida(){
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------------\nGraciar por visitarnos. Feliz dia.\n-------------------------------------------------------------------------------------------------------------------------------------------------\n");
	}
	
	public static void MostrarMensaje (String mensaje){
		System.out.println(mensaje);
	}
	
	public static int PedirTipoVehiculo(){
		
		int numero = 0;
		String opcion = "";
		boolean validacion = false;
		
		//Se muestran las opciones y se recibe el dato
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------------\nDe que clase es su vehiculo?");
		System.out.println("1.\tClase S");
		System.out.println("2.\tClase C");
		System.out.println("3.\tClase A");
			
		opcion = scan.nextLine();
		
		//Se comprueba que el dato esté dentro del rango permitido
		validacion = comprobarNumero(opcion);
		
		if (validacion){
			numero = Integer.parseInt(opcion);
		}
		
		while (validacion = false || numero<1 || numero>3){
			System.out.println("ERROR!! Ingrese un numero entre 1 y 3.");
			opcion = scan.nextLine();
			validacion = comprobarNumero(opcion);
			if (validacion){
				numero = Integer.parseInt(opcion);
			}
		}
		
		return numero;
		
	}
	
	public static int PedirEncenderRadio(){
		
		int numero = 0;
		String opcion = "";
		boolean validacion = false;
		
		//Se muestran las opciones y se recibe el dato
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nLa radio se encuentra actualmente apagada. Que desea hacer?");
		System.out.println("1.\tEncender la radio");
		System.out.println("2.\tSalir");
			
		opcion = scan.nextLine();
		
		//Se comprueba que el dato esté dentro del rango permitido
		validacion = comprobarNumero(opcion);
		
		if (validacion){
			numero = Integer.parseInt(opcion);
		}
		
		while (validacion = false || numero<1 || numero>2){
			System.out.println("ERROR!! Ingrese un numero entre 1 y 2.");
			opcion = scan.nextLine();
			validacion = comprobarNumero(opcion);
			if (validacion){
				numero = Integer.parseInt(opcion);
			}
		}
		
		return numero;
		
	}
	
	public static int PedirModo(){
		
		int numero = 0;
		String opcion = "";
		boolean validacion = false;
		
		//Se muestran las opciones y se recibe el dato
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nEn que modo desea tener la radio");
		System.out.println("1.\tModo radio");
		System.out.println("2.\tModo reproduccion");
		System.out.println("3.\tModo telefono");
		System.out.println("4.\tModo productividad");
			
		opcion = scan.nextLine();
		
		//Se comprueba que el dato esté dentro del rango permitido
		validacion = comprobarNumero(opcion);
		
		if (validacion){
			numero = Integer.parseInt(opcion);
		}
		
		while (validacion = false || numero<1 || numero>4){
			System.out.println("ERROR!! Ingrese un numero entre 1 y 4.");
			opcion = scan.nextLine();
			validacion = comprobarNumero(opcion);
			if (validacion){
				numero = Integer.parseInt(opcion);
			}
		}
		
		return numero;
		
	}
	
	public static int PedirOpcionModoRadio(String menuOpciones){
		
		int numero = 0;
		String opcion = "";
		boolean validacion = false;
		
		//Se muestran las opciones y se recibe el dato
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nQue desea hacer?\n");
		System.out.println(menuOpciones);
			
		opcion = scan.nextLine();
		
		//Se comprueba que el dato esté dentro del rango permitido
		validacion = comprobarNumero(opcion);
		
		if (validacion){
			numero = Integer.parseInt(opcion);
		}
		
		while (validacion = false || numero<1 || numero>8){
			System.out.println("ERROR!! Ingrese un numero entre 1 y 8.");
			opcion = scan.nextLine();
			validacion = comprobarNumero(opcion);
			if (validacion){
				numero = Integer.parseInt(opcion);
			}
		}
		
		return numero;
		
	}
	
	public static int PedirOpcionModoReproduccion(String menuOpciones){
		
		int numero = 0;
		String opcion = "";
		boolean validacion = false;
		
		//Se muestran las opciones y se recibe el dato
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nQue desea hacer?\n");
		System.out.println(menuOpciones);
			
		opcion = scan.nextLine();
		
		//Se comprueba que el dato esté dentro del rango permitido
		validacion = comprobarNumero(opcion);
		
		if (validacion){
			numero = Integer.parseInt(opcion);
		}
		
		while (validacion = false || numero<1 || numero>7){
			System.out.println("ERROR!! Ingrese un numero entre 1 y 7.");
			opcion = scan.nextLine();
			validacion = comprobarNumero(opcion);
			if (validacion){
				numero = Integer.parseInt(opcion);
			}
		}
		
		return numero;
		
	}
	
	public static int PedirOpcionModoTelefono(String menuOpciones, int LimiteInferior, int LimiteSuperior){
		
		int numero = 0;
		String opcion = "";
		boolean validacion = false;
		
		//Se muestran las opciones y se recibe el dato
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nQue desea hacer?\n");
		System.out.println(menuOpciones);
			
		opcion = scan.nextLine();
		
		//Se comprueba que el dato esté dentro del rango permitido
		validacion = comprobarNumero(opcion);
		
		if (validacion){
			numero = Integer.parseInt(opcion);
		}
		
		while (validacion = false || numero<LimiteInferior || numero>LimiteSuperior){
			System.out.println("ERROR!! Ingrese un numero entre " + LimiteInferior + " y " + LimiteSuperior + ".");
			opcion = scan.nextLine();
			validacion = comprobarNumero(opcion);
			if (validacion){
				numero = Integer.parseInt(opcion);
			}
		}
		
		return numero;
		
	}
	
	public static int PedirOpcionModoProductividad(String menuOpciones){
		
		int numero = 0;
		String opcion = "";
		boolean validacion = false;
		
		//Se muestran las opciones y se recibe el dato
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nQue desea hacer?\n");
		System.out.println(menuOpciones);
			
		opcion = scan.nextLine();
		
		//Se comprueba que el dato esté dentro del rango permitido
		validacion = comprobarNumero(opcion);
		
		if (validacion){
			numero = Integer.parseInt(opcion);
		}
		
		while (validacion = false || numero<1 || numero>5){
			System.out.println("ERROR!! Ingrese un numero entre 1 y 5.");
			opcion = scan.nextLine();
			validacion = comprobarNumero(opcion);
			if (validacion){
				numero = Integer.parseInt(opcion);
			}
		}
		
		return numero;
		
	}
	
	public static int PedirNuevoModo(){
		
		int numero = 0;
		String opcion = "";
		boolean validacion = false;
		
		//Se muestran las opciones y se recibe el dato
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nEn que modo desea tener el radio?\n");
		System.out.println("1.\tRadio\n2.\tReproduccion\n3.\tTelefono\n4.\tProductividad");
			
		opcion = scan.nextLine();
		
		//Se comprueba que el dato esté dentro del rango permitido
		validacion = comprobarNumero(opcion);
		
		if (validacion){
			numero = Integer.parseInt(opcion);
		}
		
		while (validacion = false || numero<1 || numero>4){
			System.out.println("ERROR!! Ingrese un numero entre 1 y 4.");
			opcion = scan.nextLine();
			validacion = comprobarNumero(opcion);
			if (validacion){
				numero = Integer.parseInt(opcion);
			}
		}
		
		return numero;
		
	}
	
	public static int PedirCambioVolumen(){
		
		int numero = 0;
		String opcion = "";
		boolean validacion = false;
		
		//Se muestran las opciones y se recibe el dato
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDesea subir o bajar volumen?\n");
		System.out.println("1.\tSubir\n2.\tBajar");
			
		opcion = scan.nextLine();
		
		//Se comprueba que el dato esté dentro del rango permitido
		validacion = comprobarNumero(opcion);
		
		if (validacion){
			numero = Integer.parseInt(opcion);
		}
		
		while (validacion = false || numero<1 || numero>2){
			System.out.println("ERROR!! Ingrese un numero entre 1 y 2.");
			opcion = scan.nextLine();
			validacion = comprobarNumero(opcion);
			if (validacion){
				numero = Integer.parseInt(opcion);
			}
		}
		
		return numero;
		
	}
	
	public static int PedirAMoFM(){
		
		int numero = 0;
		String opcion = "";
		boolean validacion = false;
		
		//Se muestran las opciones y se recibe el dato
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nEn que tipo de frecuencia desea tener la radio?\n");
		System.out.println("1.\tAM\n2.\tFM");
			
		opcion = scan.nextLine();
		
		//Se comprueba que el dato esté dentro del rango permitido
		validacion = comprobarNumero(opcion);
		
		if (validacion){
			numero = Integer.parseInt(opcion);
		}
		
		while (validacion = false || numero<1 || numero>2){
			System.out.println("ERROR!! Ingrese un numero entre 1 y 2.");
			opcion = scan.nextLine();
			validacion = comprobarNumero(opcion);
			if (validacion){
				numero = Integer.parseInt(opcion);
			}
		}
		
		return numero;
		
	}
	
	public static float PedirNuevaEmisora(){
		
		float numero = 0;
		String opcion = "";
		boolean validacion = false;
		
		//Se muestran las opciones y se recibe el dato
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nIngrese el numero de la emisora que desea guardar\n");
			
		opcion = scan.nextLine();
		
		//Se comprueba que el dato esté dentro del rango permitido
		validacion = comprobarFloat(opcion);
		
		if (validacion){
			numero = Float.parseFloat(opcion);
		}
		
		while (!validacion || numero<=0){
			System.out.println("ERROR!! Ingrese un numero decimal o entero positivo");
			opcion = scan.nextLine();
			validacion = comprobarFloat(opcion);
			if (validacion){
				numero = Float.parseFloat(opcion);
			}
		}
		
		return numero;
		
	}
	
	public static int PedirEmisoraACargar(ArrayList<Float> FrecuenciasGuardadas){
		
		int numero = 0;
		String opcion = "";
		boolean validacion = false;
		
		//Se muestran las opciones y se recibe el dato
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nQue emisora desea cargar?\n");
		for(int i=0; i<FrecuenciasGuardadas.size(); i++){
			System.out.println((i+1) + "\t" + FrecuenciasGuardadas.get(i));
		}
			
		opcion = scan.nextLine();
		
		//Se comprueba que el dato esté dentro del rango permitido
		validacion = comprobarNumero(opcion);
		
		if (validacion){
			numero = Integer.parseInt(opcion);
		}
		
		while (validacion = false || numero<1 || numero>FrecuenciasGuardadas.size()){
			System.out.println("ERROR!! Ingrese un numero entre 1 y " + FrecuenciasGuardadas.size() + ".");
			opcion = scan.nextLine();
			validacion = comprobarNumero(opcion);
			if (validacion){
				numero = Integer.parseInt(opcion);
			}
		}
		
		return numero-1;
		
	}
	
	public static String PedirListaDeReproduccion(){
		
		int numero = 0;
		String opcion = "";
		boolean validacion = false;
		
		//Se muestran las opciones y se recibe el dato
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nQue lista de reproduccion desea seleccionar?\n");
		System.out.println("1.\tCanciones de Pop");
		System.out.println("2.\tCanciones de Jazz");
			
		opcion = scan.nextLine();
		
		//Se comprueba que el dato esté dentro del rango permitido
		validacion = comprobarNumero(opcion);
		
		if (validacion){
			numero = Integer.parseInt(opcion);
		}
		
		while (validacion = false || numero<1 || numero>2){
			System.out.println("ERROR!! Ingrese un numero entre 1 y 2.");
			opcion = scan.nextLine();
			validacion = comprobarNumero(opcion);
			if (validacion){
				numero = Integer.parseInt(opcion);
			}
		}
		
		String nombreNuevaLista = "";
		
		if(numero == 1){
			nombreNuevaLista = "Canciones de Pop";
		}else{
			nombreNuevaLista = "Canciones de Jazz";
		}
		
		return nombreNuevaLista;
		
	}
	
	public static int PedirFormaDeAvanzarEnLaLista(){
		
		int numero = 0;
		String opcion = "";
		boolean validacion = false;
		
		//Se muestran las opciones y se recibe el dato
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDesea cambiar a la cancion anterior o posterior a la que se esta seleccionada actualmente\n");
		System.out.println("1.\tAnteior");
		System.out.println("2.\tPosterior");
		
		opcion = scan.nextLine();
		
		//Se comprueba que el dato esté dentro del rango permitido
		validacion = comprobarNumero(opcion);
		
		if (validacion){
			numero = Integer.parseInt(opcion);
		}
		
		while (validacion = false || numero<1 || numero>2){
			System.out.println("ERROR!! Ingrese un numero entre 1 y 2.");
			opcion = scan.nextLine();
			validacion = comprobarNumero(opcion);
			if (validacion){
				numero = Integer.parseInt(opcion);
			}
		}
		
		return numero;
		
	}
	
	public static void EscucharCancion(String InfoCancion){
		System.out.println("\nActualmente esta escuchando la siguiente cancion:");
		System.out.println(InfoCancion);
	}
	
	public static int PedirConectarODesconectarTelefono(){
		
		int numero = 0;
		String opcion = "";
		boolean validacion = false;
		
		//Se muestran las opciones y se recibe el dato
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDesea conectar o desconectar el telefono?\n");
		System.out.println("1.\tConectar");
		System.out.println("2.\tDesconectar");
		
		opcion = scan.nextLine();
		
		//Se comprueba que el dato esté dentro del rango permitido
		validacion = comprobarNumero(opcion);
		
		if (validacion){
			numero = Integer.parseInt(opcion);
		}
		
		while (validacion = false || numero<1 || numero>2){
			System.out.println("ERROR!! Ingrese un numero entre 1 y 2.");
			opcion = scan.nextLine();
			validacion = comprobarNumero(opcion);
			if (validacion){
				numero = Integer.parseInt(opcion);
			}
		}
		
		return numero;
		
	}
	
	public static void MostrarContactos(ArrayList<String> Contactos){
		
		System.out.println("\nLos contactos de los que dispone son los siguientes:\n");
		for(int i=0; i<Contactos.size(); i++){
			System.out.println("\t- " + Contactos.get(i));
		}
		
	}
	
	public static String PedirContactoALlamar(ArrayList<String> Contactos){
		
		int numero = 0;
		String opcion = "";
		boolean validacion = false;
		
		//Se muestran las opciones y se recibe el dato
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nA que contacto desea llamar?");
		for(int i=0; i<Contactos.size(); i++){
			System.out.println((i+1) + ".\t " + Contactos.get(i));
		}
		
		opcion = scan.nextLine();
		
		//Se comprueba que el dato esté dentro del rango permitido
		validacion = comprobarNumero(opcion);
		
		if (validacion){
			numero = Integer.parseInt(opcion);
		}
		
		while (validacion = false || numero<1 || numero>5){
			System.out.println("ERROR!! Ingrese un numero entre 1 y 5.");
			opcion = scan.nextLine();
			validacion = comprobarNumero(opcion);
			if (validacion){
				numero = Integer.parseInt(opcion);
			}
		}
		
		String ContactoALlamar = Contactos.get(numero-1);
		
		return ContactoALlamar;
		
	}
	
	public static void LlamarAContacto(String ContactoALlamar){
		
		System.out.println("\n(Llamando a " + ContactoALlamar + "...)");
		System.out.println("\nLlamada en curso. Presione Enter cuando desee finalizar la llamada.");
		
		Scanner scan = new Scanner(System.in);
		String opcion = scan.nextLine();
		
		System.out.println("\nLa llamada ha sido finalizada exitosamente");
		
	}
	
	public static int PedirSalidaDeAudio(){
		
		int numero = 0;
		String opcion = "";
		boolean validacion = false;
		
		//Se muestran las opciones y se recibe el dato
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nQue medio desea seleccionar como salida de audio?\n");
		System.out.println("1.\tBocina");
		System.out.println("2.\tAuriculares");
		
		opcion = scan.nextLine();
		
		//Se comprueba que el dato esté dentro del rango permitido
		validacion = comprobarNumero(opcion);
		
		if (validacion){
			numero = Integer.parseInt(opcion);
		}
		
		while (validacion = false || numero<1 || numero>2){
			System.out.println("ERROR!! Ingrese un numero entre 1 y 2.");
			opcion = scan.nextLine();
			validacion = comprobarNumero(opcion);
			if (validacion){
				numero = Integer.parseInt(opcion);
			}
		}
		
		return numero;
		
	}
	
	public static void PlanificarViajes(){
		
		System.out.println("\nSe han planificado los siguientes viajes:\n");
		System.out.println("\tViaje No. 1\n\tLugar: Tikal, Peten\n\tDia: 01/12/2021\n\tCosto: Q1200");
		System.out.println("\n\tViaje No. 2\n\tLugar: Panajachel, Solola\n\tDia: 05/12/2021\n\tCosto: Q800");
	}
	
	public static int PedirLlamadaEnEspera(){
		
		int numero = 0;
		String opcion = "";
		boolean validacion = false;
		
		//Se muestran las opciones y se recibe el dato
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDesea habilitar la funcion de llamadas en espera?\n");
		System.out.println("1.\tSi");
		System.out.println("2.\tNo");
		
		opcion = scan.nextLine();
		
		//Se comprueba que el dato esté dentro del rango permitido
		validacion = comprobarNumero(opcion);
		
		if (validacion){
			numero = Integer.parseInt(opcion);
		}
		
		while (validacion = false || numero<1 || numero>2){
			System.out.println("ERROR!! Ingrese un numero entre 1 y 2.");
			opcion = scan.nextLine();
			validacion = comprobarNumero(opcion);
			if (validacion){
				numero = Integer.parseInt(opcion);
			}
		}
		
		return numero;
		
	}
	
	public static void VerPronosticoDelClima(){
		
		System.out.println("\nEl pronostico del tiempo es el siguiente:\n");
		System.out.println("\tDe las 3 a las 6 hrs: Nublado");
		System.out.println("\tDe las 6 a las 9 hrs: Llovizna leve");
		System.out.println("\tDe las 9 a las 12 hrs: Nublado");
		System.out.println("\tDe las 12 a las 15 hrs: Despejado");
		System.out.println("\tDe las 15 a las 18 hrs: Nublado");
		System.out.println("\tDe las 18 a las 21 hrs: Lluva intensa");
		
	}
	
	public static void VerTarjetasDePresentacion(){
		
		System.out.println("\nLas tarjetas de presentacion de algunas emisoras son:");
		
		//Tarjeta de la primera emisora
		System.out.println("\n\tNombre: Eugenio Garcia");
		System.out.println("\tTelefono: 42560321");
		System.out.println("\tEmisora que representa: 60.5 AM");
		
		//Tarjeta de la segunda emisora
		System.out.println("\n\tNombre: Laura Martinez");
		System.out.println("\tTelefono: 56918200");
		System.out.println("\tEmisora que representa: 80.6 FM");
		
		//Tarjeta de la tercera emisora
		System.out.println("\n\tNombre: Marcos Mazariegos");
		System.out.println("\tTelefono: 98030021");
		System.out.println("\tEmisora que representa: 40.8 FM");
	}
	
	private static boolean comprobarNumero(String conjuntoCaracteres){
		try{
			//Se trata de convertir el objeto de tipo String a tipo int
			Integer.parseInt(conjuntoCaracteres);
			return true;
		}
		catch (NumberFormatException nfe){
			return false;
		}
	}
	
	private static boolean comprobarFloat(String conjuntoCaracteres){
		try{
			//Se trata de convertir el objeto de tipo String a tipo int
			Float.parseFloat(conjuntoCaracteres);
			return true;
		}
		catch (NumberFormatException nfe){
			return false;
		}
	}
	
}