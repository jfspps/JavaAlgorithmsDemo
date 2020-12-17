package com.example.javaAlgorithms;

// run algorithms from this class
public class RunAlgorithm {

    public static void main(String[] args){
        System.out.println("Algorithms tested here");

        // build an instance of the algorithm class
        ExampleAlgorithm algorithm = new ExampleAlgorithm();

        // set up data with primitives or boxed types
        String[] names = {"Jim", "Jam", "Jom", "Jum"};

        // pass the data to the algorithm to build the ADT
        ExampleAlgorithm.Node root = algorithm.buildList(names);

        // test the algorithm
        algorithm.findNode(root, "Jom");
        algorithm.findNode(root, "Zoo");
        algorithm.findNode(root, "");

        // multiple algorithms can be run in their own static methods in this class, RunAlgorithm
        runAnotherAlgorithm();
    }

    private static void runAnotherAlgorithm() {
        System.out.println("Here is another demo of a different algorithm");
    }
}
