import java.util.Scanner;

public class contarDigitos {
    public static void main(String[] args) {
        //crear scanner
        Scanner input = new Scanner(System.in);
        //declaro la variable para poder almacenar los numeros
        int numero;
        //le pido al usuario que ingrese la cadena de numeros
        System.out.println("Ingrese la cadena de numeros ");
        numero = input.nextInt();
        //creo el contador para el programa
        int contador = 0;
        //creo la estructura para saber la cantidad de numero que hay
        if (numero == 0) {
            contador = 1; 
        }
        while (numero>0) {
            numero/=10;
            contador++;
        }
        System.out.println("el numero de caracteres de la cadena es: "+ contador);


        input.close();
    }

}
