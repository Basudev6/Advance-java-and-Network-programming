
package rmidemo;

import java.rmi.*;
public class MyClient {
    public static void main(String[] args) {
        try{
            Adder stub = (Adder)Naming.lookup("rmi://localhost:5001/demo");
            System.out.println("The output is: "+ stub.add(1,24));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
