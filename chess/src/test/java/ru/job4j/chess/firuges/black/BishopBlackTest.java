package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest extends TestCase {

    public void testPosition() {
        new BishopBlack(Cell.C8);
        exepted = Cell.C8;
        assertEquals(position();
    }

    public void testCopy() {
        new BishopBlack(Cell.C8);
        exepted = Cell.C8;
        assertEquals(Figure.copy(equals(exepted)));
    }

    public void testWay() {
        new BishopBlack(Cell.C1);

    }
}