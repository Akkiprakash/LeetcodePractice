package leetcodearrays;

class shuffle{
    public int[] shuffle(int[] nums, int n) {
      int length = nums.length;
      int[] arr = new int[length];
      int index =0;
      for(int i=0;i<n;i++){
        arr[index++] = nums[i];
        arr[index++] = nums[i+n];
      }
      return arr;
    }
}
public class shuffleThearray {
    public static void main(String[] args) {
        shuffle sol = new shuffle();
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] result = sol.shuffle(nums,n);
        for(var x : result){
            System.out.print(x + " ");
        }
    }

    
}
