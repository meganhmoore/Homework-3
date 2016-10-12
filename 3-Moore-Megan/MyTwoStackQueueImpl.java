/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sq_exercises;

import java.util.logging.Level;
import java.util.logging.Logger;
import stacksandqueues.*;

/**
 *
 * @author ogm2
 */
public class MyTwoStackQueueImpl<E> implements MyQueueIF<E> {

    DoubleStackIF<E> stack;

    public MyTwoStackQueueImpl(E[] array) {
        stack = new DoubleStackImpl<>(array);
    }

    @Override
    public void enqueue(E element) throws FullStructureException {
        // TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E dequeue() throws EmptyStructureException {
        // TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E peek() throws EmptyStructureException {
        // TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        // TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isFull() {
        // TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void display() {
        // TO DO
        throw new UnsupportedOperationException("Not supported yet.");
    }
   
}
