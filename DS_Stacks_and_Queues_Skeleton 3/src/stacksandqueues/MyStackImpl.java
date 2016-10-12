package stacksandqueues;


public class MyStackImpl<E> implements MyStackIF<E> {

    E[] array;
    int size;

    public MyStackImpl(E[] array) {
        this.array = array;
        this.size = 0;
    }  

    public MyStackImpl(Character[] character) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void push(E element) throws FullStructureException {
        if (this.isFull())
            throw new FullStructureException();
        array[size] = element;
        size++;
    }

    @Override
    public E pop() throws EmptyStructureException {
        if (this.isEmpty())
            throw new EmptyStructureException();
        size--;
        return array[size];
    }

    @Override
    public E peek() throws EmptyStructureException {
        if (this.isEmpty())
            throw new EmptyStructureException();
        return array[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public boolean isFull() {
        return (size == array.length);
    }
    
    public void display() {
        for (int i = 0; i < size; i++)
            System.out.print(array[i].toString() + " ");
        System.out.println("");
    }

    
}
