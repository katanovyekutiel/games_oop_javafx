package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        int x1 = position.getX();
        int y1 = position.getY();
        int x2 = dest.getX();
        int y2 = dest.getY();
        if (Math.abs(x2 - x1) != Math.abs(y2 - y1) || (x2 > 7) ||(y2 > 7) || (x2 < 0) || (y2 < 0)) {
            throw new ImpossibleMoveException
                    (String.format("Could not way by diagonal from %s to %s", position, dest);
        } else {
            int moveLenght = Math.abs(x2 - x1);
            Cell[] waySteps = new Cell[moveLenght];
            int horizontal = Integer.compare(x2, x1);
            int vertical = Integer.compare(y2, y1);
            for (int i = 0; i != moveLenght; i++) {
                x2 += horizontal;
                y2 += vertical;
                waySteps[i] = new Cell(x2, y2);
            }
        }
        return ;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return false;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
