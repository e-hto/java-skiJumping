
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class JumpWeek {
 
    ArrayList<Jumper> jumpers;
    
    //HashMap< Integer, String> jumpersReverse;
    
    HashMap< String, String> jumpLengths;
    
    private Scanner reader;
    
    public JumpWeek(){
        
        ArrayList<Jumper> jumpGang = new ArrayList<Jumper>();
        
        this.jumpers = jumpGang;
        
       // HashMap< Integer, String> jumpG = new HashMap< Integer, String>();
        
       // this.jumpersReverse = jumpG;
        
        HashMap<String, String> jumpL = new HashMap<String, String>();
        
        this.jumpLengths = jumpL;
        
        Scanner read = new Scanner(System.in);
    
    this.reader = read;
        
    }
    
    public void start() {
        
        System.out.println("Kumpula ski jumping week\n" +
"\n" +
"Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        
        
        
        while( true ) { 
        
      System.out.print("  Participant name: ");
        
      String jumperName = reader.nextLine();
      
      if ( jumperName.equals( "")) { break; }
      
      
      Jumper jumpman = new Jumper( jumperName ); 
      
      jumpers.add ( jumpman);
      
        }
    
       
        System.out.println("\nThe tournament begins!\n");
                
                
        // rounds start

        int i = 1;
        
        while ( true) {
        
                
        System.out.print("Write \"jump\" to jump; otherwise you quit: ");
        
            
      
        if ( ! (reader.nextLine().equals( "jump") )) { System.out.println(""); end(); return; }
        
        System.out.println("");
        
        System.out.println("Round " + i + "\n" +
"\n" +
"Jumping order:");
        
        Collections.sort(jumpers);
        
        int k = 1;
        
        for ( Jumper j : jumpers) {
            
            
            System.out.println("  " + k + ". " + j.getName() + " (" + j.getPoints() + " points)");
            
            k++;
        }
        
            System.out.println("");
        
        
            System.out.println("Results of round " + i);
            
            
          
            
            for ( Jumper jumpBoy : jumpers)  {
                
                String name = jumpBoy.getName();
                
                System.out.println("  "  + name );
                
                // length is random int from 60 to 120
                
                int length = 60 + (int)(Math.random() * ((120 - 60) + 1));
                
               jumpBoy.addJump( length);
                
                System.out.println("    " + "length: " + length );
                
                ArrayList<Integer> votes = new ArrayList<Integer>();
                
                for ( int j = 0 ; j < 5; j++){
                    
                    Integer vote =  10 + (int)(Math.random() * ((20 - 10) + 1));
                    
                    votes.add(vote);
                    
                    
                    
                }
                
                System.out.println("    judge votes: ["  
                        
                        + votes.get(0) +", "
                        + votes.get(1) +", "
                        + votes.get(2) +", "
                        + votes.get(3) +", "
                        + votes.get(4) +"]" );
           
            
                // scores are middle 3 votes + length
                
                Collections.sort( votes);
                
                Integer score = votes.get(1) +
                        + votes.get(2) +
                        + votes.get(3) + length;
                
               jumpBoy.addPoints(score);
            
               //jumpersReverse.put(score, name);
                
            }
        // ****
            
            System.out.println("");
            
        i++;
    }
        
    }
           
public void end(){
    
    System.out.print("Thanks!\n" +
"\n" +
"Tournament results: "
            + "\n"
            + "Position    Name\n"
         );
    
    
int i = 1;
    
// sorting jumpers

Collections.sort(jumpers);
Collections.reverse(jumpers);



    for ( Jumper jumpy : jumpers ) {
        
        
        
        System.out.print(i + "           ");
        
        
     
        
         System.out.println(jumpy.getName() + "(" + 
                 
        // sorted.get(key) 
                 
                 jumpy.getPoints()
                 
                 + " points)" );
        //remove first 8 characters
        
        ArrayList jumpLengths = jumpy.getJumpLengths();
        
        String s = "            jump lengths: ";
        
      String m = "";
        
        for ( int l = 0; l < jumpLengths.size() ; l++) {
            
            if ( !(l == jumpLengths.size() )) { m = " m,"; }
            
            else { m = " m"; }
            
            s = s + jumpLengths.get(l) + m;
            
           // System.out.println(jumpLengths.get(l));
        }
        
      
        
        System.out.println(s);
        
        
        
     i++;
    }
    
  
   
 
    
    
   
}

public Jumper returnJump( String name){

for ( Jumper jumpy : jumpers ) {
    
    if  ( jumpy.getName().equals( name ) ){
        
        return jumpy;
    }
}
    
    Jumper gonzo = new Jumper( "errorWithReturnJump");
    
    return gonzo;


}

}
