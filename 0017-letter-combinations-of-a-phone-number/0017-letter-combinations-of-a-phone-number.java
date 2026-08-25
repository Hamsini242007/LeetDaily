class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans= new ArrayList<>();
        if (digits == null || digits.length() == 0) return ans;
        String[] map = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };
        formation(map,digits,ans,0,new StringBuilder());
        return ans;
    }
    private void formation(String[] map,String digits,List<String> ans,int index,StringBuilder curr){
        if(index==digits.length()){
            ans.add(curr.toString());
            return;
        }
        String letters=map[digits.charAt(index)-'0'];
        for (char c : letters.toCharArray()) {
        curr.append(c);
        formation(map, digits, ans, index + 1, curr); // Move to NEXT digit
        curr.deleteCharAt(curr.length() - 1);       // Backtrack
    }
    }
}