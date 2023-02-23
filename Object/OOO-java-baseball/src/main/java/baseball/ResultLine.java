package baseball;

import java.util.Map;

public class ResultLine implements Line {

    private Map<BallCount, Long>  result;

    public ResultLine(Map<BallCount, Long> result) {
        this.result = result;
    }

    @Override
    public String speak() {
        return null;
    }
}
