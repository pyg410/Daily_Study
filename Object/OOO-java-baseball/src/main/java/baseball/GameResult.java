package baseball;

import java.util.List;
import java.util.Map;

public class GameResult {

    private final List<CompareBallResultType> compareBallResultTypeList;

    public GameResult(List<CompareBallResultType> compareBallResultTypeList) {
        this.compareBallResultTypeList = compareBallResultTypeList;
    }

    public Map<BallCount, Long> count() {
        return null;
    }
}
