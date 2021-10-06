package lec03.assignments;

public class Marathon {
    public static void main (String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }

        System.out.print("Fastest runner: " + names[getLowestTime(times)]);
        System.out.println("   time: " + times[getLowestTime(times)]);

        System.out.print("Second fastest runner: " + names[getSecondLowestTime(times)]);
        System.out.println("   time: " + times[getSecondLowestTime(times)]);

    }
    public static int getLowestTime(int[] times) {
        int minTime = times[0];
        int minTimeIndex = 0;
        for(int i = 0; i < times.length; i++) {
            if(minTime > times[i]) {
                minTime = times[i];
                minTimeIndex = i;
            }
        }
        return minTimeIndex;
    }

    public static int getSecondLowestTime(int[] times) {
        int[] interval = new int[times.length];
        int lowestTime = getLowestTime(times);
        for(int i = 0; i < times.length; i++) {
            interval[i] = times[i] - times[lowestTime];
        }
        int secondLowestTime = interval[0];
        int second = 0;
        for(int i = 0; i < interval.length; i++) {
            if(secondLowestTime > interval[i] && interval[i] != 0) {
                secondLowestTime = interval[i];
                second = i;
            }
        }
        return second;
    }
}
