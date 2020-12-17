package com.example.javaAlgorithms;

// this class defines the algorithm
public class ExampleAlgorithm {

    // inner classes define the ADT and algorithm
    public class Node {

        private Node next;
        private String name;

        public Node(String name) {
            this.name = name;
        }

        public Node setNext(Node structure){
            if (structure != null){
                this.next = structure;
                return this;
            }
            return null;
        }

        public Node getNext() {
            return next;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    // the construction of ADTs is handled by passing primitives or boxed types
    public Node buildList(String[] names){
        if (names.length == 0){
            System.out.println("Nothing to build");
            return null;
        }

        Node rootNode = new Node(names[0]);

        if (names.length > 1){
            Node currentNode = rootNode;
            for (int i = 1; i < names.length; i++){
                Node nextNode = new Node(names[i]);
                currentNode.setNext(nextNode);
                currentNode = nextNode;
            }
        }

        return rootNode;
    }

    // this is the algorithm: search the linked list for a node with a given name
    public Node findNode(Node root, String nodeName){
        if (root == null){
            System.out.println("Root node passed cannot be null");
            return null;
        }

        while (root.getNext() != null){
            if (root.getName().equals(nodeName)){
                System.out.println("Found node with name: " + nodeName);
                return root;
            }

            root = root.getNext();
        }

        System.out.println("Node with name: " + nodeName + " not found");
        return null;
    }
}
