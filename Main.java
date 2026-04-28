
abstract class Jugador {

    // Atributo privado = encapsulamiento
    private String nombre;

    public Jugador(String nombre) {
        setNombre(nombre); // uso setter para validar
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

    // Método abstracto
    public abstract void jugar();
}

// Herencia
class Delantero extends Jugador {

    public Delantero(String nombre) {
        super(nombre);
    }

    @Override
    public void jugar() {
        System.out.println(getNombre() + " patea al arco.");
    }
}

// Herencia
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

        // Cambio de nombre usando encapsulamiento
        jugador1.setNombre("Tomas");
        jugador2.setNombre("Said"); 
        jugador1.jugar();
        jugador2.jugar();
    }
}