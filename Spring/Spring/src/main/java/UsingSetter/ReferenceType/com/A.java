package UsingSetter.ReferenceType.com;

public class A {
    int id;
    B obj;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public A(int id, B obj) {
        this.id = id;
        this.obj = obj;
    }

    public A() {
    }

    @Override
    public String toString() {
        return "A{" +
                "id=" + id +
                ", obj=" + obj +
                '}';
    }

    public B getObj() {
        return obj;
    }

    public void setObj(B obj) {
        this.obj = obj;
    }
}
