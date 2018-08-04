package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import MainFrame.ChessMenuBar.ChessBar_Menus.Edit_Menu;

class Edit_MenuTest {
  Edit_Menu em = new Edit_Menu();
  @Test
  void testEdit_Menu() {
    assertEquals("Edit", em.getText());
  }
  
}
