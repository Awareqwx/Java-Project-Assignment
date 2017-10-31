
public class Project
{
    
    private String name;
    private String desc;
    private double cost;
    
    public Project()
    {
        this("", 0, "");
    }
    
    public Project(String name)
    {
        this(name, 0, "");
    }
    
    public Project(String name, double cost)
    {
        this(name, cost, "");
    }
    
    public Project(String name, double cost, String desc)
    {
        this.name = name;
        this.desc = desc;
        this.cost = cost;
    }
    
    public String elevatorPitch()
    {
        return name + " (" + cost + ") : " + desc;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getDescription()
    {
        return desc;
    }
    
    public void setDescription(String desc)
    {
        this.desc = desc;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    
}
