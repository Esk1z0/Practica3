public class Persona {
    private String nombre;
    private char genero; //H y M
    private int edad;
    private double altura; //metros
    private double peso; //kilogramos
    private  double imc;
    private String estado;

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
    public double getPeso() {
        return peso;
    }

    public double getImc() {
        this.imc = this.peso/(this.altura*this.altura);
        return imc;
    }
    public String calcularIMC() {
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

    public String toString(){
        String nombre = this.getNombre();
        char genero = this.getGenero(); //H y M
        int edad = this.getEdad();
        double altura = this.getAltura(); //metros
        double peso = this.getPeso(); //kilogramos
        double imc = this.getImc();
        String estado = this.calcularIMC();

        String texto = "Persona { nombre: " + nombre + " genero: " + genero + " edad: " +
                edad + " altura: " + altura + " peso: " + peso + " imc: " + imc + " estado: " +
                estado + "}";
        return texto;
    }
}
