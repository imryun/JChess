package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import MainFrame.ChessFrame.MainFrame;
import MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.File_MenuItems.New_Item;

class New_ItemTest {
  New_Item ni = new New_Item(new MainFrame());
  
  @Test
  void testNew_Item() {
    assertEquals("New Game",ni.getText());
  }
  
  @Test
  void testGetIpAddress() {
    assertEquals("127.0.0.1", ni.getIpAddress());
  }
  
  @Test
  void testGetportNumber() {
    assertEquals("5000",ni.getportNumber());
  }
  
}
