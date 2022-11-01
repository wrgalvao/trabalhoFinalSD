

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author wrgalvao
 */
public interface consultas extends Remote
{
    int qtdQuartosDisponiveis() throws RemoteException;
    int qtdClientes() throws RemoteException;
    int qtdQuartos() throws RemoteException;
}
