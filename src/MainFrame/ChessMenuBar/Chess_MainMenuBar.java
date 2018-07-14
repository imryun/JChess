package MainFrame.ChessMenuBar;

import javax.swing.JMenuBar;

import MainFrame.ChessFrame.MainFrame;
import MainFrame.ChessMenuBar.ChessBar_Menus.Edit_Menu;
import MainFrame.ChessMenuBar.ChessBar_Menus.File_Menu;
import MainFrame.ChessMenuBar.ChessBar_Menus.Help_Menu;
import MainFrame.ChessMenuBar.ChessBar_Menus.Tools_Menu;

/**
 * Creates a new instance of Chess_MainMenuBar
 */
public class Chess_MainMenuBar extends JMenuBar {
  private static final long serialVersionUID = 1L;
  
  public Chess_MainMenuBar(MainFrame ff) {
    Fmenu = new File_Menu( ff);
    add( Fmenu);
    add( Emenu);
    add( Tmenu);
    add( Hmenu);
  }
  
  /**
   * getIpAddress
   * 
   * @return Fmenu.getIPaddress();
   */
  public String getIpAddress() {
    return Fmenu.getIPaddress();
  }
  
  /**
   * getPortnumber
   * 
   * @return Fmenu.getportNumber()
   */
  public String getPortnumber() {
    return Fmenu.getportNumber();
  }
  
  private final File_Menu Fmenu;
  private final Edit_Menu Emenu = new Edit_Menu();
  private final Tools_Menu Tmenu = new Tools_Menu();
  private final Help_Menu Hmenu = new Help_Menu();  
}
