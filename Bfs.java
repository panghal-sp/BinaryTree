class Bfs{

  public ArrayList<ArrayList<Integer>> levelOrder(TreeNode node){
  
    Queue<Node> queue = new LinkedList<>();
    
    ArrayList<ArrayList<Integer>> wrapList=new ArrayList<>();
    if(node==null)
    return wrapList;
    
    queue.offer(node);
    while(!queue.isEmpty()){
      int levelNum=queue.size();
      List<Integer> subList=new ArrayList<>();
      
      for(int i=0; i<levelNum; i++){
        
      if(queue.peek().left != null) queue.offer(queue.peek().left);
      if(queue.peek().right !=null) queue.offer(queue.peek().right);
        
       subList.add(queue.poll().value);

      }
      wrapList.add(subList);
    }
    return wrapList;
  }
  
}
