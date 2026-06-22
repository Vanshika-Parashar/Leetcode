class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer>a=new ArrayList<>();
        
        for(String ch:operations){
            if(ch.equals("D")){
                a.add(2*a.get(a.size()-1));
            }
            else if(ch.equals("C")){
                a.remove(a.size()-1);
            }
            else if(ch.equals("+") ){
                a.add(a.get(a.size()-1)+a.get(a.size()-2));
            }
            else{
                a.add(Integer.parseInt(ch));
                
            }
        }
        int ans=0;
        for(int i:a){
            ans+=i;
        }
        return ans;
    }
}