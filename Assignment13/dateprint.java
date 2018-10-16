import java.util.*;
public class dateprint
{   
    private static Scanner ip = new Scanner(System.in);
  
    public static void main(String args[])
    {   
        int len , y, d, m;
        String dd, mm, yy;
 
        int days[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
 
        String month[]={ "", "January", "February", "March", "April", "May", "June", "July", "August",
                         "September", "October", "November", "December" };
 
        System.out.println("Enter date in dd/mm/yyyy format : ");
        String date =  ip.nextLine();
        len = date.length();

        if(len == 10)
        {
            dd = date.substring(0,2); 
            mm = date.substring(3,5); 
            yy = date.substring(6,10);
            d = Integer.parseInt(dd); 
            m = Integer.parseInt(mm); 
            y = Integer.parseInt(yy); 
 
            if( (y%400==0) || ( (y%100!=0) && (y%4==0) ) )  days[2]=29;
             
            if(m<0 || m>12 || d<0 || d>days[m] || y<0 || y>9999) System.out.println("Unacceptable date");
            else System.out.print("Date : " + dd + " " + month[m] + " " + yy);
        }
        else System.out.println("Wrong Input");
      ip.close();
    }
}