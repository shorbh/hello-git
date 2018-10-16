class print{
    synchronized public void show(){
        for(int i=1;i<=10;i++) System.out.print(i+" ");
    }
}
class MyThread extends Thread{
    print p;
    MyThread(print p){
        this.p = p;
    }
    public void run(){
        p.show();
    }
}
public class multithread{
    public static void main(String args[]){
        print p = new print();
        MyThread mt = new MyThread(p);
        mt.start();
        MyThread mt1 = new MyThread(p);
        mt1.start();
    }
}