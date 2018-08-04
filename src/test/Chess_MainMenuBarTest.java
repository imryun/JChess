package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import MainFrame.ChessFrame.MainFrame;
import MainFrame.ChessMenuBar.Chess_MainMenuBar;

class Chess_MainMenuBarTest {
  Chess_MainMenuBar mmb = new Chess_MainMenuBar(new MainFrame());
  
  @BeforeEach
  void setUp() throws Exception {
  }
  
  @Test
  void testChess_MainMenuBar() {
    try { 
      mmb.isDisplayable();
    }catch(Exception ed ) {
      fail(ed);
    }
  }
  
  @Test
  void testGetIpAddress() {
    try { 
      assertEquals("127.0.0.1", mmb.getIpAddress() );
    }catch(Exception ed ) {
      fail(ed);
    }
  }
  
  @Test
  void testGetPortnumber() {
    try { 
      assertEquals("5000", mmb.getPortnumber() );
    }catch(Exception ed ) {
      fail(ed);
    }
  }
  
}
