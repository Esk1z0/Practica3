import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
                escribirPersonasFicheroTexto(lista);
            }
            else if (decision == 6){
                lista = leerPersonasFicheroCsv(lista);
            }
            else if (decision == 0){
                System.out.println("Vuelva pronto");
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
                "Introduzca una opci??n del menu: ");
        decision = entrada.nextInt();
        return decision;
    }

    public static void escribirPersonasFicheroTexto(ListaPersonas lista) {
        Persona humano = null;
        try {
            FileWriter out = new FileWriter("Practica 3\\src\\fichero.csv");
            for (int i=1; i<11; ++i){
                if (lista.getPersona(i) != null){
                    humano = lista.getPersona(i);
                    out.write(humano.getNombre());
                    out.write(";");
                    out.write(humano.getGenero());
                    out.write(";");
                    out.write(Integer.toString(humano.getEdad()));
                    out.write(";");
                    out.write(Double.toString(humano.getAltura()));
                    out.write(";");
                    out.write(Double.toString(humano.getPeso()));
                    out.write("\n");
                }
            }
            out.close();
        }
        catch(IOException ex){
            System.out.println("Oops, ha habido un problema, vuelva otro d??a");
        }
    }

    public static ListaPersonas leerPersonasFicheroCsv(ListaPersonas lista){
        lista = new ListaPersonas();
        int contador = 1;
        int posicion = 0;
        String texto = "";
        String[] cosas = new String[5];
        Persona humano = new Persona();

        try{
            BufferedReader in = new BufferedReader(new FileReader("Practica 3\\src\\fichero.csv"));
            while((texto = in.readLine()) != null){
                cosas = texto.split(";");
                lista.createNewPersona(contador);
                humano.setNombre(cosas[0]);
                humano.setGenero(cosas[1].charAt(0));
                humano.setEdad(Integer.parseInt(cosas[2]));
                humano.setAltura(Double.parseDouble(cosas[3]));
                humano.setPeso(Double.parseDouble(cosas[4]));
                lista.setNewPersona(humano, contador);
                humano = new Persona();
                contador = contador + 1;
            }
        }
        catch(IOException ex){
            System.out.println("Pos se ha jodio");
        }
        return lista;
    }
}

