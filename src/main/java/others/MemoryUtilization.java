package others;

import java.util.ArrayList;
import java.util.List;

public class MemoryUtilization {
    List<List<Integer>> optimalUtilization(int deviceCapacity, List<List<Integer>> foregroundAppList, List<List<Integer>> backgroundAppList) {
        // WRITE YOUR CODE HERE

        List<List<Integer>> result = new ArrayList<>();

        foregroundAppList.sort((i, j) -> i.get(1) - j.get(1));
        backgroundAppList.sort((i, j) -> i.get(1) - j.get(1));

        int max = Integer.MIN_VALUE;

        //sizes
        int m = foregroundAppList.size();
        int n = backgroundAppList.size();

        //counters
        int i = 0;
        int j = n - 1;

        while (i < m && j >= 0) {
            int sum = foregroundAppList.get(i).get(1) + backgroundAppList.get(j).get(1);
            if (sum > deviceCapacity) {
                --j;
            } else {
                if (max <= sum) {
                    if (max < sum) {
                        max = sum;
                        result.clear();
                    }
                    List<Integer> re = new ArrayList<>();
                    re.add(foregroundAppList.get(i).get(0));
                    re.add(backgroundAppList.get(j).get(0));
                    result.add(re);
                    int index = j - 1;
                    while (index >= 0 && backgroundAppList.get(index).get(1) == backgroundAppList.get(index + 1).get(1)) {
                        List<Integer> re1 = new ArrayList<>();
                        re1.add(foregroundAppList.get(i).get(0));
                        re1.add(backgroundAppList.get(index--).get(0));
                        result.add(re1);
                    }
                }
                ++i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        MemoryUtilization am = new MemoryUtilization();
        List<List<Integer>> foregroundAppList = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();

        a.add(1);
        a.add(3);

        b.add(2);
        b.add(5);

        c.add(3);
        c.add(7);

        d.add(4);
        d.add(10);

        foregroundAppList.add(a);
        foregroundAppList.add(d);
        foregroundAppList.add(b);
        foregroundAppList.add(c);

        List<List<Integer>> backgroundAppList = new ArrayList<>();
        a = new ArrayList<>();
        a.add(1);
        a.add(2);
        backgroundAppList.add(a);

        a = new ArrayList<>();
        a.add(2);
        a.add(3);
        backgroundAppList.add(a);

        a = new ArrayList<>();
        a.add(3);
        a.add(4);
        backgroundAppList.add(a);

        a = new ArrayList<>();
        a.add(4);
        a.add(5);
        backgroundAppList.add(a);

        System.out.println(am.optimalUtilization(7, foregroundAppList, backgroundAppList));
    }

}

