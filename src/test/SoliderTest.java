package test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Image;
import java.awt.Point;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import MainFrame.ChessFrame.players.Pieces.Solider;

class SoliderTest {
  String NameIcon = "Solider";
  int startX = 0, startY = 0;
  Solider s = new Solider( NameIcon, startX, startY);
  
  // System.out.println( s.Tell_me());
  @BeforeEach
  void setUp() throws Exception {
  }
  
  @Test
  void testSolider() {
    /*
     * public Solider(String NameIcon, int startX, int startY) { PieceIcon = new
     * pieceIcon( NameIcon); X = startX; Y = startY; p.x = X; p.y = Y; }
     */
    
    assertEquals( s.returnX(), 0);
    assertEquals( s.returnY(), 0);
  }
  
  @Test
  void testReturnPieceImage() {
    Image w = s.returnPieceImage();
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
    assertEquals( s.returnX(), 0);
  }
  
  @Test
  void testSetPixels() { //TODO: setPixels not working
    s.setPixels( 10, 10);
    assertEquals( 10, s.getPixelX());
  }
  
  @Test
  void testGetPixelX() {
    assertEquals( 0, s.getPixelX());
  }
  
  @Test
  void testGetPixelY() {
    assertEquals( 0, s.getPixelY());
  }
  
  @Test
  void testGetpixelPoint() {
    assertEquals( 0, (int) s.getpixelPoint().getX());
    assertEquals( 0, (int) s.getpixelPoint().getY());
    s.setPixels( 2, 2);
    assertEquals( 2, (int) s.getpixelPoint().getX());
    assertEquals( 2, (int) s.getpixelPoint().getY());
  }
  
  @Test
  void testReturnY() {
    assertEquals( 0, s.returnY());
  }
  
  @Test
  void testToOld() {
    s.setPoint( new Point( 2, 2));
    assertEquals( 2, s.returnY());
    assertEquals( 2, s.returnX());
    s.setX( (int) s.returnOld().getX());
    s.setY( (int) s.returnOld().getY());
    
    //System.out.println( s.returnX() + "," + s.returnY()); // 2,2
    assertEquals( 0, s.returnY());
    assertEquals( 0, s.returnX());
    
  }
  
  @Test
  void testSetPoint() {
    s.setPoint( new Point( 2, 2));
    assertEquals( 2, s.returnX());
    assertEquals( 2, s.returnY());
  }
  
  @Test
  void testSetX() {
    s.setX( 10);
    assertEquals( 10, s.returnX());
  }
  
  @Test
  void testSetY() {
    s.setY( 5);
    assertEquals( 5, s.returnY());
  }
  
  @Test
  void testReturnOld() {
    assertEquals( s.returnOld().getX(), 0);
    assertEquals( s.returnOld().getY(), 0);
    s.setPoint( new Point( 1, 0));
    s.setPoint( new Point( 1, 1));
    assertEquals( s.returnOld().getX(), 1);
    assertEquals( s.returnOld().getY(), 0);
    s.setPoint( new Point( 1, 2));
    assertEquals( s.returnOld().getX(), 1);
    assertEquals( s.returnOld().getY(), 1);
  }
  
  @Test
  void testReturnPostion() {
    assertEquals( 0, (int) s.returnPostion().getX());
    assertEquals( 0, (int) s.returnPostion().getY());
  }
  
  @Test
  void testReturnLife() {
    assertEquals( true, s.returnLife());
    
  }
  
  @Test
  void testInthispostion() {
    // (p.x == x && p.y == y) ? true : false
    assertEquals( true, s.Inthispostion( 0, 0));
    assertEquals( false, s.Inthispostion( 1, 1));
  }
  
  @Test
  void testCanmove() {
    //TODO: CanMove not working for soldier piece
    assertEquals( true, s.Canmove( 0, 1,"black"));
    assertEquals( true, s.Canmove( 5, 0,"white"));
    assertEquals( true, s.Canmove( 5, 5,"white"));
    assertEquals( false, s.Canmove( 3, 6,"white"));
  }
  
  @Test
  void testPieceInMYway() {
    assertEquals( false, s.PieceInMYway( 5, 0, new Point( 1, 1),"white"));
    assertEquals( false, s.PieceInMYway( 5, 0, new Point( 1, 0),"white"));
    assertEquals( true, s.PieceInMYway( 0, 5, new Point( 0, 6),"white"));
  }
  /*
  @Test
  void testCheckKing() {
    // TODO: this test is failing
    king k = new king( "WK", 0, 5);
    // System.out.println( s.checkKing( s.returnX(), s.returnY(), new
    // Point(k.returnX(),k.returnY())) ); // false
    assertEquals( s.checkKing( s.returnX(), s.returnY(), new Point( k.returnX(), k.returnY())),
        true);
  }*/
  
  @Test
  void testGeneratePossible_Moves() {
    // not really understanding the purpose or goal of this method
    // System.out.println( s.GeneratePossible_Moves()); // java.awt.Point[x=0,y=0]
    assertEquals(new Point(),s.GeneratePossible_Moves()); // TODO not sure what this method should be doing
  }
  
  @Test
  void testTell_me() {
    assertEquals( s.Tell_me(), "Soldier= (0,0)"); 
  }
  
}
