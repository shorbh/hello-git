import java.util.*;
public class waveform{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();int b;
        int a[] = new int[n];
        for(int i=0;i<n;i++) {
            if(i%2!=0){b=a[i-1];a[i-1]=sc.nextInt();a[i]=b;}
            else a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) System.out.println(a[i]);
    }
}