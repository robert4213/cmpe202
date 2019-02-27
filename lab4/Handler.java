
public interface Handler
{
	public void setSuccessor(Handler next);
	public boolean findPosition(Customer c);
	public int getPosition(Customer c);
	public void addTable(int num);
	public void showAviliableTable();
}
