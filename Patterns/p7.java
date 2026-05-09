import java.util.Scanner;
//n=3
//        *
//       ***
//      *****
public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int k=0;
        //row
        for(int i=1;i<=n;i++){
            //space
            for(int s=n-1;s>=i;s--){
                System.out.print(" ");
            }
            //col
            for(int j=1;j<=2*i-1;j++){     //instead of 2*i-1 we can use k+i but its much better
                System.out.print("*");
            }
//            k++;
            System.out.println();
        }

    }

}
