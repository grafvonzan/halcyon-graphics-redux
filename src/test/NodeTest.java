package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import backend.Node;

/**
 * Tests the node class.
 * 
 * @author Zander Ackerman
 * @version 0.0.1
 */
public class NodeTest {

    private Node<String> nodeA;
    private Node<String> nodeB;
    private Node<String> nodeAclone;
    private Node<String> nodeNull;
    private Object       object;


    /**
     * Sets up test cases.
     */
    @Before
    public void setUp() {
        nodeB = new Node<String>("Beta");
        nodeA = new Node<String>("Alpha", nodeB);
        nodeAclone = new Node<String>("Alpha");
    }


    /**
     * Tests methods related to the nextNode field.
     */
    @Test
    public void testNextNode() {
        nodeAclone.setNextNode(nodeB);
        assertEquals(nodeB, nodeAclone.getNextNode());
    }


    /**
     * Tests methods related to the data field.
     */
    @Test
    public void testData() {
        nodeAclone.setData("New");
        assertEquals("New", nodeAclone.getData());
    }


    /**
     * Tests the equals method.
     */
    @Test
    public void testEqualsObject() {
        assertTrue(nodeA.equals(nodeAclone));
        assertTrue(nodeA.equals(nodeA));
        assertFalse(nodeA.equals(nodeB));
        assertFalse(nodeA.equals(nodeNull));
        assertFalse(nodeA.equals(object));
    }


    /**
     * Tests toString() functionality.
     */
    @Test
    public void testToString() {
        assertEquals("[Alpha]", nodeA.toString());
    }

}
