package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static ru.job4j.chess.firuges.Cell.findBy;

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
        int x = position.getX();
        int y = position.getY();
        int size = Math.abs(x - dest.getX());
        Cell[] steps = new Cell[size];
        int deltaX = x < dest.getX() ? 1 : -1;
        int deltaY = y < dest.getY() ? 1 : -1;
        for (int index = 0; index < size; index++) {
            x += deltaX;
            y += deltaY;
            steps[index] = findBy(x, y);
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return Math.abs((dest.getX() - source.getX())) == Math.abs((dest.getY() - source.getY()));
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
