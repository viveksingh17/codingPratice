package com;

/**
 * recursive approch
 * @author vivek.singh
 *
 */
class NodeHeight{
	int data;
	NodeHeight left,right=null;
	NodeHeight(int data)
	{
		this.data=data;
	}
}
public class ComputeHeight {

	public int computeHeight(Node root)
	{
		if(root==null) {
			return 0;
		}
		else {
		return Math.max(computeHeight(root.left),computeHeight(root.right))+1;
	}
	}
}
