import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Enter an excercise (1-3):\n");
        int menu = 0;
        Scanner a = new Scanner(System.in);
        menu = a.nextByte();
        switch (menu) {
            case 1: {
                Circle circulin = new Circle();

                circulin.calculeArea();

                circulin.showCircle();
                Cylindre cilindrin = new Cylindre();

                cilindrin.calculeVolume();
                cilindrin.calculeArea();
                cilindrin.showCylindre();

            }
            case 2: {

            }
            case 3:{

            }
        }
    }
}
