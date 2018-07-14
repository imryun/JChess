package MainFrame.ChessFrame.players.Pieces;

import java.awt.Image;
import java.awt.Toolkit;

/**
 * pieceIcon
 */
public class pieceIcon {
  private Toolkit kit = Toolkit.getDefaultToolkit();
  private Image image;
  
  /**
   * pieceIcon
   * 
   * @param NameIcon
   */
  public pieceIcon(String NameIcon) {
    image = kit.getImage( NameIcon);
  }
  
  /**
   * returnPieceIcon
   * 
   * @return
   */
  public Image returnPieceIcon() {
    return image;
  }
  
}
