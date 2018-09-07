import java.util.*;
public class removeVowel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String x  = sc.nextLine();String y = "";
        for(int i=0;i<x.length();i++){
            if(x.substring(i,i+1).compareTo("a")>=0 || x.substring(i,i+1).compareTo(" ")==0) y = y + x.substring(i,i+1);
        }
        System.out.print(y);
    }
}
