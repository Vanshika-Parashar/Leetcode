class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String>set=new HashSet<>();
        int count=0;
        for(String i:words){
            
            String ans=reverse(i);
            if(!set.contains(ans)){
                set.add(i);
            }
            else{
                count++;
            }
        }
        return count;
        
    }
    public String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}