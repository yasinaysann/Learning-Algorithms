package DataStructures.LinkedList;

public class SinglyLinkedList<E> {
    // nested Node class
    private static class Node<E>{
        private  E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement(){
            return element;
        }
        public Node<E> getNext(){
            return next;
        }
        public void setNext(Node<E> n){
            next = n;
        }
    }

    // instance variables of the SinglyListedList
    private Node<E> head = null;    // head node of the list (or null if empty)
    private Node<E> tail = null;    // last node of the list (or null if empty)
    private int size = 0;           // number of nodes in the list
    // construct an initially empty list
    public SinglyLinkedList(){

    }
    // access methods
    public int size() {
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    // return the first element
    public E first(){
        if (isEmpty()) return null;
        return head.getElement();
    }
    // return the last element
    public E last(){
        if (isEmpty()) return null;
        return tail.getElement();
    }

    // update methods
    public void addFirst(E e){
        head = new Node<>(e,head);
        if (size == 0)
            tail = head;
        size++;
    }

    public void addLast(E e){
        Node<E> newest = new Node<>(e,null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        size++;
    }

    public E removeFirst(){
        if (isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return answer;
    }
    //  Equivalence Testing with Linked Lists
    public boolean equals(Object o){
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SinglyLinkedList<E> other = (SinglyLinkedList<E>) o;    // use nonparameterized type
        if (size != other.size) return false;
        Node walkA = head;                                      // traverse the primary list
        Node walkB = other.head;                                // traverse the secondary list
        while (walkA != null){
            if (!walkA.getElement().equals(walkB.getElement())) return false;
            walkA = walkA.getNext();
            walkB = walkB.getNext();
        }
        return true;                        // if we reach this, everything matched successfully
    }



}
