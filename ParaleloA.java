import java.util.LinkedList;  // Fifo
import java.util.Queue;// Fifo

public class ParaleloA {
    private Queue <Estudiante> listado; //Interfaz Queve para fifo

    public ParaleloA(){
        listado=new LinkedList<Estudiante>(); //linked lista para crear listas // new para objetos
    }

    public void agregar(Estudiante dato){  //metodos personales
        listado.add(dato);
    }

    public Estudiante desencolar() throws Exception{ //metodos personales   //  excepciones
        if (listado.isEmpty())
            throw new Exception("Cola sin elementos");
        return listado.poll();
    }

    public String listarEstudiantes(){ // metodos personales
        String resultado="";
        for(Estudiante x:listado){ // iteraciones para guardar nombres de estudiantes en resultados //alternativa para gets por la interfaz// : apunta al elmento de la coleccion
            resultado+=x.toString() + "\n";//llamamos al metodo de la clase estudiante para asignar valores a resultado
        }
        return resultado;
    }
}
