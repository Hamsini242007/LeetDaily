class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans= new ArrayList<>();
        if (digits == null || digits.length() == 0) return ans;
        char[][] map = {
            {},                 // 0
            {},                 // 1
            {'a', 'b', 'c'},    // 2
            {'d', 'e', 'f'},    // 3
            {'g', 'h', 'i'},    // 4
            {'j', 'k', 'l'},    // 5
            {'m', 'n', 'o'},    // 6
            {'p', 'q', 'r', 's'},// 7
            {'t', 'u', 'v'},    // 8
            {'w', 'x', 'y', 'z'} // 9
        };
        formation(map,digits,ans,0,new StringBuilder());
        return ans;
    }
    private void formation(char[][] map,String digits,List<String> ans,int index,StringBuilder curr){
        if(index==digits.length()){
            ans.add(curr.toString());
            return;
        }
        for (char c : map[digits.charAt(index) - '0']) {
            curr.append(c);
            formation(map, digits, ans, index + 1, curr);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}