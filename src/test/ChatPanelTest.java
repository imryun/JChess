package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import MainFrame.ChessFrame.ChatPanel;

class ChatPanelTest {
  ChatPanel cp = new ChatPanel();
  
  @BeforeEach
  void setUp() throws Exception {
  }
  
  @Test
  void testChatPanel() {
    try {
      cp.getSize();
      assertEquals( true, true);
    } catch (Exception ed) {
      System.out.println( "chatbox produced an exception \n" + ed);
      fail( ed); // there was an exception launching chat box
    }
  }
  
  @Test
  void testStart_chat() {
    try {
      cp.start_chat();
      assertEquals( true, true);
    } catch (Exception ed) {
      System.out.println( "chatbox produced an exception \n" + ed);
      fail( ed); // there was an exception launching chat box
    }
  }
  
  @Test
  void testSend_text_chat() {
    try {
      cp.Send_text_chat();
      assertEquals( true, true);
    } catch (Exception ed) {
      System.out.println( "Send_text_chat produced an exception \n" + ed);
      fail( ed); // there was an exception launching Send_text_chat
    }
  }
  
  @Test
  void testSend_text_server() {
    try {
      cp.Send_text_server();
      assertEquals( true, true);
    } catch (Exception ed) {
      System.out.println( "Send_text_server produced an exception \n" + ed);
      fail( ed); // there was an exception launching Send_text_server
    }
  }
  
  @Test
  void testListen_chat() {
    try {
      cp.listen_chat();
      assertEquals( true, true);
    } catch (Exception ed) {
      System.out.println( "listen_chat produced an exception \n" + ed);
      fail( ed); // there was an exception launching listen_chat
    }
  }
}
