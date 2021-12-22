public class ListaPersonas {
    private Persona [] lista = new Persona[10];

    public int findSpace() {
        int posicion = 0;
        int contador = 0;
        while(posicion == 0 && contador < 10){
            if(this.lista[contador] == null){
                posicion = contador+1;
            }
            contador = contador + 1;
        }
        return posicion;
    }
    public void createNewPersona(int posicion){
        this.lista[posicion-1] = new Persona();
    }
    public void setNewPersona(Persona persona, int posicion){
        this.lista[posicion-1] = persona;
    }
    public void erasePersona(int posicion){
        this.lista[posicion-1] = null;
    }
    public Persona getPersona(int posicion){
        Persona persona = this.lista[posicion-1];
        return persona;
    }
}
