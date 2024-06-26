package clases1;

import java.util.Arrays;

public class Clase5 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        numeros[0]=2;
        numeros[2]=21;
        numeros[4]=12;
        numeros[5]=32;
        numeros[6]=23;
        System.out.println(numeros.length);
        Arrays.stream(numeros).forEach(System.out::println);

    }
}
