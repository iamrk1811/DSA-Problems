package questions.Array;

public class DistanceBetweenBusStops {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
//        leetcode 1184
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }

        int clockWise = 0;
        for (int i = start; i < destination; i++) clockWise += distance[i];

        int antiClockWise = 0;
        for (int i = destination; i < distance.length; i++) antiClockWise += distance[i];
        for (int i = 0; i < start; i++) antiClockWise += distance[i];

        return Math.min(clockWise, antiClockWise);
    }
}
