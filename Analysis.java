// Figura 4.12: Analysis.java
// Análise dos resultados dos exames.
import java.util.Scanner; // classe utiliza a classe Scanner

public class Analysis
{
    public static void main( String[] args )
    {
        // cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner( System.in );

        // inicializando variáveis nas declarações
        int passes = 0; // número de aprovações
        int failures = 0; // número de reprovações
        int studentCounter = 1; // contador de alunos
        int result; // um resultado do exame (fornecido pelo usuário)

        // processa 10 alunos com o loop controlado por contador
        while ( studentCounter <= 10 )
        {
            // solicita ao usuário uma entrada e obtém o valor fornecido pelo usuário
            System.out.print( "Enter result (1 = pass, 2 = fail): " );
            result = input.nextInt();

            // if...else aninhado em while
            if ( result == 1 ) // se resultar 1,
                passes = passes + 1; // incrementa aprovações;
            else // caso contrário, resultado não é 1, então
                failures = failures + 1; // incrementa reprovações

            // incrementa studentCounter até o loop terminar
            studentCounter = studentCounter + 1;
        } // fim do while

        // fase de término; prepara e exibe os resultados
        System.out.printf( "Passed: %d\nFailed: %d\n", passes, failures );

        // determina se mais de 8 alunos foram aprovados
        if ( passes > 8 )
            System.out.println( "Bonus to instructor!" );
    } // fim de main
} // fim da classe Analysis