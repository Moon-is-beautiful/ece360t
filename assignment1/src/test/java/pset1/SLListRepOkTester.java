package pset1;

import static org.junit.Assert.*;
import org.junit.Test;
import pset1.SLList.Node;

public class SLListRepOkTester {
    @Test
    public void t0() {
        SLList l = new SLList();
        assertTrue(l.repOk());
    }

    @Test
    public void t1() {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        assertTrue(l.repOk());
        l.last=n;
        assertFalse(l.repOk());
    }

    @Test
    public void t2() {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        assertTrue(l.repOk());
        l.first=n;
        l.first.next=n;
        l.last=l.first;
        assertFalse(l.repOk());
    }

    @Test
    public void t2() {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        assertTrue(l.repOk());
        l.first=n;
        l.first.next=n;
        l.last=l.first;
        assertFalse(l.repOk());
    }
    
    // your code goes here
}