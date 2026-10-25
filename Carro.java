public class Carro{
    private String marca;

    public Carro(String name){
        marca = name;
    }

    public void setMarca(String name){
        marca = name;
    }
    
        public String getMarca(){
         return marca;
    }

        public void ExibeMarca(){
        System.out.printf("%s\n",getMarca());
    }

}
