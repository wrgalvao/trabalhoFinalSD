package classes;
import java.util.List;
/**
 *
 * @author wrgalvao
 */
public class hotel extends empresa
{
    private List<quarto> quartos;
    private List<departamento> departamentos;
    private List<cliente> clientes;

    public List<quarto> getQuartos()
    {
        return quartos;
    }
    
    public void setQuartos(List<quarto> quartos) {
        this.quartos = quartos;
    }

    public List<departamento> getDepartamentos()
    {
        return departamentos;
    }

    public void setDepartamentos(List<departamento> departamentos)
    {
        this.departamentos = departamentos;
    }

    public List<cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<cliente> clientes)
    {
        this.clientes = clientes;
    }
    
    int qtdQuartosDisponiveis()
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
    
    int qtdClientes()
    {
        return this.clientes.size();
    }
    
    int qtdQuartos()
    {
        return this.quartos.size();
    }
}


