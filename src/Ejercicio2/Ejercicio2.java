package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int price = entrada.nextInt();
        iva(price);
    }
    static void iva(int price) {
        System.out.println("Price: " + (price+(price*0.27)));
    }
}
