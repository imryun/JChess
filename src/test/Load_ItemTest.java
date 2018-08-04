package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.File_MenuItems.Load_Item;

class Load_ItemTest {
  Load_Item li = new Load_Item();
  @Test
  void testLoad_Item() {
    assertEquals("Load Game",li.getText());
  }
  
}
