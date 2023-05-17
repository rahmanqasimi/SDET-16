package Homework;

public class Hw7 {
    char getGrade(int score){
        char grade;
        if(score>90){
            grade ='A';
        } else if (score>80) {
            grade = 'B';
        } else if (score>70) {
            grade = 'C';
        } else if (score>60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public static void main(String[] args) {
        Hw7 obj = new Hw7();
        int score = 79;
        char grade = obj.getGrade(score);
        System.out.println("Grade = "+grade);
    }
}
