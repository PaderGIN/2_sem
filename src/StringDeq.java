//public class StringDeq extends  {
//
//    public StringDeq() {
//        super();
//    }
//
//    public StringDeq(int i) {
//        super(i);
//    }
//
//    public StringDeq(String str) {
//        super(str.length());
//        for (int i = 0; i < str.length(); i++) {
//            try {
//                this.push(str.charAt(i));
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    //Вернуть индекс предыдущего за данным элемента.
//    private int backword(int index) {
//        return --index < 0 ? array.length - 1 : index;
//    }
//    // Пуст ли дек?
//    public boolean empty(){
//        return super.isEmpty();
//    }
//    // Сделать дек пустым.
//    public void clear(){
//        super.clear();
//    }
//    // Добавить число в конец дека.
//    public void pushBack(char val) throws Exception {
//        if (++size > array.length)
//            throw new Exception();
//
//        array[head = backword(head)] = val;
//    }
//    // Добавить число в начало дека.
//    public void pushFront(char val) throws Exception {
//        super.push(val);
//    }
//    // Удалить последний элемент дека.
//    public char popBack() throws Exception {
//        char val = back();
//        tail = backword(tail);
//        size -= 1;
//        return val;
//    }
//    // Удалить первый элемент дека.
//    public char popFront() throws Exception {
//        return super.pop();
//    }
//    // Получить последний элемент дека (не удаляя его).
//    public char back() throws Exception {
//        if (isEmpty())
//            throw new Exception();
//        return array[tail];
//    }
//    // Получить первый элемент дека (не удаляя его).
//    public char front() throws Exception {
//        return super.front();
//    }
//}