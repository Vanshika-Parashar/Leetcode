class Solution {
    public int findFinalValue(int[] nums, int original) {
        //approach 1
        // Arrays.sort(nums);
        // for(int i:nums){
        //     if (i==original){
        //         original=original*2;
        //     }
        // }
        // return original;
        //approach 2
        boolean x=true;
        while(x==true){
            x=find(nums,original);
            original=original*2;
        }
        return original/2;
        
    }
    public static boolean find(int[]nums ,int original){
        for(int i:nums){
            if(i==original){
                return true;
            }
        }
        return false;
    }
}