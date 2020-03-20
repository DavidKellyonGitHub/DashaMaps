package main;

import java.util.Locale;

public class DashaMapOne implements HashMapX{
    private Node[] hashArray = new Node[0];

    public DashaMapOne(){
        int counter = 0;
        for (char i = 'a'; i <= 'z'; i++){
            Node letterNode = new Node(null,(char) i, null);
            this.addNodeToHashArray(letterNode);
        }
    }

    public void addNodeToHashArray(Node newNode){
        int size = this.hashArray.length + 1;
        int counter = 0;
        Node[] placeHolder = new Node[size];
        for (Node currentNode : hashArray){
            placeHolder[counter] = currentNode;
            counter++;
            }
        placeHolder[hashArray.length] = newNode;
        this.hashArray = placeHolder;
    }

    public class Node<T>{
        private Node<T> nextNode;
        private T key;
        private T value;

        public Node(Node<T> nextNode, T key, T value){
            this.nextNode = nextNode;
            this.key = key;
            this.value = value;
        }

        public Node<T> getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node<T> nextNode) {
            this.nextNode = nextNode;
        }

        public T getKey() {
            return key;
        }

        public void setKey(T key) {
            this.key = key;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    private String HashFunctionOne(String input) {
        if (input.length() > 0) {
            return String.valueOf(input.charAt(0)).toLowerCase();
        }
        return null;
    }

    public Node[] getHashArray() {
        return hashArray;
    }

    public void setHashArray(Node[] hashArray) {
        this.hashArray = hashArray;
    }

    @Override
    public void set(String key, String value) {

    }

    @Override
    public String delete(String key) {
        return null;
    }

    @Override
    public String get(String key) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public long size() {
        return 0;
    }

    @Override
    public boolean bucketSize(String key) {
        return false;
    }
}
