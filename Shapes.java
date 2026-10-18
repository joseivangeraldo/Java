// Figura .: Shapes.java
// Demonstra o desenho de diferentes formas.
 import java.awt.Graphics;
 import javax.swing.JPanel;

 public class Shapes extends JPanel
 {
 private int choice; // escolha do usuário de qual forma desenhar

// construtor configura a escolha do usuário
 public Shapes( int userChoice )
 {
 choice = userChoice;
 } // fim do construtor Shapes

 // desenha uma cascata de formas que iniciam do canto superior esquerdo
 public void paintComponent( Graphics g )
 {
 super.paintComponent( g );

 for ( int i = 0; i < 0; i++ )
 {
 // seleciona a forma com base na escolha do usuário
 switch ( choice )
 {
 case 1 : // desenha retângulos
 g.drawRect( 0 + i * 0, 0 + i * 0,
 0 + i * 0, 0 + i * 0 );
 break;
 case 2 : // desenha elipses
 g.drawOval( 0 + i * 0, 0 + i * 0,
 0 + i * 0, 0 + i * 0 );
 break;
 } // fim do switch
 } // for final
 } // fim do método paintComponent
 } // fim da classe Shapes