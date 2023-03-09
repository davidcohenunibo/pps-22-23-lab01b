package e2;

import e2.model.Board;
import e2.model.BoardImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    private static final int SIZE = 5;
    private static final int MINES = 5;
    private Board board;

    @BeforeEach
    void setUp() {
        this.board = new BoardImpl(SIZE,MINES);
    }

    @Test
    void testBoardSize() {
        assertEquals(SIZE, this.board.size());
    }

    @Test
    void testBoardBombs() {
        assertEquals(MINES, this.board.getMines());
    }
}
