package ru.job4j.chess;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test
    void whenFigureNotFoundEx() {
        Logic logic = new Logic();
        Throwable thrown = assertThrows(FigureNotFoundException.class,
                () -> logic.move(Cell.C2, Cell.D2));
        Assertions.assertNotNull(thrown.getMessage());
    }

    @Test
    void whenCellOccupiedEx() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.D2));
        Throwable thrown = assertThrows(OccupiedCellException.class,
                () -> logic.move(Cell.C1, Cell.D2));
        Assertions.assertNotNull(thrown.getMessage());
    }

    @Test
    void whenImpossibleMoveEx() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        Throwable thrown = assertThrows(ImpossibleMoveException.class,
                () -> logic.move(Cell.C1, Cell.C2));
        Assertions.assertNotNull(thrown.getMessage());
    }
}