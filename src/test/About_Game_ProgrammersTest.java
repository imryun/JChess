package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.Help_MenuItems.About_Game_Programmers;

class About_Game_ProgrammersTest {
  
  @Test
  void testAbout_Game_Programmers() {
    About_Game_Programmers g = new About_Game_Programmers();
    assertEquals( "About us", g.getText());
  }
}
