public class Customer
{
    private String name;
    private int num;
    private int phone;
    public Customer(String name, int phone, int num)
    {
        this.name = name;
        this.num = num;
        this.phone = phone;
    }

    public int returnNum()
    {
        return num;
    }
    public String returnName()
    {
        return name;
    }
    public int returnPhone()
    {
        return phone;
    }
}
