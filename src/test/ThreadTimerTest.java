package test;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JLabel;

import org.junit.jupiter.api.Test;

import MainFrame.ChessFrame.ThreadTimer.ThreadTimer;

class ThreadTimerTest {
  ThreadTimer tt = new ThreadTimer(new JLabel());
  @Test
  void testRun() {//TODO: not sure how to test this
    //tt.run();tt.interrupt();
  }
  
  @Test
  void testThreadTimer() {
    // TODO: not sure how to test this
    fail( "Not yet implemented"); // TODO
  }
  
}
