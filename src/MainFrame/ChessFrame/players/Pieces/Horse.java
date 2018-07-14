package MainFrame.ChessFrame.players.Pieces;

import java.awt.Image;
import java.awt.Point;

/**
 * Creates a new instance of Horse
 */
public class Horse {
  private int X, Y;
  private Point pixelPoint = new Point();
  private int pixelX, pixelY;
  private boolean havelife = true;
  private Point old = new Point();
  private pieceIcon PieceIcon;
  private Point p = new Point();
  
  /**
   * Creates a new instance of Horse
   * 
   * @param NameIcon
   * @param startX
   * @param startY
   */
  public Horse(String NameIcon, int startX, int startY) {
    PieceIcon = new pieceIcon( NameIcon);
    X = startX;
    Y = startY;
    p.x = X;
    p.y = Y;
  }
  
  /**
   * returnPostion
   * 
   * @return (Point)p.clone();
   */
  public Point returnPostion() {
    return (Point) p.clone();
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
   * returnX
   * 
   * @return X
   */
  public int returnX() {
    return X;
  }
  
  /**
   * setPoint
   * 
   * @param newPoint
   */
  public void setPoint(Point newPoint) {
    old.x = p.x;
    old.y = p.y;
    X = p.x = newPoint.x;
    Y = p.y = newPoint.y;
  }
  
  /**
   * returnOlds
   * 
   * @return
   */
  public Point returnOld() {
    return (Point) old.clone();
    
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
   * @return PixelY
   */
  public int getPixelY() {
    return pixelY;
  }
  
  /**
   * getpixelPoint
   * 
   * @return pixelPoint
   */
  public Point getpixelPoint() {
    return pixelPoint;
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
   * returnY
   * 
   * @return Y
   */
  public int returnY() {
    return Y;
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
   * Inthispostion
   * 
   * @param x
   * @param y
   * @return (p.x == x && p.y == y) ? true : false
   */
  public boolean Inthispostion(int x, int y) {
    if (p.x == x && p.y == y)
      return true;
    return false;
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
   * Canmove
   * 
   * @param x
   * @param y
   * @return
   */
  public boolean Canmove(int x, int y) {
    if ((x + 1 == X) && (y + 2 == Y) || (x + 1 == X) && (y - 2 == Y) || (x - 1 == X) && (y + 2 == Y)
        || (x - 1 == X) && (y - 2 == Y) || (x + 2 == X) && (y + 1 == Y)
        || (x + 2 == X) && (y - 1 == Y) || (x - 2 == X) && (y + 1 == Y)
        || (x - 2 == X) && (y - 1 == Y)) {
      return true;
    } else {
      return false;
    }
  }
  
  /**
   * GeneratePossible_Moves
   * 
   * @return
   */
  public Point GeneratePossible_Moves() {
    return new Point();
  }
  
  /**
   * Tell_me
   * 
   * @return horse=(p.x,p.y)
   */
  public String Tell_me() {
    return "Horse= (" + p.x + ',' + p.y + ")";
  }
}
