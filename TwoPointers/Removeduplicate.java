package TwoPointers;

class removing{
      public int removeElement(int[] nums, int val) {
        int index =0;
        int i=0;
        while(i< nums.length){
            if(nums[i] != val){
                nums[index++] =nums[i];
               
            }
              i++;
           
        }
        return index;
    }
}
public class Removeduplicate {
    public static void main(String[] args) {
        
        removing obj = new removing();
        int[] arr = {3,2,2,3};
        int val = 3;
        int ans = obj.removeElement(arr, val);
        System.out.println(ans);
    }

}
