import java.util.ArrayList;

public class Student {
    public String name;
    public long id;
    public ArrayList<Integer> grades;

    public Student(String name, long id){
        this.name = name;
        this.id = id;
        grades = new ArrayList<Integer>(0);
    }

    // returns the student's id
    public long getId(){ return id;}

    // returns the student's name
    public String getName(){return name;}

    // adds the given grade to the grades list
    public void addGrade(int grade){grades.add(grade);}

    // returns the list of grades
    public ArrayList<Integer> getGrades(){return grades;}

    // returns the average of the students grades
    public double getGradeAverage(){
        double average = 0;
        for(Integer i: grades){
            average += i;
        }
        return average/grades.size();
    }

    public boolean deleteGrade(Integer i){
        return grades.remove(i);
    }

    public boolean updateGrade(Integer grade, Integer newGrade){
        if(grades.contains(grade)){
            grades.set(grades.indexOf(grade), newGrade);
            return true;
        } else return false;
    }
}
