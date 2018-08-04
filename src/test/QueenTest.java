package test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Image;
import java.awt.Point;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import MainFrame.ChessFrame.players.Pieces.Queen;
import MainFrame.ChessFrame.players.Pieces.king;

class QueenTest {
  String NameIcon = "Queen";
  int startX = 0, startY = 0;
  Queen q = new Queen( NameIcon, startX, startY);
  
  // System.out.println( q.Tell_me());
  @BeforeEach
  void setUp() throws Exception {
  }
  
  @Test
  void testQueen() {
    /*
     * public Queen(String NameIcon, int startX, int startY) { PieceIcon = new
     * pieceIcon( NameIcon); X = startX; Y = startY; p.x = X; p.y = Y; }
     */
    
    assertEquals( q.returnX(), 0);
    assertEquals( q.returnY(), 0);
  }
  
  @Test
  void testReturnPieceImage() {
    Image w = q.returnPieceImage();
    String str = w.toString();
    char[] charoid = str.toCharArray();
    
    String y = "";
    for (int x = 0; x < 26; x++)
      y += charoid[x];
    // System.out.println( y);
    assertEquals( y.toString(), "sun.awt.image.ToolkitImage");
  }
  
  @Test
  void testReturnX() {
    assertEquals( q.returnX(), 0);
  }
  
  @Test
  void testSetPixels() { //TODO: setPixels not working
    q.setPixels( 10, 10);
    assertEquals( 10, q.getPixelX());
  }
  
  @Test
  void testGetPixelX() {
    assertEquals( 0, q.getPixelX());
  }
  
  @Test
  void testGetPixelY() {
    assertEquals( 0, q.getPixelY());
  }
  
  @Test
  void testGetpixelPoint() {
    assertEquals( 0, (int) q.getpixelPoint().getX());
    assertEquals( 0, (int) q.getpixelPoint().getY());
    q.setPixels( 2, 2);
    assertEquals( 2, (int) q.getpixelPoint().getX());
    assertEquals( 2, (int) q.getpixelPoint().getY());
  }
  
  @Test
  void testReturnY() {
    assertEquals( 0, q.returnY());
  }
  
  @Test
  void testToOld() {
    q.setPoint( new Point( 2, 2));
    assertEquals( 2, q.returnY());
    assertEquals( 2, q.returnX());
    q.setX( (int) q.returnOld().getX());
    q.setY( (int) q.returnOld().getY());
    
    //System.out.println( q.returnX() + "," + q.returnY()); // 2,2
    assertEquals( 0, q.returnY());
    assertEquals( 0, q.returnX());
    
  }
  
  @Test
  void testSetPoint() {
    q.setPoint( new Point( 2, 2));
    assertEquals( 2, q.returnX());
    assertEquals( 2, q.returnY());
  }
  
  @Test
  void testSetX() {
    q.setX( 10);
    assertEquals( 10, q.returnX());
  }
  
  @Test
  void testSetY() {
    q.setY( 5);
    assertEquals( 5, q.returnY());
  }
  
  @Test
  void testReturnOld() {
    assertEquals( q.returnOld().getX(), 0);
    assertEquals( q.returnOld().getY(), 0);
    q.setPoint( new Point( 1, 0));
    q.setPoint( new Point( 1, 1));
    assertEquals( q.returnOld().getX(), 1);
    assertEquals( q.returnOld().getY(), 0);
    q.setPoint( new Point( 1, 2));
    assertEquals( q.returnOld().getX(), 1);
    assertEquals( q.returnOld().getY(), 1);
  }
  
  @Test
  void testReturnPostion() {
    assertEquals( 0, (int) q.returnPostion().getX());
    assertEquals( 0, (int) q.returnPostion().getY());
  }
  
  @Test
  void testReturnLife() {
    assertEquals( true, q.returnLife());
    
  }
  
  @Test
  void testInthispostion() {
    // (p.x == x && p.y == y) ? true : false
    assertEquals( true, q.Inthispostion( 0, 0));
    assertEquals( false, q.Inthispostion( 1, 1));
  }
  
  @Test
  void testCanmove() {
    assertEquals( true, q.Canmove( 0, 5));
    assertEquals( true, q.Canmove( 5, 0));
    assertEquals( true, q.Canmove( 5, 5));
    assertEquals( false, q.Canmove( 3, 6));
  }
  
  @Test
  void testPieceInMYway() {
    assertEquals( false, q.PieceInMYway( 5, 0, new Point( 1, 1)));
    assertEquals( true, q.PieceInMYway( 5, 0, new Point( 1, 0)));
  }
  
  @Test
  void testCheckKing() {
    // TODO: this test is failing
    king k = new king( "WK", 0, 5);
    // System.out.println( q.checkKing( q.returnX(), q.returnY(), new
    // Point(k.returnX(),k.returnY())) ); // false
    assertEquals( q.checkKing( q.returnX(), q.returnY(), new Point( k.returnX(), k.returnY())),
        true);
  }
  
  @Test
  void testGeneratePossible_Moves() {
    // not really understanding the purpose or goal of this method
    // System.out.println( q.GeneratePossible_Moves()); // java.awt.Point[x=0,y=0]
    assertEquals(new Point(),q.GeneratePossible_Moves()); // TODO not sure what this method should be doing
  }
  
  @Test
  void testTell_me() {
    assertEquals( q.Tell_me(), "Queen= (0,0)");
  }
  
}
