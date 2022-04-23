import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleTesting {

	public static void main(String[] args) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();        
		String dateToStr = dateFormat.format(date);
		System.out.println("Date is "+ dateToStr);
	}
}
