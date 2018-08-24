public class overload{
    static void print1(){
        System.out.println("accepting null arguments");
    }
    static void print(int x){
        System.out.println("accepting integer value "+x);
    }
    static void print(float x){
        System.out.println("accepting float value "+x);
    }
    public static void main(String args[]){
        print1();
        print(4);
        print(2.5f);
    }
}