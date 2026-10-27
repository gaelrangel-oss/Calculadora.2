
import java.util.Arrays;
import java.util.Scanner;   
public class Cadenas{

public static void main(String args[]){
    Scanner teclado= new Scanner (System.in);

    System.out.println("Ingresar cadena");
    String cadena=teclado.nextLine();
System.out.println("     ");
System.out.println("1.-Mostrar longitud");
System.out.println("2.-Mostrar caracteres");
System.out.println("3.-Mostrar cadena invertida.");
System.out.println("4.-Contar apariciones de un caracter");
System.out.println("5.-Buscar una subcadena");
System.out.println("6.-Checar anagrama");
System.out.println("   ");
System.out.println("Ingresar la opcion");
int opcion=teclado.nextInt();
teclado.nextLine();
int tamaño=cadena.length();
switch (opcion){

case (1):


System.out.println("Tamaño de la cadena="+tamaño);
    break;

case (2):


for (int i=0; i<tamaño; i++){
    char l=0;
l=cadena.charAt(i);
System.out.println("Caracter("+i+")"+"="+l);
}
    break;

    case (3):
for (int i=tamaño-1; i>=0; i--){
    char l=0;
l=cadena.charAt(i);
System.out.print(l);
System.out.println("  ");
}
    break;

    case (4):
      String abecedario = "abcdefghijklmnñopqrstuvwxyz";


for (int i = 0; i < abecedario.length(); i++) {
    char letraActual = abecedario.charAt(i);
    int contador = 0; // Se reinicia a 0 para cada nueva letra

    
    for (int j = 0; j < cadena.length(); j++) {
        if (cadena.charAt(j) == letraActual) {
            contador++;
        }
    }

    
    if (contador > 0) {
        System.out.println("La letra '" + letraActual + "' aparece " + contador + " veces.");
    }
}
    break;

    case (5):
        System.out.println("Que quieres buscar:");
            String subcadena = teclado.nextLine(); // Ahora sí se detendrá a esperar tu texto

            int posicion = cadena.indexOf(subcadena);

            if (posicion != -1) {
                System.out.println("Existe y empieza en la posición " + posicion);
            } else {
                System.out.println("No existe en el texto.");
            }
    break;

    case (6):
System.out.println("Ingresa la segunda cadena para comparar:");
    String cadena2 = teclado.nextLine();

    String c1 = cadena.replace(" ", "").toLowerCase();
    String c2 = cadena2.replace(" ", "").toLowerCase();

    
    if (c1.length() != c2.length()) {
        System.out.println("No son anagramas (longitudes distintas).");

    } 
    else {
        boolean esAnagrama = true;
        for (int i = 0; i < c1.length(); i++) {
            char letra = c1.charAt(i);
        int pos = c2.indexOf(letra);
            if (pos != -1) {
                c2 = c2.substring(0, pos) + c2.substring(pos + 1);
            } 
            else {
                esAnagrama = false;
                break;
            }
        }
        if (esAnagrama) {
            System.out.println("¡Las cadenas '" + cadena + "' y '" + cadena2 + "' SÍ son un anagrama!");
        } else {
            System.out.println("No son anagramas.");
        }
    }
             


    break;

}













}

}//Fin clase