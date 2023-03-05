import java.util.ArrayList;

public class Zajecia {
    private ArrayList<Student> list= new ArrayList<Student>();

    public void zapiszStudena(Student student){
        if(this.list.size()<10){
            this.list.add(student);
        }
        else{
            System.out.println("Maksymalna liczba studentow zostala osiagnieta");
        }
    }
}

