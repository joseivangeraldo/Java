public class Meu{
    private String nome;

    public Meu(String Pnome){
        nome = Pnome;
    }

    public void setNome(String name){
        nome = name;
    }
    
        public String getNome(){
         return name;
    }

        public void Exibe(){
        System.out.printf("%s\n",getNome());
    }
}