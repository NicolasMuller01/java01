package Ejercicio3;

public class E3 {
    public static void main(String[] args) {
        String[] nombres = {"hola", "como", "estan", "?"};
        concatenador(nombres);
    }
    private static void concatenador(String[] nombres) {
        String concatenados = "";
        for(String nombre : nombres) {
            concatenados+=nombre;
        }
        System.out.println(concatenados);
    }
}
