public class Table2 extends Table implements Handler
{
    private Handler successor;  
    
    public Table2(int[] n)
    {
        super(n);
    }
    
    public void setSuccessor(Handler next)
    {
        successor = next;
    }
    
    public boolean findPosition(Customer c)
    {   
        boolean flag = false;
        if (c.returnNum()>2)
        {
            flag = this.successor.findPosition(c);
        }
        else if (super.remainTable()>0)
        {
        	flag = true;            
        }
        return flag;
    }
    
    public int getPosition(Customer c)
    {
    	int num = 0;
    	if (c.returnNum()>2)
        {
            num = this.successor.getPosition(c);
        }
    	else
    	{
    		num = assignTable();
    	}
    	return num;
    }
    
    public void addTable(int num) 
    {
    	if(num/10 == 2) super.addTable(num);
    	else this.successor.addTable(num);
    }
    
    public void showAviliableTable()
    {
    	System.out.print("Table with 2 seats:");
    	for(int i=0; i<super.remainTable(); i++)
    	{
    		System.out.format("%d, ",super.getNo(i));
    	}
    	System.out.println();
    	this.successor.showAviliableTable();
    }
}
