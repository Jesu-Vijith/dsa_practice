package LinearSearch;


import java.util.Arrays;
import java.util.List;

public class StaticIdGenerator {
    String name;
    int age;
    int id;
    private static int idGen;

    public static int idGenerator(){
        idGen=idGen+1;
        return idGen;
    }

    StaticIdGenerator(String name, int age, int id){
        this.name=name;
        this.age=age;
        this.id=id;
    }

    @Override
    public String toString() {
        return  "name= " + name+"\n"+
                "age= " + age+"\n"+
                "id= " + id +"\n"+
                "==================";
    }

    public static void main(String[] args) {
        StaticIdGenerator dummy1=new StaticIdGenerator("VG",21, StaticIdGenerator.idGenerator());
        StaticIdGenerator dummy2=new StaticIdGenerator("VG",21, StaticIdGenerator.idGenerator());
        StaticIdGenerator dummy3=new StaticIdGenerator("VG",21, StaticIdGenerator.idGenerator());
        StaticIdGenerator dummy4=new StaticIdGenerator("VG",21, StaticIdGenerator.idGenerator());
        StaticIdGenerator dummy5=new StaticIdGenerator("VG",21, StaticIdGenerator.idGenerator());
        List<StaticIdGenerator> list= Arrays.asList(dummy1,dummy2,dummy3,dummy4,dummy5);
        for(StaticIdGenerator dummy:list){
            System.out.println(dummy);
        }
    }
}
