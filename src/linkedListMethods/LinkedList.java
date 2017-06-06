package linkedListMethods;

/**
 * Created by btamara on 2017.06.01..
 */
public class LinkedList {

    private Node root;
    private int sizeCounter;

    public void insert(Integer data) {
        ++this.sizeCounter;
        if (root == null) {
            root = new Node(data);

        } else {
            insertDataBeginning(data);
        }
    }

    private void insertDataBeginning(Integer data) {
        Node newNode = new Node(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }

    private void insertDataEnd(Integer data, Node node) {
        if (node.getNextNode() != null) {
            insertDataEnd(data, node.getNextNode());
        } else {
            Node newNode = new Node(data);
            node.setNextNode(newNode);
        }
    }


    public void remove(Integer data) {
        if (this.root == null) {
            return;
        }
        --this.sizeCounter;
        if (this.root.getData().compareTo(data) == 0) {
            this.root = this.root.getNextNode();
        } else {
            remove (data, root, root.getNextNode());

        }
    }
    private void remove(Integer dataToRemove, Node previousNode, Node actualNode) {
        while (actualNode != null) {
            if (actualNode.getData().compareTo(dataToRemove) == 0) {
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }
            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }


    public void traverseList() {

        if (root == null) return;
        Node node = this.root;
        while (node != null) {
            System.out.print(node.toString() + " ");
            node = node.getNextNode();
        }
    }


    public int size() {
        return this.sizeCounter;
    }

    public void deleteDuplicates(){
        //write code  to remove duplicates from an unsorted  linkedlist.

        Node current = this.root;
        while (current != null) {
            Node next = current.getNextNode();
            while (next != null) {
                if (current.getData() == next.getData()) {
                    current.setNextNode(next.getNextNode());
                    break;
                }
                next = next.getNextNode();
            }
            current = current.getNextNode();
        }
    }

    public void findTheKthElement(int kthElement){
        int counter = 0;
        if (root == null) return;
        Node node = this.root;
        while (node != null) {
            ++counter;
            if(counter == kthElement){
                System.out.println(node.toString());
            }
            node = node.getNextNode();
        }
    }

    public void removeMiddle(){
        int middle = sizeCounter/2;
        remove(middle);
        traverseList();
    }

}
