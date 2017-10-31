
public class ProjectTest
{

    public static void main(String[] args)
    {
        Project foo = new Project();
        Project bikes = new Project("Bikes");
        Project houses = new Project(
                "Houses", 2000,
                "This is a simple and effective way to get your foot into the housing market."
        );
        
        System.out.println(houses.elevatorPitch());
        System.out.println();
        System.out.println(bikes.getName());
        System.out.println();
        foo.setName("Foo");
        foo.setDescription("Bar");
        System.out.println(foo.getDescription());
        System.out.println();
        System.out.println(foo.elevatorPitch());
        System.out.println();
        houses.setCost(2100.0);
        System.out.println(houses.getCost());
        foo.setCost(150);
        bikes.setCost(1500);
        
        Portfolio projList = new Portfolio();
        System.out.println();
        projList.addProject(foo);
        projList.addProject(bikes);
        projList.addProject(houses);
        projList.showPortfolio();
    }

}
