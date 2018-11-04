import java.util.ArrayList;

public class Actor {
    private String name;
    private String nameDesignator;
    public ArrayList<String> titles = new ArrayList<>();
    private double score;

    public void setTitle(String t){
        this.titles.add(t);
    }

    public String getNameDesignator() {
        return nameDesignator;
    }

    public void setNameDesignator(String nameDesignator) {
        this.nameDesignator = nameDesignator;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

}