import java.util.Scanner;
class largest
{
  int n ;
  public int getN()
  {
	return n;
  }
  public void setN(int x)
  {
	n = x;
  }
  public void find(int[] a)
  {
	for(int i = 0; i < n; i++)
	{
	   for(int j = i + 1; j < n; j++)
	   {
		if(a[i] > a[j])
		{
			int tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
		}
	    }
	}
	System.out.println("The second largest number is: "+a[n - 2]);
  }
}
public class larray
{
  public static void main(String[] args)
  {
	largest l = new largest();
	Scanner sc = new Scanner(System.in);
	int []a = new int[10];
	for(int i = 0; i < 10; i++)
	{
	  a[i] = sc.nextInt();
	}
	l.setN(10);
	l.find(a);
  }

}
