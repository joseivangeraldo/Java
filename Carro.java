public class Carro{
    private String nome;
    private String cor;
    private int ano;

    public Carro(String _nome, String _cor , int _ano){
        nome = _nome;
        cor = _cor;
        ano = _ano;

    }

    public void setMarca(String _nome){
        nome = _nome;
    }

    public void setCor(String _cor){
        cor = _cor;
    }

    public void setAno(String _ano){
        ano = _ano;
    }
    
        public String getMarca(){
         return nome;
    }

        public String getCor(){
         return cor;
    }

        public int getAno(){
         return ano;
    }

        public void Exibe(){
        System.out.printf("%s , %s, %d\n",getMarca(), getCor(), getAno());
        }
}
