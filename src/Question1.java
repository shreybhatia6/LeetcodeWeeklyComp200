public class Question1 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < arr.length-2; i++){
            for (int j = i+1; j < arr.length-1; j++){
                for (int k = j+1; k < arr.length; k++){
                    int temp1 = (int) ((Math.abs(arr[i] - arr[j])));
                    int temp2 = (int) ((Math.abs(arr[j] - arr[k])));
                    int temp3 = (int) ((Math.abs(arr[i] - arr[k])));
                    if (temp1 <= a && temp2 <=b && temp3 <=c){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

