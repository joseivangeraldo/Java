 // Figura .: GradeBook.java
 // A classe GradeBook utiliza a instrução switch para contar as letras das notas escolares.
 import java.util.Scanner; // programa utiliza a classe Scanner

 public class GradeBook
 {
 private String courseName; // nome do curso que essa GradeBook representa
 // variáveis de instância int são inicializadas em  por padrão
 private int total; // soma das notas
 private int gradeCounter; // número de notas inseridas
 private int aCount; // contagem de notas A
 private int bCount; // contagem de notas B
 private int cCount; // contagem de notas C
 private int dCount; // contagem de notas D
 private int fCount; // contagem de notas F

 // construtor inicializa courseName;
 public GradeBook(String name)
 {
 courseName = name; // inicializa courseName
 } // fi m do construtor

 // método para confi gurar o nome do curso
 public void setCourseName(String name)
 {
 courseName = name; // armazena o nome do curso
 } // fi m do método setCourseName

 // método para recuperar o nome do curso
 public String getCourseName()
 {
 return courseName;
 } // fi m do método getCourseName

 // exibe uma mensagem de boas­vindas para o usuário GradeBook
 public void displayMessage()
 {
 // getCourseName obtém o nome do curso
 System.out.printf( "Welcome to the grade book for\n%s!\n\n",
 getCourseName() );
 } // fim do método displayMessage

 // insere número arbitrário de notas do usuário
 public void inputGrades()
 {
 Scanner input = new Scanner( System.in );

 int grade; // nota inserida pelo usuário

 System.out.printf( "%s\n%s\n %s\n %s\n",
 "Enter the integer grades in the range -.",
 "Type the end-of-file indicator to terminate input:",
 "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
 "On Windows type <Ctrl> z then press Enter" );

 // faz loop até usuário inserir o indicador de fim do arquivo
 while (input.hasNext() )
 {
 grade = input.nextInt(); // lê a nota
 total += grade; // adiciona grade a total
 ++gradeCounter; // incrementa o número de notas

 // chama método para incrementar o contador adequado
 incrementLetterGradeCounter( grade );
 } // fim do while
 } // fim do método inputGrades

 // adiciona  ao contador adequado da nota especificada
 private void incrementLetterGradeCounter( int grade )
 {
 // determina a nota que foi inserida
 switch ( grade / 10  )
 {
 case 9: // a nota estava entre 
 case 10: // e , inclusivo
 ++aCount; // incrementa aCount
 break; // necessário para sair de switch

 case 8: // nota estava entre  e 
 ++bCount; // incrementa bCount
 break; // sai do switch

 case 7: // nota estava entre  e 
 ++cCount; // incrementa cCount
 break; // sai do switch

 case 6: // nota estava entre  e 
 ++dCount; // incrementa dCount
 break; // sai do switch

 default: // a nota era menor que 
 ++fCount; // incrementa fCount
 break; // opcional; sairá do switch de qualquer jeito
 } // fim do switch
 } // fim do método incrementLetterGradeCounter

 // exibe um relatório baseado nas notas inseridas pelo usuário
 public void displayGradeReport()
 {
 System.out.println( "\nGrade Report:" );

 // se usuário inseriu pelo menos uma nota...
 if ( gradeCounter !=  )
 {
 // calcula a média de todas as notas inseridas
 double average = (double) total / gradeCounter;


. A estrutura de seleção múltipla switch 

 // gera a saída de resumo de resultados
 System.out.printf( "Total of the %d grades entered is %d\n",
 gradeCounter, total );
 System.out.printf( "Class average is %.f\n", average );
 System.out.printf( "%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
 "Number of students who received each grade:",
 "A: ", aCount, // exibe número de notas A
 "B: ", bCount, // exibe número de notas B
 "C: ", cCount, // exibe número de notas C
 "D: ", dCount, // exibe número de notas D
 "F: ", fCount ); // exibe número de notas F
 } // fim do if
 else // notas não foram inseridas, portanto imprime mensagem apropriada
 System.out.println( "No grades were entered" );
 } // fim do método displayGradeReport
 } // fim da classe GradeBook