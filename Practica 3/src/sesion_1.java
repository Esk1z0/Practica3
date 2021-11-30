import java.util.Scanner;

public class sesion_1 {
    public static int menu(Scanner entrada){
        int resultado = 0;
        System.out.print("Menú Práctica 3:\n\b1. Insetar persona.\n\b2. Listar Personas\n\b0. Finalizar personas\nIntroduzca una opción del menú");
        resultado = entrada.nextInt();
        return resultado;
    }

    public static Persona crearPersona(Scanner entrada){
        Persona Persona1 = new Persona();
        System.out.println("Nombre: ");
        Persona1.setNombre(entrada.next());
        System.out.println("Género (H/M): ");
        Persona1.setGenero(entrada.next().charAt(0));
        System.out.println("Edad: ");
        Persona1.setEdad(entrada.nextInt());
        System.out.println("Altura (m): ");
        Persona1.setAltura(entrada.nextDouble());
        System.out.println("Peso (kg): ");
        Persona1.setPeso(entrada.nextDouble());
        return Persona1;
    }

    public static void main(String[] args) {
        int decision;
        Scanner entrada = new Scanner(System.in);
        decision = menu(entrada);
        if (decision == 1){
            crearPersona(entrada);
        }
    }
}
