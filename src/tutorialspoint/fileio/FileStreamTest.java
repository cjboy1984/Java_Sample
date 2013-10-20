package tutorialspoint.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamTest
{
  public static void main(String args[])
  {
    try
    {
      System.out.println("1. Create test.txt.");
      
      byte bWrite[] = {'H', 'e', 'l', 'l', 'o'};
      OutputStream os = new FileOutputStream("test.txt");
      for (int x = 0; x < bWrite.length; x++)
      {
        os.write(bWrite[x]); // writes the bytes
      }
      os.close();
      
      System.out.println("2. Dump test.txt.");
      InputStream is = new FileInputStream("test.txt");
      int size = is.available();
      
      for (int i = 0; i < size; i++)
      {
        System.out.print((char) is.read());
      }
      is.close();
    }
    catch (IOException e)
    {
    }
  }
}
