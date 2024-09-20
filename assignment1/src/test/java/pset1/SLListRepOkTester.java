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
        n.elem=true;
        n.next=null;
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
        n.elem=true;
        n.next=n;
        l.first=n;
        l.last=l.first;
        assertFalse(l.repOk());
    }

    @Test
    public void t3() {
        SLList l = new SLList();
        Node n = new Node();
        // your code goes here
        assertTrue(l.repOk());
        Node m= new Node();
        m.elem=true;
        m.next=n;
        n.elem=true;
        n.next=null;
        l.first=m;
        l.last=n;
        assertTrue(l.repOk());
    }
    
    // your code goes here
}