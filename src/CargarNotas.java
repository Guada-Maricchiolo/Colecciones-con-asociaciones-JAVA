import java.util.ArrayList;
import java.util.Scanner;

//ESTA CLASE ES RESPONSABLE DE MANEJAR LA ENTRADA DE DATOS Y MOSTRAR RESULTADOS
public class CargarNotas {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();  //crea una lista para almacenar los alumnos
        Scanner scanner = new Scanner(System.in);
        String agregarAlumno;   //variable para controlar si se desea agregar otro alumno

        do{
            //solicito los datos basicos del alumno
            System.out.println("Ingrese el nombre completo del alumno: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el numero de legajo del alumno: ");
            long legajo = scanner.nextLong();

            scanner.nextLine();     //consumir la linea despues de ingresar el legajo

            //crea un nuevo objeto Alumno con el nombre y legajo ingresados
            Alumno alumno1 = new Alumno(nombre, legajo);

            String agregarNota;     //variable para validar si se desea agregar otra nota

            boolean tieneNotas = false;     //variable para asegurar que se ingrese al menos una nota

            do {    //bucle para agregar multiples notas al alumno
                System.out.println("Ingrese la cátedra/materia del alumno: ");
                String catedra = scanner.nextLine();
                System.out.println("Ingrese la nota obtenida: ");
                double notaExamen = scanner.nextDouble();
                scanner.nextLine();

                //crea un nuevo objeto nota con la catedra y la nota del examen
                alumno1.agregarNota(new Nota(catedra, notaExamen));  //añade la nota del alumno
                tieneNotas = true; //marca que se ha agregado al menos una nota

                //preguntamos si se desea agregar otra nota para el mismo alumno
                System.out.println("Desea agregar otra nota para este alumno? Si/No: ");
                agregarNota = scanner.nextLine();

            }while (agregarNota.equalsIgnoreCase("si"));//repite mientras el usuario ponga si

            //si no se ingreso ninguna nota, muestra mensaje:
            if (!tieneNotas){
                System.out.println("Debe ingresar al menos una nota.");
            }else {
                alumnos.add(alumno1); //agregar al alumno a la lista si tiene al menos una nota
            }

            //preguntamos si queremos agregar otro alumno
            System.out.println("Desea cargar otro alumno? Si/No: ");
            agregarAlumno = scanner.nextLine();
        }while (agregarAlumno.equalsIgnoreCase("si"));


        //MUESTRA LA INFORMACION DE TODOS LOS ALUMNOS Y SUS PROMEDIOS
        System.out.println("\n----Listado de alumnos----");
        for (Alumno alumno : alumnos) {  //recorre cada alumno en la lista de alumnos
            System.out.println(alumno); //imprime la informacion del alumno (toString de Alumno)
            System.out.println("-----------");
        }

        scanner.close();    //cierra el scaner
    }
}