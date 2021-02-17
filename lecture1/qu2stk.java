package lecture1;

public class qu2stk {
private stkuarray pstk;
private stkuarray qstk;
public qu2stk()throws Exception
{
	this.pstk=new stkuarray();
	this.qstk=new stkuarray();
}
public int size()
{
	return pstk.size();
}
public boolean isemp()
{
	return pstk.isempty();
}
public void enq(int element) throws Exception
    {
	pstk.push(element);
     }
public void dq() throws Exception
{
	while(pstk.size()!=1)
	{
	int rv=pstk.pop();
	qstk.push(rv);
	}
	pstk.pop();
	while(qstk.size()!=0)
	{
	int rv=qstk.pop();
	pstk.push(rv);
	}
}
public void display()
{
	for(int i=pstk.size();i>=0;i++)
	{
	System.out.println();
	}
    }
	}
