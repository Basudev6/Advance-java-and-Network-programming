
package rmidemo2;

import java.rmi.*;
import java.rmi.registry.*;
public class MyServer {
    public static void main(String[] args) {
        try{
            Registry reg = LocateRegistry.createRegistry(5001);
            Factorial stub = new FactorialRemote();
            Naming.rebind("rmi://localhost:5001/demo",stub);
            System.out.println("Server is running");
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
     
    
}
