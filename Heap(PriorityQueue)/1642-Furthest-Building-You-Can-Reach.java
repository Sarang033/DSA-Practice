class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq  = new PriorityQueue<>((a,b)->b-a);
        int i ;
        for(i =0 ;i <heights.length-1;i++){
            int diff = heights[i+1] - heights[i];
            if(diff <= 0) continue;
            bricks-=diff;
            pq.offer(diff);
            if(bricks<0){
                bricks+=pq.poll();
                ladders--;
            }
            if(ladders < 0) break;
        }
        return i;
        
    }
}