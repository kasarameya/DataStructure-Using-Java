/**
 * Created by ©Ameya on 2/22/2018 at 8:09 PM.
 */
public class ActivitySelection {

    public static void main(String[] args) {
        Activity[] givenActivities = {
                new Activity(0, 0, 0),
                new Activity(1, 2, 50),
                new Activity(3, 5, 20),
                new Activity(6, 19, 20),
                new Activity(2, 100, 200)};

        optimalActivitySelection(givenActivities);
    }

    private static void optimalActivitySelection(Activity[] givenActivities) {
        int[] ASP = new int[givenActivities.length + 1];
        int[] prev = new int[givenActivities.length + 1];
        boolean[] use = new boolean[givenActivities.length + 1];
        ASP[0] = 0;
        prev[0] = 0;

        for (int i = 1; i < givenActivities.length; i++) {
            ASP[i] = ASP[i - 1];
            use[i] = false;
            int j = i - 1;
            while (givenActivities[j].getEndTime() > givenActivities[i].getStartTime()) {
                j--;
            }
            prev[i] = j;
            if (ASP[i] < givenActivities[i].getValue() + ASP[j]) {
                ASP[i] = givenActivities[i].getValue() + ASP[j];
                use[i] = true;
            }
        }
        System.out.println(ASP[givenActivities.length - 1]);
        getSelectedActivities(prev, use, ASP);


    }

    private static void getSelectedActivities(int[] prev, boolean[] use, int[] asp) {
        int current = asp.length - 1;
        while (current > 0) {
            if (use[current]) {
                System.out.println(current);
                current = prev[current];
            } else {
                current--;
            }
        }
    }
}

class Activity {
    private int startTime, endTime, value;

    public Activity(int startTime, int endTime, int value) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.value = value;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public int getValue() {
        return value;
    }
}
