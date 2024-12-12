package entities;

public class Student {
    public String name;
    public double note1, note2, note3;

    public double CalcNote(){
        double totalNote =note1 + note2 + note3;
        if (totalNote >= 60 && totalNote <= 100){
            System.out.println("FINAL GRADE = " + totalNote);
            System.out.println("PASS");
        }else {
            System.out.println("FINAL GRADE = " + totalNote);
            System.out.println("FAILED");
            double missing = 60 - totalNote;
            System.out.println("MISSING = " + missing);
        }
        return totalNote;
    }
}
