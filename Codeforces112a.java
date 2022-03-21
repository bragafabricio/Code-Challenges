import java.util.Scanner;

public class Codeforces112a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String in1 = sc.nextLine();
        String in2 = sc.nextLine();
        System.out.println(ordenate(in1, in2));
    }

    public static int ordenate(String um, String dois){
        int out = um.compareToIgnoreCase(dois);
        if (out == 0){
            return 0;
        }
        else if (out < 0){
            return -1;
        }
        else {
            return 1;
        }
    }
}
