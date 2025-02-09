import java.util.ArrayList;

public class mergOverlapingIntervals {
    public class Main
{
	public static void mergOverlapingInterval(Interval [] Intervals1) {
		Interval CurrentInterval = Intervals1[0];
		ArrayList<Interval> ans = new ArrayList<Interval>();
		for(int i = 1; i<Intervals1.length; i++) {
			Interval nextInterval = Intervals1[i];
			int Current_s = CurrentInterval.start;
			int Current_e = CurrentInterval.end;
			int nextInterval_s = nextInterval.start;
			int nextInterval_e = nextInterval.end;
			// This condition is non overlaping condition
			if(nextInterval_s > nextInterval_s) {
				ans.add(CurrentInterval);
				CurrentInterval = nextInterval;
			} else {
				Current_s = Math.min(Current_s,nextInterval_s);
				Current_e = Math.max(Current_e,nextInterval_e);
			}
		}
		ans.add(CurrentInterval);
	}
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
}
