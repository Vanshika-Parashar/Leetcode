class Solution {
    public List<String> fizzBuzz(int n) {
        List<String>ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String s=find(i);
            ans.add(s);
        }
        return ans;

        
        
    }
    public String find(int i){
        if(i%3==0 && i%5==0){
            return "FizzBuzz";
        }
        else if(i%3==0){
            return "Fizz";
        }
        else if(i%5==0){
            return "Buzz";
        }
        else{
            String s=String.valueOf(i);
            return s;
        }
    }
}