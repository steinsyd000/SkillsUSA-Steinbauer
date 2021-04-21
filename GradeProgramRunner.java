// Project #2 Grade Program Sydney Steinbauer \\
import java.util.ArrayList;
public class GradeProgramRunner 
{
    public static void main(String[]args){
        ArrayList <Student>grades = new ArrayList<Student>();
        
        // identify five students and their grades
        Student syd = new Student(90, 75.5, 80.9, 89, 81);
        Student grace = new Student(80, 60.5, 81.2, 93, 91);
        Student nat = new Student(85, 85.5, 80.3, 67, 75);
        Student ella = new Student(90, 82, 80.2, 89, 62);
        Student alex = new Student(85, 99, 86.3, 88, 66);

        // add five students
        grades.add(syd);
        grades.add(grace);
        grades.add(nat);
        grades.add(ella);
        grades.add(alex);
        
        double lowestp = 101;
        double lowesta = 101;
        double lowests = 101;
        double lowestm = 101;
        double lowesth = 101;

        double highestp = 0;
        double highesta = 0;
        double highests = 0;
        double highestm = 0;
        double highesth = 0;

        double totalProg = 0;
        double totalArt = 0;
        double totalSci = 0;
        double totalMath = 0;
        double totalHist = 0;

        // iterate through the list for each Student (scores)
        for(int x=0; x<grades.size(); x++){
            double p = grades.get(x).getProgGrade();
            double a = grades.get(x).getArtGrade();
            double s = grades.get(x).getSciGrade();
            double m = grades.get(x).getMathGrade();
            double h = grades.get(x).getHistGrade();
            System.out.print(p + ", ");
            totalProg += p;
            if(p > highestp)
                highestp = p;
            if(p < lowestp)
                lowestp = p;
            System.out.print(a + ", ");
            totalArt += a;
            if(a > highesta)
                highesta = a;
            if(a < lowesta)
                lowesta = a;
            System.out.print(s + ", ");
            totalSci += s;
            if(s > highests)
                highests = s;
            if(s < lowests)
                lowests = s;
            System.out.print(m + ", ");
            totalMath += m;
            if(m > highestm)
                highestm = m;
            if(m < lowestm)
                lowestm = m;
            System.out.println(h + ", ");
            totalHist += h;
            if(h > highesth)
                highesth = h;
            if(h < lowesth)
                lowesth = h;
        }
        System.out.println("Average Programming Grade: " + (totalProg/5));
        System.out.print("Highest Programming Grade: " + highestp);
        System.out.println("   Lowest Programming Grade: " + lowestp);

        System.out.println("Average Art Grade: " + (totalArt/5));
        System.out.print("Highest Art Grade: " + highesta);
        System.out.println("   Lowest Art Grade: " + lowesta);

        System.out.println("Average Science Grade: " + (totalSci/5));
        System.out.print("Highest Science Grade: " + highests);
        System.out.println("   Lowest Science Grade: " + lowests);

        System.out.println("Average Math Grade: " + (totalMath/5));
        System.out.print("Highest Math Grade: " + highestm);
        System.out.println("   Lowest Math Grade: " + lowestm);

        System.out.println("Average History Grade: " + (totalHist/5));
        System.out.print("Highest History Grade: " + highesth);
        System.out.println("   Lowest History Grade: " + lowesth);

        // two new students added
        Student nora = new Student(85, 99, 86.3, 88, 66);
        Student kais = new Student(99, 60, 79, 81, 99);

        grades.add(nora);
        grades.add(kais);
        // remove one student
        grades.remove(nora);

        System.out.println();
        System.out.println("--NEW RESULTS--");

        for(int x=0; x<grades.size(); x++){
            double p = grades.get(x).getProgGrade();
            double a = grades.get(x).getArtGrade();
            double s = grades.get(x).getSciGrade();
            double m = grades.get(x).getMathGrade();
            double h = grades.get(x).getHistGrade();
            System.out.print(p + ", ");
            totalProg += p;
            if(p > highestp)
                highestp = p;
            if(p < lowestp)
                lowestp = p;
            System.out.print(a + ", ");
            totalArt += a;
            if(a > highesta)
                highesta = a;
            if(a < lowesta)
                lowesta = a;
            System.out.print(s + ", ");
            totalSci += s;
            if(s > highests)
                highests = s;
            if(s < lowests)
                lowests = s;
            System.out.print(m + ", ");
            totalMath += m;
            if(m > highestm)
                highestm = m;
            if(m < lowestm)
                lowestm = m;
            System.out.println(h + ", ");
            totalHist += h;
            if(h > highesth)
                highesth = h;
            if(h < lowesth)
                lowesth = h;
        }
        System.out.print("Average Programming Grade: " + (totalProg/5));
        System.out.print("   Highest Programming Grade: " + highestp);
        System.out.println("   Lowest Programming Grade: " + lowestp);

        System.out.print("Average Art Grade: " + (totalArt/5));
        System.out.print("   Highest Art Grade: " + highesta);
        System.out.println("   Lowest Art Grade: " + lowesta);

        System.out.print("Average Science Grade: " + (totalSci/5));
        System.out.print("   Highest Science Grade: " + highests);
        System.out.println("   Lowest Science Grade: " + lowests);

        System.out.print("Average Math Grade: " + (totalMath/5));
        System.out.print("   Highest Math Grade: " + highestm);
        System.out.println("   Lowest Math Grade: " + lowestm);

        System.out.print("Average History Grade: " + (totalHist/5));
        System.out.print("   Highest History Grade: " + highesth);
        System.out.println("   Lowest History Grade: " + lowesth);
    }
}