class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        char f=arr[0];
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>target){
            return arr[i];
        }
        }
        return f;
        
    }
}