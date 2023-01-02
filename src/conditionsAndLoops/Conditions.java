package conditionsAndLoops;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        System.out.println(extracted());
    }

    private static int extracted() {
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        switch (num) {
            case 1 -> {
                return 1;
            }
            case 2 -> {
                System.out.println(2);
                System.out.println(0);
            }
            case 3 -> {
                return 3;
            }
            default -> System.out.println("default");
        }

        return num;
    }
}
