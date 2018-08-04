package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.Help_MenuItems.About_Chess_Game;

class About_Chess_GameTest {
  
  @Test
  void testAbout_Chess_Game() {
    About_Chess_Game g = new About_Chess_Game();
    assertEquals( "About This Game", g.getText());
  }
  
}
