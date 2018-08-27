import java.util.*;
public class reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b=0;
        while(n!=0){
            b = b*10 + n%10;
            n/=10;
        }
        System.out.println(b);
    }
}