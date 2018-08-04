package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import MainFrame.ChessFrame.MainFrame;
import MainFrame.ChessMenuBar.ChessBar_Menus.File_Menu;

class File_MenuTest {
  File_Menu fm = new File_Menu(new MainFrame());
  @Test
  void testFile_Menu() {
    assertEquals("File", fm.getText());
  }
  
  @Test
  void testGetIPaddress() {
    assertEquals("127.0.0.1",fm.getIPaddress());
  }
  
  @Test
  void testGetportNumber() {
    assertEquals( "5000", fm.getportNumber());
  }
  
}
