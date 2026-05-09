import java.util.Scanner;
//n=4
//        1234
//        123
//        12
//        1
public class p6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int k=1;
            for(int j=n;j>=i;j--){
                System.out.print(k++);
            }
            System.out.print("\n");
        }
    }
}
