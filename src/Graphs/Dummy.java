public class Dummy {
    static Integer freshOrange=0;
    public int dummyMethod(){
        for(int i=0;i<5;i++){
            freshOrange++;
        }
        return 1;
    }

    static void main() {
        Dummy d1=new Dummy();
        d1.dummyMethod();
        System.out.println(freshOrange);
    }
}
