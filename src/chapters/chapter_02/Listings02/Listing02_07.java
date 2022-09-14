public class Listing02_07 {
	public static void main(String[] args){
		 long totalMilliSeconds = System.currentTimeMillis();
		 long totalSeconds = totalMilliSeconds / 1000;
		 long currentSecond = totalSeconds % 60;
		 long totalMinutes = totalSeconds / 60;
		 long currentMinute = totalMinutes % 60;
		 long totalHours = totalMinutes / 60;
		 long currentHour = totalHours % 24;

		 System.out.println("Current time is " + currentHour + " : " + currentMinute + " : " + currentSecond + " GMT");
	}
}
