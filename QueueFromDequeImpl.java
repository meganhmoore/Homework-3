/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sq_exercises;

import stacksandqueues.*;

/**
 *
 * @author ogm
 * @param <E>
 */
public class QueueFromDequeImpl<E> implements MyQueueIF<E> {

    MyDequeIF<E> myDeque;
    int head;
    int tail;
    int size;
    E[] array;
   
    public QueueFromDequeImpl(E[] array) {
        myDeque = new MyDequeImpl<>(array);
        
    }

    @Override
    public void enqueue(E element) throws FullStructureException {
        myDeque.insertRight(element);
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E dequeue() throws EmptyStructureException {
        return myDeque.removeLeft();
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E peek() throws EmptyStructureException {
        return myDeque.peekLeft();
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        return myDeque.isEmpty();
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isFull() {
        return myDeque.isFull();
        //return(size== array.length);
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void display() {
        myDeque.display();
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
