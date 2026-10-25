public class Pessoa
{
	public String nome;
	public String cpf;
	public Date data_nascimento;

	public Pessoa(String _nome, String _cpf, Date _data)
{
	this.nome = _nome;
	this.cpf = _cpf;
	this.data_nascimento = _data;
}
    public String DisplayNome()
    {
        return nome;
    }
}

public class Aluno extends Pessoa
{
    public Aluno(String _nome, String _cpf, Date _data)
    {
        super(_nome, _cpf, _data);
    }
    public String matricula;
}

public class Professor extends Pessoa
{
    public Professor(String _nome, String _cpf, Date _data)
    {
        super(_nome, _cpf, _data);
    }
    public double salario;
    public String disciplina;
}

public class Funcionario extends Pessoa
{
    public Funcionario(String _nome, String _cpf, Date _data)
    {
        super(_nome, _cpf, _data);
    }
    public double salario;
    public Date data_admissao;
    public String cargo;
}