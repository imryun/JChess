package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MainFrame.ChessFrame.StatusPanel;

class StatusPanelTest {
  StatusPanel sp = new StatusPanel();
  @Test
  void testStatusPanel() {
    sp.setToolTipText( "example");
    assertEquals("example", sp.getToolTipText());
  }
  
  @Test
  void testStart_Again() {
    try { sp.start_Again();} catch(Exception ed) {fail(ed);}
  }
  
}
