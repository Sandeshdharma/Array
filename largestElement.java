public class largestElement {
    public static void main(String[] args) {
        int Arr1[] = {2,5,7,8,23};
        int Max=Arr1[0];
        for(int i =0; i<Arr1.length;i++){
            if(Max<Arr1[i]){
                Max=Arr1[i];


            }

        }
        System.out.println(Max);
    }
    
}
