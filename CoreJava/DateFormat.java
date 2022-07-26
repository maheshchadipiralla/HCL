import java.util.*;
import java.text.SimpleDateFormat;

public class DateFormat{
	public static void main(String args[]){
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		String TodayDate = dateFormat.format(new Date());
		System.out.println(TodayDate);
	}
}