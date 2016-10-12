/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sq_exercises;

import stacksandqueues.EmptyStructureException;
import stacksandqueues.FullStructureException;


public class DoubleStackImpl<E> implements DoubleStackIF<E> {
    
    E[] array;
    int sizeIn, sizeOut;
    int elIn;
    int elOut;

    public DoubleStackImpl(E[] array) {
        this.array = array;
        this.elIn=(array.length)/2; 
        this.elOut=(array.length/2)+1;
    }

    @Override
    public void pushIn(E element) throws FullStructureException {
        
        if(this.isFull())
            throw new FullStructureException("The array is full");
        else if(elIn==0){
            array[elIn]=element;
            elIn=array.length-1;
            sizeIn++;
        }
        else{
            array[elIn]=element;
            elIn--;
            sizeIn++;
        }
            
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E popIn() throws EmptyStructureException {
        if(this.isEmptyIn())
            throw new EmptyStructureException("This stack is empty");
        else if(elIn==array.length-1){
            sizeIn--;
            elIn=0;
            return(array[array.length-1]);
        }
        else{
            sizeIn--;
            elIn++;
            return(array[elIn-1]);
        }
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void pushOut(E element) throws FullStructureException {
        if(this.isFull())
            throw new FullStructureException ("This stack is full");
        else if(elOut==array.length-1){
            array[elOut]=element;
            elOut=0;
            sizeOut++;
        }
        else{
            array[elOut]=element;
            elOut++;
            sizeOut++;
        }
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E popOut() throws EmptyStructureException {
        if(this.isEmptyOut())
            throw new EmptyStructureException("The stack is empty");
        else if(elOut==0){
            elOut=array.length-1;
            sizeOut--;
            return(array[0]);
        }
        else{
            elOut--;
            sizeOut--;
            return(array[elOut+1]);
        }
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isEmpty() {
        return ((sizeOut+sizeIn)==0);
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isFull() {
        return (sizeOut+sizeIn==array.length);
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void display() {
        System.out.println("Stack Out: ");
        int i=0;
        int x=0;
        int elPrintO=(array.length/2)+1;
        int elPrintI=(array.length/2);
        while(i<=sizeOut){
            if(elPrintO==array.length-1){
                System.out.print(array[elPrintO]);
                elPrintO=0;
                i++;
            }
            else{
                System.out.print(array[elPrintO]);
                elPrintO++;
                i++;
            }
        }
        System.out.println();
        System.out.println("Stack In: ");
        while(x<=sizeIn){
            if(elPrintI==0){
                System.out.print(array[elPrintI]);
                elPrintI=array.length-1;
                x++;
            }
            else{
                System.out.print(array[elPrintI]);
                elPrintI--;
                x++;
            }
        }
        System.out.println();
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E peekIn() throws EmptyStructureException {
        if(this.isEmptyIn())
            throw new EmptyStructureException("There are no elements");
        else 
            return this.array[elIn];
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmptyIn() {
        return(sizeIn==0);
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E peekOut() throws EmptyStructureException {
        if(this.isEmptyOut())
            throw new EmptyStructureException("There are no elements");
        else 
            return this.array[elOut];
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmptyOut() {
        return(sizeOut==0);
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
