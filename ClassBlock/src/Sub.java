public class Sub extends Super {
    int y;
    Sub(int x) {
        super(x);
        y = x;
    }
    Sub(int x, int y) {
        this(x);// x super ile bağlamak için kullanır
    }
}