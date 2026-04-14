package Sorting;

//You are given a password. Find the strength of the password.
//
//The password must satisfy certain conditions.
//
//It should be 7-32 characters in length.
//It must contain both Uppercase and Lowercase characters in it.
//It should contain at least one special character.
//It should contain at least one number.
//        Weak - If it satisfies any one condition.
//
//Medium - If it satisfies any two condition.
//
//Good - If it satisfies any three condition.
//
//Strong - If it satisfies all four condition.


public class Question_3 {
    public static void main(String[] args) {
        String password="Jesuvijith@123";
        Question_3 qn3=new Question_3();
        System.out.println(qn3.strengthOfThePassword(password));
    }

    public String strengthOfThePassword(String password){
        int mark=0;
        if(password.length()>=7 && password.length()<=32){
            mark++;
        }
        int upperCase=0;
        int lowerCase=0;
        int numbers=0;
        int specialCharacter=0;
        for(char ch:password.toCharArray()){
            if(Character.isDigit(ch)){
                numbers++;
            }
            else if(ch+'0'>122 && ch+'0'<48){
                specialCharacter++;
            }
            else if(ch+'0'>65 && ch+'0'<90){
                upperCase++;
            }
            else if(ch+'0'>97 && ch+'0'<122) {
                lowerCase++;
            }
        }
        if(upperCase>0 && lowerCase>0) {
            mark++;
        }
        if(numbers>0){
            mark++;
        }
        if(specialCharacter>0){
            mark++;
        }
        if(mark==1)return "Weak";
        if(mark==2)return "Medium";
        if(mark==3)return "Good";
        if(mark==4)return "Strong";
        return "None";
    }
}
