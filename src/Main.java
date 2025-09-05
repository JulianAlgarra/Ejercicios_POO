import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int a, b, c;
        int sumaD1=0, sumaD2=0, sumaD3=0 ;
        for (int i = 0; i <= 20; i++) {
            a= aleatorio.nextInt((6-1)+1)+1;
            sumaD1 += a;
            b= aleatorio.nextInt((6-1)+1)+1;
            sumaD2 += b;
            c= aleatorio.nextInt((6-1)+1)+1;
            sumaD3 += c;
            System.out.println(a+ "," +b+ "," +c);

        }
        if (sumaD1>sumaD2 && sumaD1>sumaD3){
            System.out.println("El dado 1 es el mejor, con resultado = "+sumaD1);
            if (sumaD2>sumaD3){
                System.out.println("El dado 2 es el segundo, con resultado = "+sumaD2);
                System.out.println("El dado 3 es el peor, con resultado = "+sumaD3);
            }else {
                System.out.println("El dado 3 es el segundo, con resultado = "+sumaD3);
                System.out.println("El dado 3 es el peor, con resultado = "+sumaD2);
            }

        } else if (sumaD2>sumaD1 && sumaD2>sumaD3) {
            System.out.println("El dado 2 es el mejor, con resultado = "+sumaD2);
            if (sumaD1>sumaD3){
                System.out.println("El dado 1 es el segundo, con resultado = "+sumaD1);
                System.out.println("El dado 3 es el peor, con resultado = "+sumaD3);
            }else {
                System.out.println("El dado 3 es el segundo, con resultado = "+sumaD3);
                System.out.println("El dado 1 es el peor, con resultado = "+sumaD1);
            }
        } else {
            System.out.println("El dado 3 es el mejor, con resultado = "+sumaD3);
            if (sumaD1>sumaD2){
                System.out.println("El dado 1 es el segundo, con resultado = "+sumaD1);
                System.out.println("El dado 2 es el peor, con resultado = "+sumaD2);
            }else {
                System.out.println("El dado 2 es el segundo, con resultado = "+sumaD2);
                System.out.println("El dado 1 es el peor, con resultado = "+sumaD1);
            }
        }
    }
}