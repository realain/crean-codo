package cleancode.minesweeper.tobe.minesweeper.io;

import cleancode.minesweeper.tobe.minesweeper.board.GameBoard;

public interface OutputHandler {

    public void showGameStartComments();

    public void showBoard(GameBoard board);

    public void showGameWinningComment();

    public void showGameLosingComment();

    public void showCommentForSelectingCell();

    public void showCommentForUserAction();

    public void showExceptionMessage(Exception e);

    public void showSimpleMessage(String message);
}
