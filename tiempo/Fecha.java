package tiempo;

/**
 * Colección de funciones para manejar fechas en cadenas de caracteres.
 *
 * El formato de la cadena es: AAAAMMDD.
 * Ejemplo: El 15 de diciembre de 2019 sería: "20191215"
 *
 * Colección de funciones:
 *
 * 1. fechaCorrecta: dice si la fecha que se pasa como parámetro es correcta.
 *
 * 2. fechaMas1Dia: suma un día a la fecha que se pasa como parámetro y lo devuelve.
 *
 * 3. fechaMasNDias: suma una serie de días a la fecha que se pasa como parámetro y lo devuelve.
 *
 * 4. fechaMenos1Dia: resta un día a la fecha que se pasa como parámetro y lo devuelve.
 *
 * 5. fechaMenosNDias: resta una serie de días a la fecha que se pasa como parámetro y lo devuelve.
 *
 * 6. esBisiesto: dice si la fecha que se pasa como parámetro es bisiesto.
 *
 * 7. comparaFechas: recibe dos fechas y devuelve un valor negativo si la 1ª es anterior a la
 *    segunda, cero si son iguales, y un valor positivo si la 1ª es posterior a la segunda.
 *
 * 8. fechaFormateada: recibe un fecha y devuelve una cadena con el formato:
 *    DD de {MES} de AAAA     (Ejemplo: "15 de Diciembre de 2019")
 *
 * 9. anyo, mes, dia, nombreMes: recibe un fecha y devuelve esos valores.
 *
 * @author rafa
 *
 */

public class Fecha {

  /**
   * Dice si la fecha que se pasa como parámetro es correcta.
   *	Separo los meses y los dias
   *	Los meses tienen que ser un numero entre 1 y 12
   *		Para cada mes, tendrá un máximo
   *		Febrero, si es bisiesto, cambiara su máximo de 28 a 29
   *
   * @param fecha
   * @return verdadero o falso.
   */
  public static boolean fechaCorrecta(String fecha) {
  	char[] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','v','w','x','y','z'};
  	char[] abecedarioMayus = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','V','W','X','Y','Z'};
  	
  	for (int i=0; i<fecha.length(); i++) {
  		for (int j=0; j<abecedario.length; j++){
  			if (fecha.charAt(i) == abecedario[j] || fecha.charAt(i) == abecedarioMayus[j]) {
  				return false;
  			}
  		}
  		
  	}
  	int month = mes(fecha);
  	int day = dia(fecha);
  	
  	//Si el mes no esta bien
  	if (month < 1 || month > 12) {
  		return false;
  	}
  	
  	//Si el día no esta bien
  	if (day < 1) {
  		return false;
  	}
  	//Meses con 31 dias
  	if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
  		if (day > 31) {
  			return false;
  		}
  		//Meses con 30 dias
  	} else if (month == 4 || month == 6 || month == 9 ||  month == 11) {
  		if (day > 30) {
  			return false;
  		}
  		//Febrero
  	} else if (month == 2) {
  		if (esBisiesto(fecha)) {
  			if (day > 29) {
  				return false;
  			}
  		} else if (day > 28) {
  				return false;
  		}
  	} 
  	
    return true;
  }
  	

  /**
   * Suma un día a la fecha que se pasa como parámetro y la devuelve.
   *
   * @param fecha
   * @return nuevo fecha
   */
  public static String fechaMas1Dia(String fecha) {
  	int year = anyo(fecha);
  	int month = mes(fecha);
  	int day = dia(fecha);
  	
  	//Diciembre
  	if (month == 12) {
  		if (day == 31) {
  			month = 1;
  			day = 1;
  			year += 1;
  		} else {
  			day += 1;
  		}
  		
  		//Resto de meses con 31 dias
  	} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
  		if (day == 31) {
  			month += 1;
  			day = 1;
  		} else {
  			day += 1;
  		}
  		
  		//Meses con 30 dias
  	} else if (month == 4 || month == 6 || month == 9 ||  month == 11) {
  		if (day == 30) {
  			month += 1;
  			day = 1;
  		} else {
  			day += 1;
  		}
  		//Febrero
  	} else if (month == 2) {
  		if (esBisiesto(fecha)) {
  			if (day == 29) {
  				month += 1;
  				day = 1;
  			} else {
  				day += 1;
  			}
  		} else if (day == 28) {
  			month += 1;
  			day = 1;
  		} else {
  			day += 1;
  		}
  	}
  	
    return fecha(day, month, year);
  }

  /**
   * Suma una serie de días a la fecha que se pasa como parámetro y la devuelve.
   *
   * @param fecha
   * @param dias
   * @return nueva fecha
   */
  public static String fechaMasNDias(String fecha, int dias) {
  	String nuevaFecha = fecha;
  	
  	for (int i=0; i<dias; i++) {
  		nuevaFecha = fechaMas1Dia(nuevaFecha);
  	}
    return nuevaFecha;
  }

  /**
   * Resta un día a la fecha que se pasa como parámetro y la devuelve.
   *
   * @param fecha
   * @return nuevo fecha
   */
  public static String fechaMenos1Dia(String fecha) {
  	int year = anyo(fecha);
  	int month = mes(fecha);
  	int day = dia(fecha);
  	
  	//Enero
  	if (month == 1) {
  		if (day == 1) {
  			month = 12;
  			day = 31;
  			year -= 1;
  		} else {
  			day -= 1;
  		}
  		
  		//Meses cuyo mes anterior tiene 30 dias
  	} else if (month == 12 || month == 5 || month == 7 || month == 10) {
  		if (day == 1) {
  			month -= 1;
  			day = 30;
  		} else {
  			day -= 1;
  		}
  		
  		//Meses cuyo mes anterior tiene 31 dias
  	} else if (month == 4 || month == 6 || month == 9 ||  month == 11 || month == 8 || month == 2) {
  		if (day == 1) {
  			month -= 1;
  			day = 31;
  		} else {
  			day -= 1;
  		}
  		//Marzo
  	} else if (month == 3) {
  		if (esBisiesto(fecha)) {
  			if (day == 1) {
  				month -= 1;
    			day = 29;
  			}
  		} else if (day == 1) {
  			month -= 1;
  			day = 28;
  		} else {
  			day -= 1;
  		}
  	}
  	
    return fecha(day, month, year);
  }

  /**
   * Resta una serie de días a la fecha que se pasa como parámetro y la devuelve.
   *
   * @param fecha
   * @param dias
   * @return nueva fecha
   */
  public static String fechaMenosNDias(String fecha, int dias) {
  	String nuevaFecha = fecha;
  	
  	for (int i=0; i<dias; i++) {
  		nuevaFecha = fechaMenos1Dia(nuevaFecha);
  	}
    return nuevaFecha;
  }


  /**
   * Dice si la fecha que se pasa como parámetro es de un año bisiesto.
   *
   * @param fecha
   * @return verdadero o falso
   */
  public static boolean esBisiesto(String fecha) {
  	double year = anyo(fecha);
  	
  	if ( year/4 == (int)(year/4) ) {
      if (year/100 != (int)(year/100) || year/400 == (int)(year/400)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Recibe dos fechas y devuelve un valor negativo si la 1º es anterior a la 2º,
   * cero si son iguales, y un valor positivo si la 1º es posterior a la segunda.
   *
   * @param fecha1
   * @param fecha2
   * @return entero negativo, cero o un entero positivo.
   */
  public static int comparaFechas(String fecha1, String fecha2) {
  	int fecha1Int = Integer.parseInt(fecha1);
  	int fecha2Int = Integer.parseInt(fecha2);
  	
    return fecha1Int - fecha2Int;
  }

  /**
   * Recibe un fecha y devuelve una cadena con el formato DD de {MES} de AAAA
   * (Ejemplo: "15 de Diciembre de 2019")
   *
   * @param fecha
   * @return fecha formateada
   */
  public static String fechaFormateada(String fecha) {
  	int day = dia(fecha);
  	String month = nombreMes(fecha);
  	int year = anyo(fecha);
  	String fechaFormat = day + " de " + month + " de " + year;
    return fechaFormat;
  }

  /**
   * Devuelve el año de la fecha.
   *
   * @param fecha
   * @return
   */
  public static int anyo(String fecha) {
  	String anyo = "";
  	int year;
  	for (int i=0; i<(fecha.length()-4); i++) {
  		anyo += fecha.charAt(i) + "";
  	}
  	year = Integer.parseInt(anyo);
    return year;
  }

  /**
   * Devuelve el nombre del mes de la fecha.
   *
   * @param fecha
   * @return
   */
  public static String nombreMes(String fecha) {
  	int month = mes(fecha);
  		if (month == 1) {
  			return "enero";
  		} else if (month == 2) {
  			return "febrero";
  		} else if (month == 3) {
  			return "marzo";
  		} else if (month == 4) {
  			return "abril";
  		} else if (month == 5) {
  			return "mayo";
  		} else if (month == 6) {
  			return "junio";
  		} else if (month == 7) {
  			return "julio";
  		} else if (month == 8) {
  			return "agosto";
  		} else if (month == 9) {
  			return "septiembre";
  		} else if (month == 10) {
  			return "octubre";
  		} else if (month == 11) {
  			return "noviembre";
  		} else if (month == 12) {
  			return "diciembre";
  		} else {
  			return "ERROR: INVALID MONTH";
  		}
  }

  /**
   * Devuelve el mes de la fecha
   *
   * @param fecha
   * @return nombre del mes
   */
  public static int mes(String fecha) {
  	String mes = "";
  	int month;
  	
  	for (int i=(fecha.length()-4); i<(fecha.length()-2); i++) {
  		mes += fecha.charAt(i) + "";
  	}
  	month = Integer.parseInt(mes);
  	
    return month;
  }

  /**
   * Devuelve el día de la fecha.
   *
   * @param fecha
   * @return
   */
  public static int dia(String fecha) {
  	String dia = "";
  	int day;
  	
  	for (int i=(fecha.length()-2); i<fecha.length(); i++) {
  		dia += fecha.charAt(i);
  	}
  	
  	day = Integer.parseInt(dia);
  	
    return day;
  }

  /**
   * Devuelve una cadena en formato AAAAMMDD
   * @param d día del mes
   * @param m día del año
   * @param a año
   * @return
   */
  public static String fecha(int d, int m, int a) {
    String dia=Integer.toString(d).trim();
    String mes=Integer.toString(m).trim();
    String anyo=Integer.toString(a).trim();
    // día
    if (dia.length()<2) {
      dia = "0"+dia;
    }
    // mes
    if (mes.length()<2) {
      mes = "0"+mes;
    }
    // año
    for (int i=anyo.length(); i<4; i++) {
      anyo = "0"+anyo;
    }
    return anyo + mes + dia;
  }

}
