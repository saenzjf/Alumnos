package registro;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAlumnos {
    
    private ArrayList<Alumno> alumnos;
    
    public SistemaAlumnos(){
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(String nombre, int edad){
        Alumno alumno = new Alumno(nombre, edad);
        alumnos.add(alumno);
    }

    public void asignarCalificacion(int indice){
        Scanner scanner = new Scanner(System.in);
        System.out.println("agregue la calificacion:");
        int calificacion = scanner.nextInt();

        if(indice >= 0 && indice < alumnos.size()){
            alumnos.get(indice).agregarCalificacion(calificacion);
        }else{
            System.out.println("El estudiante no existe.");
        }
    }

    public void escogerEstudiante(int indicePromedio){
        double promedio=0;
        if(indicePromedio >= 0 && indicePromedio < alumnos.size()){
            promedio = alumnos.get(indicePromedio).calcularPromedio();
            System.out.println("El promedio de "+alumnos.get(indicePromedio).nombre+" es: "+promedio);
        }else{
            System.out.println("El estudiante no existe.");
        }

    }

    public void verInformacionGeneral(){
        for(int i = 0; i < alumnos.size(); i++){
            System.out.println("Estudiante: "+alumnos.get(i).nombre);
            System.out.println("Edad: "+alumnos.get(i).edad);
            System.out.println("Notas: "+ alumnos.get(i).calificaciones);
            System.out.println("Promedio: "+alumnos.get(i).calcularPromedio());
        }
    }


}
