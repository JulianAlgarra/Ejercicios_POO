import java.util.Random;

//TIP Para <b>ejecutar</b> el código, pulsar <shortcut actionId="Run"/> o
// Haz clic en el ícono <icon src="AllIcons.Actions.Execute"/> del margen.
public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int a, b;
        int sumaD1=0, sumaD2=0;
        for (int i = 0; i <= 20; i++) {
            a= aleatorio.nextInt((6-1)+1)+1;
            sumaD1 += a;
            b= aleatorio.nextInt((6-1)+1)+1;
            sumaD2 += b;
            System.out.println(a+ "," +b);

        }
        if (sumaD1>sumaD2){
            System.out.println("El dado 1= " +sumaD1+ " es mayor a dado 2= " +sumaD2);
        } else {
            System.out.println("El dado 2= " +sumaD2+ " es mayor a dado 1= " +sumaD1);
            System.out.println("suuuiiiu");
            System.out.println("suuuiiiu");
        }
    }
}