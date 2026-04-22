
abstract class Jugador {
    
    private String nombre; //Encapsulo el nombre

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    //Solo puedo leer el nombre a través de este método
    public String getNombre() {
        return nombre;
    }

    //Aca está la abstraccion
    public abstract void jugar();
}

//El delantero Hereda todo lo de Jugador.
class Delantero extends Jugador {
    
    public Delantero(String nombre) {
        super(nombre);
    }

    //El delantero define su propia manera de jugar, esto es Polimorfismo
    @Override
    public void jugar() {
        System.out.println(getNombre() + " patea al arco.");
    }
}

//Herencia de nuevo
class Defensor extends Jugador {
    
    public Defensor(String nombre) {
        super(nombre);
    }

   //Polimorfismo de nuevo
    @Override
    public void jugar() {
        System.out.println(getNombre() + " roba la pelota.");
    }
}

public class Main {
    public static void main(String[] args) {
        
        //Creo los objetos
        Jugador jugador1 = new Delantero("Lionel");
        Jugador jugador2 = new Defensor("Cuti");

        jugador1.jugar(); 
        jugador2.jugar();
    }
}