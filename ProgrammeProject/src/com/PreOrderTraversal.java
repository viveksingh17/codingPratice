package com;

class PreNode{
	int data;
	PreNode left,right=null;
	public PreNode(int data) {
		this.data=data;
	}
}
public class PreOrderTraversal {
	
	public void printPreOrder(PreNode node)
	{
		if(node==null)
			return ;
		else
		{
			System.out.println(node.data+" ");
			printPreOrder(node.left);
			printPreOrder(node.right);
		}
	}
	

}
