public class Friend {
    
    String name;
    static int numberoffriends;

    Friend(String name) {
        this.name=name;
        numberoffriends++;
    }

    static void displayFriends() {
        System.out.print("You have "+numberoffriends+" friends");
    }
}
