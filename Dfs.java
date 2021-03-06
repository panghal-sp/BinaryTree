class Dfs{

public void preOrder(TreeNode node){

  if(node==null)
  return ;
  
  System.out.println(node.data);
  preOrder(node.left);
  preOrder(node.right);

}

public void postOrder(TreeNode node){

  if(node==null)
  return ;
  
  
  preOrder(node.left);
  preOrder(node.right);
  System.out.println(node.data);
}

public void inOrder(TreeNode node){

  if(node==null)
  return ;
  
  
  preOrder(node.left);
  System.out.println(node.data);
  preOrder(node.right);
  
}
}
