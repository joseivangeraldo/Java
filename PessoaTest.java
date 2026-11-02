public class PessoaTest {

     public static void main(String[] args)
    {   
    Pessoa pessoa = new Pessoa("José", "123456789", "10/10/2026");
    pessoa.Display();

    Professor prof = new Professor("Ana Souza", "987.654.321-11", "20/10/1975");

        // 2. Set fields specific to Professor
        prof.salario = 6200.50;
        prof.disciplina = "Programação Orientada a Objetos";

        // 3. Use the inherited Display() method
        System.out.print("Dados do Professor -> ");
        prof.Display();

        // 4. Print specific fields
        System.out.println("Disciplina: " + prof.disciplina);
        System.out.println("Salário: R$ " + prof.salario);
    }
}
