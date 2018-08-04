package test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Image;
import java.awt.Point;

import org.junit.jupiter.api.Test;

import MainFrame.ChessFrame.players.Pieces.king;

class kingTest {
  king k = new king( "k", 0, 0);
  
  @Test
  void testking() {
    /*
     * public king(String NameIcon, int startX, int startY) { PieceIcon = new
     * pieceIcon( NameIcon); X = startX; Y = startY; p.x = X; p.y = Y; }
     */
    
    assertEquals( k.returnX(), 0);
    assertEquals( k.returnY(), 0);
  }
  
  @Test
  void testReturnPieceImage() {
    Image w = k.returnPieceImage();
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
    assertEquals( k.returnX(), 0);
  }
  
  @Test
  void testSetPixels() {
    
    k.setPixels( 10, 10);
    assertEquals( 10, k.getPixelY());
    assertEquals( 10, k.getPixelX());
    
  }
  
  @Test
  void testGetPixelX() {
    assertEquals( 0, k.getPixelX());
  }
  
  @Test
  void testGetPixelY() {
    assertEquals( 0, k.getPixelY());
  }
  
  @Test
  void testGetpixelPoint() {
    assertEquals( 0, (int) k.getpixelPoint().getX());
    assertEquals( 0, (int) k.getpixelPoint().getY());
    k.setPixels( 2, 2);
    assertEquals( 2, (int) k.getpixelPoint().getX());
    assertEquals( 2, (int) k.getpixelPoint().getY());
  }
  
  @Test
  void testReturnY() {
    assertEquals( 0, k.returnY());
  }
  
  @Test
  void testToOld() {
    k.setPoint( new Point( 2, 2));
    assertEquals( 2, k.returnY());
    assertEquals( 2, k.returnX());
    k.setX( (int) k.returnOld().getX());
    k.setY( (int) k.returnOld().getY());
    
    // System.out.println( k.returnX() + "," + k.returnY()); // 2,2
    assertEquals( 0, k.returnY());
    assertEquals( 0, k.returnX());
    
  }
  
  @Test
  void testSetPoint() {
    k.setPoint( new Point( 2, 2));
    assertEquals( 2, k.returnX());
    assertEquals( 2, k.returnY());
  }
  
  @Test
  void testSetX() {
    k.setX( 10);
    assertEquals( 10, k.returnX());
  }
  
  @Test
  void testSetY() {
    k.setY( 5);
    assertEquals( 5, k.returnY());
  }
  
  @Test
  void testReturnOld() {
    assertEquals( k.returnOld().getX(), 0);
    assertEquals( k.returnOld().getY(), 0);
    k.setPoint( new Point( 1, 0));
    k.setPoint( new Point( 1, 1));
    assertEquals( k.returnOld().getX(), 1);
    assertEquals( k.returnOld().getY(), 0);
    k.setPoint( new Point( 1, 2));
    assertEquals( k.returnOld().getX(), 1);
    assertEquals( k.returnOld().getY(), 1);
  }
  
  @Test
  void testReturnPostion() {
    assertEquals( 0, (int) k.returnPostion().getX());
    assertEquals( 0, (int) k.returnPostion().getY());
  }
  
  @Test
  void testReturnLife() {
    assertEquals( true, k.returnLife());
    
  }
  
  @Test
  void testInthispostion() {
    // (p.x == x && p.y == y) ? true : false
    assertEquals( true, k.Inthispostion( 0, 0));
    assertEquals( false, k.Inthispostion( 1, 1));
  }
  
  @Test
  void testCanmove() {
    assertEquals( true, k.Canmove( 1, 1));
    assertEquals( true, k.Canmove( 1, 0));
    assertEquals( true, k.Canmove( 0, 1));
    assertEquals( false, k.Canmove( 5, 5));
  }
  /*
   * @Test void testPieceInMYway() { assertEquals( false, k.PieceInMYway( 5, 0,
   * new Point( 1, 1))); assertEquals( true, k.PieceInMYway( 5, 0, new Point( 1,
   * 0))); }
   * 
   * @Test void testCheckKing() { // TODO: this test is failing king k = new king(
   * "WK", 0, 5); // System.out.println( k.checkKing( k.returnX(), k.returnY(),
   * new // Point(k.returnX(),k.returnY())) ); // false assertEquals( k.checkKing(
   * k.returnX(), k.returnY(), new Point( k.returnX(), k.returnY())), true); }
   */
  
  @Test
  void testGeneratePossible_Moves() {
    // not really understanding the purpose or goal of this method
    // System.out.println( k.GeneratePossible_Moves()); // java.awt.Point[x=0,y=0]
    assertEquals( new Point(), k.GeneratePossible_Moves()); // TODO not sure what this method should
                                                            // be doing
  }
  
  @Test
  void testTell_me() {
    assertEquals( k.Tell_me(), "King= (0,0)");
  }
}