package interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Abstract {
    private static int areas = 0;

    public static void main(String[] args) {
        pc2Read();
    }


    public static void process(int arr[]) {
        int numeroDeLados = arr[0], cant_pintura = 0, cant_lienzo = 1;
        for (int i = 1; i < arr.length; i++) {
            cant_pintura += arr[i];
            cant_lienzo *= arr[i];
        }
        poligonType(numeroDeLados);
        System.out.printf(" -> pintura: %d lienzo: %d", cant_pintura, cant_lienzo);
    }

    public static void poligonType(int cantidadLados) {
        switch (cantidadLados) {
            case 3:
                System.out.print("Triangulo");
                break;
            case 4:
                System.out.print("Cuadrado");
                break;
            case 5:
                System.out.print("Pentagono");
                break;
            case 6:
                System.out.print("Hexagono");
                break;
            case 7:
                System.out.print("Heptagono");
                break;
            case 8:
                System.out.print("Octagono");
                break;
            case 9:
                System.out.print("Eneagono");
                break;
            case 10:
                System.out.print("Decagono");
                break;
            case 11:
                System.out.print("Endecagono");
                break;
            case 12:
                System.out.print("Dodecagono");
                break;
            case 13:
                System.out.print("Tridecagono");
                break;
            case 14:
                System.out.print("Tetradecagono");
                break;
            case 15:
                System.out.print("Pentadecagono");
                break;
            case 16:
                System.out.print("Hexadecagono");
                break;
            case 17:
                System.out.print("Heptadecagono");
                break;
            case 18:
                System.out.print("Octadecagono");
                break;
            case 19:
                System.out.print("Eneadecagono");
                break;
            case 20:
                System.out.print("Icosagono");
                break;
            default:
                System.out.println("Poligono no identificado");
                break;
        }
    }

    public static void convertArrayInteger(String arr[]) {
        int[] vec = new int[arr.length];
        for (int i = 0; i < vec.length; i++) {
            vec[i] = Integer.valueOf(arr[i]);
        }
        process(vec);
    }
    public static void pc2Read() {
        String vec[], line;
        byte n;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            line = buffer.readLine();
            n = Byte.valueOf(line);

            while (n-- >= 1) {
                line = buffer.readLine();;
                vec = line.split(" ");
                convertArrayInteger(vec);
                System.out.println();
            }
            buffer.close();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Poligonos {

    public static int triangulo(int base, int altura) {
        int result = (base * altura) / 2;
        return result * 4;
    }
    public static int cuadrado(int lado1, int lado2) {
        int result = 0;
        return result;
    }
    public static int pentagono(int lado1, int lado2) {
        int result = 0;
        return result;
    }
    public static int hexagono(int lado1, int lado2) {
        int result = 0;
        return result;
    }
    public static int hepagono(int lado1, int lado2) {
        int result = 0;
        return result;
    }
    public static int octagono(int lado1, int lado2) {
        int result = 0;
        return result;
    }
    public static int eneagono(int lado1, int lado2) {
        int result = 0;
        return result;
    }
    public static int decagono(int lado1, int lado2) {
        int result = 0;
        return result;
    }
    public static int endecagono(int lado1, int lado2) {
        int result = 0;
        return result;
    }
    public static int dodecagono(int lado1, int lado2) {
        int result = 0;
        return result;
    }
    public static int tridecagono(int lado1, int lado2) {
        int result = 0;
        return result;
    }
    public static int tetradecagono(int lado1, int lado2) {
        int result = 0;
        return result;
    }
    public static int pentadecagono(int lado1, int lado2) {
        int result = 0;
        return result;
    }
    public static int hexadecagono(int lado1, int lado2) {
        int result = 0;
        return result;
    }
    public static int heptadecagono(int lado1, int lado2) {
        int result = 0;
        return result;
    }
    public static int octadecagono(int lado1, int lado2) {
        int result = 0;
        return result;
    }
    public static int eneadecagono(int lado1, int lado2) {
        int result = 0;
        return result;
    }
    public static int icosagono(int lado1, int lado2) {
        int result = 0;
        return result;
    }
}
