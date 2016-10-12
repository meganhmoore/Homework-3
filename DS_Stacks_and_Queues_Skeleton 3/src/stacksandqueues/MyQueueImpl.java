package stacksandqueues;


public class MyQueueImpl<E> implements MyQueueIF<E> {

    int tail;
    int head;
    int size;
    E[] array;

    
    public MyQueueImpl(E[] array) {
        this.array = array;
        head = 0;
        tail = 0;
    }
    
    @Override
    public void enqueue(E element) throws FullStructureException {
        if (this.isFull())
            throw new FullStructureException();
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;        
    }

    @Override
    public E dequeue() throws EmptyStructureException {
        int index;
        if (this.isEmpty())
            throw new EmptyStructureException();
        index = head;
        head = (head + 1) % array.length;
        size--;
        return array[index];
    }

    @Override
    public E peek() throws EmptyStructureException {
        if (this.isEmpty())
            throw new EmptyStructureException();
        return array[head];
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public boolean isFull() {
        return (size == array.length);
    }
    
    public void display(){
        int i;
        if (!(this.isEmpty())){
            i = (tail + array.length - 1) % array.length;
            do {
                System.out.print(array[i]+" ");
                i = (i + array.length - 1) % array.length;
            } while (i != (head + array.length - 1) % array.length);
        }
        System.out.println("");
    }
    
}
