import java.util.ArrayList;

public class MergeIntervals {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
     // This is List is to push the ans
     ArrayList<Interval> ans = new ArrayList<Interval>();
     for(Interval currentInterval : intervals){
         int current_s = currentInterval.start;
         int current_e = currentInterval.end;
         int newInterval_s = newInterval.start;
         int newInterval_e = newInterval.end;
        
        // Check if interval are overlaping
        if(newInterval_s > current_e){
            ans.add(currentInterval);
        }else if(newInterval_e < currentInterval.start ){
            ans.add(newInterval);
            newInterval = currentInterval;
        }else{ // This is overlaping condition
            newInterval.start = Math.min(newInterval.start, currentInterval.start);
            newInterval.end = Math.max(newInterval.end, currentInterval.end);
        } 
     }
    ans.add(newInterval);
    return ans;

    }
}
