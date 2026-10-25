public class Meu{
    private String nome;

    public Meu(String name){
        nome = name;
    }

    public void setNome(String name){
        nome = name;
    }
    
        public String getNome(){
         return nome;
    }

        public void Exibe(){
        System.out.printf("%s\n",getNome());
    }

}