public class TowersOfHanoi {

    public static void main(String[] args) {

        int disks = 4;
        move(disks, 1, 3, 2);
    }

    // Move: Move count disks form start to finish using temp for temporary storage

    public static void move(int count, int start, int finish, int temp) {
        if (count == 1) {
            System.out.println("Move a disk from " + start + "to" + finish);
        } else {
            move(count - 1, start, temp, finish);
            System.out.println("Move a disk from " + start + " to " + finish);
            move(count - 1, temp, finish, start);
        }

    }
}
