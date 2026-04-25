import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DSA {
    public static int[] maxSlidingWindow(int[] nums, int k){
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<=n-k;i++){
            int j=i;
            int max=Integer.MIN_VALUE;
            while(j<k+i){
                if(nums[j]>max){
                    max=nums[j];
                }
                j++;
            }
            list.add(max);
        }
        int[] res=new int[list.size()];
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int size=sc.nextInt();
            int[] nums=new int[size];
            for(int i=0;i<size;i++){
                nums[i]=sc.nextInt();
            }
            int k=sc.nextInt();
            int[] res=maxSlidingWindow(nums, k);
            System.out.println(Arrays.toString(res));
        }
    }
}

