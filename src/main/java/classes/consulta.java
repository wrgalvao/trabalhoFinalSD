package classes;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author wrgalvao
 */
public interface consulta extends Remote
{
    int qtdQuartosDisponiveis() throws RemoteException;
    int qtdClientes() throws RemoteException;
    int qtdQuartos() throws RemoteException;
}
