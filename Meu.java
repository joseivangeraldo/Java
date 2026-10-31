public class Meu{
    private String nome;
    private String sobrenome;
    private int cpf;
    

    public Meu(String name, String surname, int _cpf){
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

    public void setCpf(int _cpf){
        cpf = _cpf;
    }
    
        public String getNome(){
         return nome;
    }

        public String getSobrenome(){
         return sobrenome;
    }

        public int getCpf(){
         return cpf;
    }

        public void Exibe(){
        System.out.printf("%s , %s, %d\n",getNome(), getSobrenome(), getCpf());
    }

}