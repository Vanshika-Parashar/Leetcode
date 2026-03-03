class Solution {
    public int findKthPositive(int[] arr, int k) {
    ArrayList<Integer>ar=new ArrayList<>();
    for(int i:arr){
        ar.add(i);
    }
    int nums=1;
    int count=0;
    while(true){
        if(!ar.contains(nums)){
            count++;
            if(count==k){
            return nums;
        }
        
        }
        nums++;
        
    }
        
    }
}