interface AccionJugador {
    void jugar();
}

// Uso la interfaz ahora
abstract class Jugador implements AccionJugador {

    private String nombre;

    public Jugador(String nombre) {
        setNombre(nombre);
    }


    public String getNombre() {
        return nombre;
    }

    // Setter con validación
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "Sin nombre";
        }
    }
}

//Hereda de Jugador e implementa jugar()
class Delantero extends Jugador {

    public Delantero(String nombre) {
        super(nombre);
    }

    @Override
    public void jugar() {
        System.out.println(getNombre() + " patea al arco.");
    }
}

// Tambien hereda de Jugador e implementa jugar()
class Defensor extends Jugador {

    public Defensor(String nombre) {
        super(nombre);
    }

    @Override
    public void jugar() {
        System.out.println(getNombre() + " roba la pelota.");
    }
}

public class Main {
    public static void main(String[] args) {

        Jugador jugador1 = new Delantero("Lionel");
        Jugador jugador2 = new Defensor("Cuti");

        jugador1.jugar();
        jugador2.jugar();
    }
}