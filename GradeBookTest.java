// Figura 4.7: GradeBookTest.java
// Cria o objeto da classe GradeBook e invoca seu método
// determineClassAverage
public class GradeBookTest
{
public static void main( String[] args )
{
// cria o objeto myGradeBookda classe GradeBook e
// passa o nome de cursor para o construtor
GradeBook myGradeBook = new GradeBook(
"CS101 Introduction to Java Programming" );

myGradeBook.displayMessage(); // exibe a mensagem welcome
myGradeBook.determineClassAverage(); // calcula a média das 10 notas
} // fim de main
} // fim da classe GradeBookTest