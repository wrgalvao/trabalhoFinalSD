package cliente;

import java.rmi.Naming;
/**
 *
 * @author wrgalvao
 */
public class clienteRMI
{
    public static void main(String[] args) throws Exception
    {
        String objetoNome = "rmi://localhost:1099/hotel";
        consultas h1 = (consultas) Naming.lookup(objetoNome);
        System.out.println("Numero total de quartos e :" + h1.qtdQuartos());
        System.out.println("Quantidade de clientes total e: "+ h1.qtdClientes());
        System.out.println("Numero de quartos disponiveis e: " + h1.qtdQuartosDisponiveis());
    }
}
