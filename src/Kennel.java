import java.util.ArrayList;
import java.util.Arrays;

public class Kennel
{
    private ArrayList petList;

    public Kennel(String name, String speak)
    {
        petList.get(i).getName() = name;
        petList.get(i).speak() = speak;
    }

    public void allSpeak()
    {
        for (Pet p : petList)
        {
            System.out.println(p.getName() + ": " + p.speak());
        }
    }
}