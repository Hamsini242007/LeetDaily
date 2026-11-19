class Solution {
    public String reverseWords(String s) {
        // String[] words = s.trim().split("\\s+");
        // StringBuilder sb = new StringBuilder();
        // for (int i = words.length - 1; i >= 0; i--) {
        //     sb.append(words[i]);
        //     if (i > 0) {
        //         sb.append(" ");
        //     }
        // }
        // return sb.toString();

        // s = s.trim();
        // StringBuilder result = new StringBuilder();
        // int end = s.length() - 1;
        // while (end >= 0) {
        //     while (end >= 0 && s.charAt(end) == ' ') {
        //         end--;
        //     }
        //     if (end < 0) break;
        //     int start = end;
        //     while (start >= 0 && s.charAt(start) != ' ') {
        //         start--;
        //     }
        //     if (result.length() > 0) {
        //         result.append(" ");
        //     }
        //     result.append(s.substring(start + 1, end + 1));
        //     end = start - 1;
        // }
        // return result.toString();


        if (s == null) return s;
        char[] a = s.toCharArray();
        int n = a.length;
        reverse(a, 0, n - 1);
        reverseWords(a, n);
        return cleanSpaces(a, n);
    }
    
    private void reverse(char[] a, int i, int j) {
        while (i < j) {
            char t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
    }
    
    private void reverseWords(char[] a, int n) {
        int i = 0, j = 0;
        
        while (i < n) {
            while (i < j || i < n && a[i] == ' ') i++;
            while (j < i || j < n && a[j] != ' ') j++;
            reverse(a, i, j - 1); 
        }
    }
    
    private String cleanSpaces(char[] a, int n) {
        int i = 0, j = 0;
        
        while (j < n) {
            while (j < n && a[j] == ' ') j++;
            while (j < n && a[j] != ' ') a[i++] = a[j++];
            while (j < n && a[j] == ' ') j++;
            if (j < n) a[i++] = ' ';
        }
        return new String(a, 0, i);
    }
}