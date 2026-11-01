public class Meu{
    private String nome;
    private String sobrenome;
    private String cpf;
    

    public Meu(String name, String surname, String _cpf){
        nome = name;
        sobrenome = surname;
        cpf = _cpf;
    }

    public void setNome(String name){
        nome = name;
    }

    public void setSobrenome(String surname){
        sobrenome = surname;
    }

    public void setCpf(String _cpf){
        cpf = _cpf;
    }
    
        public String getNome(){
         return nome;
    }

        public String getSobrenome(){
         return sobrenome;
    }

        public String getCpf(){
         return cpf;
    }

        public void Exibe(){
        System.out.printf("nome: %s   sobrenome: %s   CPF: %s\n",getNome(), getSobrenome(), getCpf());
    }

}