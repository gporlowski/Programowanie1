package pl.sda.gporlowski;

public class MyLinkedList {

    private MyNode startNode;

    public void add(Integer newValue) {
        if(startNode == null) {
            startNode = new MyNode(newValue, null);
        } else {
            MyNode currentNode = startNode;
            while (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = new MyNode(newValue, null);
        }
    }

    public void printAll() {
        if(startNode == null) {
            System.out.println("No data");
        } else {
            MyNode currentNode = startNode;
            System.out.print(currentNode.value);
            while (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode;
                System.out.print(" - " + currentNode.value);
            }
        }
    }
}
