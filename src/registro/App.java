package registro;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        SistemaAlumnos sistema = new SistemaAlumnos();

        int opcion;

        do {
            System.out.println(">> SISTEMA DE CALIFICACIONES <<");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Asignar calificación");
            System.out.println("3. Calcular promedio");
            System.out.println("4. Ver información general");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del alumno:");
                    String nombre = scanner.next();
                    System.out.println("Ingrese la edad:");
                    int edad = scanner.nextInt();

                    sistema.agregarAlumno(nombre, edad);
                    break;
                
                case 2:
                    System.out.println("Ingrese el indice del alumno:");
                    int indice = scanner.nextInt();
                    sistema.asignarCalificacion(indice);

                    break;
                
                case 3:
                    System.out.println("Ingrese el indice del alumno que desea calcular el promedio:");
                    int indicePromedio = scanner.nextInt();
                    sistema.escogerEstudiante(indicePromedio);
                    break;
                
                case 4:
                    sistema.verInformacionGeneral();
                    break;

                case 5:
                    System.out.println("Sistema Cerrado");
                    break;
            
                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }
            
        } while (opcion !=5);
    }
}
