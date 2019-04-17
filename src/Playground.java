import ransom.MagazineRansomService;
import treeGame.Tree;
import treeGame.TreeService;

public class Playground {

    public static void main(String[] args) {
        final Playground playground = new Playground();
        System.out.println("Tree game: " + playground.playWithTheTreeGame());
        System.out.println("Magazine ransom: " + playground.playWithMagazineRansom());
    }

    private int playWithTheTreeGame() {
        final TreeService treeService = new TreeService();
        final Tree tree = new Tree(4,
                new Tree(5,
                        new Tree(4,
                                new Tree(5, null, null), null), null),
                new Tree(6,
                        new Tree(1, null, null),
                        new Tree(6, null, null)));
        return treeService.treeGames(tree);
    }

    private boolean playWithMagazineRansom() {
        final MagazineRansomService ransomService = new MagazineRansomService();
        final String magazine = "ive got a lovely bunch of coconuts";
        final String ransom = "ive got some coconuts";

        return ransomService.checkIfRansomIsInMagazine(magazine, ransom);
    }
}
