package com.testhospitalmaciel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hospital hospital = new Hospital(new int[0]);

        // Ejecutar requerimiento a y b

        System.out.println("Entro en requerimiento a y b");

        hospital.Cantidadpaciente();

        // Ejecutar requerimiento c

        System.out.println("Entro en requerimiento c");

        int[] nr = hospital.LlenarArray();

        // Ejecutar requerimiento d

        System.out.println("Entro en requerimiento d");

        // int casos_c = hospital.CasosCriticos();

        System.out.println("El total de casos criticos del hospital es " + hospital.CasosCriticos());

        // Ejecutar requerimiento e

        System.out.println("Entro en requerimiento e");

        System.out.println("Ingrese el paciente");
        int id_paciente = sc.nextInt(); // si es el primer paciente y el usuario teclea 1
        int p=hospital.GravedadDePaciente(id_paciente - 1);
        System.out.println("Su gravedad es " + p);
        // Ejecutar requerimiento f

        System.out.println("Entro en requerimiento f");

        System.out.println("Gravedad 1: 1-3 sintomas\n" +
                "Gravedad 2: 4-7 sintomas\n" +
                "Gravedad 3: 7-10 sintomas\n" +
                "Gravedad 4: + de 10 sintomas");

        System.out.println("Ingrese el valor de gravedad (Entre 1 y 4)");
        int gravedad = sc.nextInt();
        int totalmenosgrave = hospital.CantidadPacientesMenosGraves(gravedad);

        System.out.println("la cantidad de pacientes de gravedad menor que dicho valor definido es " + totalmenosgrave);

        // Ejecutar requerimiento g
        System.out.println("Entro en requerimiento g");

        System.out.println("Gravedad 1: 1-3 sintomas\n" +
                "Gravedad 2: 4-7 sintomas\n" +
                "Gravedad 3: 7-10 sintomas\n" +
                "Gravedad 4: + de 10 sintomas");

        System.out.println("Ingrese el valor de gravedad (Entre 1 y 4) para determinar promedio de sintomas");
        int gravedad2 = sc.nextInt();
        double prom = hospital.MostrarPromedioSintoma(gravedad2);
        System.out.println("El promedio de sintomas es " + prom);

        // Ejecutar requerimiento h
        System.out.println("Entro en requerimiento h");

        int m = hospital.MayorCantidadSintoma();

        System.out.println("Hay registrado un paciente con " + m
                + "sintomas y es la mayor cantidad de sintomas, por tanto esta en el horno");

        // Ejecutar requerimiento i

        System.out.println("Entro en requerimiento i");

        hospital.PorcientoBajoVigilanciaPocoGrave();

        sc.close();

    }

}
