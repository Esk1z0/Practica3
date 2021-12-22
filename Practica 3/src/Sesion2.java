import java.util.Scanner;

public class Sesion2 {

    public static void main(String[] args) {
        int decision = 0;
        int posicion = 0;
        Persona persona = null;
        ListaPersonas lista = new ListaPersonas();
        Scanner entrada = new Scanner(System.in);

        while (decision < 5) {
            decision = Sesion1.menu(entrada);
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
                mostrarPersonas(lista);
            }
        }
    }

    public static void mostrarPersonas(ListaPersonas lista){
        String texto = null;
        Persona persona;
        for (int i=1; i<11; ++i){
            if(lista.getPersona(i) != null) {
                persona = lista.getPersona(i);
                texto = persona.toString();
                System.out.println(i + ". " + texto);
            }
        }
    }
}
