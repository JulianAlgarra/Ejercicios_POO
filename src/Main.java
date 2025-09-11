import java.util.*;


public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void  menu() {
        Scanner sc = new Scanner(System.in);
        int opcion=0;

        while (opcion != 6) {
            System.out.println("Menu opciones Ejercicios");
            System.out.println("1. Ejercicio tirada 2 dados.");
            System.out.println("2. Ejercicio tirada 3 dados.");
            System.out.println("3. Ejercicio Indice Masa Corporal.");
            System.out.println("4. Piedra, Papel o Tijeras");
            System.out.println("5. ");
            System.out.println("6. Salir");

            System.out.println("Elija el numero del ejercicio al que desea ir: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    dados2();
                    break;
                case 2:
                    dados3();
                    break;
                case 3:
                    System.out.println(imc());
                    break;
                case 4:
                    vs_pc();
                    break;
                case 5:
                    System.out.println("En proceso");
                    break;
                case 6:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Error..");
            }

        }
    }
    public static void dados2(){
        Random tiradas = new Random();
        int a, b;
        int sumaD1=0, sumaD2=0;
        for (int i = 0; i <= 20; i++) {
            a= tiradas.nextInt((6-1)+1)+1;
            sumaD1 += a;
            b= tiradas.nextInt((6-1)+1)+1;
            sumaD2 += b;
            System.out.println(a+ "," +b);
        }
            if(sumaD1>sumaD2){
                System.out.println("El dado 1 es el mejor, con resultado = "+sumaD1);
                System.out.println("El dado 2 el esl segundo, con resultado = "+sumaD2);
            } else {
                System.out.println("El dado 2 es el mejor, con resultado = "+sumaD2);
                System.out.println("El dado 1 es el segundo, con resultado = " +sumaD1);
            }



    }
    public static void dados3(){
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
    public static String imc(){
        Scanner leer = new Scanner(System.in);
        double peso, estatura, imc;
        String resultado;

        System.out.println("Ingrese peso en kilogramos: ");
        peso = leer.nextDouble();
        System.out.println("Ingrese su estatura en metros");
        estatura = leer.nextDouble();

        imc= peso/(Math.pow(estatura,2));

        if (imc<18.5){
            resultado = "Usted tiene bajo peso = ";
        } else if (imc>18.5 && imc<24.9){
            resultado = "Usted tiene Peso Normal = ";
        } else if (imc>25 && imc<26.9){
            resultado = "Usted tiene Sobrepeso Grado 1 = ";
        } else if (imc>27 && imc<29.9){
            resultado = "Usted tiene Sobrepeso Grado 2 = ";
        } else if (imc>30 && imc<34.9){
            resultado = "Usted tiene Obesidad Tipo 1 = ";
        } else if (imc>35&& imc<39.9){
            resultado = "Usted tiene Obesidad Tipo 2 = ";
        } else if (imc>40 && imc<49.9){
            resultado = "Usted tiene Obesidad Tipo 3 = ";
        } else{
            resultado = "Usted tiene Obesidad Tipo 4 = ";
        }
        return resultado +imc;
    }
    public static void vs_pc(){
        Scanner opcion_jugador = new Scanner(System.in);
        Random opcion_pc = new Random();
        int jugador=0, pc;
        String eleccion_pc= "",eleccion_jugador = "";

        while (jugador != 4) {
            System.out.println("Piedra, Papel o tijeras");
            System.out.println("Escoge un numero de 1-3 para tu eleccion ");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijera");
            System.out.println("4. Salir");
            jugador = opcion_jugador.nextInt();
            pc = opcion_pc.nextInt((3 - 1) + 1) + 1;

        switch (jugador){
            case 1:
                eleccion_jugador ="Piedra";
                break;
            case 2:
                eleccion_jugador ="Papel";
                break;
            case 3:
                eleccion_jugador ="Tijera";
                break;
            case 4:
                System.out.println("Saliendo.......");
            default:
                System.out.println("Opcion no valida");
        }

        switch (pc){
            case 1:
                eleccion_pc ="Piedra";
                break;
            case 2:
                eleccion_pc ="Papel";
                break;
            case 3:
                eleccion_pc ="Tijera";
                break;
            default:
                System.out.println("Opcion no valida");
        }

        System.out.println("Tu elección: " + eleccion_jugador);
        System.out.println("La máquina eligió: " + eleccion_pc);

        if (jugador == pc) {
            System.out.println("¡Empate!");
        } else if ((jugador == 1 && pc == 3) ||
                (jugador == 2 && pc == 1) ||
                (jugador == 3 && pc == 2)) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Perdiste, la máquina gana.");
        }
    }
    }
}