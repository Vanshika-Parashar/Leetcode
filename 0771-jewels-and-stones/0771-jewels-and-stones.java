class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character>s=new HashSet<>();
        for(char ch:jewels.toCharArray()){
            s.add(ch);
        }
        int count=0;
        for(char ch:stones.toCharArray()){
            if(s.contains(ch)){
                count++;
            }
        }
        return count;
    }
}