package classes;

import java.rmi.Naming;
import java.rmi.RemoteException;
/**
 *
 * @author wrgalvao
 */
public class clienteRMI
{
    public static void main(String[] args) throws Exception
    {
        String objetoNome = "rmi://localhost:1099/hotel";
        consulta h1 = (consulta) Naming.lookup(objetoNome);
        System.out.println("Numero de quartos disponiveis e: " + h1.qtdQuartosDisponiveis());
    }
}
