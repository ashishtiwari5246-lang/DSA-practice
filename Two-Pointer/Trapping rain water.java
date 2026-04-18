class Solution {
    public int trap(int[] height) {
      int leftmax=0;
      int rightmax=0;
      int count=0; 
      int n=height.length;
     int  maxheight=height[0];
      int index=0;
      for(int i=0;i<n;i++){
      if(height[i]>maxheight){
        maxheight=height[i];
        index=i;
      }
      }
     // left part;
     for(int j=0;j<index;j++){
        if(leftmax>height[j]){
            count+=leftmax-height[j];
        }
        else{
            leftmax=height[j];
        }
     }
     // right part; 
     for(int k=n-1;k>index;k--){
        if(rightmax>height[k]){
            count+=rightmax-height[k];
        }
        else{
            rightmax=height[k];
        }   
     }   
      return count;
    }
}
