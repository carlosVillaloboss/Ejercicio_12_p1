package com.mycompany.ejercicio_12_p1;
import java.util.Scanner;

public class Ejercicio_12_p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre del empleado: ");
        String nombre= scanner.nextLine();
        System.out.print("Ingrese el numero de horas trabajadas: ");
        double ht= scanner.nextDouble();
        System.out.print("Ingrese el valor de la hora trabajada: ");
        double vht= scanner.nextDouble();
        double pago = 0;
        
        if (ht>40){
            double he= ht-40;
            if (he>8){
                double hee= he-8;
                double vhe= (8*vht)*2;
                double vhee= (hee*vht)*3;        
                pago= (40*vht)+vhee+vhe;
            }else{
                double vhe= (he*vht)*2;
                pago= (40*vht)+vhe;
            } 
        }else{
            pago= ht*vht;
        }    
        System.out.println("Nombre trabajador: "+nombre);
        System.out.println("Salario del trabajador: "+pago);
        scanner.close();
    }
}
