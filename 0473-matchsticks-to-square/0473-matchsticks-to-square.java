
class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum=0;
        for(int i:matchsticks){
            sum+=i;
        }
        if(sum%4!=0)return false;
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        int target=sum/4;
        int[]ans=new int[4];
        return find(matchsticks,ans,target,0);
        
        
        
    }
    public boolean find(int[]arr,int []ans,int target,int idx){
        if (idx==arr.length){
            return ans[0]==ans[1]&&ans[1]==ans[2]&&ans[2]==ans[3]&&ans[3]==ans[0];
        }
        for(int i=0;i<4;i++){
            if(ans[i]+arr[idx]<=target){
                ans[i]=ans[i]+arr[idx];
                if(find(arr,ans,target,idx+1))return true;
                ans[i]-=arr[idx];
            }
        }
        return false;

    }
    public void reverse(int[]arr){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}

