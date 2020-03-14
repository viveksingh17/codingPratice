package com;
/**
 * Delete the node whose only pointer is given in link list you don't know head and tail
 * @author vivek.singh
 *
 */
class RefLink{
	int data;
	RefLink node;
	RefLink(int data)
	{
	this.data=data;	
	}
	
}
public class ReferenceLinkList {

    public int lPalin(RefLink A) {
        StringBuffer s=null;
        while(A!=null)
        {
            s.append(A.data);
            A=A.node;
        }
        StringBuffer s2=new StringBuffer(s);
        if(new String(s).equals(s2))
        {
            return 1;
        }else{
            return 0;
        }
    }
	public static void main(String args[])
	{
		
	}
}
