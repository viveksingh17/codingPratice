package com;

class PrintNode{
	int data;
	PrintNode left=null,right=null;
	PrintNode(int data)
	{
		this.data=data;
	}
}
public class PrintLeftView {
	PrintNode root;
	int max_Node=0;
	public void PrintLeft(PrintNode node,int max)
	{
		if(node==null)
		{
			return;
		}
		if(max_Node<max)
		{
			System.out.println(node.data+" ");
			max_Node=max;
		}
		
		PrintLeft(node.left,max+1);
		PrintLeft(node.right,max+1);
	}
	
	public void leftView()
	{
		PrintLeft(root,1);
	}
}
