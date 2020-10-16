
import java.util.Scanner; 
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Top ten by points" );
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();  
        
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();  
        
        
        
    }
}
