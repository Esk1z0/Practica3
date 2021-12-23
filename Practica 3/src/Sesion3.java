import java.util.Scanner;

public class Sesion3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int decision = 1;
        int posicion = 0;
        Persona persona = null;
        ListaPersonas lista = new ListaPersonas();

        while(decision != 0) {
            decision = menu(entrada);
            if (decision == 1){
                posicion = lista.findSpace();
                if(posicion != 0) {
                    persona = Sesion1.crearPersona(entrada);
                    lista.createNewPersona(posicion);
                    lista.setNewPersona(persona, posicion);
                }
                else if(decision == 0){
                    System.out.println("Numero de personas superado, lo sentimos");
                }
            }
            else if (decision == 2){
                Sesion2.mostrarPersonas(lista);
            }
            else if (decision == 3){
                buscarPersonas(entrada, lista);
            }
            else if (decision == 4){
                eliminarPersona(entrada, lista);
            }
            else if (decision == 5){

            }
            else if (decision == 6){

            }
            else if (decision == 0){

            }
        }
    }

    public static void buscarPersonas(Scanner entrada, ListaPersonas lista){
        Persona persona;
        int posicion;
        String nombre;
        System.out.print("\nIntroduzca el nombre de la persona: ");
        nombre = entrada.next();
        posicion = lista.findPersona(nombre);
        persona = lista.getPersona(posicion);
        persona.toString();
    }

    public static void eliminarPersona(Scanner entrada, ListaPersonas lista){
        String nombre;
        int posicion;
        System.out.print("\nIntroduzca el nombre de la persona: ");
        nombre = entrada.next();
        posicion = lista.findPersona(nombre);
        lista.setNewPersona(null, posicion);
    }

    public static int menu(Scanner entrada) {
        int decision = 1;
        System.out.print("MENU DE LA PRACTICA 3:\n  1. Insertar Persona.\n  2. Listar Personas.\n" +
                "  3. Buscar Persona\n  4. Eliminar Persona\n  5. Escribir Personas a fichero de texto .csv\n" +
                "  6. Leer Personas desde fichero de texto .csv\n  0. Finalizar programa.\n" +
                "Introduzca una opción del menu: ");
        decision = entrada.nextInt();
        return decision;
    }
}
