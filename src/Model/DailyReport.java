package Model;

/**
 * Created by Administrator on 2017/5/1.
 */
public class DailyReport {
    double totalIncome;
    int totalNumber;
    int childNumber;
    int adultNumber;
    int seniorNumber;
    int studentNumber;

    public DailyReport(){  //每次开始，应该从TXT读入上次的数，此处先暂时写0
        totalIncome = 0;
        totalNumber = 0;
        childNumber = 0;
        adultNumber = 0;
        seniorNumber = 0;
        studentNumber = 0;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public int getAdultNumber() {
        return adultNumber;
    }

    public int getChildNumber() {
        return childNumber;
    }

    public int getSeniorNumber() {
        return seniorNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void addAdult(int income, int number){
        totalIncome += income;
        totalNumber += number;
        adultNumber += number;
    }

    public void addChild(int income, int number){
        totalIncome += income;
        totalNumber += number;
        childNumber += number;
    }

    public void addSenior(int income, int number){
        totalIncome += income;
        totalNumber += number;
        seniorNumber += number;
    }

    public void addStudent(int income, int number){
        totalIncome += income;
        totalNumber += number;
        studentNumber += number;
    }
}
