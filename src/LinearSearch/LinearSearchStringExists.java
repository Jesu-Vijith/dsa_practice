package LinearSearch;

public class LinearSearchStringExists {
    static boolean linearSearch(String name,char target){
        for(char letter:name.toCharArray()){
            if(letter==target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String name="David Miller";
        char target='l';
        System.out.println(linearSearch(name,target)?"Character Exist":
                "Character doesn't Exist");
    }
}
