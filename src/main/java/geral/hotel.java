
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class hotel extends UnicastRemoteObject implements consultas
{ 
    private int cnpj;
    private String razaSocial;
    private String nomeFantasia;
    private List<quarto> quartos;
    private List<cliente> clientes;
    
    public hotel() throws RemoteException
    {
        //super
    }
    @Override
    public int qtdQuartosDisponiveis() throws RemoteException
    {
        int qtdDisponiveis = 0;
        int i;
        for(i=0;i<this.quartos.size();i++)
        {
            if(this.quartos.get(i).isOcupacao() == false)
            {
                qtdDisponiveis++;
            }
        }
        return qtdDisponiveis;
    }
    

    @Override
    public int qtdClientes() throws RemoteException
    {
        return this.clientes.size();
    }
    

    @Override
    public int qtdQuartos() throws RemoteException
    {
        return this.quartos.size();
    }

    public int getCnpj()
    {
        return cnpj;
    }

    public void setCnpj(int cnpj)
    {
        this.cnpj = cnpj;
    }

    public String getRazaSocial()
    {
        return razaSocial;
    }

    public void setRazaSocial(String razaSocial)
    {
        this.razaSocial = razaSocial;
    }

    public String getNomeFantasia()
    {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia)
    {
        this.nomeFantasia = nomeFantasia;
    }

    public List<quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<quarto> quartos)
    {
        this.quartos = quartos;
    }

    public List<cliente> getClientes()
    {
        return clientes;
    }

    public void setClientes(List<cliente> clientes)
    {
        this.clientes = clientes;
    }    
}
