package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import ru.job4j.chess.firuges.Cell;

import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    void whenPositionRight() {
        BishopBlack fig = new BishopBlack(Cell.F8);
        assertThat(fig.position()).isEqualByComparingTo(Cell.F8);
    }

    @Test
    void whenCopyRight() {
        BishopBlack fig = new BishopBlack(Cell.F8);
        BishopBlack fig1 = (BishopBlack) fig.copy(Cell.D6);
        assertThat(fig1.position()).isEqualByComparingTo(Cell.D6);
    }
}