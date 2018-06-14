package task2;

import java.util.List;

public class TreeHeightCalculator {

    public int calculateTreeHeight(Saka treeToAnalyze){
        if (treeToAnalyze.sakos.isEmpty()){
            return 1;
        } else {
        int h = 1;

        for(Saka s1 : treeToAnalyze.sakos){
            h = Math.max(h, calculateTreeHeight(s1));
        }
        return h+1;
        }
    }
}
