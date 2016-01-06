import java.rmi.*;
import java.rmi.server.*;
public class AddServerImpl extends UnicastRemoteObject
  implements AddServerIntf {

  public AddServerImpl() throws RemoteException {
	  super(0);
  }
  public double add(double d1, double d2) throws RemoteException {
    return d1 + d2;
  }
}