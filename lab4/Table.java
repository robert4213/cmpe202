import java.util.LinkedList; 

public class Table
{
    private LinkedList<Integer> t_no;

    public Table(int[] n)
    {
        for (int i = 0; i<n.length;i++)
        {
            t_no.push(n[i]);
        }
    }

    public int assignTable()
    {
        return t_no.pop();
    }
    
    public void addTable(int n)
    {
        t_no.addLast(n);
    }
    
    public int remainTable()
    {
        return t_no.size();
    }
    public int getNo(int i)
    {
    	return t_no.get(i);
    }
}
