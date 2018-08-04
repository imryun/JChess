package test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Image;
import java.awt.Point;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import MainFrame.ChessFrame.players.Pieces.Castle;
import MainFrame.ChessFrame.players.Pieces.king;

class CastleTest {
  String NameIcon = "Castle";
  int startX = 0, startY = 0;
  Castle c = new Castle( NameIcon, startX, startY);
  
  // System.out.println( c.Tell_me());
  @BeforeEach
  void setUp() throws Exception {
  }
  
  @Test
  void testCastle() {
    /*
     * public Castle(String NameIcon, int startX, int startY) { PieceIcon = new
     * pieceIcon( NameIcon); X = startX; Y = startY; p.x = X; p.y = Y; }
     */
    
    assertEquals( c.returnX(), 0);
    assertEquals( c.returnY(), 0);
  }
  
  @Test
  void testReturnPieceImage() {
    Image w = c.returnPieceImage();
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
    assertEquals( c.returnX(), 0);
  }
  
  @Test
  void testSetPixels() {// fixed aug3 7:52
    
    c.setPixels( 10, 10);
    assertEquals( 10, c.getPixelX());
  }
  
  @Test
  void testGetPixelX() {
    assertEquals( 0, c.getPixelX());
  }
  
  @Test
  void testGetPixelY() {
    assertEquals( 0, c.getPixelY());
  }
  
  @Test
  void testGetpixelPoint() {
    assertEquals( 0, (int) c.getpixelPoint().getX());
    assertEquals( 0, (int) c.getpixelPoint().getY());
    c.setPixels( 2, 2);
    assertEquals( 2, (int) c.getpixelPoint().getX());
    assertEquals( 2, (int) c.getpixelPoint().getY());
  }
  
  @Test
  void testReturnY() {
    assertEquals( 0, c.returnY());
  }
  
  @Test
  void testToOld() {
    c.setPoint( new Point( 2, 2));
    assertEquals( 2, c.returnY());
    assertEquals( 2, c.returnX());
    c.setX( (int) c.returnOld().getX());
    c.setY( (int) c.returnOld().getY());
    
    //System.out.println( c.returnX() + "," + c.returnY()); // 2,2
    assertEquals( 0, c.returnY());
    assertEquals( 0, c.returnX());
    
  }
  
  @Test
  void testSetPoint() {
    c.setPoint( new Point( 2, 2));
    assertEquals( 2, c.returnX());
    assertEquals( 2, c.returnY());
  }
  
  @Test
  void testSetX() {
    c.setX( 10);
    assertEquals( 10, c.returnX());
  }
  
  @Test
  void testSetY() {
    c.setY( 5);
    assertEquals( 5, c.returnY());
  }
  
  @Test
  void testReturnOld() {
    assertEquals( c.returnOld().getX(), 0);
    assertEquals( c.returnOld().getY(), 0);
    c.setPoint( new Point( 1, 0));
    c.setPoint( new Point( 1, 1));
    assertEquals( c.returnOld().getX(), 1);
    assertEquals( c.returnOld().getY(), 0);
    c.setPoint( new Point( 1, 2));
    assertEquals( c.returnOld().getX(), 1);
    assertEquals( c.returnOld().getY(), 1);
  }
  
  @Test
  void testReturnPostion() {
    assertEquals( 0, (int) c.returnPostion().getX());
    assertEquals( 0, (int) c.returnPostion().getY());
  }
  
  @Test
  void testReturnLife() {
    assertEquals( true, c.returnLife());
    
  }
  
  @Test
  void testInthispostion() {
    // (p.x == x && p.y == y) ? true : false
    assertEquals( true, c.Inthispostion( 0, 0));
    assertEquals( false, c.Inthispostion( 1, 1));
  }
  
  @Test
  void testCanmove() {
    assertEquals( true, c.Canmove( 0, 5));
    assertEquals( true, c.Canmove( 5, 0));
    assertEquals( false, c.Canmove( 5, 5));
  }
  
  @Test
  void testPieceInMYway() {
    assertEquals( false, c.PieceInMYway( 5, 0, new Point( 1, 1)));
    assertEquals( true, c.PieceInMYway( 5, 0, new Point( 1, 0)));
  }
  
  @Test
  void testCheckKing() {
    // TODO: this test is failing
    king k = new king( "WK", 0, 5);
    // System.out.println( c.checkKing( c.returnX(), c.returnY(), new
    // Point(k.returnX(),k.returnY())) ); // false
    assertEquals( c.checkKing( c.returnX(), c.returnY(), new Point( k.returnX(), k.returnY())),
        true);
  }
  
  @Test
  void testGeneratePossible_Moves() {
    // not really understanding the purpose or goal of this method
    // System.out.println( c.GeneratePossible_Moves()); // java.awt.Point[x=0,y=0]
    fail( "Not yet implemented"); // TODO not sure what this method should be doing
  }
  
  @Test
  void testTell_me() {
    assertEquals( c.Tell_me(), "Castle= (0,0)");
  }
  
}
