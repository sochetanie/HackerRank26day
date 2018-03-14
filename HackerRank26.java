import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Day26 {
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 
		 String borrowedDate = in.nextLine();
		 String dueDate = in.nextLine();
		 
		 String[] str = borrowedDate.split(" ");
		 String[] str1= dueDate.split(" ");
		 
		 String dd = str[0]+"-"+str[1]+"-"+str[2];
		 String dd1 = str1[0]+"-"+str1[1]+"-"+str1[2];
		 
		 SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		 Date returned = null;
		try {
			returned = format.parse(dd);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		 Date deadline = null;
		try {
			deadline = format.parse(dd1);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		 
		long diff = returned.getTime() - deadline.getTime();
		long diffDays = diff / (24 * 60 * 60 * 1000);	 
		long diffMonths = diffDays/30;
		
		if(diffDays<=0){
			System.out.println(0);
		}else if(str[1].equals(str1[1])&& str[2].equals(str1[2])){
			System.out.println(15*diffDays);
		}else if(!str[1].equals(str1[1])&& str[2].equals(str1[2])){
			System.out.println(500*diffMonths);
		}else
			System.out.println(10000);
		
		
	 }

}