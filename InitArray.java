// Figura 7.2: InitArray.java
// Inicializando os elementos de um array como valores padrão de zero.

public class InitArray
{
    public static void main( String[] args )
    {
        // lista de inicializador especifica o valor de cada elemento
        int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };

        System.out.printf( "%s%8s\n", "Index", "Value" ); // títulos de coluna

        // gera saída do valor de cada elemento do array
        for ( int counter = 0; counter < array.length; counter++ )
            System.out.printf( "%5d%8d\n", counter, array[ counter ] );
    } // fim de main
} // fim da classe InitArray