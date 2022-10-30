package classes;
/**
 *
 * @author wrgalvao
 */
public class cliente extends pessoa 
{
    private quarto quartoCliente;

    public quarto getQuartoCliente()
    {
        return quartoCliente;
    }

    public void setQuartoCliente(quarto quartoCliente)
    {
        this.quartoCliente = quartoCliente;
    }
}
