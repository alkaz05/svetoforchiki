import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите N и M");
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] result = new int[n];
        System.out.println("введите "+m+" тоннелей");
        for (int i = 0; i < 2*m; i++) {
            int x = scan.nextInt();
            result[x-1]++;
        }
        System.out.println(Arrays.toString(result));
        System.out.println("ура-ура");
    }
}