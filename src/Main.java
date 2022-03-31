import com.generation.housing.Room;

public class Main 
{
    public static void main(String[] args)
    {
        Room r1 = new Room(5,6);
        int sqm = 800; 

        System.out.println("Total price:" + (r1.getArea()*sqm));

        
    }
    
}
