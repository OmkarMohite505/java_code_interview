public class Test5 {
    public static void main(String[] args) {
        try{

        throw new IOException();
        }catch(RuntimeException | IOException e)
    { if(e instanceof IOException) 
        e = new RuntimeException(e); // Line 2
      // throw e;
    }
}
