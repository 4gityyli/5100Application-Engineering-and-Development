
import java.util.Collections;
import java.util.List;
import java.util.Arrays;


public class hierachy {
  private String name;
  private int id;
  private List<Integer> Scores;
  
  public hierachy(String name, int id, List<Integer> Scores) {
    this.name = name;
    this.id = id;
    this.Scores = Scores;
  }
  
  public String getName() {
    return this.name;
  }
  
  public int getId() {
    return this.id;
  }

  public List<Integer> getScores() {
    return this.Scores;
  }
  
  public double getAverageScore() {
    double total = 0;
    for (int score : Scores) {
      total += score;
    }
    return total / Scores.size();
  }
}

class PartTime extends hierachy {

  public PartTime(String name, int id, List<Integer> Scores) {
    super(name, id, Scores);
  }
}

class FullTime extends hierachy {
  private List<Integer> examScores;
  
  public FullTime(String name, int id, List<Integer> Scores, List<Integer> examScores) {
    super(name, id, Scores);
    this.examScores = examScores;
  }
  
  public List<Integer> getExamScores() {
    return this.examScores;
  }
}

