package classes;

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
        consulta consult = (consulta) Naming.lookup(objetoNome);
        System.out.println("Numero de quartos disponiveis e: " + qtdQuartosDisponiveis());
    }
}
