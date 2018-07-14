package MainFrame.ChessFrame.players.Pieces;

import java.awt.Image;
import java.awt.Point;

/**
 * Creates a new instance of king
 */
public class king {
  
  /** Creates a new instance of king */
  private int X, Y;
  private Point pixelPoint = new Point();
  private int pixelX, pixelY;
  private boolean havelife = true;
  private pieceIcon PieceIcon;
  private Point old = new Point();
  private Point p = new Point();
  
  /**
   * Creates a new instance of king
   * 
   * @param NameIcon
   * @param startX
   * @param startY
   */
  public king(String NameIcon, int startX, int startY) {
    PieceIcon = new pieceIcon( NameIcon);
    X = startX;
    Y = startY;
    p.x = X;
    p.y = Y;
  }
  
  /**
   * returnPieceImage
   * 
   * @return PieceIcon.returnPieceIcon()
   */
  public Image returnPieceImage() {
    return PieceIcon.returnPieceIcon();
  }
  
  /**
   * returnPostion
   * 
   * @return (Point) p.clone()
   */
  public Point returnPostion() {
    return (Point) p.clone();
  }
  
  /**
   * returnX
   * 
   * @return X
   */
  public int returnX() {
    X = p.x;
    return X;
  }
  
  /**
   * setPixels
   * 
   * @param newpixelX
   * @param newpixelY
   */
  public void setPixels(int newpixelX, int newpixelY) {
    pixelPoint.x = newpixelX;
    pixelPoint.y = newpixelY;
  }
  
  /**
   * getPixelX
   * 
   * @return pixelX
   */
  public int getPixelX() {
    return pixelX;
  }
  
  /**
   * getPixelY
   * 
   * @return pixelY
   */
  public int getPixelY() {
    return pixelY;
  }
  
  /**
   * getpixelPoint
   * 
   * @return
   */
  public Point getpixelPoint() {
    return pixelPoint;
  }
  
  /**
   * returnY
   * 
   * @return Y
   */
  public int returnY() {
    Y = p.y;
    return Y;
  }
  
  /**
   * setPoint
   * 
   * @param newPoint
   */
  public void setPoint(Point newPoint) {
    old.x = p.x;
    old.y = p.y;
    p.x = newPoint.x;
    p.y = newPoint.y;
    X = p.x;
    Y = p.y;
  }
  
  /**
   * toOld
   * 
   * @param Old
   */
  public void toOld(Point Old) {
    p.x = Old.x;
    p.y = Old.y;
  }
  
  /**
   * returnOld
   * 
   * @return old
   */
  public Point returnOld() {
    return old;
  }
  
  /**
   * setX
   * 
   * @param newX
   */
  public void setX(int newX) {
    X = newX;
    p.x = X;
  }
  
  /**
   * setY
   * 
   * @param newY
   */
  public void setY(int newY) {
    Y = newY;
    p.y = Y;
  }
  
  /**
   * Inthispostion
   * 
   * @param x
   * @param y
   * @return (p.x == x && p.y == y) ? true : false
   */
  public boolean Inthispostion(int x, int y) {
    if (p.x == x && p.y == y)
      return true;// cant kill the king anymore;
    return false;
  }
  
  /**
   * returnLife
   * 
   * @return havelife
   */
  public boolean returnLife() {
    return havelife;
  }
  
  /**
   * Canmove
   * 
   * @param x
   * @param y
   * @return
   */
  public boolean Canmove(int x, int y) {
    if (((y == Y) && (x == (X - 1))) || ((y == Y - 1) && (x == (X + 1)))
        || ((y == Y - 1) && (x == (X - 1))) || ((y == Y + 1) && (x == (X + 1)))
        || (((y == Y + 1) && x == (X - 1))) || ((y == Y) && (x == (X + 1)))
        || ((y == Y - 1) && x == ((X))) || ((y == Y + 1) && (x == (X)))) {
      return true;
    }
    return false;
  }
  
  /**
   * GeneratePossible_Moves
   * 
   * @return new Point()
   */
  public Point GeneratePossible_Moves() {
    return new Point();
  }
  
  /**
   * Tell_me
   * 
   * @return "King=(p.x, p.y)"
   */
  public String Tell_me() {
    return "King= (" + p.x + ',' + p.y + ")";
  }
}
