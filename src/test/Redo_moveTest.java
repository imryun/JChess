package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.Edit_MenuItems.Redo_move;

class Redo_moveTest {
  Redo_move rm = new Redo_move();
  @Test
  void testRedo_move() {
    assertEquals("Redo move",rm.getText());
  }
  
}
