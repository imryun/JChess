package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import MainFrame.ChessFrame.MainFrame;

class MainFrameTest {
  
  MainFrame m = new MainFrame();
  
  @Test
  public void testStart_Again() {
    try {
      m.start_Again();
    } catch (Exception ed) {
      fail( ed);
    }
  }
  
  @Test
  public void testStart_As_Server() {
    
    try {
      m.start_As_Server();
    } catch (Exception ed) {
      fail( ed);
    }
    
  }
  
  @Test
  public void testStart_As_Client() {
    
    try {
      m.start_As_Client();
    } catch (Exception ed) {
      fail( ed);
    }
    
  }
  
}