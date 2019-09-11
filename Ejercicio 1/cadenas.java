public class cadenas{
    public static void main(String[] args){
	String telefono = "72-25-14-23-62";
	int indice1 = telefono.indexOf('1');
	System.out.println("El índice del carácter buscado es: "+ indice1);
	int indice2 = telefono.indexOf('-', 4);
	System.out.println("El segundo índice es: "+indice2);
	System.out.println(telefono.charAt(8));
	System.out.println(telefono.charAt(13));
	String subcadena1 = telefono.substring(0, 5);
	String subcadena2 = telefono.substring(8, 12);
	String subcadena3 = telefono.substring(7);
	System.out.println(subcadena1);
	System.out.println(subcadena2);
	System.out.println(subcadena3);
	String cambio = telefono.replace("-","@");
	System.out.println(cambio);
	String reemplazo = telefono.replaceFirst("72-2","Toluca");
	System.out.println(reemplazo);
    }
}