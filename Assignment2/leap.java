import java.util.*;
public class leap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println((a%4!=0) ? ("not a leap year"):((a%100!=0) ? "leap year":((a%400!=0) ? "not a leap year":"leap year")));
    }
}