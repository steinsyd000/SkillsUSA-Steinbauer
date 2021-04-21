// Project #2 Grade Program Sydney Steinbauer \\
import java.util.*;
public class Student 
{
    // five classes
    private double prog;
    private double art;
    private double sci;
    private double math;
    private double hist;
    
    public Student(){
    }

    public Student(double prog, double art, double sci, double math, double hist)
    {
        this.prog = prog;
        this.art = art;
        this.sci = sci;
        this.math = math;
        this.hist = hist;
    }

    // setters
    public void setProgGrade(double prog){
        this.prog = prog;
    }
    public void setArtGrade(double art){
        this.art = art;
    }
    public void setSciGrade(double sci){
        this.sci = sci;
    }
    public void setMathGrade(double math){
        this.math = math;
    }
    public void setHistGrade(double hist){
        this.hist = hist;
    }

    // getters
    public double getProgGrade(){
        return this.prog;
    }
    public double getArtGrade(){
        return this.art;
    }
    public double getSciGrade(){
        return this.sci;
    }
    public double getMathGrade(){
        return this.math;
    }
    public double getHistGrade(){
        return this.hist;
    }
}