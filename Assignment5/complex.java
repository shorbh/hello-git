
import java.util.Scanner;
class complexs
{
  private int real;
  private int imag;

  public int getReal()
  {
	return real;
  }
  public void setReal(int x)
  {
	real = x;
  }
  public int getImag()
  {
	return imag;
  }
  public void setImag(int x)
  {
	imag = x;
  }
  public void show()
  {

	System.out.println("The complex no  is "+real+" + "+imag+"i");
  }
}

public class complex
{
  public static void main(String[] args)
  {
	complexs a = new complexs();
	Scanner sc = new Scanner(System.in);
	int real = sc.nextInt();
	int imag = sc.nextInt();
	a.setReal(real);
	a.setImag(imag);
	a.show();
  }

}