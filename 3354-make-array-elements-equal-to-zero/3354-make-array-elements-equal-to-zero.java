class Solution {
    public int countValidSelections(int[] nums) {
    //     int count=0;
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]==0){
    //             if(isvalid(nums,i,-1))count++;
    //             if(isvalid(nums,i,+1))count++;
    //         }
    //     }
    //     return count;
    // }
    // public static boolean isvalid(int[]nums,int start,int dir){
    //     int curr=start;
    //     int[]arr=nums.clone();
    //     while(curr>=0 && curr<nums.length){
    //         if(arr[curr]==0){
    //             curr+=dir;
    //         }
    //         else{
    //             arr[curr]--;
    //             dir*=-1;
    //             curr+=dir;
    //         }
    //     }
    //     for(int i:arr){
    //         if(i!=0){
    //             return false;
    //         }
            
    //     }
    //     return true;

    // }
    // method2
    int count=0;
    int sum=0;
    int halfsum=0;
    for(int i:nums){
        sum+=i;
    }
    for(int i=0;i<nums.length;i++){
        halfsum+=nums[i];
        if(nums[i]==0){
            if(2*halfsum==sum){
                count+=2;
            }
            else if((Math.abs(sum-2*halfsum)==1)){
                count+=1;
            }
            }

        }
        return count;
    }
    }
