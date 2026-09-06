class Solution {
    public int findContentChildren(int[] greed, int[] Size) {
        Arrays.sort(greed);
        Arrays.sort(Size);
        int g=0;
        int s=0;
        int count=0;
        while(g<greed.length && s<Size.length){
            if(greed[g]<=Size[s]){
                count++;
                g++;
                s++;
            }else if(greed[g]>Size[s]){
                s++;
            }
        }
        return count;

    }
}
