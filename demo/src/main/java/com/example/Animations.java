package com.example;

public class Animations {
    public static void animarBarco1(int duracion, int direccion, String[] barco, String[] muñecosInicio) {
        int screenWidth = 35;
        int barcoPosicion = 15;
        int puntoFinal = screenWidth - 7; // Ajusta este valor según la longitud del barco
        int alturaMuñecosInicio = muñecosInicio.length; // Altura de los muñecos al principio
        // int alturaMuñecosFinal = muñecosFinal.length; // Altura de los muñecos al
        // final
        long startTime = System.currentTimeMillis();

        try {
            while (System.currentTimeMillis() - startTime < duracion) {
                // Limpiar toda la pantalla
                System.out.print("\033[H\033[2J");

                // Mover el barco en la dirección apropiada
                barcoPosicion += direccion;

                // Imprimir el barco
                for (String linea : barco) {
                    // Imprimir espacios en blanco para posicionar el barco horizontalmente
                    for (int i = 0; i < barcoPosicion; i++) {
                        System.out.print(" ");
                    }
                    System.out.println(linea);
                }

                // Imprimir muñecos al principio en la misma línea horizontal que el barco
                for (int i = 0; i < alturaMuñecosInicio; i++) {
                    // Imprimir la línea del muñeco al principio
                    System.out.println(muñecosInicio[i]);
                }

                // Cambiar la dirección cuando el barco alcanza el punto final
                if (barcoPosicion >= puntoFinal || barcoPosicion <= 0) {
                    direccion *= -1;
                }

                // Esperar un breve periodo de tiempo para dar la ilusión de movimiento
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void Barco1(int direccion) {
        // Definir la apariencia del barco
        String[] barco = {
                "   ~~~~~~~║■~~~~~~",
                "   ~~~~~~▓║~~~~O~~~",
                "   ~~~~~▓▓║~~~l|/~~",
                "   ~~~~▓▓▓║~~~~|~~~",
                "   ▀████████████▀~~"
        };

        // Definir la apariencia de los muñecos en la misma línea horizontal que el
        // barco
        String[] muñecos3 = {
                "\\█/ \\█/ \\█/"
        };
        String[] muñecos2 = {
                "\\█/ \\█/"
        };
        String[] muñecos1 = {
                "\\█/ "
        };

        // Llamar a la función para animar el barco y mostrar muñecos en la misma línea
        animarBarco1(3500, direccion, barco, muñecos3);
    }



    public static void animarBarco2(int duracion, int direccion, String[] barco, String[] muñecosInicio, String[] muñecosFinal) {
        int screenWidth = 35;
        int barcoPosicion = 10;
        int puntoFinal = screenWidth - 7; // Ajusta este valor según la longitud del barco
        int alturaMuñecosInicio = muñecosInicio.length; // Altura de los muñecos al principio
        int alturaMuñecosFinal = muñecosFinal.length; // Altura de los muñecos al final
        long startTime = System.currentTimeMillis();

        try {
            while (System.currentTimeMillis() - startTime < duracion) {
                // Limpiar toda la pantalla
                System.out.print("\033[H\033[2J");

                // Mover el barco en la dirección apropiada
                barcoPosicion += direccion;

                // Imprimir el barco
                for (String linea : barco) {
                    // Imprimir espacios en blanco para posicionar el barco horizontalmente
                    for (int i = 0; i < barcoPosicion; i++) {
                        System.out.print(" ");
                    }
                    System.out.println(linea);
                }

                // Imprimir muñecos al principio en la misma línea horizontal que el barco
                for (int i = 0; i < alturaMuñecosInicio; i++) {
                    // Imprimir la línea del muñeco al principio
                    System.out.println(muñecosInicio[i]);
                }

                // Imprimir muñecos al final en la misma línea horizontal que el barco
                for (int i = 0; i < alturaMuñecosFinal; i++) {
                    // Imprimir espacios en blanco para posicionar los muñecos al final
                    for (int j = 0; j < puntoFinal+20; j++) {
                        System.out.print(" ");
                    }
                    // Imprimir la línea del muñeco al final
                    System.out.println(muñecosFinal[i]);
                }
                // Esperar un breve periodo de tiempo para dar la ilusión de movimiento
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void Barco2(int direccion) {
        // Definir la apariencia del barco
        String[] barco = {
                "   ~~~~~~~║■~~~~~~",
                "   ~~~~~~▓║~~~~O~~~",
                "   ~~~~~▓▓║~~~l|/~~",
                "   ~~~~▓▓▓║~~~~|~~~",
                "   ▀████████████▀~~"
        };

        // Definir la apariencia de los muñecos en la misma línea horizontal que el
        // barco
        String[] muñecos3 = {
                "\\█/ \\█/ \\█/"
        };
        String[] muñecos2 = {
                "\\█/ \\█/"
        };
        String[] muñecos1 = {
                "\\█/ "
        };

        // Llamar a la función para animar el barco y mostrar muñecos en la misma línea
        animarBarco2(2000, direccion, barco, muñecos2, muñecos1);
    }

    public static void barcoImagen1() {
        System.out.print("\033[H\033[2J");
        // Definir la apariencia del barco
        String[] imagen = {
                "         ~~~~~~~║■~~~~~~~",
                "         ~~~~~~▓║~~~~O~~~",
                "         ~~~~~▓▓║~~~l|/~~",
                "         ~~~~▓▓▓║~~~~|~~~",
                "\\█/ \\█/  ▀████████████▀~~                    \\█/"
        };
        for (String linea : imagen) {
            System.out.println(linea);
        }
    }

    public static void barcoImagen2() {
        System.out.print("\033[H\033[2J");
        // Definir la apariencia del barco
        String[] imagen = {
                "                          ~~~~~~~║■~~~~~~~",
                "                          ~~~~~~▓║~~~~O~~~",
                "                          ~~~~~▓▓║~~~l|/~~",
                "                          ~~~~▓▓▓║~~~~|~~~",
                "\\█/                      ▀████████████▀~~ \\█/\\█/"
        };
        for (String linea : imagen) {
            System.out.println(linea);
        }
    }

    public static void barcoImagen3() {
        System.out.print("\033[H\033[2J");
        // Definir la apariencia del barco
        String[] imagen = {
                "     ~~~~~~~║■~~~~~~~",
                "     ~~~~~~▓║~~~~O~~~",
                "     ~~~~~▓▓║~~~l|/~~",
                "     ~~~~▓▓▓║~~~~|~~~",
                "\\█/  ▀████████████▀~~                    \\█/\\█/"
        };
        for (String linea : imagen) {
            System.out.println(linea);
        }
    }
}
