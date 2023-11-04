
package rmidemo2;

import java.rmi.*;
import java.rmi.server.*;

public class FactorialRemote extends UnicastRemoteObject implements Factorial {
    
    FactorialRemote() throws RemoteException{
    super();
    }
    
    public int fact(int x)
    {
        if(x==0)
        {
            return 1;
        }
        else{
            return (x*fact(x-1));
        }
  
        
    }
}
