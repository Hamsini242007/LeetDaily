class Solution {
    public String reversePrefix(String word, char ch) {
        int right=word.indexOf(ch);
        if(right==-1) return word;
        char[] chars=word.toCharArray();
        int left=0;
        while(left<right){
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}