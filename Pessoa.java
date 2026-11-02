
import java.util.Date; // Fixes the Date error
public class Pessoa
{
	public String nome;
	public String cpf;
	public String data_nascimento;

	public Pessoa(String _nome, String _cpf, String _data)
{
	this.nome = _nome;
	this.cpf = _cpf;
	this.data_nascimento = _data;
}
    public void Display()
    {
    System.out.printf("nome: %s CPF: %s  DATA: %s\n", nome, cpf, data_nascimento);   
    }
}

class Aluno extends Pessoa
{
    public Aluno(String _nome, String _cpf, String _data)
    {
        super(_nome, _cpf, _data);
    }
    public String matricula;
}

class Professor extends Pessoa
{
    public Professor(String _nome, String _cpf, String _data)
    {
        super(_nome, _cpf, _data);
    }
    public double salario;
    public String disciplina;
}

class Funcionario extends Pessoa
{
    public Funcionario(String _nome, String _cpf, String _data)
    {
        super(_nome, _cpf, _data);
    }
    public double salario;
    public Date data_admissao;
    public String cargo;
}