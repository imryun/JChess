package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.File_MenuItems.Save_Item;

class Save_ItemTest {
  Save_Item si = new Save_Item();
  @Test
  void testSave_Item() {
    assertEquals("Save Game", si.getText());
  }
  
}
