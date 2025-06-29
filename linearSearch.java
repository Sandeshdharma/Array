import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int k=0;k<n;k++){
            arr[k]=sc.nextInt();
        }
        System.out.println("enter which element you want to search");
        int keyElement = sc.nextInt();

        int z= -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == keyElement){
                z=i;
                break;

            }
        }
        if(z>-1){
            System.out.println(z);
        }else{
            System.out.println("not found");
        }

    }
    
}
