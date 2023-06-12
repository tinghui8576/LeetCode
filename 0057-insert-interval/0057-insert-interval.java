class Solution {
   public int[][] insert(int[][] intervals, int[] newInterval) {
        int s =  0;
        int e = 0;
        while (s < intervals.length){
            if (intervals[s][1] >= newInterval[0]){
                
                while (e < intervals.length){
                        // System.out.println(e);
                        if( intervals[e][0] > newInterval[1]){
                            // System.out.print('c');
                            // System.out.println(intervals[e][1]);
                            break;
                        } 
                        e++;
                } 
                break;
            }
            s++;
            e = s;
        }
        // System.out.print("start");
        // System.out.println(s);
        // System.out.print("end");
        // System.out.println(e); 

        int len = intervals.length - e + s +1;
        int[][] ans = new int[len][];
        int index = 0;
        
        // System.out.print(len);

        for (int i = 0; i < s; i++){
            
            int[] arr = new int[2];
            arr[0] = intervals[i][0];
            arr[1] = intervals[i][1];
            ans[index] = arr;
            // System.out.println("start");
            // System.out.println(index);
            // System.out.print(arr[0]);
            // System.out.println(arr[1]);
            index += 1;
        }
        if ( e == s){
            int[] arr = new int[2];
            arr[0] = newInterval[0];
            arr[1] = newInterval[1];
            ans[index] = arr;
            // System.out.println('s');
            // System.out.println(index);
            // System.out.print(arr[0]);
            // System.out.println(arr[1]);
            index += 1;
        }
        else {
            int[] arr = new int[2];
            arr[0] = Math.min(intervals[s][0], newInterval[0]);
            arr[1] = Math.max(intervals[e-1][1], newInterval[1]);
            ans[index] = arr;
            // System.out.print('c');
            // System.out.print(index);
            // System.out.print(arr[0]);
            // System.out.println(arr[1]);
            index += 1;
        }
        
        for (int i = e  ; index < len; i++){
            
            int[] arr = new int[2];
            arr[0] = intervals[i][0];
            arr[1] = intervals[i][1];
            // System.out.print('t');
            // System.out.print(index);
            // System.out.print(arr[0]);
            // System.out.println(arr[1]);
            ans[index] = arr;
            
            index += 1;
        }
        return ans;
    }
}