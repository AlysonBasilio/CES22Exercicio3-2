
public class Time {
	private int hour;
	private int minute;
	
	Time(int h, int m){
		hour = h;
		minute = m;
	};
	
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public static void main (String arg[]){
		Time t = new Time(3,25);
		System.out.println("The time now is "+t.getHour()+":"+t.getMinute());
	}
}
