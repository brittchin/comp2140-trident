package Trident;


/**
 * Abstract class Resource - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Resource
{
    public String Type, idNum;

    public Resource(String type, String idnum)
    {
        Type = type;
        idNum = idnum;
    }
    
    public String toString()
    {
        String result = "Name: " + Type + "\t" + "ID number: " + idNum + "\n"; 
        return result;
    }
}
