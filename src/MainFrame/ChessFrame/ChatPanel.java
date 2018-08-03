package MainFrame.ChessFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.UnknownHostException;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.net.Socket;
import java.net.ServerSocket;

import javax.swing.border.TitledBorder;

/**
 * ChatPanel Creates a new instance of ChatPanel
 */
public class ChatPanel extends JPanel {
  private static final long serialVersionUID = 1L;
  
  /**
   * ChatPanel
   */
  public ChatPanel() {
    setSize( 200, 300);
    setLocation( 600, 350);
    TextAreaScroll.setSize( 180, 190);
    TextAreaScroll.setLocation( 10, 0);
    setLayout( null);
    
    TextAreaScroll.setEnabled( false);
    TextFiled.setEnabled( false);
    Sendbutton.setEnabled( false);
    add( TextAreaScroll);
    add( TextFiled);
    add( Sendbutton);
    
    Sendbutton.addActionListener( new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        textArea.append( "\n" + TextFiled.getText());
        if (I_am_What) {
          Send_text_server();
          TextFiled.setText( null);
        } else {
          Send_text_chat();
          TextFiled.setText( null);
        }
      }
    });
    
    TextFiled.addKeyListener( new KeyListener() {
      @Override
      public void keyPressed(KeyEvent e) {
        // System.out.println("okdddd "+e.KEY_PRESSED+" "+e.VK_PAGE_DOWN);
        if (e.getKeyChar() == '\n') {
          textArea.append( "\n" + TextFiled.getText());
          if (I_am_What) {
            Send_text_server();
            TextFiled.setText( null);
          } else {
            Send_text_chat();
            TextFiled.setText( null);
          }
        }
      }
      
      @Override
      public void keyReleased(KeyEvent e) {
      }
      
      @Override
      public void keyTyped(KeyEvent e) {
      }
    });// add(chatPanelScroll);
  }
  
  /**
   * start_chat
   */
  public void start_chat() {
    TextAreaScroll.setEnabled( true);
    TextFiled.setEnabled( true);
    Sendbutton.setEnabled( true);
    
    I_am_What = false;
    try {
      send_socket = new Socket( "127.0.0.1", 5002);
      in2 = new BufferedReader( new InputStreamReader( send_socket.getInputStream()));
      out2 = new PrintWriter( send_socket.getOutputStream());
    } catch (UnknownHostException ex) {
      ex.printStackTrace();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    client_thread.start();
  }
  
  /**
   * Send_text_chat
   */
  public void Send_text_chat() {
    out2.print( TextFiled.getText());
    out2.print( "\r\n");
    out2.flush();
  }
  
  /**
   * Send_text_server
   */
  public void Send_text_server() {
    out1.print( TextFiled.getText());
    out1.print( "\r\n");
    out1.flush();
    
  }
  
  /**
   * listen_chat
   */
  public void listen_chat() {
    TextAreaScroll.setEnabled( true);
    TextFiled.setEnabled( true);
    Sendbutton.setEnabled( true);
    
    I_am_What = true;
    try {
      server_chat = new ServerSocket( 5002);
      chat_socket = server_chat.accept();
      in1 = new BufferedReader( new InputStreamReader( chat_socket.getInputStream()));
      out1 = new PrintWriter( chat_socket.getOutputStream());
      // chat_socket.setSoTimeout(10000);
      myserv_thread.start();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
  
  /**
   * client_chat
   */
  class client_chat extends Thread {
    @Override
    public void run() {
      String receive = null;
      while (true) {
        try {
          receive = in2.readLine();
        } catch (IOException ex) {
          ex.printStackTrace();
        }
        if (receive != null) {
          textArea.append( "\n" + "Other: " + receive);
        }
      }
    }
  }
  
  /**
   * serv_chat
   */
  class serv_chat extends Thread {
    @Override
    public void run() {
      String receive = null;
      while (true) {
        try {
          receive = in1.readLine();
        } catch (IOException ex) {
          ex.printStackTrace();
        }
        if (receive != null) {
          textArea.append( "\n" + "Other: " + receive);
        }
      }
    }
  }
  
  private final mytextArea textArea = new mytextArea( 6, 20);
  private final myTextFiled TextFiled = new myTextFiled( 10);
  private final mybutton Sendbutton = new mybutton();
  private final JScrollPane TextAreaScroll = new JScrollPane( textArea,
      JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
  private Socket chat_socket;
  private ServerSocket server_chat;
  private BufferedReader in1;
  private PrintWriter out1;
  private BufferedReader in2;
  private PrintWriter out2;
  private serv_chat myserv_thread = new serv_chat();
  private Socket send_socket;
  private client_chat client_thread = new client_chat();
  private boolean I_am_What;
  
}

/**
 * mytextArea
 */
class mytextArea extends JTextArea {
  private static final long serialVersionUID = 1L;
  
  mytextArea(int Row_num, int Col_num) {
    super( Row_num, Col_num);
    /*
     * setSize(130,150); setLocation(30,0);
     */
    setEditable( false);
    // TextAreaScroll =new
    // JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    // this.add(TextAreaScroll);
    setBorder( TextBorder);
  }
  
  private final TitledBorder TextBorder = new TitledBorder( "Chat History");
}

/**
 * mybutton
 */
class mybutton extends JButton {
  private static final long serialVersionUID = 1L;
  
  mybutton() {
    setSize( 80, 30);
    setLocation( 50, 230);
    setText( "Send");
  }
}

/**
 * myTextFiled
 */
class myTextFiled extends JTextField {
  private static final long serialVersionUID = 1L;
  
  myTextFiled(int FiledLength) {
    super( FiledLength);
    setSize( 180, 20);
    setLocation( 10, 200);
    
    add( TextAreaScroll);
    this.setToolTipText( "Write Text Here");    
  }
  
  private final JScrollPane TextAreaScroll = new JScrollPane();
}
