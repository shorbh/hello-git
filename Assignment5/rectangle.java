
import java.util.Scanner;
class area
{
  private int length;
  private int breadth;

  public int getLength()
  {
	return length;
  }
  public void setLength(int x)
  {
	length = x;
  }
  public int getBreadth()
  {
	return breadth;
  }
  public void setBreadth(int x)
  {
	breadth = x;
  }
  public void find()
  {
	double area = length * breadth;
	System.out.println("The area of rectangle is "+area);
  }
}
public class rectangle
{
  public static void main(String[] args)
  {
	area a = new area();
	Scanner sc = new Scanner(System.in);
	int l = sc.nextInt();
	int b = sc.nextInt();
	a.setLength(l);
	a.setBreadth(b);
	a.find();
  }

}