class Solution {
    public int[] findMissingAndRepeatedValues(int[][] g) {
        int r=g.length;
        int c=g[0].length;
        int n=r*c;
        int[]freq=new int[n+1];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int el=g[i][j];
                freq[el]++;

            }
        }
        int[]arr=new int[2];
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1){
                arr[0]=i;
            }
            if(freq[i]==0){
                arr[1]=i;
            }
        }
        return arr;
        
    }
}