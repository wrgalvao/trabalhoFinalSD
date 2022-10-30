package classes;
import java.util.List;

/**
 *
 * @author wrgalvao
 */
public class departamento
{   
    private String nome;
    private List<funcionario> funcionarios;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}

