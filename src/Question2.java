public class Question2 {
    public int getWinner(int[] arr, int k) {

        int l = 0;
        int p = l + 1;
        int currentWinner = 0;
        int winnerCount = 0;
        while (p < arr.length) {

            if (arr[l] > arr[p]) {
                currentWinner = arr[l];

                winnerCount++;
                p++;

            } else {
                currentWinner = arr[p];
                winnerCount = 1;
                l = p;
                p = l + 1;
            }

            if (winnerCount == k) {
                return currentWinner;
            }
        }

        return currentWinner;
    }
}

