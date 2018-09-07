import java.util.*;
public class countWords{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string : ");
        String x  = sc.nextLine();int c=0;int a=x.length();
        for(int i=0;i<a;i++) if(x.substring(i,i+1).compareTo(" ")==0) c++;
        System.out.println(c + 1 + " Words in the string");
    }
}
