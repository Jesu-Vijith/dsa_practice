package RecursionString.BasicQuestions;

public class SkipAWord {
    public static void main(String[] args) {
        System.out.println(skipWord("gwaewaskypiea"));
        System.out.println(skipAppNotApple("yuafappsydsa"));
    }

    static String skipWord(String word){
        if(word.isEmpty()){
            return "";
        }
        char ch=word.charAt(0);
        if(word.startsWith("sky")){
            return skipWord(word.substring(3));
        }
        else{
            return ch+skipWord(word.substring(1));
        }
    }

    static String skipAppNotApple(String word){
        if(word.isEmpty()){
            return "";
        }
        char ch=word.charAt(0);
        if(word.startsWith("app") && !word.startsWith("apple")){
            return skipAppNotApple(word.substring(3));
        }
        else{
            return ch+skipAppNotApple(word.substring(1));
        }
    }
}
