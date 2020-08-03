import java.util.ArrayList;

public class Question3 {
    public int minSwaps(int[][] grid) {
        ArrayList<Integer> al = new ArrayList<>();
        int totalSwaps = 0;
        MAIN:
        for (int i = 0; i < grid.length; i++) {
            int count = 0;
            for (int j = grid.length - 1; j >= 0; j--) {
                if (grid[i][j] == 1) {
                    al.add(count);
                    continue MAIN;
                } else {
                    count++;
                }
            }
            al.add(count);

        }
        System.out.println (al);
        SECOND:
        for (int k = 0; k < grid.length; k++) {
            int trailingNeeded = grid.length - k - 1;
            for (int l = k ; l < al.size(); l++) {
                if (al.get(l) >= trailingNeeded) {
                    totalSwaps += (l-k);
                    al.add(0, al.get(l));
                    al.remove(l + 1);
                    continue SECOND;

                }
                if (l == grid.length - 1 && !(al.get(l) >= trailingNeeded))
                    return -1;
            }
        }
        return totalSwaps;
    }
}

