package chapters.chapter6;

public class TowerOfHanoi {
    public void move(int numberOfDisks, char towerFrom, char towerTo, char towerIntermediate) {
        if (numberOfDisks == 1) {
            System.out.println("Moving disc 1 from " + towerFrom + " to " + towerTo);

            return;
        }

        move(numberOfDisks - 1, towerFrom, towerIntermediate, towerTo);
        System.out.println("Moving disc " + numberOfDisks + " from " + towerFrom + " to " + towerTo);
        move(numberOfDisks - 1, towerIntermediate, towerTo, towerFrom);
    }
}
