package leetcodearrays;

class watercheck{
     public int maxArea(int[] height) {
        int left =0,right = height.length-1;
        int max = 0;
        while(left < right){
            int width = (right-left);
            int sum = Math.min(height[left],height[right]) * width;
            max = Math.max(sum,max);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        System.gc();
        return max;
    }
}
public class Tappingrain {
    public static void main(String[] args) {
        watercheck obj = new watercheck();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int res = obj.maxArea(height);
        System.out.println(res);
    }
}
