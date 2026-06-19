class Solution {
    public int minimumRefill(int[] plants, int A, int B) {
        int oa=A;
        int ob=B;
        int left=0;
        int refil=0;
        int right=plants.length-1;
        while(left<=right){
            if(left!=right){
                if(plants[left]<=A){
                    A=A-plants[left];
                    left++;
                }
                else{
                    A=oa;
                    refil++;
                    A=A-plants[left];
                    left++;
                }
                if(plants[right]<=B){
                    B=B-plants[right];
                    right--;
                }
                else{
                    B=ob;
                    refil++;
                    B=B-plants[right];
                    right--;
                }
            }
            else{
                int max=Math.max(A,B);
                if(max<plants[left]){
                    refil++;
                }
                break;
            }
        }
        return refil;
        
    }
}