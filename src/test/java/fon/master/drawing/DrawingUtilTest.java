package fon.master.drawing;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class DrawingUtilTest {

    @Test
    public void testPiramidaZvezdicaWithZero() {
        DrawingUtil drawingUtil = new DrawingUtil();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        drawingUtil.piramidaZvezdica(0);
        assertEquals("", outContent.toString());
        System.setOut(System.out);
    }

    @Test
    public void testObrnutaXpiramidaWithZero() {
        DrawingUtil drawingUtil = new DrawingUtil();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        drawingUtil.obrnutaXpiramida(0);
        assertEquals("", outContent.toString());
        System.setOut(System.out);
    }
}