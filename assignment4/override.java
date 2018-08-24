import java.util.*;
class animal{
    private String breed;
    private String colour;
    public void setData(){
        Scanner sc = new Scanner(System.in);
        breed = sc.next();
        colour = sc.next();
    }
    public void getData(){
        System.out.println("breed name = "+breed+" and colour = "+colour);
    }
    public void speak(){
        System.out.println("any animal sound");
    }
}
class cat extends animal{
    public void speak(){
        System.out.println("cat sound");//overriding the base class speak function
    }
}
class dog extends animal{
    public void speak(){
        System.out.println("dog sound");//overriding the base class speak function
    }
}
public class override{
    public static void main(String args[]){
      cat obj = new cat();
      dog obj1 = new dog();
      obj.setData();
      obj1.setData();
      obj.getData();
      obj.speak();
      obj1.getData();
      obj1.speak();
    }
}