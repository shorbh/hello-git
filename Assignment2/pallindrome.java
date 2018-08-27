import java.util.Scanner;
public class pallindrome{
  public static void main(String args[]){
    int n,a=0,b=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    n=sc.nextInt();
    a=n;
    while(a!=0){
      b=b*10+a%10;
      a/=10;
    }
     if(b==n) System.out.println("Number is Pallindrome");
     else System.out.println("This number is not pallindrome");
  }
}