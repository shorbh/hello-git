import java.util.*;
import java.math.*;
public class prime
{
    public static void main(String args[])
    {
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt(),c=0;
    for(int i=1;i<=Math.sqrt(a);i++)
            if(a%i==0&&i!=1||a==1){System.out.println("Not Prime");c=1;break;}
    if(c==0) System.out.println("Prime");
    }
}