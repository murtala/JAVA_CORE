package exercises.example6_9;

interface IStack {                                                // (1)
    void   push(Object item);
    Object pop();
}

class StackImpl implements IStack {                               // (2)
    protected Object[] stackArray;
    protected int      tos;  // top of stack

    public StackImpl(int capacity) {
        stackArray = new Object[capacity];
        tos        = -1;
    }

    public void push(Object item)                                 // (3)
        { stackArray[++tos] = item; }

    public Object pop() {                                         // (4)
        Object objRef = stackArray[tos];
        stackArray[tos] = null;
        tos--;
        return objRef;
    }

    public Object peek() { return stackArray[tos]; }
}

interface ISafeStack extends IStack {                             // (5)
    boolean isEmpty();
    boolean isFull();
}

class SafeStackImpl extends StackImpl implements ISafeStack {     // (6)

    public SafeStackImpl(int capacity) { super(capacity); }
    public boolean isEmpty() { return tos < 0; }                  // (7)
    public boolean isFull() { return tos >= stackArray.length-1; }// (8)
}
public class StackUser {

    public static void main(String[] args) {                      // (9)
        SafeStackImpl safeStackRef  = new SafeStackImpl(10);
        StackImpl     stackRef      = safeStackRef;
        ISafeStack    isafeStackRef = safeStackRef;
        IStack        istackRef     = safeStackRef;
        Object        objRef        = safeStackRef;

        safeStackRef.push("Dollars");                             // (10)
        stackRef.push("Kroner");
        System.out.println(isafeStackRef.pop());
        System.out.println(istackRef.pop());
        System.out.println(objRef.getClass());
    }
}
