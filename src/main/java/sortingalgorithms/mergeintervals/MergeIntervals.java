package sortingalgorithms.mergeintervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {

        if(intervals.length <= 1){
            return intervals;
        }

        Arrays.sort(intervals,(arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

        List<int[]> output_arr = new ArrayList<>();

        int[] current_interval = intervals[0];
        output_arr.add(current_interval);

        for(int[] interval : intervals){

            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];

            if(current_end >= next_begin){
                current_interval[1] = Math.max(current_end, next_end);
            } else {
                current_interval = interval;
                output_arr.add(current_interval);
            }
        }

        return output_arr.toArray(new int[output_arr.size()][]);
    }

    public static void main(String[] args) {
        int[][] input = {{1,3},{2,6},{8,10},{15,18}};
        MergeIntervals mergeIntervals = new MergeIntervals();
        System.out.println(Arrays.deepToString(mergeIntervals.merge(input)));
    }
}
