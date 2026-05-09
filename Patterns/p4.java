import java.util.Scanner;

//n=5
//        1
//        22
//        333
//        4444
//        55555
public class p4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k);
            }
            System.out.print("\n");
            k++;
        }
    }
}
