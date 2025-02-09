
import java.util.*;

class Interval {
	int start, end;

	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}
public class MergInterval {
    public class Main {  // Renamed from StaticIntervalListexample to Main
        static List<Interval> intervalListOne = new ArrayList<>();
        static List<Interval> intervalListTwo = new ArrayList<>();
        // Static block to initialize intervals
        static {
            intervalListOne.add(new Interval(1, 10));
            intervalListOne.add(new Interval(15, 25));
            intervalListOne.add(new Interval(30, 40));
        }
    
        static {
            intervalListTwo.add(new Interval(1, 8));
            intervalListTwo.add(new Interval(17, 35));
            intervalListTwo.add(new Interval(50, 60));
        }
    
        static ArrayList<Interval> mergIntervals = new ArrayList<Interval>();
        public static void main(String[] args) {
            for(int i = 0; i<intervalListOne.size(); i++) {
                Interval intervalOne = intervalListOne.get(i);
                Interval intervaltwo = intervalListTwo.get(i);
                System.out.println(" "+intervalOne.start+" "+intervalOne.end);
                System.out.println(" "+intervaltwo.start+" "+intervaltwo.end);
                if(intervaltwo.start < intervalOne.end || intervaltwo.end < intervalOne.start){
                    Interval newInterval = new Interval( Math.min(intervalOne.start,intervaltwo.start),Math.max(intervalOne.end,intervaltwo.end));
                    mergIntervals.add(newInterval);
                }
            }
            for(Interval IntervalRef : mergIntervals){
                System.out.print(" "+IntervalRef.start+" "+IntervalRef.end);
            }
            System.out.println();
        }
    }
}
