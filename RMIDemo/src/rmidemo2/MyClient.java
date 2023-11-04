
package rmidemo2;


import java.rmi.*;
public class MyClient {
    public static void main(String[] args) {
        try{
            Factorial stub = (Factorial)Naming.lookup("rmi://localhost:5001/demo");
            System.out.println("The output is: "+ stub.fact(6));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
