package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int decision = 1, remador, sujeto1, sujeto2, sujeto3, devolver, devolver2;
        System.out.println("Utilize Solamente Numeros");
        while (decision == 1) {
            mostrarOpciones();
            remador = leer.nextInt();
            switch (remador) {
                case 1:mostrarGameover("Caperucita no Sabe Remar");break;
                case 2:mostrarGameover("Las Uvas no Saben Remar");break;
                case 3:mostrarGameover("El Lobo no Sabe Remar");break;
                case 4:seleccionarAcompañante(leer);break;
            }
        }
    }
    public static void mostrarOpciones() {
        System.out.println("\u001B[36m****************************************");
        System.out.println("|           *** Opciones ***           |");
        System.out.println("****************************************\u001B[0m");
        System.out.println(
                "Tenemos:\n1- \u001B[33mA Caperucita\u001B[0m \n2- \u001B[33mA las Uvas\u001B[0m \n3- \u001B[33mAl Lobo\u001B[0m \n4- \u001B[33mAl Hombre\u001B[0m");
        System.out.print("A cuál desea pasar en el espacio de remador: ");
    }
    public static void mostrarGameover(String mensaje) {
        Scanner leer = new Scanner(System.in);
        System.err.println("\u001B[31m****************************************");
        System.err.println("|          *** Game Over ***           |");
        System.err.println("****************************************\u001B[0m");
        System.err.println("\n" + mensaje + "\n");
        System.out.println("¿Desea Continuar el Juego?");
        System.out.println("1- Sí");
        System.out.println("2- No");
        System.out.print("-----> ");
        int decision = leer.nextInt();
    }
    public static void seleccionarAcompañante(Scanner leer) {
        int sujeto1;
        System.out.println("\u001B[36m****************************************");
        System.out.println("|          *** Acompañante ***         |");
        System.out.println("****************************************\u001B[0m");
        System.out.println("Usted ha elegido al Hombre, ¿Quién acompaña al Hombre?");
        System.out.println(
                "1- \u001B[33mEl Lobo\u001B[0m  \n2- \u001B[33mLas Uvas\u001B[0m \n3- \u001B[33mCaperucita\u001B[0m");
        System.out.print("-----> ");
        sujeto1 = leer.nextInt();
        System.out.println(" ");
        switch (sujeto1) {
            case 1:mostrarGameover("Caperucita se Comio a las Uvas");break;
            case 2:mostrarGameover("El Lobo se Comio a Caperucita");break;
            case 3:acompañanteCaperucita(leer);break;
        }
    }
    public static void acompañanteCaperucita(Scanner leer) {
        int sujeto2;
        System.out.println("Usted ha Elegido \u001B[33m Caperucita \u001B[0m, Ahora");
        Animations.Barco1(1);
        Animations.barcoImagen1();
        System.out.println("\n\nCaperucita Esta del Otro Lado del Rio");
        System.out.println("El Hombre Vuelve y Ahora, ¿A Quien Lleva?");
        System.out.println("1- \u001B[33mEl Lobo \u001B[0m\n2- \u001B[33mLas Uvas\u001B[0m\n-----> ");
        sujeto2 = leer.nextInt();
        System.out.println(" ");
        switch (sujeto2) {
            case 1:llevarLoboConCaperucita(leer);break;
            case 2:llevarUvasConCaperucita(leer);break;
        }
    }

    public static void llevarLoboConCaperucita(Scanner leer) {
        int devolver;
        Animations.Barco2(1);
        Animations.barcoImagen2();
        System.out.println("\n\nUsted ha Elegido Al \u001B[32mLobo\u001B[0m, Ahora");
        System.out.println("El Lobo Esta del Otro Lado del Rio con Caperucita");
        System.out.println("¿Desea Regresar con Alguno?");
        System.out.println("Digite: \n1- Ninguno\n2- El Lobo\n3- Caperucita\n-----> ");
        devolver = leer.nextInt();
        System.out.println(" ");
        switch (devolver) {
            case 1:mostrarGameover("El Lobo se Comio a Caperucita");break;
            case 2:mostrarGameover("Hizo el Mismo Movimiento");break;
            case 3:llevarUvasConCaperucita(leer);break;
        }
    }
    public static void llevarUvasConCaperucita(Scanner leer) {
        int sujeto3;
        Animations.Barco2(1);
        Animations.barcoImagen2();
        System.out.println("\n\nUsted ha Elegido las \u001B[32mUvas\u001B[0m");
        System.out.println("Ahora Caperucita Esta del Lado Original con las Uvas");
        System.out.println("¿Ahora a Cual Desea Llevar al Otro Lado del Rio con El Lobo");
        System.out.println("1- Ninguno\n2- Caperucita\n3- Uvas\n-----> ");
        sujeto3 = leer.nextInt();
        System.out.println(" ");
        switch (sujeto3) {
            case 1:mostrarGameover("Caperucita se Comio a las Uvas");break;
            case 2:mostrarGameover("Hizo el Mismo Movimiento");break;
            case 3:llevarUvasConLobo(leer);break;
        }
    }

    public static void llevarUvasConLobo(Scanner leer) {
        int devolver2;
        System.out.println("Usted ha Elegido las Uvas");
        System.out.println("Ahora las Uvas Están del Otro Lado del Rio con El Lobo");
        System.out.println("¿Desea Regresar Con Alguno?");
        System.out.println("1- Ninguno\n2- Las Uvas\n3- El Lobo\n-----> ");
        devolver2 = leer.nextInt();
        System.out.println(" ");

        switch (devolver2) {
            case 1:
                mostrarFinal();
                break;
            case 2:
                mostrarGameover("Hizo el Mismo Movimiento");
                break;
        }
    }

    public static void mostrarFinal() {
        System.out.println("El Hombre Volvio Solo");
        System.out.println("Ahora Caperucita se Monto en la Barca Para Llegar al Otro Lado del Rio");
        System.out.println(" ");
        System.out.println("****************************************");
        System.out.println("Todos los Participantes Esta en el Otro Lado del Rio");
        System.out.println("Felicidades");
        System.out.println("Usted ha Ganado El Juego");
        System.out.println("Fin");
        System.out.println("****************************************");
    }
}