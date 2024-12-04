package org.example;
class Student
{
    private int id;
    private String name;
    private double score;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public String getRanking() {
        if (score < 5.0) {
            return "Fail";
        } else if (score < 6.5) {
            return "Medium";
        } else if (score < 7.5) {
            return "Good";
        } else if (score < 9.0) {
            return "Very Good";
        } else {
            return "Excellent";
        }
    }
    public Student() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double setScore () {
        return score;
    }
    @Override
    public String toString() {
        return "Student {" + "id = " + id + ", name = " + name + ", score = " + score +
                ", Ranking = " + getRanking()+ '}';
    }
}
