package theory;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayAndSet {
    private static ArrayList<String> friend = new ArrayList<>();

    private static HashSet<String> moreFriend = new HashSet<>();

    private static void addFriend() {
        friend.add("Anna");
        friend.add("Raisa");
        friend.add("David");
        friend.add("Maria");
        friend.add("John");
    }

    private static void addMoreFriend() {
        moreFriend.add("Nina");
        moreFriend.add("Max");
        moreFriend.add("Dan");
        moreFriend.add("Jim");
        moreFriend.add("Joy");
    }

    public static void printFriend() {
        addFriend();
        System.out.println(friend);
    }

    public static void printMoreFriend() {
        addMoreFriend();
        System.out.println(moreFriend);
    }
}
