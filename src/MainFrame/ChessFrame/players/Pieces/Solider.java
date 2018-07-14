package MainFrame.ChessFrame.players.Pieces;

import java.awt.Image;
import java.awt.Point;

/**
 * Creates a new instance of Solider
 */
public class Solider {
  private int X, Y;
  private Point pixelPoint = new Point();
  private int pixelX, pixelY;
  private boolean havelife = true;
  private boolean movedbefore = false;
  private pieceIcon PieceIcon;
  private Point p = new Point();
  private Point old = new Point();
  private boolean myseen = false;
  
  /**
   * Creates a new instance of Solider
   * 
   * @param NameIcon
   * @param startX
   * @param startY
   */
  public Solider(String NameIcon, int startX, int startY) {
    PieceIcon = new pieceIcon( NameIcon);
    X = startX;
    Y = startY;
    p.x = X;
    p.y = Y;
  }
  
  /**
   * returnPieceImage
   * 
   * @return Piece.returnPieceIcon()
   */
  public Image returnPieceImage() {
    return PieceIcon.returnPieceIcon();
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
    p.x = X;
    p.y = Y;
    movedbefore = true;
    myseen = false;
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
   * @return PixelX
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
   * returnY
   * 
   * @return Y
   */
  public int returnY() {
    return Y;
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
   * Canmove
   * 
   * @param x
   * @param y
   * @param typeColor
   * @return
   */
  public boolean Canmove(int x, int y, String typeColor) {
    if ((typeColor.equals( "black"))) {
      if ((((y - 1 == Y) && (x == (X)))) /* &&!Check_Solider_Sees(x,y) */) {
        return true;
      } else if ((((y - 2 == Y) && (x == (X)))) && !movedbefore) {
        return true;
      } else if ((y - 1 == Y && x + 1 == (X) || (y - 1 == Y && x - 1 == (X))) && myseen) {
        return true;
      } else
        return false;
    } else if (typeColor == "white") {
      if (((y + 1 == Y) && (x == (X))) /* &&!Check_Solider_Sees(x,y) */) {
        return true;
      } else if ((((y + 2 == Y) && (x == (X)))) && !movedbefore) {
        return true;
      } else if ((y + 1 == Y && x + 1 == (X) || (y + 1 == Y && x - 1 == (X))) && myseen) {
        return true;
      } else
        return false;
    }
    return false;
  }
  
  /**
   * PieceInMYway
   * 
   * @param x
   * @param y
   * @param othersPostion
   * @param typeColor
   * @return
   */
  public boolean PieceInMYway(int x, int y, Point othersPostion, String typeColor) {
    if (Y - y == 2 || Y - y == -2) {
      if ((typeColor.equals( "black"))) {
        if ((((y - 1 == othersPostion.y) && (x == (othersPostion.x)))) && !movedbefore) {
          return true;
        } else
          return false;
      } else if (typeColor.equals( "white")) {
        if (((y + 1 == othersPostion.y) && (x == (othersPostion.x)) && !movedbefore)) {
          return true;
        } else
          return false;
      }
    }
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
   * setMYseen
   * 
   * @param newBoolean
   */
  public void setMYseen(boolean newBoolean) {
    myseen = newBoolean;
  }
  
  /**
   * returnMyseen
   * 
   * @return myseen
   */
  public boolean returnMyseen() {
    return myseen;
  }
  
  /**
   * setSeenbychecking
   * 
   * @param newP
   * @param Color
   * @return Seenbychecking
   */
  public boolean setSeenbychecking(Point newP, String Color) {
    myseen = false;
    if ((Color.equals( "black"))) {
      if ((newP.y - 1 == Y && newP.x + 1 == (X) || (newP.y - 1 == Y && newP.x - 1 == (X)))) {
        myseen = true;
        return true;
      } else
        return false;
    } else if (Color.equals( "white")) {
      if ((newP.y + 1 == Y && newP.x + 1 == (X) || (newP.y + 1 == Y && newP.x - 1 == (X)))) {
        myseen = true;
        return true;
      } else
        return false;
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
   * @return "Soldier=(p.x,p.y) "
   */
  public String Tell_me() {
    return "Soldier= (" + p.x + ',' + p.y + ")";
  }
  
}
