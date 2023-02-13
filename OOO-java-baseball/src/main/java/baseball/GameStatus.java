package baseball;

public enum GameStatus {
    END(true), AGAIN(false);

    private Boolean isEnd;

    GameStatus(Boolean isEnd) {
        this.isEnd = isEnd;
    }

    public static GameStatus of(String endInput) {
        return null;
    }
}
