package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import MainFrame.ChessMenuBar.ChessBar_Menus.Help_Menu;

class Help_MenuTest {
  Help_Menu hm = new Help_Menu();
  
  @Test
  void testHelp_Menu() {
    assertEquals("Help", hm.getText());
  }
  
}
