class Solution {
    public int maxArea(int[] height) {
    
      int l=0;
      int r=height.length-1;
      
      int maxarea=0;
      while(l<r){
        int width=r-l;
       int ht=Math.min(height[l],height[r]);
       int area=width*ht;
       maxarea=Math.max(maxarea,area);

       if(height[l]<height[r]){
        l++;
       }
       else{
        r--;
       }
      }
      return maxarea;  
    }
}
