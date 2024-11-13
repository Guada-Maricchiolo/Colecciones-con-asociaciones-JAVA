//REPRESENTA A UN ESTUDIANTE QUE TIENE COMO ATRIBUTOS NOMBRE, NUMERO DE LEGAJO Y UNA LISTA DE NOTAS

import java.util.ArrayList;

public class Alumno {
    private String nombreCompleto;
    private long legajo;
    private ArrayList<Nota>notas;       //LISTA DE NOTAS DEL ALUMNO


    public Alumno(String nombreCompleto, long legajo, ArrayList<Nota> notas) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;                   //CONSTRUCTOR
        this.notas = notas;
    }

    public Alumno(String nombreCompleto, long legajo) {
        this.nombreCompleto = nombreCompleto;       //CONSTRUCTOR SECUNDARIO, inicializa la lista de notas
        this.legajo = legajo;
        this.notas = new ArrayList<>(); //inicializa la lista para evitar errores
    }
    //----------------------------------------------------------------------------------------------

    public void agregarNota(Nota nota){         //METODO PARA AGREGAR UNA NUEVA NOTA AL ALUMNO
        notas.add(nota);            //Añade el objeto Nota a la lista de notas.
    }
    //----------------------------------------------------------------------------------------------

    public double calcularPromedio(){  //VARIABLE PARA ACUMULAR LAS NOTAS
                      //variable para acumular las notas

        if (notas.isEmpty()) { //evita la division por 0 si no hay notas
            return 0;

        }
        double suma = 0;
        for (Nota nota : notas){             //recorre todas las notas del alumno
            suma += nota.getNotaExamen();   //suma la nota de cada cátedra.
        }
        return suma / notas.size();         //calcula el pomedio
    }
//----------------------------------------------------------------------------------------------}
   //SOBREESCRIBE EL METODO toString PARA MOSTRAR LA INFORMACION DEL ALUMNO Y SUS NOTAS
    @Override
    public String toString(){
         String detalles= "Nombre :" + nombreCompleto + "\n"+
            "Legajo: " + legajo + "\n" +
            "Notas:\n";

         //recorrer cada nota y agregarla a la cadena de texto
        for (Nota nota : notas){
              detalles += "Cátedra: " + nota.getCatedra() + ", Nota: " + nota.getNotaExamen() + "\n";
        }

         detalles += "Promedio de notas: " + calcularPromedio(); //Añade al final el promedio de notas
         return detalles;                //DEVUELVE LA CADENA COMPLETA

    }

    
}