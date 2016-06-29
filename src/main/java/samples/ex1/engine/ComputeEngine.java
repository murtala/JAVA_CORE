package samples.ex1.engine;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import samples.ex1.compute.Compute;
import samples.ex1.compute.Task;

public class ComputeEngine implements Compute {    // implements the comptute  remote interface  ---> therefrire can be used as remote object

    public ComputeEngine() {           //contructor with no arguments. invokes the superclass constru
        super();
    }
     
 

    public static void main(String[] args) {

        //creates and install a security manager
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
        try {
            String name = "Compute";
            Compute engine = new ComputeEngine();
            Compute stub =
                    (Compute) UnicastRemoteObject.exportObject(engine, 0);  //exports the supplied remote object so that it can receive invocations of its remote clients. 0 means random port
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind(name, stub);
            System.out.println("ComputeEngine bound");
        } catch (Exception e) {
            System.err.println("ComputeEngine exception:");
            e.printStackTrace();
        }
    }

    //implements the protocol between computeengine remote object and its clients
	@Override
	public <T> T executeTask(Task<T> t) throws RemoteException {
		 return t.execute();
	}
}
