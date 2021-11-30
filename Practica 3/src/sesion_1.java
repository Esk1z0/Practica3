import java.util.Scanner;

public class sesion_1 {
    public static int menu(Scanner entrada){
        int resultado = 0;
        System.out.print("Menú Práctica 3:\n\b1. Insetar persona.\n\b2. Listar Personas\n\b0. Finalizar personas\nIntroduzca una opción del menú");
        resultado = entrada.nextInt();
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        menu(entrada);
        Persona Persona = new Persona();
    }
}
