/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package scrap.heap.refactor;

import org.apache.commons.cli.ParseException;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertNotNull;

public class AppTest {
  @Test
  public void testAppHasAGreeting() {
    App classUnderTest = new App();
    assertNotNull("app should have a greeting", classUnderTest.getGreeting());
  }

    @Test
    public void testAppMain() throws Exception {
        App classUnderTest = new App();
        String[] args = new String[2];
        args[0] = "-c=CHOCOLATE,CHOCOLATE,CIRCLE,SMALL,BROWN";
        args[1] = "-b=RED,mylar,6";
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        PrintStream console = System.out;
        try {
            System.setOut(new PrintStream(bytes));
            App.main(args);
        } finally {
            System.setOut(console);
        }
        assertNotNull("Order params must be there.", bytes.toString());
    }

    @Test(expected = ParseException.class)
    public void testAppMainFailedToParseBalloon() throws Exception {
        App classUnderTest = new App();
        String[] args = new String[2];
        args[0] = "-c=CHOCOLATE";
        args[1] = "-b=RED,mylar";
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        PrintStream console = System.out;
        try {
            System.setOut(new PrintStream(bytes));
            App.main(args);
        } finally {
            System.setOut(console);
        }
    }

    @Test(expected = ParseException.class)
    public void testAppMainFailedToParseCake() throws Exception {
        App classUnderTest = new App();
        String[] args = new String[2];
        args[0] = "-c=CHOCOLATE,CHOCOLATE,CIRCLE,SMALL,BROWN";
        args[1] = "-b=RED,mylar";
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        PrintStream console = System.out;
        try {
            System.setOut(new PrintStream(bytes));
            App.main(args);
        } finally {
            System.setOut(console);
        }
    }
}
