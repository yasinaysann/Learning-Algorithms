package DataStructures;

import DataStructures.ArraysAndList.Arrays.ArrayList;
import DataStructures.ArraysAndList.Example.GameEntry;
import DataStructures.ArraysAndList.Example.ScoreBoard;
import DataStructures.LinkedList.CircularlyLinkedList;
import DataStructures.LinkedList.DoublyLinkedList;
import DataStructures.LinkedList.SinglyLinkedList;

public class MainDataStructures {
    public static void main(String[] args) {
        // starting  play of Game entry
        GameEntry gameEntry = new GameEntry("test", 1000);
        GameEntry gameEntry2 = new GameEntry("test2", 2000);
        GameEntry gameEntry3 = new GameEntry("test3", 3000);
        GameEntry gameEntry4 = new GameEntry("test4", 4000);
        ScoreBoard scoreBoard = new ScoreBoard(4);

        scoreBoard.add(gameEntry);
        scoreBoard.add(gameEntry2);
        scoreBoard.add(gameEntry3);
        scoreBoard.add(gameEntry4);

        scoreBoard.remove(0);

        System.out.println(scoreBoard.showAll());
        System.out.println("-------------------------------------");
        // ending play of game entry

        // use of SinglyLinkedList<E>
        SinglyLinkedList<Integer> integerSinglyLinkedList = new SinglyLinkedList<>();
        integerSinglyLinkedList.addFirst(15);   // 0.index
        integerSinglyLinkedList.addLast(20);    // 1.index
        System.out.println(integerSinglyLinkedList.first());
        System.out.println(integerSinglyLinkedList.removeFirst()); // remove of 0 index
        System.out.println("-------------------------------------");

        // use of CircularlyLinkedList
        CircularlyLinkedList<String> stringCircularlyLinkedList = new CircularlyLinkedList<>();
        stringCircularlyLinkedList.addFirst("hello");
        stringCircularlyLinkedList.addLast("world");
        System.out.println(stringCircularlyLinkedList.isEmpty());
        System.out.println(stringCircularlyLinkedList.first());
        stringCircularlyLinkedList.rotate();
        System.out.println("-------------------------------------");

        // use of DoublyLinkedList
        DoublyLinkedList<String> stringDoublyLinkedList = new DoublyLinkedList<>();
        stringDoublyLinkedList.addFirst("Hello");
        stringDoublyLinkedList.addLast("World");
        System.out.println(stringDoublyLinkedList.first());
        System.out.println(stringDoublyLinkedList.last());
        System.out.println("--------------------------------------");


        // package DataStructures.ArraysAndList.Arrays;
        // use of arrays
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add(0,"A");
        stringArrayList.add(1,"b");

        ArrayList<Integer> integerArrayList = new ArrayList<>(4);
        integerArrayList.add(0,1);
        integerArrayList.add(1,2);
        integerArrayList.add(2,3);
        integerArrayList.add(3,4);
        System.out.println(integerArrayList.get(0));

    }
}
