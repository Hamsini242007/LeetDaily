class Solution {
    public String reversePrefix(String word, char ch) {
        char[] chars=word.toCharArray();
        int left=0,right=-1;
        for(int i=0;i<word.length();i++){
            if(chars[i]==ch){
                right=i;
                while(left<right){
                    char temp=chars[left];
                    chars[left]=chars[right];
                    chars[right]=temp;
                    left++;
                    right--;
                }
                break;
            }
        }
        return new String(chars);
    }
}