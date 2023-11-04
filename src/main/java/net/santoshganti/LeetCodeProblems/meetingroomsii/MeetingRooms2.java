package net.santoshganti.LeetCodeProblems.meetingroomsii;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms2 {
    public static void main(String[] args) {
        int[][] input = {{0, 30}, {5, 10}, {15, 20}};
        MeetingRooms2 meetingRooms2 = new MeetingRooms2();
        System.out.println(meetingRooms2.minMeetingRooms(input));
    }

    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, (a1, b1) -> (a1[0] - b1[0]));
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        // process all events
        for (int[] interval : intervals) {
            // if nothing active, then we can simply add one
            if (pq.size() == 0) {
                pq.add(interval);
                continue;
            }

            //have a look  if the record in queue has end time finished
            int[] temp = pq.peek();

            // if end time exceeded
            if (temp[1] <= interval[0]) {

                //pull out the event
                pq.poll();

                //add the current event
                pq.add(interval);
                continue;
            }

            // else the end time of the event at top has not expired then we need to simply put this event into queue
            pq.add(interval);
        }

        // the current size of the queue tells us the different rooms required
        return pq.size();
    }
}
