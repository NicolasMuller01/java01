package Ejercicio4;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if(name.equals("nicolas")){
            System.out.println("Nicolas");
        }

        SmartDevice device = new SmartDevice("alexa","audio","11","2022");
        SmartWatch watch = new SmartWatch("SWa22","android","a22","2021",11);
        SmartPhone phone = new SmartPhone("iphone11","iphone","11","2019","ios");

        System.out.println(device);
        System.out.println(watch);
        System.out.println(phone);
    }

}
