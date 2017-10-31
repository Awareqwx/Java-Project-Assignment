import java.util.ArrayList;

public class Portfolio
{
    
    private ArrayList<Project> list;
    
    public Portfolio()
    {
        this(new ArrayList<Project>());
    }
    
    public Portfolio(ArrayList<Project> list)
    {
        this.list = list;
    }
    
    public ArrayList<Project> getProjects()
    {
        return list;
    }
    
    public void setProjects(ArrayList<Project> list)
    {
        this.list = list;
    }
    
    public void addProject(Project proj)
    {
        list.add(proj);
    }
    
    public double getPortfolioCost()
    {
        double sum = 0;
        for(int i = 0; i < list.size(); i++)
        {
            sum += list.get(i).getCost();
        }
        return sum;
    }
    
    public void showPortfolio()
    {
        double sum = getPortfolioCost();
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i).elevatorPitch());
        }
        System.out.println("Total cost: " + sum);
    }
    
}
