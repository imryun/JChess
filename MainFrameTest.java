package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import MainFrame.ChessFrame.MainFrame;

class MainFrameTest {

    MainFrame m;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        m = new MainFrame();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testStart_Again() {
        m.start_Again();
    }
    
    @Test
    public void testStart_As_Server() {
        m.start_As_Server();
    }

    @Test
    public void testStart_As_Client() {
        m.start_As_Client();
    }
        
}