class Solution {
    public boolean hasDuplicate(int[] nums) {
        
         for(int i=0;i<nums.length;i++){

              for(int j=i+1;j<nums.length;j++){

                int source= nums[i];
                int target= nums[j];

            
                if(source==target)
                   return true; 
              }
              }  

    return false;    
           

    }
}