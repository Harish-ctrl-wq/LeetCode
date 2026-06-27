class Solution {
    public int kthSmallest(int[][] matrix, int k) {
    PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
    int n = matrix[0].length;
    int totalelement = n*n;
    for(int i = 0; i < totalelement ;i++){
        int row = i/n;
        int col = i%n;
        maxheap.add(matrix[row][col]);
        if(maxheap.size()>k){
            maxheap.poll();
        }
    }

   return maxheap.peek();
    
        }
        
    }
