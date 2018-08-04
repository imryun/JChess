package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import MainFrame.ChessMenuBar.ChessBar_Menus.Menu_Items.Tool_MenuItems.Options;

class OptionsTest {
  Options o = new Options();
  
  @Test
  void testOptions() {
    assertEquals("Options",o.getText());
  }
  
}
