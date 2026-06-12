class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>s=new HashSet<>();
        if(nums.length==0)return 0;
        for(int i:nums){
            s.add(i);
        }
        int max=1;
        for(int i:s){
            int count=0;
            if(s.contains(i-1)){//hme no mil rha toh check krenge ki agr hash set usse chota contain krta toh contine 
                continue;
            }
            else{
                int st=i;//agr isse chota nh mila mtln agr seq hoga toh yhi se start isliye isi se loop lga kr checck kra
                while(s.contains(st)){
                    count++;
                    st++;
                }
            }
            max=Math.max(count,max);

        }
        return max;
        
    }
}