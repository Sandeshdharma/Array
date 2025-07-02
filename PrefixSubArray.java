public class PrefixSubArray{

    public static void SubArraySum(int numbers[]) {
        int MaxSum = Integer.MIN_VALUE;
        int Prefix[] = new int[numbers.length];
        Prefix[0] = numbers[0];
        for(int i = 1; i < Prefix.length; i++){
            Prefix[i] = Prefix[i-1] + numbers[i];
        }
        int currSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                int end = j;
                currSum = start==0 ? Prefix[end] : Prefix[end]- Prefix[start-1];


                // for (int k = start; k <= end; k++) {
                //     currSum += numbers[k];
                // }


                // System.out.println(currSum);
                if(MaxSum < currSum) {
                    MaxSum = currSum;
                }
            }
            // System.out.println();
        }
        System.out.print(" max sum " + MaxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        SubArraySum(numbers);

    }

}
