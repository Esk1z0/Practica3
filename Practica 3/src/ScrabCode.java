import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ScrabCode {
    public static void main(String[] args) {
        cosa2();
    }

    public static void cosa2(){
        try {
            FileWriter out = new FileWriter("Practica 3\\src\\fichero.csv");
            out.write("HOLA");
            out.close();
        }
        catch(IOException ex ){
            System.out.println("Cagada");
        }
    }


















    public static void cosa(){
        PrintWriter out = null;
        try {
            out = new PrintWriter("fichero.csv");
            out.print(1);
            out.print(':');
            out.print(" juan = ");
            out.println(5.5);
            out.println(2 + ": jose = " + 7.2);
        } catch (IOException ex) {
            System.out.println("IOException al escribir:" + ex.getMessage());
        } finally {
            if (out != null) {
                out.close();
            }
        }}
}
