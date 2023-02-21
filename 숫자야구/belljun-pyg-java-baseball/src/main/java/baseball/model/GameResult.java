package baseball.model;

import java.util.Map;

public class GameResult {
    private Map<CompareBallResult, Long>  compareBallResultList;

    public GameResult(Map<CompareBallResult, Long> compareBallResultList) {
        this.compareBallResultList = compareBallResultList;
    }
}
