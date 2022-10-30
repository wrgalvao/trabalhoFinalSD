package classes;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author wrgalvao
 */
public class principal
{
    public static void main(String[] args)
    {
        funcionario f1 = new funcionario();
        funcionario f2 = new funcionario();
        funcionario f3 = new funcionario();
        funcionario f4 = new funcionario();
        
        
        ArrayList<funcionario> funcionarios = new ArrayList();
        ArrayList<funcionario> funcionarios2 = new ArrayList();
        
        
        f1.setNome("hugo");
        f1.setNumeroIdentificacao(123);
      
        
        f2.setNome("baia");
        f2.setNumeroIdentificacao(245);
        
        
        f3.setNome("bruno");
        f3.setNumeroIdentificacao(258);
        
        
        f4.setNome("iago");
        f4.setNumeroIdentificacao(063);
        
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios2.add(f3);
        funcionarios2.add(f4);
        
        departamento d1 =  new departamento();
        d1.setNome("financeiro");
        d1.setFuncionarios(funcionarios);
      
        
        departamento d2 =  new departamento();
        d2.setNome("logistico");
        d2.setFuncionarios(funcionarios2);
        
        
        quarto q1 =  new quarto();
        q1.setNumero(1);
        q1.setOcupacao(false);
        
        quarto q2 =  new quarto();
        q2.setNumero(2);
        q2.setOcupacao(false);
        
        
        ArrayList<quarto> quartos = new ArrayList();
        ArrayList<departamento> departamentos = new ArrayList();
        quartos.add(q1);
        quartos.add(q2);
        
        departamentos.add(d1);
        departamentos.add(d2);
        
        hotel h1 =  new hotel();
        h1.setCnpj(02314);
        h1.setNomeFantasia("motel disfarçado");
        h1.setRazaSocial("hotelaria galvao");
        h1.setQuartos(quartos);
        h1.setDepartamentos(departamentos);
        
        cliente a1 = new cliente();
        a1.setNome("warley rabelo galvao");
        a1.setIdade(24);
        a1.setRg(6605847);
        a1.setQuartoCliente(q1);
        q1.setOcupacao(true);
     
        ArrayList<cliente> clientes = new ArrayList();
        clientes.add(a1);
        
        
        h1.setClientes(clientes);
        
        h1.setClientes(clientes);
        System.out.println(h1.getDepartamentos().get(0).getNome());
        System.out.println(h1.getDepartamentos().get(1).getNome());
        System.out.println(h1.getQuartos().get(0).getNumero());
        System.out.println(h1.getDepartamentos().get(1).getFuncionarios().get(0).getNumeroIdentificacao());
        System.out.println(h1.getClientes().get(0).getNome());
        System.out.println(h1.qtdQuartosDisponiveis());
        System.out.println("Quantidade de clientes = " + h1.qtdClientes());
        System.out.println("Quantidade de quartos  = " +h1.qtdQuartos());
        
        

    }
}
