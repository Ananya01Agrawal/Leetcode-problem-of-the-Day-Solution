class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>res=new LinkedList<>();
        if(root==null) return res;

        //create a queue
        Queue<TreeNode> q=new LinkedList<>();
        //add root to the queue
        q.offer(root);
        //initialize the sum as zero
        double sum=0;

        while(!q.isEmpty()){
            sum=0;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                sum+=curr.val;
                if(curr.left !=null) q.offer(curr.left);
                if(curr.right !=null) q.offer(curr.right);
            }
            //calculating the average
            double avg=sum/size;
            res.add(avg);
        }
        return res;
    }
}
