
package Simple_Programs;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class util3 {
    public static void main(String[] args) {
        GregorianCalendar gc=new GregorianCalendar();
        GregorianCalendar gc2=new GregorianCalendar(2016,0,16,05,15,30);
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.DATE));
        System.out.println("gc2="+gc2);
        System.out.println(gc2.get(Calendar.DATE)+"/"+gc2.get(Calendar.MONTH));
        if(gc.isLeapYear(2016))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
    
}
