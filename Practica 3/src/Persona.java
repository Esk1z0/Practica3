public class Persona {
    String nombre;
    char genero; //H y M
    int edad;
    double altura; //metros
    double peso; //kilogramos
    double imc;
    String estado;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }


    public String getNombre() {
        return nombre;
    }
    public char getGenero() {
        return genero;
    }
    public int getEdad() {
        return edad;
    }
    public double getAltura() {
        return altura;
    }
    public double getImc() {
        this.imc = peso/altura*altura;
        return imc;
    }
    public String getEstado() {
        double IMC = getImc();
        if (IMC < 18.5){
            this.estado = "Peso inferior al normal";
        }
        else if (IMC >= 18.5 && IMC < 24.9){
            this.estado = "Peso Normal";
        }
        else if (IMC >= 24.9 && IMC < 29.9){
            this.estado = "Peso superior al normal";
        }
        else if (IMC > 29.9){
            this.estado = "Obesidad";
        }
        return estado;
    }
}
