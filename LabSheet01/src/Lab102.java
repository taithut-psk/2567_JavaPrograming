import java.util.*;
public class Lab102 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Input the number of minutes: ");
	        int minute = sc.nextInt();

	        int year = minute / 525600;//525600 min per year
	        int day = (minute % 525600) / 1440;

	        System.out.println(minute + " minutes is approximately " + year + " years and " + day + " days.");

	        sc.close();
	 }
}
