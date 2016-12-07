package backend;

/**
 * A stack data structure.
 * 
 * @author Zander Ackerman
 * @version 0.0.1
 * @param <T>
 *            The type of data contained in the stack.
 */
public class Stack<T> {
    // Fields
    private Node<T> headNode;
    private int     length;


    // Constuctor
    /**
     * Creates a new stack.
     */
    public Stack() {
        this.headNode = null;
        this.length = 0;
    }


    // Methods
    /**
     * Adds this new element to the top of the stack.
     * 
     * @param dataPushed
     *            The element being added.
     */
    public void push(T dataPushed) {
        Node<T> newNode = new Node<T>(dataPushed, headNode);
        headNode = newNode;
        length++;
    }


    /**
     * Removes the topmost element of the stack.
     * 
     * @return The removed element.
     */
    public T pop() {
        Node<T> poppedNode = headNode;
        headNode = headNode.getNextNode();
        length--;
        return poppedNode.getData();
    }


    /**
     * Looks at the topmost element of the stack. Does not modify the stack.
     * 
     * @return Topmost data element of the stack.
     */
    public T peek() {
        return headNode.getData();
    }


    /**
     * Clears the stack.
     */
    public void clear() {
        headNode = null;
        length = 0;
    }


    /**
     * Gets the length of the stack.
     * 
     * @return The length of the stack.
     */
    public int getLength() {
        return length;
    }


    /**
     * Checks to see if the stack is empty.
     * 
     * @return true if stack is empty, false if not.
     */
    public boolean isEmpty() {
        return headNode == null;
    }


    /**
     * Creates a string representing this stack.
     * 
     * @return The string representing the stack.
     */
    public String toString() {
        Node<T> currentNode = headNode;
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        while (currentNode != null) {
            builder.append(currentNode.toString());
            if (currentNode.getNextNode() != null) {
                builder.append(", ");
            }
            currentNode = currentNode.getNextNode();
        }
        return builder.toString();
    }


    /**
     * Creates an array representing the stack.
     * 
     * @return An array containing all the data stored in the stack
     */
    public T[] toArray() {
        Object[] array = new Object[length];
        Node<T> currentNode = headNode;
        int count = 0;
        while (currentNode != null) {
            array[count] = currentNode.getData();
            count++;
            currentNode = currentNode.getNextNode();
        }
        // Everything in this array is of type T
        @SuppressWarnings("unchecked")
        T[] returnArray = (T[])array;
        return returnArray;
    }


    /**
     * Checks to see if another object is equal to this stack.
     * 
     * @param other
     *            The object being compared to this.
     */
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (other.getClass().equals(this.getClass())) {
            // We know other is of type Stack<T>
            @SuppressWarnings("unchecked")
            Stack<T> otherStack = (Stack<T>)other;
            if (this.getLength() == otherStack.getLength()) {
                Node<T> otherCurrent = otherStack.headNode;
                Node<T> thisCurrent = this.headNode;
                while (thisCurrent != null) {

                    if (!thisCurrent.equals(otherCurrent)) {
                        return false;
                    }
                    otherCurrent = otherCurrent.getNextNode();
                    thisCurrent = thisCurrent.getNextNode();
                }
                return true;
            }
        }
        return false;
    }

}
