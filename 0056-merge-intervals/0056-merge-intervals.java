class Solution {
    public int[][] merge(int[][] intervals) {
        // if (intervals.length <= 1) {
        //     return intervals;
        // }
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
       // int n=intervals.length;
        // List<int[]> mergedList = new ArrayList<>();
        // int[] currInterval=intervals[0];
        // for(int i=1;i<n;i++){
        //     if(currInterval[1]>=intervals[i][0]){
        //         currInterval[1]=Math.max(currInterval[1],intervals[i][1]);
        //     }else{
        //         mergedList.add(currInterval);
        //         currInterval = intervals[i];
        //     }
        // }
        // mergedList.add(currInterval);
        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.get(merged.size() - 1)[1] =
                    Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);

        //return mergedList.toArray(new int[mergedList.size()][]);
    }
}