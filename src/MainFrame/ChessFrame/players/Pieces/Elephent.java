package MainFrame.ChessFrame.players.Pieces;

import java.awt.Image;
import java.awt.Point;

/**
 * Creates a new instance of Elephent
 */
@SuppressWarnings("unused")
public class Elephent {
  private int X, Y;
  private Point pixelPoint = new Point();
  private int pixelX, pixelY;
  private boolean havelife = true;
  private pieceIcon PieceIcon;
  private Point p = new Point();
  private Point old = new Point();
  
  /**
   * Constructor for new Elephent Object
   * 
   * @param NameIcon
   * @param startX
   * @param startY
   */
  public Elephent(String NameIcon, int startX, int startY) {
    PieceIcon = new pieceIcon( NameIcon);
    X = startX;
    Y = startY;
    p.x = X;
    p.y = Y;
  }
  
  /**
   * Elephent
   * 
   * @return (Point) p.clone()
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
    p.x = newPoint.x;
    p.y = newPoint.y;
    X = p.x;
    Y = p.y;
  }
  
  /**
   * setX
   * 
   * @param newX
   */
  public void setX(int newX) {
    X = newX;
    p.x = newX;
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
   * toOld
   * 
   * @param Old
   */
  public void toOld(Point Old) {
    p.x = Old.x;
    p.y = Old.y;
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
   * @return pixelPoint
   */
  public Point getpixelPoint() {
    return pixelPoint;
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
   * @return (p.x == x && p.y == y) true ? false
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
   * @return
   */
  public boolean Canmove(int x, int y) {
    
    int j = y;
    int i = x;
    if ((x - y) == (X - Y)) {
      return true;
    }
    //////////////////////////////////////////////////////////////////////////////////////////
    else if ((x + y) == (X + Y)) {
      return true;
    } else {
      return false;
    }
  }
  
  /**
   * PieceInMYway
   * 
   * @param x
   * @param y
   * @param othersPostion
   * @return
   */
  public boolean PieceInMYway(int x, int y, Point othersPostion) {
    int j = y;
    int i = x;
    if ((x - y) == (X - Y)) {
      if (x > X && y > Y) {
        while ((j != Y + 1) && (i != X + 1)) {
          j--;
          i--;
          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }
        }
      } else if (x < X && y < Y)
        while ((j != Y - 1) && (i != X - 1)) {
          j++;
          i++;
          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }
        }
    } else if (((x + y)) == ((X + Y))) {
      if ((X < i) && (Y > j)) {
        while (((j != Y - 1)) && ((i != X + 1))) {
          j++;
          i--;
          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }
        }
      } else if ((X > i) && (Y < j)) {
        while ((j != X + 1) && (i != X - 1)) {
          j--;
          i++;
          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  /**
   * checkKing
   * 
   * @param x
   * @param y
   * @param othersPostion
   * @return
   */
  public boolean checkKing(int x, int y, Point othersPostion) {
    int j = y;
    int i = x;
    if ((x - y) == (X - Y)) {
      if (x > X && y > Y) {
        while ((j != Y) && (i != X)) {
          j--;
          i--;
          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }
        }
      } else if (x < X && y < Y)
        while ((j != Y) && (i != X)) {
          j++;
          i++;
          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }
        }
    } else if (((x + y)) == ((X + Y))) {
      if ((X < i) && (Y > j)) {
        while (((j != Y)) && ((i != X))) {
          j++;
          i--;
          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }
        }
      } else if ((X > i) && (Y < j)) {
        while ((j != X) && (i != X)) {
          j--;
          i++;
          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }
        }
      }
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
   * @return Elephent= ( p.x,p.y )
   */
  public String Tell_me() {
    return "Elephent= (" + p.x + ',' + p.y + ")";
  }
}
