/*Universidad De Las Americas
* Estudiantes: Josue Chiriboga y Jean Carlos Gomez
* Asignatura: Programación II
* Fecha: 27/10/2024
* NRC:5458
* Actividad: Avance De Proyecto*/

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //REGISTRO DE PACIENTE
        System.out.println("----------Gestion de Pacientes de Ortodoncia----------");

        System.out.println("\nIngrese ID del paciente:");
        int idPaciente = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el nombre del paciente:");
        String nombrePaciente = sc.nextLine();

        System.out.println("Ingrese el apellido del paciente:");
        String apellidoPaciente = sc.nextLine();

        System.out.println("Fecha Ultimo Control");
        System.out.println("Dia:");
        int diaUltimo = sc.nextInt();
        System.out.println("Mes:");
        int mesUltimo = sc.nextInt();
        System.out.println("Anio:");
        int anioUltimo = sc.nextInt();

        Fecha fechaUltimoControl = new Fecha(diaUltimo,mesUltimo,anioUltimo);

        System.out.println("Fecha Proximo Control:");
        System.out.println("Dia:");
        int diaProximo = sc.nextInt();
        System.out.println("Mes:");
        int mesProximo = sc.nextInt();
        System.out.println("Anio:");
        int anioProximo = sc.nextInt();
        sc.nextLine();

        Fecha fechaProximoControl = new Fecha(diaProximo,mesProximo,anioProximo);

        System.out.println("Grupo del paciente (G1/G2/G3/G4):");
        String grupo = sc.nextLine();

        System.out.println("Doctora asignada:");
        System.out.println("ID:");
        int idDoctora = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre:");
        String nombreDoctora = sc.nextLine();
        System.out.println("Apellido:");
        String apellidoDoctora = sc.nextLine();
        Doctor doctora = new Doctor(idDoctora,nombreDoctora,apellidoDoctora);


        System.out.println("Asistencia del paciente (Asiste/No Asiste):");
        String asistencia = sc.nextLine();

        System.out.println("Estado de Control (Armado/En Curso/Finalizado):");
        String estadoControl = sc.nextLine();

        System.out.println("Valor a pagar:");
        double valorControl = sc.nextDouble();
        sc.nextLine();

        Paciente paciente = new Paciente(idPaciente,nombrePaciente,apellidoPaciente,fechaUltimoControl,fechaProximoControl,grupo,doctora,asistencia,estadoControl,valorControl);

        //Mostrar Informacion Paciente
        System.out.println("\nDATOS DEL PACIENTE");
        System.out.println(paciente);



        sc.close();



    }
}