
package servidor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;

/**
 *
 * @author wrgal
 */
public class server
{
    public static void main(String[] args) throws RemoteException, MalformedURLException
    {
        
        ArrayList<cliente> clientes = new ArrayList();
        ArrayList<quarto> quartos =  new ArrayList();
        
        quarto q1 = new quarto();
        q1.setNumero(1);
        q1.setOcupacao(false);
        
        quarto q2 = new quarto();
        q2.setNumero(2);
        q2.setOcupacao(false);
        
        quarto q3 = new quarto();
        q3.setNumero(3);
        q3.setOcupacao(false);
        
        quarto q4 = new quarto();
        q4.setNumero(1);
        q4.setOcupacao(false);
        
        cliente c1 = new cliente();
        c1.setNome("warley");
        c1.setIdade(24);
        c1.setRg(660);
        c1.setQuartoCliente(q1);
        q1.setOcupacao(true);
        
        cliente c2 = new cliente();
        c2.setNome("yure");
        c2.setIdade(23);
        c2.setRg(550);
        c2.setQuartoCliente(q2);
        q2.setOcupacao(true);
        
        clientes.add(c1);
        clientes.add(c2);
        
        quartos.add(q1);
        quartos.add(q2);
        quartos.add(q3);
        quartos.add(q4);
        
        hotel h1 = new hotel();
        h1.setNomeFantasia("yure chupa pika");
        h1.setCnpj(123);
        h1.setRazaoSocial("hotelaria");
        h1.setClientes(clientes);
        h1.setQuartos(quartos);
        String ObjetoNome = "rmi://localhost/hotel";
        System.out.println("Registrando o objeto no RMIRegistry...");
        LocateRegistry.createRegistry(1099);
        Naming.rebind(ObjetoNome, h1);
        System.out.println("Aguardando clientes");  
    }
}
