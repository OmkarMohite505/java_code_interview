package oct15;

class Rushi3 {

int getValue() 
{
    int returnValue = 10;
    try 
    {
        String[] Languages = {"Java", "Ruby"};
        System.out.println(Languages[5]);
    }
    catch (Exception e) 
    {
        System.out.println("Catch Block :" + returnValue);
        return returnValue;
    }
    finally
    {
        returnValue += 10;
        System.out.println("Finally Block :" + returnValue);
    }
return returnValue;
}

public static void main(String args[])
{
	Rushi3 var = new Rushi3();
    System.out.println("Main Block:" + var.getValue());
}
}