bool checkValidString(char* s) {
    int low = 0;
    int high = 0;

    for (int i = 0; s[i] != '\0'; i++) {
        if (s[i] == '(') {
            low++;
            high++;
        } else if (s[i] == ')') {
            low--;
            high--;
        } else { // s[i] == '*'
            low--;  // treat as ')'
            high++; // treat as '('
        }

        if (high < 0) {
            return false; // Too many ')'
        }
        if (low < 0) {
            low = 0; // Reset low because count of open brackets can't be negative
        }
    }

    return low == 0;
}