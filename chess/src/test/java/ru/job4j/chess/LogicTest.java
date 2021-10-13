package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

public class LogicTest {

    @Ignore
    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test(expected = FigureNotFoundException.class)
    public void whenFigureNotFound()
            throws FigureNotFoundException {
        Logic logic = new Logic();
        logic.move(Cell.C1, Cell.H6);
    }

    @Test(expected = ImpossibleMoveException.class)
    Logic.add(new BishopBlack(Cell.C1));
    public void whenImpossibleMove()
            throws ImpossibleMoveException {
        Logic logic = new Logic();
        logic.move(Cell.C1, Cell.A5);
    }

    @Test(expected = OccupiedCellException.class)
    Logic.add(new BishopBlack(Cell.C1));
    Logic.add(new PawnBlack(Cell.B2));
    public void whenOccupiedCell()
            throws OccupiedCellException {
        Logic logic = new Logic();
        logic.move(Cell.C1, Cell.A3);
    }
}