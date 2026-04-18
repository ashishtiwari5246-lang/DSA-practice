class Solution {
    public int[] sortedSquares(int[] nums) {
         int k=0;
          int[] result= new int[nums.length];
      for(int i=0;i<nums.length;i++){
        
        
        long sq=Math.abs(nums[i]*nums[i]);
        
         result[k]=(int)sq;
        k++;
      }  
      Arrays.sort(result);
      return result;
    }
}
