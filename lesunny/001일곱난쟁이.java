import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[9];
        
        //input
        int sum=0;
        for (int i=0; i<9 ; i++){
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        
        Arrays.sort(arr);
        
        int a=0, b=8;
        while(sum-arr[a]-arr[b] !=100){
            if(sum-arr[a]-arr[b] > 100){
                a++;
            }else{
                b--;
            }
        }
        for(int i=0; i<9; i++){
            if (i==a || i==b) continue;
            System.out.println(arr[i]);
        }
    }
}
