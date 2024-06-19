import java.util.Scanner;
public class Resistencia {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Pedir resistencia 1, puse mayor a 0, porque no es claro en eso, sera positivo pero no debe ser 0
    float resistencia1;
    do {
        System.out.println("Ingrese Resistencia 1:");
        resistencia1= sc.nextFloat();
        if (resistencia1<=0)
            System.out.println("Ingresa un numero mayor a 0");
    } while (resistencia1<=0);


    //Pedir resistencia 2
    float resistencia2;
    do {
        System.out.println("Ingrese Resistencia 2:");
        resistencia2= sc.nextFloat();
        if (resistencia2<=0)
            System.out.println("Ingresa un numero mayor a 0");
    } while (resistencia2<=0);


    //Pedir resistencia 3
    float resistencia3;
    do {
        System.out.println("Ingrese Resistencia 3:");
        resistencia3 = sc.nextFloat();
        if (resistencia3 <=0)
            System.out.println("Ingresa un numero mayor a 0");
    } while (resistencia3 <=0);

    //Calculo la resistencia total de estas 3 resistencias
    float resistenciaTotal= 1/((1/resistencia1)+(1/resistencia2)+(1/resistencia3));

    //Entrega de resultado
        System.out.printf("La resistencia total es de %.1f", resistenciaTotal); //para que quede solo un decimal despues de la coma

    }

}
