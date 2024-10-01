import java.util.Scanner;

public class contarPalabras {
    public static void main(String[] args) {
        //creo el scanner
        Scanner input = new Scanner(System.in);
        //le pido al usuario que ingrese un texto
        System.out.println("ingrese el texto que desea conocer la cantidad de palabras");
        String texto = input.nextLine();
        //cambio el texto para que solo halla un espacio de separacion
        texto = texto.trim().replaceAll("\\s+", " ");
        //creo el vector para saber la cantidad de palabras
        String[] palabras = texto.split(" ");
        //imprimo la cantidad de palabras que hay en el codigo 
        System.out.println("la cantidad de palabras es: " + palabras.length);

        input.close();
    }

}
