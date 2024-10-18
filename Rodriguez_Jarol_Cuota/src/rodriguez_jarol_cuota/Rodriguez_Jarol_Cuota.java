/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodriguez_jarol_cuota;
import java.util.Scanner;

/**
 *
 * @author Booker
 */
public class Rodriguez_Jarol_Cuota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        

        System.out.print("Ingrese el monto del préstamo (HNL): ");
        double montoPrestamo = entrada.nextDouble();

        System.out.print("Ingrese el plazo de pago en meses: ");
        int plazoMeses = entrada.nextInt();

        System.out.print("Ingrese el interés mensual (%) : ");
        double interesMensual = entrada.nextDouble() / 100; 

        System.out.print("Ingrese la comisión por cuota (HNL): ");
        double comisionPorCuota = entrada.nextDouble();

        System.out.print("Ingrese el porcentaje de seguro mensual (%) : ");
        double seguroMensual = entrada.nextDouble() / 100; 

        
        double cuotaSinComision = (montoPrestamo / plazoMeses) + (montoPrestamo * interesMensual);
        double cuotaConSeguro = cuotaSinComision + (cuotaSinComision * seguroMensual);
        double cuotaMensual = cuotaConSeguro + comisionPorCuota;
        double totalAPagar = cuotaMensual * plazoMeses;

        System.out.println("**** CUOTAS MENSUALES *******");
        System.out.printf("Cuota de Pago Mensual: HNL %.2f\n", cuotaMensual);
        System.out.printf("Total a Pagar: HNL %.2f\n", totalAPagar);
    }
}
    

