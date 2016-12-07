package backend;

/**
 * Linked Nodes
 * 
 * @author Zander Ackerman
 * @version 0.0.1
 * @param <T>
 *            Type of data node contains
 */
public class Node<T> {

    // Field
    private T       data;
    private Node<T> nextNode;


    // Constructor
    /**
     * Creates a new node with a data element.
     * 
     * @param data
     *            The new node's data element.
     */
    public Node(T data) {
        this.data = data;
        nextNode = null;
    }


    /**
     * Creates a new node with a data element and a nextNode
     * 
     * @param data
     *            The node's data element.
     * @param nextNode
     *            The node connected to this node.
     */
    public Node(T data, Node<T> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }


    // Methods

    /**
     * Sets the node that is connected to this node.
     * 
     * @param newNode
     *            The node that will be connected to this node.
     */
    public void setNextNode(Node<T> newNode) {
        this.nextNode = newNode;
    }


    /**
     * Sets the data for this node.
     * 
     * @param data
     *            What will replace this node's data.
     */
    public void setData(T data) {
        this.data = data;
    }


    /**
     * Gets this node's data.
     * 
     * @return This node's data
     */
    public T getData() {
        return this.data;
    }


    /**
     * Gets the node connected to this node.
     * 
     * @return The next node in the chain
     */
    public Node<T> getNextNode() {
        return nextNode;
    }


    /**
     * Checks to see if another object is equal to this node.
     * 
     * @param other
     *            Other object
     * @return true if equal, false if not
     */
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (this == other) {
            return true;
        }

        if (other.getClass().equals(this.getClass())) {
            // These are the same class, so it is okay to cast
            @SuppressWarnings("unchecked")
            Node<T> otherNode = (Node<T>)other;
            if (this.getData().equals(otherNode.getData())) {
                return true;
            }
        }
        return false;
    }


    public String toString() {
        String outputString = "";
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append(data.toString());
        builder.append("]");
        outputString = builder.toString();
        return outputString;
    }

}
