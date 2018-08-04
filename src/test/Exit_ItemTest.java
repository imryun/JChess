package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.File_MenuItems.Exit_Item;

class Exit_ItemTest {
  Exit_Item ei = new Exit_Item();
  @Test
  void testExit_Item() {
    assertEquals("Exit",ei.getText());
  }
  
}
