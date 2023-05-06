import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  
 public class DateToStringExample1 {  
       public static void main(String args[]){  
                Date date = Calendar.getInstance().getTime();
        a=1
         
                DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
                String strDate = dateFormat.format(date);  
                System.out.println("Converted String: " + strDate);  
                 
        }  
}  
