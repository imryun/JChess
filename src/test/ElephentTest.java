package test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Image;
import java.awt.Point;
import org.junit.jupiter.api.Test;

import MainFrame.ChessFrame.players.Pieces.Elephent;
import MainFrame.ChessFrame.players.Pieces.king;

class ElephentTest {
  Elephent el = new Elephent( "EL", 0, 0);
  
  @Test
  void testElephent() {
    try {
      el.getPixelX();
    } catch (Exception ed) {
      fail( ed);
    }
  }
  
  @Test
  void testReturnPostion() {
    assertEquals( el.returnPostion().getX(), 0);
    assertEquals( el.returnPostion().getY(), 0);
  }
  
  @Test
  void testReturnPieceImage() {
    Image w = el.returnPieceImage();
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
    assertEquals( el.returnX(), 0);
  }
  
  @Test
  void testSetPoint() {
    el.setPixels( 10, 10);
    assertEquals( 10, el.getPixelX()); // TODO: set pixel doesnt work
  }
  
  @Test
  void testSetX() {
    assertEquals( 0, el.getPixelX());
    el.setX( 2);
    assertEquals( 2, el.getPixelX());
  }
  
  @Test
  void testReturnOld() {
    assertEquals( el.returnOld().getX(), 0);
    assertEquals( el.returnOld().getY(), 0);
    el.setPoint( new Point( 1, 0));
    el.setPoint( new Point( 1, 1));
    assertEquals( el.returnOld().getX(), 1);
    assertEquals( el.returnOld().getY(), 0);
    el.setPoint( new Point( 1, 2));
    assertEquals( el.returnOld().getX(), 1);
    assertEquals( el.returnOld().getY(), 1);
  }
  
  @Test
  void testSetPixels() {
    el.setPixels( 3, 3);
    assertEquals( 3, el.getPixelX());
    assertEquals( 3, el.getPixelY());
    // TODO: elephent set pixels not working
  }
  
  @Test
  void testGetPixelX() {
    assertEquals( 0, el.getPixelX());
  }
  
  @Test
  void testToOld() {
    el.setPoint( new Point( 2, 2));
    assertEquals( 2, el.returnY());
    assertEquals( 2, el.returnX());
    el.setX( (int) el.returnOld().getX());
    el.setY( (int) el.returnOld().getY());
    
    // System.out.println( el.returnX() + "," + el.returnY()); // 2,2
    assertEquals( 0, el.returnY());
    assertEquals( 0, el.returnX());
  }
  
  @Test
  void testGetPixelY() {
    assertEquals( 0, el.getPixelY());
  }
  
  @Test
  void testGetpixelPoint() {
    assertEquals( 0, (int) el.getpixelPoint().getX());
    assertEquals( 0, (int) el.getpixelPoint().getY());
    el.setPixels( 2, 2);
    assertEquals( 2, (int) el.getpixelPoint().getX());
    assertEquals( 2, (int) el.getpixelPoint().getY());
  }
  
  @Test
  void testSetY() {
    assertEquals( 0, el.getPixelY());
    el.setY( 2);
    assertEquals( 2, el.getPixelY());
  }
  
  @Test
  void testReturnY() {
    assertEquals( 0, el.returnY());
  }
  
  @Test
  void testReturnLife() {
    assertEquals( true, el.returnLife());
  }
  
  @Test
  void testInthispostion() {
    assertEquals( true, el.Inthispostion( 0, 0));
    assertEquals( false, el.Inthispostion( 1, 1));
  }
  
  @Test
  void testCanmove() {
    assertEquals( true, el.Canmove( 1, 1));
    assertEquals( true, el.Canmove( 2, 2));
    assertEquals( false, el.Canmove( 1, 3));
  }
  
  @Test
  void testPieceInMYway() {
    assertEquals( false, el.PieceInMYway( 0, 0, new Point( 1, 1)));
    assertEquals( true, el.PieceInMYway( 0, 0, new Point( 0, 0)));
  }
  
  @Test
  void testCheckKing() {
    king k = new king( "WK", 2, 2);
    // System.out.println( c.checkKing( c.returnX(), c.returnY(), new
    // Point(k.returnX(),k.returnY())) ); // false
    assertEquals( el.checkKing( el.returnX(), el.returnY(), new Point( k.returnX(), k.returnY())),
        true);
  }
  
  @Test
  void testGeneratePossible_Moves() {
    assertEquals( new Point(), el.GeneratePossible_Moves()); // TODO not sure what this method does
  }
  
  @Test
  void testTell_me() {
    assertEquals( el.Tell_me(), "Elephent= (0,0)");
  }
  
}
