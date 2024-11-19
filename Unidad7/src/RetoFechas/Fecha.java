package RetoFechas;
public class Fecha 
{
	int dia;
	int mes;
	static int año;
	
	private Fecha (int dia, int mes, int año)
	{
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	
	private Fecha (int dias)
	{
		DiasXXI(dias);
	}
	
	public int DiasXXI()
	{
		int dias = 0;
		int []diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0; i < año; i++)
		{
			if (bisiesto(200 + i))
				dias = 366;
			else
				dias = 365;
		}
		if (bisiesto(2000 + año))
			diasMes[1] = 29;
		dias += dias - 1;
		return dias;
	}
	public int Getdia(int dia)
	{
		return dia;
	}
	public int Getmes(int mes)
	{
		return mes;
	}
	public int Getaño(int año)
	{
		return año;
	}
	public static boolean bisiesto ()
	{
		return (año % 4 == 0);
	}
	public String toString()
	{
		return (dia + "/" + mes + "/" + año);
	}
	public String diaSemana ()
	{
		String [] diasSemana = {"Sabado", "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
		return diasSemana[1] = String.valueOf(dias);
	}
	public static void main(String[] args) 
	{
		Fecha miFecha1 = new Fecha(0);
		Fecha miFecha2 = new Fecha (1,1,1);
		Fecha hoy = new Fecha (11, 12, 23);
		
		System.out.printf("Hay %d días entre las 2 fechas (es decir, %d)\n",    
		        miFecha1.diashasta(miFecha2),miFecha2.DiasXXI());  //debe dar 366 (es decir 366);
		System.out.printf("El %s fue %s\n",miFecha1.toString(),miFecha1.diaSemana());  // fue Sábado
		if(Fecha.bisiesto())
		   System.out.printf("Fue un año bisiesto\n");  // sí lo fue
		if(!Fecha.bisiesto())
		   System.out.printf("El año siguiente no fue bisiesto\n"); // no lo fue
		System.out.printf("Hoy es %s, %s\n",hoy.toString(), hoy.diaSemana());
	}

}
