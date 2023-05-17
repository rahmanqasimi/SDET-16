package Practice;

public class Students {
    String name;
    int sub1;
    int sub2;
    int sub3;
    int avgGrade(int sub1, int sub2, int sub3){
        int avg = (sub1+sub2+sub3)/3;
        return avg;
    }
    Students(String studentName, int cSub1, int cSub2, int cSub3 ){
        name=studentName;
        sub1=cSub1;
        sub2=cSub2;
        sub3=cSub3;
        int avg = (cSub1+cSub2+cSub3)/3;
        System.out.println(studentName+" has "+avg+" average grade.");
    }

    public static void main(String[] args) {

    }

}
