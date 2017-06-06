package linkedListMethods;

/**
 * Created by btamara on 2017.06.01..
 */
public class Node {
    private Integer data;
    private Node nextNode;

    public Node(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }


    public void setData(Integer data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", nextNode=" + nextNode +
                '}';
    }


}
