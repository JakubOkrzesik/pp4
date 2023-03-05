import java.util.ArrayList;

public class Fifo {
    private ArrayList<Object> array = new ArrayList<Object>();

    public void add(Object obj){
        array.add(array.size(), obj);
    }

    public void pop(){
        array.remove(0);
    }
}
