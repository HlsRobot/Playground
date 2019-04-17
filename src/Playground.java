import ransom.MagazineRansomService;
import treeGame.Tree;
import treeGame.TreeService;
import wordMachine.WordMachineService;

public class Playground {

    public static void main(String[] args) {
        final Playground playground = new Playground();
        System.out.println("Tree game: " + playground.playWithTheTreeGame());
        System.out.println("Magazine ransom: " + playground.playWithMagazineRansom());
        System.out.println("Word machine: " + playground.playWithTheWordMachine());
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

    private int playWithTheWordMachine() {
        final WordMachineService wordMachineService = new WordMachineService();
        final String command = "13 DUP 4 POP 5 DUP + DUP + -";
        return wordMachineService.wordMachine(command);
    }
}
