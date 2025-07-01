public class SumOfMaxSubArray {

    public static void SubArraySum(int numbers[]){
        int MaxSum= Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                currSum = 0;


                int end = j;
                for(int k = start; k<= end ; k++){
                    currSum += numbers[k];

                    
                }
                System.out.println(currSum);
                if(MaxSum < currSum){
                    MaxSum = currSum;
                }

            }
            System.out.println();
        }
        System.out.print(" max sum " + MaxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2 ,4 , 6, 8, 10};
        SubArraySum(numbers);

    }
    
}
