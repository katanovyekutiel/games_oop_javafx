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
        if (!isDiagonal(position, dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not way by diagonal from %s to %s", position, dest)
            );
        }
        int x1 = position.getX();
        int y1 = position.getY();
        int x2 = dest.getX();
        int y2 = dest.getY();
        int moveLenght = Math.abs(x2 - x1);
        Cell[] waySteps = new Cell[moveLenght];
        int deltaX = x2 - x1 > 0 ? 1 : -1;
        int deltaY = y2 - y1 > 0 ? 1 : -1;
        for (int i = 0; i != moveLenght; i++) {
            x1 += deltaX;
            y1 += deltaY;
            waySteps[i] = Cell.findBy(x1, y1);
        }
        return waySteps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return Math.abs(dest.getX() - source.getX()) == Math.abs(dest.getY() - source.getY());
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }

}
