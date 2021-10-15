package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest extends TestCase {

    public void testPosition() {
        BishopBlack bishop = new BishopBlack(Cell.A2);
        assertThat(bishop.position(), is(Cell.A2));
    }

    public void testCopy() {
        BishopBlack bishop = new BishopBlack(Cell.A2);
        assertThat(bishop.copy(Cell.B3).position(), is(Cell.B3));
    }

    public void testWay() throws ImpossibleMoveException {
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        BishopBlack bishop = new BishopBlack(Cell.D1);
        assertEquals(expected, bishop.way(Cell.G5));
    }
}