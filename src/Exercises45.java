import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercises45 {
    public static void main(String[] args) {
       SimpleDateFormat newData = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS") ;
        String date = newData.format(new Date());

        System.out.println("Data: " + date);
    }
}
