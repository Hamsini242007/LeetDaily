int sumCounts(int* nums, int numsSize) {
    int ans = 0;
    for (int i = 0; i < numsSize; i++) {
        int distinctCount = 0;
        int freq[101] = {0}; // Assuming element values are within a manageable range (e.g., 1 to 100)
        
        for (int j = i; j < numsSize; j++) {
            if (freq[nums[j]] == 0) {
                distinctCount++;
            }
            freq[nums[j]]++;
            ans += (distinctCount * distinctCount);
        }
    }
    return ans;
}