import java.util.Scanner;

public class ControlDeLaboratorio {
    public static void mostrarTemperaturas(int[][] temperaturas) {
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                System.out.print(temperaturas[i][j] + " ");
            }
            System.out.println("Ingrese la temperatura del equipo " + (i + 1) + ": ");
            if (temperaturas[i][0] > 50) {
                System.out.println("Equipo " + (i + 1) + " está sobrecalentado.");
            } else {
                System.out.println("Equipo " + (i + 1) + " está en condiciones normales.");
            } 
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[][] temperaturas = new int[4][5];
        System.out.println("Ingrese la temperatura de los equipos");
        for (int i=0; i < 4; i++){
            for (int j = 0; j < 5; j++) {
                System.out.print("Equipo " + (i + 1) + ", Sensor " + (j + 1) + ": ");
                temperaturas[i][j] = scanner.nextInt();
                System.out.println("Temperatura del equipo " + (i + 1) + ", Sensor " + (j + 1) + ": " + temperaturas[i][j]);
            }
        }
    }
}
