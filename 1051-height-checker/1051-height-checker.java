class Solution {
    public int heightChecker(int[] expected) {
        int[]heights=new int[expected.length];
        for(int i=0;i<expected.length;i++){
            heights[i]=expected[i];
        }
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<expected.length;i++){
            if(heights[i]!=expected[i])
            count++;
        }
        return count;
        
        
    }
}