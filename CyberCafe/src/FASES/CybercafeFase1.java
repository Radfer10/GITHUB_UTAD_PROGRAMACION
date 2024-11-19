package FASES;
import java.util.Scanner;

public class CybercafeFase1 
{
	static Scanner sc = new Scanner (System.in);
	static int LimiteReservas = 10;
	static int countReservas = 0;
	static int totalPCs = 10;
	static boolean[] PCsDisponibles = new boolean[totalPCs];
	public static void inicializarPCs()
	{
		for (int i = 0; i < totalPCs; i++)
			PCsDisponibles[i] = true;
	}
	static String[][] reservas = new String[LimiteReservas][6];
	static String[][] usuarios = new String[LimiteReservas][5];
	static boolean inicializadoPCs = false;
	static int countUsuarios = 0;
	
	public static void MenuPrincipal()
	{
		
		
		int select = 0;
		
		
		
		while (select != 3)
		{
			System.out.println("===== MENU PRINCIPAL CYBERCAFE =====");
			System.out.println("1. Entrar como Administrador");
			System.out.println("2. Entrar como Usuario ");
			System.out.println("3. Salir");	
			System.out.println("===== MENU PRINCIPAL CYBERCAFE =====");
			System.out.println();
			System.out.println("Elija una opción marcando su número: ");
			
			if (sc.hasNextInt())
			{
				select = sc.nextInt();
				sc.nextLine();
				
				switch (select)
				{
					case 1:
						MenuAdministrador();
						break;
					case 2:
						IngresarComoUsuario();
						break;
					case 3:
						System.out.println("¡HASTA LA PRÓXIMA!");
						break;
					default:
						System.out.println("Opción invalida. Prueba otra vez.");
				}
			}
			else
			{
				System.out.println("Entrada no valida. Prueba de nuevo");
				sc.nextLine();	
			}	
		}
		sc.close();
	}
	public static void VerReservaPC()
	{
		boolean HayDisponibles = false;
		for (int i = 0; i < totalPCs; i++) 
		{
	        if (PCsDisponibles[i])
	        {
	        	System.out.println("PC 00" + (i + 1) + " - Disponible");
	        	HayDisponibles = true;
	        }
	        else if (PCsDisponibles[i] == false)
	        	System.out.println("PC 00" + (i + 1) + " - No Disponible");
	        	
	    }
		if (!HayDisponibles)
		{
			System.out.println("No hay ordenadores disponibles");
			return;
		}
	}
	public static void MakeReserva()
	{
		if (!inicializadoPCs) {
            for (int i = 0; i < totalPCs; i++) {
                PCsDisponibles[i] = true;
            }
            inicializadoPCs = true;
        }
		
		if (countReservas >= LimiteReservas)
		{
			System.out.println("No se admiten mas reservas.");
			return;
		}
		
		System.out.println("Ingrese el nombre del cliente: ");
		String nombreCliente = sc.nextLine();
		System.out.println("===== Ordenadores Disponibles =====");
		boolean HayDisponibles = false;
		for (int i = 0; i < totalPCs; i++) 
		{
	        if (PCsDisponibles[i])
	        {
	        	System.out.println("PC 00" + (i + 1) + " - Disponible");
	        	HayDisponibles = true;
	        }
	        else
	        	System.out.println("PC 00" + (i + 1) + " - No Disponible");
	        	
	    }
		if (!HayDisponibles)
		{
			System.out.println("No hay ordenadores disponibles");
			return;
		}
		int numPC;
		while (true)
		{
			System.out.println("Ingrese el número de Ordenador que desea reservas: ");
			if (sc.hasNextInt())
			{
				numPC = sc.nextInt();
				
				if (numPC > 0 && numPC <= totalPCs && PCsDisponibles[numPC - 1])
				{
					PCsDisponibles[numPC - 1] = false;
					break;
				}
				else
					System.out.println("Ordenador no disponible");
			}
			else
			{
				System.out.println("Entrada inválidad. Ingrese un número");
				sc.next();
			}
		}
		sc.nextLine();
		String hora;
		String regex = "^([01]?[0-9]|2[0-3]):[0-5][0-9]$";
		
		while (true)
		{
			System.out.print("Ingrese la hora de inicio (HH:MM): ");
			hora = sc.nextLine();
			
			if (hora.matches(regex))
			{
				System.out.println("Hora valida ingresada: " + hora);
				break;
			}
			else
				System.out.println("Formato incorrecto, prueba de nuevo");
		}
		System.out.println("===== Elegir Duracion =====");
		System.out.println("1. 3 horas");
		System.out.println("2. 6 horas");
		System.out.println("3. 12 horas");
		System.out.println("4. 24 horas");
		
		int duracion = 0;
		
		while (true)
		{
			System.out.println("Seleccione una duración: ");
			if (sc.hasNextInt())
			{
				duracion = sc.nextInt();
				switch (duracion)
				{
					case 1:
						duracion = 3;
						break;
					case 2:
						duracion = 6;
						break;
					case 3:
						duracion = 12;
						break;
					case 4:
						duracion = 24;
						break;
					default:
						System.out.println("Opción invalida. Prueba otra vez.");
						continue;
				}
				break;
			}
			else
			{
				System.out.println("Opcion invalida. Prueba otra vez");
				sc.next();	
			}
		}
		
		
		reservas[countReservas][0] = String.valueOf(countReservas + 1);
		reservas[countReservas][1] = nombreCliente;
		reservas[countReservas][2] = String.valueOf(numPC);
		reservas[countReservas][3] = hora;
		reservas[countReservas][4] = String.valueOf(duracion);
		reservas[countReservas][5] = null;
		
		countReservas++;
		System.out.println("Reserva creada. ID Reserva: " + "Reserva 00" + countReservas);
		
	}
	
	public static void actualizarReserva()
	{
		if (countReservas == 0)
		{
			System.out.println("No existen reservas disponibles para modificar");
			return;
		}
		System.out.println("Introducca el ID de la reserva a modificar: ");
		int idReserva = sc.nextInt();
		sc.nextLine();
		
		boolean reservaEncontrada = false;
		
		for (int i = 0; i < countReservas; i++)
		{
			if (reservas[i][0].equals(String.valueOf(idReserva)))
			{
				reservaEncontrada = true;
				
				String hora;
				String regex = "^([01]?[0-9]|2[0-3]):[0-5][0-9]$";
				
				while (true)
				{
					System.out.print("Ingrese la hora de inicio (HH:MM): ");
					hora = sc.nextLine();
					
					if (hora.matches(regex))
					{
						System.out.println("Hora valida ingresada: " + hora);
						reservas[i][3] = hora;
						break;
					}
					else
						System.out.println("Formato incoorecto, prueba de nuevo");
				}
				
				
				System.out.println("===== Elegir Duracion =====");
				System.out.println("1. 3 horas");
				System.out.println("2. 6 horas");
				System.out.println("3. 12 horas");
				System.out.println("4. 24 horas");
				int duracion = 0;
				while (true)
				{
					System.out.println("Seleccione una duración: ");
					if (sc.hasNextInt())
					{
						duracion = sc.nextInt();
						switch (duracion)
						{
							case 1:
								duracion = 3;
								break;
							case 2:
								duracion = 6;
								break;
							case 3:
								duracion = 12;
								break;
							case 4:
								duracion = 24;
								break;
							default:
								System.out.println("Opción invalida. Prueba otra vez.");
								continue;
						}
						reservas[i][4] = String.valueOf(duracion);
						break;
					}
					else
					{
						System.out.println("Opcion invalida. Prueba otra vez");
						sc.next();	
					}
				}
				System.out.println("Reserva actualizada correctamente.");
				break;
			}
			if (!reservaEncontrada)
				System.out.println("Reserva no encontrada.");	
		}
	}
	public static void borrarReserva()
	{
		if (countReservas == 0)
		{
			System.out.println("No existen reservas para borrar");
			return;
		}
		System.out.println("Ingrese el ID de la reserva que desea borrar: ");
		int IdReservas = sc.nextInt();
		boolean flag = false;
		
		for (int i = 0; i < countReservas; i++)
		{
			if (reservas[i][0].equals(String.valueOf(IdReservas)))
				flag = true;
			int PCindex = Integer.parseInt(reservas[i][2]) - 1;
			PCsDisponibles[PCindex] = true;
			for (int j = i; j < countReservas - 1; j++)
			{
				reservas[j] = reservas[j + 1];
			}
			countReservas--;
			System.out.println("Reserva: " + IdReservas + " Borrada correctamente");
		}
		if (!flag)
			System.out.println("Numero de Reserva no encontrada");
		
	}
	
	public static void VerCliente() 
	{
	    
	    if (countReservas == 0) 
	    {
	        System.out.println("No existen Reservas.");
	    } 
	    else 
	    {
	        System.out.println("===== Lista de Reservas =====");
	        for (int i = 0; i < countReservas; i++) 
	        {
	            System.out.println("Reserva " + (i + 1) + ": " + reservas[i][1]);
	        }
	        System.out.println("Número de Reservas: " + countReservas);
	    }

	    
	    if (countUsuarios == 0) 
	    {
	        System.out.println("No existen usuarios registrados.");
	    } 
	    else 
	    {
	        System.out.println("===== Lista de Usuarios =====");
	        for (int i = 0; i < countUsuarios; i++)
	        {
	            System.out.println("IDuser: " + usuarios[i][0] + " - Nombre Cliente: " + usuarios[i][1]);
	        }
	        System.out.println("Número de Usuarios: " + countUsuarios);
	    }
	}

	
	public static void MostrarReserva()
	{
		if (countReservas == 0)
		{
			System.out.println("No existen reservas");
			return;
		}
		
		for (int i = 0; i < countReservas; i++)
		{
			System.out.println("IDReserva: " + reservas[i][0] +  " \nCliente: " + reservas[i][1] + "\nNumero de PC: " + reservas[i][2] + "\nHora de Inicio: " +  reservas[i][3] + "\nDuracion de la Reserva: " + reservas[i][4] + " horas");
			System.out.println("Numero de Reserva: 00" + countReservas);
		}
		
	}
	public static void MakeReserva(String userID)
	{
		if (!inicializadoPCs) {
            for (int i = 0; i < totalPCs; i++) {
                PCsDisponibles[i] = true;
            }
            inicializadoPCs = true;
        }
		
		if (countReservas >= LimiteReservas)
		{
			System.out.println("No se admiten mas reservas.");
			return;
		}
		
		System.out.println("Ingrese el nombre del cliente: ");
		String nombreCliente = sc.nextLine();
		System.out.println("===== Ordenadores Disponibles =====");
		boolean HayDisponibles = false;
		for (int i = 0; i < totalPCs; i++) 
		{
	        if (PCsDisponibles[i])
	        {
	        	System.out.println("PC 00" + (i + 1) + " - Disponible");
	        	HayDisponibles = true;
	        }
	        else
	        	System.out.println("PC 00" + (i + 1) + " - No Disponible");
	        	
	    }
		if (!HayDisponibles)
		{
			System.out.println("No hay ordenadores disponibles");
			return;
		}
		int numPC;
		while (true)
		{
			System.out.println("Ingrese el número de Ordenador que desea reservas: ");
			if (sc.hasNextInt())
			{
				numPC = sc.nextInt();
				
				if (numPC > 0 && numPC <= totalPCs && PCsDisponibles[numPC - 1])
				{
					PCsDisponibles[numPC - 1] = false;
					break;
				}
				else
					System.out.println("Ordenador no disponible");
			}
			else
			{
				System.out.println("Entrada inválidad. Ingrese un número");
				sc.next();
			}
		}
		sc.nextLine();
		String hora;
		String regex = "^([01]?[0-9]|2[0-3]):[0-5][0-9]$";
		
		while (true)
		{
			System.out.print("Ingrese la hora de inicio (HH:MM): ");
			hora = sc.nextLine();
			
			if (hora.matches(regex))
			{
				System.out.println("Hora valida ingresada: " + hora);
				break;
			}
			else
				System.out.println("Formato incoorecto, prueba de nuevo");
		}
		System.out.println("===== Elegir Duracion =====");
		System.out.println("1. 3 horas");
		System.out.println("2. 6 horas");
		System.out.println("3 12 horas");
		System.out.println("4 24 horas");
		
		int duracion = 0;
		
		while (true)
		{
			System.out.println("Seleccione una duración: ");
			if (sc.hasNextInt())
			{
				duracion = sc.nextInt();
				switch (duracion)
				{
					case 1:
						duracion = 3;
						break;
					case 2:
						duracion = 6;
						break;
					case 3:
						duracion = 12;
						break;
					case 4:
						duracion = 24;
						break;
					default:
						System.out.println("Opción invalida. Prueba otra vez.");
						continue;
				}
				break;
			}
			else
			{
				System.out.println("Opcion invalida. Prueba otra vez");
				sc.next();	
			}
		}
		
		
		reservas[countReservas][0] = String.valueOf(countReservas + 1);
		reservas[countReservas][1] = nombreCliente;
		reservas[countReservas][2] = String.valueOf(numPC);
		reservas[countReservas][3] = hora;
		reservas[countReservas][4] = String.valueOf(duracion);
		reservas[countReservas][5] = userID;
		
		countReservas++;
		System.out.println("Reserva creada. ID Reserva: " + "Reserva 00" + countReservas);
		
	}
	public static void MostrarReserva(String userID)
	{
		if (countReservas == 0)
		{
			System.out.println("No existen reservas");
			return;
		}
		
		boolean hayReservas = false;
	    for (int i = 0; i < countReservas; i++) 
	    {
	        if (userID != null && userID.equals(reservas[i][5]))
	        { 
	            System.out.println("IDReserva: " + reservas[i][0] +
	                               " \nCliente: " + reservas[i][1] +
	                               "\nNúmero de PC: " + reservas[i][2] +
	                               "\nHora de Inicio: " + reservas[i][3] +
	                               "\nDuración de la Reserva: " + reservas[i][4] + "horas");
	            hayReservas = true;
	        }
	    }
	    if (!hayReservas) {
	        System.out.println("No tienes ninguna reserva");
	    }
	}
	public static void borrarReserva(String userId) 
	{
	    
	    if (countReservas == 0) 
	    {
	        System.out.println("No existen reservas para borrar");
	        return;
	    }
	    
	    
	    boolean foundReserva = false;
	    int reservaIndex = -1;
	    
	    for (int i = 0; i < countReservas; i++) 
	    {
	        if (reservas[i][5].equals(userId)) 
	        { 
	            System.out.println("ID Reserva: " + reservas[i][0] +
	                               " Cliente: " + reservas[i][1] +
	                               " PC: " + reservas[i][2] +
	                               " Hora: " + reservas[i][3] +
	                               " Duración: " + reservas[i][4]);
	            foundReserva = true;
	        }
	    }

	    if (!foundReserva) 
	    {
	        System.out.println("No tienes reservas activas para borrar.");
	        return;
	    }

	   
	    System.out.println("Ingrese el ID de la reserva que desea borrar: ");
	    int idReserva = sc.nextInt();

	    
	    for (int i = 0; i < countReservas; i++) 
	    {
	        if (Integer.parseInt(reservas[i][0]) == idReserva && reservas[i][5].equals(userId)) {
	            reservaIndex = i;
	            break;
	        }
	    }

	    if (reservaIndex == -1) 
	    {
	        System.out.println("Reserva no encontrada o no es tu reserva.");
	        return;
	    }

	  
	    int pcIndex = Integer.parseInt(reservas[reservaIndex][2]) - 1;
	    PCsDisponibles[pcIndex] = true;

	   
	    for (int i = reservaIndex; i < countReservas - 1; i++) 
	    {
	        reservas[i] = reservas[i + 1];
	    }
	    countReservas--;
	  System.out.println("Reserva eliminada con éxito.");
	}
	public static String makeIDuser()
	{
		return "USR" + (++countUsuarios);
	}
	
	public static String RegistrarUsuario (Scanner sc)
	{
		
		String userID = makeIDuser();
		System.out.println("Usuario registrado exitosamente: " + userID);
		System.out.println("Ingrese su nombre: ");
		String nombreUsuario = sc.nextLine();
		usuarios[countUsuarios - 1][0] = userID;
		usuarios[countUsuarios - 1][1] = nombreUsuario;
		System.out.println("Usuario registrado correctsmente: " + userID + "(" + nombreUsuario + ")");
		return userID;
	}
	
	public static void IngresarComoUsuario() 
	{
		Scanner sc = new Scanner (System.in);
		String respuesta;
		boolean respuestaValida = false;
		while (!respuestaValida)
		{
			System.out.println("¿Tiene un userID? (Si/No): ");
			respuesta = sc.nextLine();
			if (respuesta.equalsIgnoreCase("Si"))
			{
				System.out.println("Ingrese su userID: ");
				String userID = sc.nextLine();
				boolean encontrado = false;
				
				for (int i = 0; i < countUsuarios; i++)
				{
					if (usuarios[i][0].equals(userID))
					{
						System.out.print("Bienvenido " + usuarios[i][1]);
						System.out.println();
						MenuUsuario(userID);
						encontrado = true;
						break;
					}
				}
				if (!encontrado)
					System.out.println("Usuario no registrado");
				else
					respuestaValida = true;
			}
			else if (respuesta.equalsIgnoreCase("No"))
			{
				System.out.println("===== REGISTRAR USUARIO =====");
				String userID = RegistrarUsuario(sc);
				MenuUsuario(userID);
				respuestaValida = true;
				
			}
			else
				System.out.println("Opcion no válida. Prueba de nuevo");
		}
	}
			
		

	public static void MenuUsuario(String userID)
	{
		
		int select = 0;
		
		while (select != 4)
		{
			System.out.println("===== MENU USUARIO CYBERCAFE =====");
			System.out.println("1. Crear Reserva");
			System.out.println("2. Ver Mis Reservas");
			System.out.println("3. Anular Reserva");
			System.out.println("4. Volver al Menu Principal");
			System.out.println("===== MENU USUARIO CYBERCAFE =====");
			System.out.println();
			System.out.println("Elija una opción marcando su número: ");
			
			if (sc.hasNextInt())
			{
				select = sc.nextInt();
				sc.nextLine();
				
				switch (select)
				{
					case 1:
						System.out.println("===== CREAR RESERVA =====");
						MakeReserva(userID);
						break;
					case 2:
						System.out.println("===== MIS RESERVAS =====");
						MostrarReserva(userID);
						break;
					case 3:
						System.out.println("===== ANULAR RESERVA =====");
						borrarReserva(userID);
						break;
					case 4:
						MenuPrincipal();
						return;
					default:
						System.out.println("Opción invalida. Prueba otra vez.");
						continue;
				}
			}
			else
			{
				System.out.println("Entrada no valida. Prueba de nuevo");
				sc.nextLine();
			}
		}
	}
	public static void MenuAdministrador()
	{
		int select = 0;
		
		while (select != 7)
		{
			System.out.println("===== MENU ADMINISTRADOR CYBERCAFE =====");
			System.out.println("1. Crear Reserva");
			System.out.println("2. Ver Reservas");
			System.out.println("3. Eliminar Reservas");
			System.out.println("4. Ver Usuarios");
			System.out.println("5. Modificar Reservas");
			System.out.println("6. Ver Ordenadores");
			System.out.println("7. Volver al Menú Principal");
			System.out.println("===== MENU ADMINISTRADOR CYBERCAFE =====");
			System.out.println();
			System.out.println("Elija una opción marcando su número: ");
			
			if (sc.hasNextInt())
			{
				select = sc.nextInt();
				sc.nextLine();
				
				switch (select)
				{
					case 1:
						System.out.println("===== CREAR RESERVA =====");
						MakeReserva();
						break;
					case 2:
						System.out.println("===== VER RESERVAS =====");
						MostrarReserva();
						break;
					case 3:
						System.out.println("===== BORRAR RESERVAS =====");
						borrarReserva();
						break;
					case 4:
						System.out.println("===== USUARIOS =====");
						 VerCliente();
						break;
					case 5:
						System.out.println("===== MODIFICAR RESERVAS =====");
						actualizarReserva();
						break;
					case 6:
						System.out.println("===== VER ORDENADORES =====");
						VerReservaPC();
						break;
					case 7:
						return;
					default:
						System.out.println("Opción invalida. Prueba otra vez.");
						continue;
				}
			}
			else
			{
				System.out.println("Entrada no valida. Prueba de nuevo");
				sc.nextLine();
			}
		}
	}
	public static void main (String[] args)
	{
		inicializarPCs();
		MenuPrincipal();
	}
}
