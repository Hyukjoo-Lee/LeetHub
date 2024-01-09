class Solution {
    public int[][] merge(int[][] intervals) {
         /**
            merge overlapping intervals in a 2D array..
            intervals = [[1,3],[2,6],[8,10],[15,18]]
            intervals[0] = [start0, end0]
            intervals[1] = [start1, end1]
            ...

            should be sorted based on their start points
            to ensure we can check if the current interval overlaps with the next one?

            list will be used to store the merged intervals
            will be useful to store the dynamic size of the output

            use Math.max() to find the maximum end point wile merging
            - this is because we need to identify overlapping intervals..

            overalpping occurs when the start of one interval is less than OR
            equal to the end of another one

          */
          // sort the intervals based on their start points
          Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
          
          List<int[]> merged = new LinkedList<>();

          for(int[] interval : intervals) {
              // how to detect overlapping intervals
              // interval[1] - end point - previous one => merged.get(merged.size() -1)
              // interval[0] - start point - current
              // interval[1] - 전의 end point 가 현재 start point 보다 작으면 overap 이 발생하지 x
              if(merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                  merged.add(interval);
              } else {
                  // if the current interval is overapped with the previous point, we need to merge
                  merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size()-1)[1], interval[1]); 
              }

          }

          return merged.toArray(new int[merged.size()][]);
    }
}