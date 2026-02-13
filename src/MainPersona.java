import java.util.ArrayList;
import java.util.Iterator;

public class MainPersona {

    public static void main(String[] args) {

        ArrayList<Persona> lista = new ArrayList<>();

        lista.add(new Persona("Ana", 17));
        lista.add(new Persona("Luis", 20));
        lista.add(new Persona("Carlos", 15));
        lista.add(new Persona("Marta", 22));

        System.out.println("Antes de eliminar:");
        System.out.println(lista);

        eliminarMenores(lista);

        System.out.println("Después de eliminar menores de 18:");
        System.out.println(lista);
    }

    public static void eliminarMenores(ArrayList<Persona> lista) {

        Iterator<Persona> it = lista.iterator();

        while (it.hasNext()) {
            Persona p = it.next();

            if (p.getEdad() < 18) {
                it.remove();
            }
        }
    }
}
