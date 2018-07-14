package MainFrame.ChessFrame.players.Pieces;

import java.awt.Image;
import java.awt.Point;

/**
 * Creates a new instance of Queen
 */
public class Queen {
  private int X, Y;
  private Point pixelPoint = new Point();
  private int pixelX, pixelY;
  private boolean havelife = true;
  private pieceIcon PieceIcon;
  private Point p = new Point();
  private Point old = new Point();
  
  /**
   * Creates a new instance of Queen
   * 
   * @param NameIcon
   * @param startX
   * @param startY
   */
  public Queen(String NameIcon, int startX, int startY) {
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
   * setX
   * 
   * @param newX
   */
  public void setX(int newX) {
    X = newX;
    p.x = X;
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
   * setY
   * 
   * @param newY
   */
  public void setY(int newY) {
    Y = newY;
    p.y = Y;
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
   * Canmove
   * 
   * @param x
   * @param y
   * @return
   */
  public boolean Canmove(int x, int y) {
    if (((y == Y) && (x > (X) || (x < X)))) {
      return true;
    } else if ((((y > Y) || (y < Y)) && (x == (X)))) {
      return true;
    } else if ((x - y) == (X - Y)) {
      return true;
    } else if ((x + y) == (X + Y)) {
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
    if (((y == Y) && (x > (X) || (x < (X))))) {
      if ((X < i))
        while ((i != X + 1)) {
          i--;
          if (((othersPostion.y) == j) && ((othersPostion.x == i)))// there Same Color piece
          {
            return true;
          }
        }
      
      else if ((X > i)) {
        while ((i != X - 1)) {
          i++;
          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }
        }
      }
    } else if ((((y > Y) || (y < Y)) && (x == (X)))) {
      if ((Y < j)) {
        while ((j != Y + 1)) {
          j--;
          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }
        }
      } else if ((Y > j)) {
        while ((j != Y - 1)) {
          j++;
          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }
        }
      }
    } else if ((x - y) == (X - Y)) {
      if (x > X && y > Y) {
        while ((j != Y + 1) && (i != X + 1)) {
          j--;
          i--;
          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }
        }
      }
      
      else if (x < X && y < Y)
        
        while ((j != Y - 1) && (i != X - 1)) {
          j++;
          i++;
          
          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }
          
        }
    }
    
    else if ((x + y) == (X + Y)) {
      
      if ((X < i) && (Y > j)) {
        while ((j != Y - 1) && (i != X + 1)) {
          j++;
          i--;
          
          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }
          
        }
        
      }
      
      else if ((X > i) && (Y < j)) {
        while ((j != Y + 1) && (i != X - 1)) {
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
  
  public boolean checkKing(int x, int y, Point othersPostion) {
    int j = y;
    int i = x;
    if (((y == Y) && (x > (X) || (x < (X))))) {
      if ((X < i))
        while ((i != X)) {
          i--;
          if (((othersPostion.y) == j) && ((othersPostion.x == i)))// there Same Color piece
          {
            return true;
          }
        }
      
      else if ((X > i)) {
        while ((i != X)) {
          i++;
          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }
        }
      }
    }
    
    else if ((((y > Y) || (y < Y)) && (x == (X)))) {
      if ((Y < j)) {
        while ((j != Y)) {
          j--;
          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }
        }
      } else if ((Y > j)) {
        while ((j != Y)) {
          j++;
          
          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }
        }
      }
    } else if ((x - y) == (X - Y)) {
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
    } else if ((x + y) == (X + Y)) {
      if ((X < i) && (Y > j)) {
        while ((j != Y) && (i != X)) {
          j++;
          i--;
          if (((othersPostion.y) == j) && ((othersPostion.x == i))) {
            return true;
          }
        }
      } else if ((X > i) && (Y < j)) {
        while ((j != Y) && (i != X)) {
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
   * PieceInMYway
   * 
   * @return new Point()
   */
  public Point GeneratePossible_Moves() {
    return new Point();
  }
  
  /**
   * Tell_me
   * 
   * @return "Queen= (p.x, p.y)"
   */
  public String Tell_me() {
    return "Queen= (" + p.x + ',' + p.y + ")";
  }
}
