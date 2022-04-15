public class Deq extends Queue {

    public Deq() {
        super();
    }

    public Deq(int i) {
        super(i);
    }

    private int backword(int index) {
        return --index < 0 ? array.length - 1 : index;
    }

    // Добавить число в конец дека.
    public void pushBack(int val) throws Exception {
        if (++size > array.length)
            throw new Exception();

        array[head = backword(head)] = val;
    }

    // Добавить число в начало дека.
    public void pushFront(int val) throws Exception {
        super.push(val);
    }

    // Удалить последний элемент дека.
    public int popBack() throws Exception {
        int val = back();
        tail = backword(tail);
        size -= 1;
        return val;
    }

    // Удалить первый элемент дека.
    public int popFront() throws Exception {
        return super.pop();
    }

    // Получить последний элемент дека (не удаляя его).
    public int back() throws Exception {
        if (isEmpty())
            throw new Exception();
        return array[tail];
    }

    // Получить первый элемент дека (не удаляя его).
    public int front() throws Exception {
        return super.front();
    }
}