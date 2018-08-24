import java.util.*;
abstract class veichle{
    abstract void start();
    void stop(){

    }
}
class twowheeler extends veichle{
    public void start(){
        System.out.println("start of two wheeler class");
    }
    public void stop(){
        System.out.println("stop of two wheeler class");
    }
}
class fourwheeler extends veichle{
    public void start(){
        System.out.println("start of four wheeler class");
    }
    public void stop(){
        System.out.println("stop of four wheeler class");
    }
}
public class abstract1{
    public static void main(String args[]){
      twowheeler obj = new twowheeler();
      fourwheeler obj1 = new fourwheeler();
      obj.start();
      obj.stop();
      obj1.start();
      obj1.stop();
    }
}