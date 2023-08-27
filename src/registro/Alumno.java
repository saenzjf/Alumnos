package registro;
import java.util.ArrayList;

public class Alumno {
    String nombre;
    int edad;
    ArrayList<Double> calificaciones;

    public Alumno(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = new ArrayList<Double>();
    }

    public void agregarCalificacion(double calificacion){
         calificaciones.add(calificacion);
    }

    public double calcularPromedio(){
        if (calificaciones.isEmpty()){
            return 0;
        }

        double suma = 0;
        double promedio = 0;
        for (int i = 0; i < calificaciones.size(); i++){
            double calificacion = calificaciones.get(i);
            suma = suma + calificacion;
        }
        
        promedio = suma / calificaciones.size();
        return promedio;
    }
}
