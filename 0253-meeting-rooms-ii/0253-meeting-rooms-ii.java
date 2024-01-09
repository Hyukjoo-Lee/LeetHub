class Solution {
    public int minMeetingRooms(int[][] intervals) {
        /**
            intervals

            return the min number of conference rooms required?

            intervals[i] = [starti, endi]
            
            아..
            
            [[0,30],[5,10],[15,20]]

            0~30
            5~10
            15~20

            we need to focus on the usage of rooms over time

            0~30 까지 미팅이 진행되고 (one room is required) - distinct one room should be fullly booked 
            5~10 , 15~20 미팅이 진행되는 room (another one room is required, but two meeting)

            should count the minimum number of rooms we will need to book

            start time and end time

            sort the start and end times separately
            and count the new room
            
        */

        int[] startTimes = new int[intervals.length];
        int[] endTimes = new int[intervals.length];
        
        for(int i = 0; i < intervals.length; i++) {
            startTimes[i] = intervals[i][0];
            endTimes[i] = intervals[i][1];
        }
        
        // startTimes = [0,5,15]
        // endTimes = [10,20,30]
        // sort these two arrays to determine when when a new room is needed = overlapped
        Arrays.sort(startTimes);
        Arrays.sort(endTimes);

        int count = 0;
        int endIdx = 0;

        for(int i = 0; i < startTimes.length; i++) {
            // 다른 미팅이 끝나기 전에(endTimes[endIdx]) 현재 미팅(startTimes[i])이 시작되는지 확인
            if(startTimes[i] < endTimes[endIdx]) {
                // 현재 미팅이 다른 미팅와 겹치므로 새 회의실이 필요
                count++;
            } else {
                // 현재 미팅이 다른 미팅이 끝난 후 시작되면 
                // 동일한 room 을 사용할 수 있음으로
                // 다음 미팅 종료시간을 고려하기 위해 증가시킴  
                endIdx++;
            }
        }

        return count;

    }
}