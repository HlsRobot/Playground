import treeGame.Tree;
import treeGame.TreeService;

public class Playground {

    public static void main(String[] args) {
        final Tree tree = new Tree(4,
                new Tree(5,
                        new Tree(4,
                                new Tree(5, null, null), null), null),
                new Tree(6,
                        new Tree(1, null, null),
                        new Tree(6, null, null)));
        final TreeService treeService = new TreeService();
        System.out.println(treeService.treeGames(tree));
    }
}
