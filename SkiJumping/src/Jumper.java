
import java.util.ArrayList;
public class Jumper implements Comparable<Jumper> {

String name;

int totalScore;

ArrayList<Integer> jumpLengths;

Jumper( String n ) {
    
    name = n;
    
    totalScore = 0;
    
    ArrayList<Integer> jL = new ArrayList<Integer>();
    
    jumpLengths = jL;
    
}
        
public String getName(){
    
    return name;
}

public int getPoints(){
    
    return totalScore;
}

public void addPoints( int points){
    
   totalScore += points;
}

    @Override
    public int compareTo(Jumper o) {
        
          return this.getPoints() - o.getPoints();
        
    }
    
    public void addJump( Integer length) {
        
        jumpLengths.add(length);
    }
    
    public ArrayList<Integer> getJumpLengths() {
        
        return this.jumpLengths;
        
    }
     
   

}
