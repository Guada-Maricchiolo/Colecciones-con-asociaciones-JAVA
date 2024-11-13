//LA CLASE NOTA REPRESENTA UNA CALIFICACIÓN EN UNA MATERIA ESPECÍFICA (CÁTEDRA)

public class Nota {
    private String catedra;
    private double notaExamen;

    public Nota(String catedra, double notaExamen) {    //CONSTRUCTOR DE LA CLASE NOTA
        this.catedra = catedra;                         //INICIALIZA LOS ATRIBUTOS
        this.notaExamen = notaExamen;
    }


    public String getCatedra() {
        return catedra;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    public double getNotaExamen() {
        return notaExamen;
    }

    public void setNotaExamen(double notaExamen) {
        this.notaExamen = notaExamen;
    }
    //----------------------------------------------------------------------------------------------
    @Override
    public String toString(){
        return "Cátedra: " + catedra + ", Nota " + notaExamen;
        //Sobreescribe el metodo toString para que al imprimir el objeto Nota muestre la información
    }
    //----------------------------------------------------------------------------------------------
}
//OVERRIDE
// se usa cuando una clase hereda de otra, y se desea redefiir el comportamiento de un metodo de la
//clase padre (sobreescribir metodos de una superclase).
//se usa también cuando se implementan metodos de una interfaz, lo cual ayuda a aclarar que el metodo
// es una implementacion de algo definido en la interfaz.
// mejora la seguridad del codigo al evitar errores comunes de sobreescritura
// en la clase ALUMNO, se sobreescribe el metodo toString, que viene a ser de la clase Objet(la clase
// base de todas las de java


