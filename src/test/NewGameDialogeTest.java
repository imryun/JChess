package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MainFrame.ChessFrame.MainFrame;
import MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.File_MenuItems.newGame_Dialoge.NewGameDialoge;

class NewGameDialogeTest {
  NewGameDialoge ng = new NewGameDialoge(new MainFrame());
  @Test
  void testNewGameDialoge() {
    assertEquals("New Game",ng.getTitle());
  }
  
  @Test
  void testGetIpAddress() {
    assertEquals("127.0.0.1", ng.GetIpAddress());
  }
  
  @Test
  void testGetPortnumber() {
    assertEquals("5000",ng.GetPortnumber());
  }
  
}
