/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author Booker
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        // Primer Ejercicio Plantilla Empleado
                 Scanner entrada = new Scanner(System.in);


        System.out.print("Ingrese el nombre completo del empleado: ");
        String nombreEmpleado = entrada.nextLine();

        
        System.out.print("Ingrese las horas trabajadas en el mes: ");
        int Htrabajadas = entrada.nextInt();

        
        System.out.print("Ingrese la tarifa por hora (Lps.): ");
        double tarifa = entrada.nextDouble();

        
        double salarioMensual = Htrabajadas * tarifa;

        
        double salarioSemanal = salarioMensual / 4;

        
        System.out.println("----- Boleta del Empleado -------");
        System.out.println("Nombre del Empleado: " + nombreEmpleado);
        System.out.println("Hora de Trabajo Mensual: " + Htrabajadas);
        System.out.println("Tarifa por Hora: Lps. " + tarifa);
        System.out.printf("Salario del Empleado Semanal: " + salarioSemanal);
        
    }
    }
    
