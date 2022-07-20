package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BishopBlackTest {

    @Test
    void whenPositionRight() {
        Figure fig = new BishopBlack(Cell.F8);
        assertThat(fig.position()).isEqualByComparingTo(Cell.F8);
    }

    @Test
    void whenCopyRight() {
        Figure fig = new BishopBlack(Cell.F8);
        fig =  fig.copy(Cell.D6);
        assertThat(fig.position()).isEqualByComparingTo(Cell.D6);
    }

    @Test
    void whenWayIsNotDiagonal() {
        Figure fig = new BishopBlack(Cell.C1);
        Throwable thrown = assertThrows(ImpossibleMoveException.class, () -> fig.way(Cell.H5));
        Assertions.assertNotNull(thrown.getMessage());

    }
}