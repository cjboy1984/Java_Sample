package tutorialspoint.json.encode;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;

class JsonEncodeDemo2
{
  public static void main(String[] args)
  {
    JSONObject obj = new JSONObject();
    
    obj.put("name", "foo");
    obj.put("num", new Integer(100));
    obj.put("balance", new Double(1000.21));
    obj.put("is_vip", new Boolean(true));
    
    StringWriter out = new StringWriter();
    try
    {
      obj.writeJSONString(out);
    }
    catch (IOException e)
    {
    }
    
    String jsonText = out.toString();
    System.out.print(jsonText);
  }
}
