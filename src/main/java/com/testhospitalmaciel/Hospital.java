package com.testhospitalmaciel;
import java.util.Scanner;

public class Hospital {
    private int[] hospital;

    public Hospital(int[] hospital) {
        this.hospital = hospital;
    }
    // METODOS

    // a y b

    public void Cantidadpaciente() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad pacientes");

        int cantidadpaciente = sc.nextInt(); // estoy guardando la cantidad de pacientes escritos por consola
        hospital = new int[cantidadpaciente]; // asumo que sea 4 pacientes ingresados por consola

    }

    // c  
    public int[] LlenarArray() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < hospital.length; i++) { // Llenar el array hospital con la cantidad de sintomas
                                                    // de cada paciente

            System.out.println("Ingrese la cantidad de Sintomas");
            int cantidadsintomas = scanner.nextInt(); // almaceno la cantidad de sintomas del paciente
            hospital[i] = cantidadsintomas; // registro en el array en la posicion i la cantidad de sintoma

        }

        return hospital;
    }

    // d   //testear
    public int CasosCriticos() {
        int casos_criticos = 0; // contador de cantidad de pacientes criticos
        int cantidadsintomas = 0; // aqui se almacenara la cantidad de sintoma de cada paciente

        // recorrer arreglo hospital para saber por cada paciente su cantidad de sintoma
        // y saber si es critico
        for (int numeropaciente = 0; numeropaciente < hospital.length; numeropaciente++) {
            cantidadsintomas = hospital[numeropaciente];// almacenar los sintomas del paciente [numeropaciente]
            if (cantidadsintomas > 10) { // Evalua si el paciente [numeropaciente] tiene mas de 10 sintomas
                casos_criticos += 1; // cuento el paciente con mas de 10 sintomas
            }

        }

        return casos_criticos;
    }

    // e             0 1 2
                // [15,8,5] - 3 pacientes
    public int GravedadDePaciente(int paciente) { // 3er paciente
        int gravedad = 0;

        if (hospital[paciente] < 4) {
            gravedad = 1;
        } else if (hospital[paciente] < 8) {
            gravedad = 2;

        } else if (hospital[paciente] < 11) {
            gravedad = 3;
        }

        else {
            gravedad = 4;
        }

        return gravedad;

    }

    // f [15,8,5,2,1,10,11] - 7 pacientes

    public int CantidadPacientesMenosGraves(int valorgravedad) { // 3
        int contadorpaciente = 0;

        for (int i = 0; i < hospital.length; i++) {
            if (GravedadDePaciente(i) < valorgravedad) {
                contadorpaciente++;
            }

        }

        return contadorpaciente;
    }

    // g
    // [15,8,5] - 3 pacientes
    public double MostrarPromedioSintoma(int gravedad) { // valor de gravedad 2
        int contadorpaciente = 0;
        int suma = 0;
        double promedio = 0;
        for (int i = 0; i < hospital.length; i++) {
            if (GravedadDePaciente(i) == gravedad) {
                contadorpaciente++; // 2
                suma += hospital[i]; // 13
            }

        }

        promedio = suma / contadorpaciente; // 6.5

        return promedio;
    }

    // 0,1,2,3,4,5,6 -indice de pacientes
    // h //[10,8,5,15,1,10,10] - 7 pacientes

    //testear
    public int MayorCantidadSintoma() {
        int mayor = 0;

        for (int i = 0; i < hospital.length; i++) {
            if (hospital[i] > mayor) {
                mayor = hospital[i];

            }

        }

        return mayor;

    }

    // i // porcierto= (parte/todo)*100
   public void PorcientoBajoVigilanciaPocoGrave(){
     double porcientoBajoVigilancia=0;
     double porcientoPocoGrave=0;
     int pacienteBajoVigilancia=0;
     int pacientePocoGrave=0;

    for (int i = 0; i < hospital.length; i++) {
            if (GravedadDePaciente(hospital[i]) == 1) {
                pacienteBajoVigilancia++;
               
            }
            else if(GravedadDePaciente(hospital[i]) == 2){
                pacientePocoGrave++;

            }
}
    porcientoBajoVigilancia = ( pacienteBajoVigilancia/hospital.length) * 100;
    porcientoPocoGrave = ( pacientePocoGrave/hospital.length) * 100;

    System.out.println("El porciento con categoria Bajo vigilancia es: " + porcientoBajoVigilancia + " %");
    System.out.println("El porciento con categoria Poco grave es: " + porcientoPocoGrave + " %");


}

}