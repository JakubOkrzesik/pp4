import java.io.FileWriter;
import java.io.IOException;

public class Procedure {
    public static void main(String[] args)
        throws IOException
    {
        String str = "String";
        try{
            FileWriter wrt = new FileWriter("filename.txt");
            wrt.write(str);
            wrt.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
