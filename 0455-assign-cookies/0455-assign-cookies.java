class Solution {
    public int findContentChildren(int[] greed, int[] Size) {
        Arrays.sort(greed);
        Arrays.sort(Size);
        int i=0;
        int j=0;
        int count=0;
        while(i<greed.length && j<Size.length){
            if(greed[i]<=Size[j]){
                count++;
                i++;
                j++;
            }
            else if(greed[i]>Size[j]){
                j++;
            }
        }
        return count;

    }
}
