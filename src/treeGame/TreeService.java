package treeGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeService {

    public int treeGames(Tree T) {
        List<Integer> distList = new ArrayList<>();
        List<Integer> distAmounts = new ArrayList<>();
        distList.add(T.x);
        this.visitLeaf(T, distList, distAmounts);
        Collections.sort(distAmounts);
        return distAmounts.get(distAmounts.size()-1);
    }

    private void visitLeaf(Tree leaf, List<Integer> distList, List<Integer> distAmounts) {
        this.checkList(distList, leaf.x);
        if(leaf.l != null) {
            visitLeaf(leaf.l, distList, distAmounts);
        }
        if(leaf.r != null) {
            visitLeaf(leaf.r, distList, distAmounts);
        }
        if (leaf.l == null && leaf.r == null) {
            distAmounts.add(distList.size());
            distList.remove(distList.size()-1);
        }
    }

    private void checkList(List<Integer> distList, int x) {
        if (!distList.contains(x)) {
            distList.add(x);
        }
    }
}
