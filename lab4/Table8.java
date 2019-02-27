public class Table8 extends Table implements Handler
{ 
    public Table8(int[] n)
    {
        super(n);
    }
    
    public void setSuccessor(Handler next)
    {
    }
    
    public boolean findPosition(Customer c)
    {   
        boolean flag = false;
        if (super.remainTable()>0)
        {
        	flag = true;            
        }
        return flag;
    }
    
    public int getPosition(Customer c)
    {
    	int num = 0;
    	num = assignTable();
    	return num;
    }
    
    public void addTable(int num) 
    {
    	if(num/10 == 2) super.addTable(num);
    	System.out.println("Not an aviliable table number.");
    }
    
    public void showAviliableTable()
    {
    	System.out.print("Table with 2 seats:");
    	for(int i=0; i<super.remainTable(); i++)
    	{
    		System.out.format("%d, ",super.getNo(i));
    	}
    	System.out.println();
    }
}
