import java.util.*;
class sortt implements Comparable<sortt> 
{
  String name;
  int age;
  sortt() {}
  sortt(String name, int age) 
  {
    this.name = name;
    this.age = age;
  }
  
  void print() 
  {
    System.out.println( this.name + " " + this.age );
  }

  public int compareTo(sortt temp) 
  {
    if (this.name.equals(temp.name))
        return 0;
    else if (this.name.compareTo(temp.name) > 0)
        return 1;
    else
        return -1;
  }
}

public class listSort
{
  public static void main(String[] args) 
  {
      Scanner sc = new Scanner(System.in);
    List<sortt> l1 = new ArrayList<>();
    System.out.println("enter the size of list");
    /int n = sc.nextInt();String a;int b;
    for(int i=0;i<n;i++) {
        a = sc.next();
        b = sc.nextInt();
        l1.add(new sortt(a,b));
    }
    System.out.println("Sorts on the basis of name : ");
    Collections.sort(l1); 
    for (sortt i: l1)
      i.print();
    System.out.println();
  }
}