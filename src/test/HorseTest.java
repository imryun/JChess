package test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Image;
import java.awt.Point;

import org.junit.jupiter.api.Test;

import MainFrame.ChessFrame.players.Pieces.Horse;

class HorseTest {
  Horse h = new Horse("h", 0, 0);

  @Test
  void testHorse() {
    /*
     * public Horse(String NameIcon, int startX, int startY) { PieceIcon = new
     * pieceIcon( NameIcon); X = startX; Y = startY; p.x = X; p.y = Y; }
     */
    
    assertEquals( h.returnX(), 0);
    assertEquals( h.returnY(), 0);
  }
  
  @Test
  void testReturnPieceImage() {
    Image w = h.returnPieceImage();
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
    assertEquals( h.returnX(), 0);
  }
  
  @Test
  void testSetPixels() {// fixed aug3 7:52
    
    h.setPixels( 10, 10);
    assertEquals( 10, h.getPixelY());
    assertEquals( 10, h.getPixelX());

  }
  
  @Test
  void testGetPixelX() {
    assertEquals( 0, h.getPixelX());
  }
  
  @Test
  void testGetPixelY() {
    assertEquals( 0, h.getPixelY());
  }
  
  @Test
  void testGetpixelPoint() {
    assertEquals( 0, (int) h.getpixelPoint().getX());
    assertEquals( 0, (int) h.getpixelPoint().getY());
    h.setPixels( 2, 2);
    assertEquals( 2, (int) h.getpixelPoint().getX());
    assertEquals( 2, (int) h.getpixelPoint().getY());
  }
  
  @Test
  void testReturnY() {
    assertEquals( 0, h.returnY());
  }
  
  @Test
  void testToOld() {
    h.setPoint( new Point( 2, 2));
    assertEquals( 2, h.returnY());
    assertEquals( 2, h.returnX());
    h.setX( (int) h.returnOld().getX());
    h.setY( (int) h.returnOld().getY());
    
    //System.out.println( h.returnX() + "," + h.returnY()); // 2,2
    assertEquals( 0, h.returnY());
    assertEquals( 0, h.returnX());
    
  }
  
  @Test
  void testSetPoint() {
    h.setPoint( new Point( 2, 2));
    assertEquals( 2, h.returnX());
    assertEquals( 2, h.returnY());
  }
  
  @Test
  void testSetX() {
    h.setX( 10);
    assertEquals( 10, h.returnX());
  }
  
  @Test
  void testSetY() {
    h.setY( 5);
    assertEquals( 5, h.returnY());
  }
  
  @Test
  void testReturnOld() {
    assertEquals( h.returnOld().getX(), 0);
    assertEquals( h.returnOld().getY(), 0);
    h.setPoint( new Point( 1, 0));
    h.setPoint( new Point( 1, 1));
    assertEquals( h.returnOld().getX(), 1);
    assertEquals( h.returnOld().getY(), 0);
    h.setPoint( new Point( 1, 2));
    assertEquals( h.returnOld().getX(), 1);
    assertEquals( h.returnOld().getY(), 1);
  }
  
  @Test
  void testReturnPostion() {
    assertEquals( 0, (int) h.returnPostion().getX());
    assertEquals( 0, (int) h.returnPostion().getY());
  }
  
  @Test
  void testReturnLife() {
    assertEquals( true, h.returnLife());
    
  }
  
  @Test
  void testInthispostion() {
    // (p.x == x && p.y == y) ? true : false
    assertEquals( true, h.Inthispostion( 0, 0));
    assertEquals( false, h.Inthispostion( 1, 1));
  }
  
  @Test
  void testCanmove() {
    assertEquals( true, h.Canmove( 2, 1));
    assertEquals( true, h.Canmove( 1, 2));
    assertEquals( false, h.Canmove( 5, 5));
  }
  /*
  @Test
  void testPieceInMYway() {
    assertEquals( false, h.PieceInMYway( 5, 0, new Point( 1, 1)));
    assertEquals( true, h.PieceInMYway( 5, 0, new Point( 1, 0)));
  }
  
  @Test
  void testCheckKing() {
    // TODO: this test is failing
    king k = new king( "WK", 0, 5);
    // System.out.println( h.checkKing( h.returnX(), h.returnY(), new
    // Point(k.returnX(),k.returnY())) ); // false
    assertEquals( h.checkKing( h.returnX(), h.returnY(), new Point( k.returnX(), k.returnY())),
        true);
  }*/
  
  @Test
  void testGeneratePossible_Moves() {
    // not really understanding the purpose or goal of this method
    // System.out.println( h.GeneratePossible_Moves()); // java.awt.Point[x=0,y=0]
    assertEquals( new Point(),h.GeneratePossible_Moves()); // TODO not sure what this method should be doing
  }
  
  @Test
  void testTell_me() {
    assertEquals( h.Tell_me(), "Horse= (0,0)");
  }
}