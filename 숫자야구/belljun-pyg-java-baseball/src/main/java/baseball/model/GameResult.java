package baseball.model;

import java.util.Map;

public class GameResult {
    private Map<CompareBallResult, Long>  compareBallResultList;

    public GameResult(Map<CompareBallResult, Long> compareBallResultList) {
        this.compareBallResultList = compareBallResultList;
    }

    public String getGameResult(){
        if(compareBallResultList.get(CompareBallResult.STRIKE).toString().equals("3")){
            return "3스트라이크";
        }

        if(compareBallResultList.get(CompareBallResult.MISS).toString().equals("3")){
            return "낫싱";
        }

        return compareBallResultList.get(CompareBallResult.STRIKE).toString() + "스트라이크 "
                + compareBallResultList.get(CompareBallResult.BALL).toString() + "볼";
    }
}
