package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.jupiter.api.Assertions.*;

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
    void whenWayRight() {
        Figure fig = new BishopBlack(Cell.C1);
        fig =  fig.copy(Cell.D6);
        assertThat(fig.position()).isEqualByComparingTo(Cell.D6);
    }
}