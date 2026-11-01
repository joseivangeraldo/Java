public class Pessoa2 {
    // Atributos (características)
    private String nome;
    private int idade;

    // Construtor (método especial para inicializar o objeto)
    public Pessoa2(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public class Aluno extends Pessoa
{
    public Aluno(String _nome, String idade)
    {
        super(_nome, _idade);
    }
     public String matricula;
}

    // Métodos (comportamentos ou ações)
    public void saudacao() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos."+ "matricula nmro" + matricula);
    }

    // Método principal para testar a criação de objetos
    public static void main(String[] args) {
        // Criando (instanciando) um objeto a partir da classe
        Pessoa2 pessoa1 = new Pessoa2("João", 30);
        pessoa1.saudacao(); // Chamando o método
        
    }
}