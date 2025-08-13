//ANALISIS
//Descripçion: La calculadora debera pedirle dos numeros al usuario y con esos dos numeros realizar suma, resta, multiplicacion, division y modulo.
//Entradas: 2, numero 1 y numero 2, ambos iingresados por el usaurio.
//Salidas: 5, una por cada resulatdo de la operacion aritmetica.

import java.util.Scanner;

public class Calculadora {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        double numero1, numero2;
        System.out.print("Ingresa el primer numero: ");
        numero1 = entrada.nextDouble();
        entrada.nextLine(); 
        

        System.out.print("Ingresa el segundo numero: ");
        numero2 = entrada.nextDouble();
        entrada.nextLine(); 
       
       double suma, resta, multiplicacion, division, modulo;
       suma = sumar(numero1, numero2);
       resta = restar(numero1, numero2);
       multiplicacion = multiplicar(numero1, numero2);
       division = dividir(numero1, numero2);
       modulo = modular(numero1, numero2);

       System.out.println("El resultado de la suma es: " + suma);
       System.out.println("El resultado de la resta es: " + resta);
       System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
       System.out.println("El resultado de la division es: " + division);
       System.out.println("El resultado del modulo es: " + modulo);

    }
    
    public static double sumar(double a, double b){
        double suma = a + b;
        return suma;
    }

    public static double restar(double a, double b){
        return a - b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b){
        return a/b;
    }

    public static double modular(double a, double b){
        return a%b;
    }
}
