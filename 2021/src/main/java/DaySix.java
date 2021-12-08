import java.util.List;

public class DaySix {

    public long getLanternFixCount(List<Integer> initialState, int numberOfDays) {
        long[] counts = new long[9];
        for (Integer i : initialState) {
            counts[i]++;
        }
        for (int i = 0; i < numberOfDays; i++) {
            long[] temp = new long[9];
            temp[8] = counts[0];
            temp[6] = counts[0] + counts[7];
            temp[7] = counts[8];
            temp[5] = counts[6];
            temp[4] = counts[5];
            temp[3] = counts[4];
            temp[2] = counts[3];
            temp[1] = counts[2];
            temp[0] = counts[1];
            for (int j = 0; j < counts.length; j++) {
             counts[j] = temp[j];
            }
        }
        long finalSum = 0;
        for (int i = 0; i < counts.length; i++) {
            finalSum += counts[i];
        }
        return finalSum;
    }


}
