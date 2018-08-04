package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import MainFrame.ChessFrame.players.Pieces.pieceIcon;

class pieceIconTest {
  pieceIcon pi = new pieceIcon("PI");
  @Test
  void testPieceIcon() {
    assertEquals("class MainFrame.ChessFrame.players.Pieces.pieceIcon", pi.getClass().toString());
  }
  
  @Test
  void testReturnPieceIcon() {
    assertEquals("class sun.awt.image.ToolkitImage",pi.returnPieceIcon().getClass().toString());
  }
  
}
