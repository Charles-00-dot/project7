/**
 * Read web server data and analyse hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version    2016.02.29
 */
public class LogAnalyzer
{
    /*
     * 1. The busiest time of the day is the 18th hour or 6 oclock at the afternoon. 
     * 2. Person[] people;
     * 3. boolean[] vacant;
     * 4.It was used two times ad there is one bracket of square in each one of it.
     * 5.int[] counts;
     *   boolean[] occupied = new boolean[5000]; 
     * 
     * 
     * 6. double[] readings = new double[60];
     *    String[] refers = new String[90];
     *    TicketMachine[] machines = new TicketMachine[5];
     * 7.  0
     * 8. the parenthesis is the problem and it should be square brackets.
     * 9. It becomes an error.
     * 10.
     * 11.  
     * 12.
     * 13.
     */
    
    
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;
    private double[] marks;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer(String filename)
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader(filename);
        
        
    }
    
    public int numberOfAccess(){
        int total = 0;
        for(int hour = 0 ;hour < hourCounts.length; hour++){
            // total += hourCounts
            
            System.out.println(total);
        }
        return total; 
    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        int hour = 0;
        while(hour < hourCounts.length) {
            System.out.println(hour + ": " + hourCounts[hour]);
            hour++;
        }
        //10
    }
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
        double[] marks = {3.2,4.2,5.3,8.4};
        printGreater(marks, 5);
    }
    //6
    public void declarations(){
        double[] readings = new double[60];
        String[] refers = new String[90];
        // TicketMachine[] machines = new TicketMachine[5];
    }
    
    //11. 
    public void printGreater(double[] marks, double mean){
        for(int index = 0; index <= marks.length-1; index++){
            if(marks[index] > mean){
               System.out.println(marks[index]); 
            }
        }
    }
    
    
    
}
