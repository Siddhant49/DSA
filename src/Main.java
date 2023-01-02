import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String h = new String("hello");
        byte[] bytes = h.getBytes();
        int length = bytes.length;
        System.out.println();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, h);
        System.out.println(map);

        Scanner input = new Scanner(System.in);
        System.out.println("Fk " + input.next());;

    }
}