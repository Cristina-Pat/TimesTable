
public class TimesTable
{ 
    // field to hold multiples of some integer from 1 to 10
    private int[] myTimesTable;
    
    // constructor
    public TimesTable()
    {
        myTimesTable = new int[10];
    }
    
    // getter for myTimesTable
    public int[] getMyTimesTable()
    {
        return myTimesTable;
    }

    // populate the array with the times table of the parameter from 1 to 10
    public void populateTimesTable(int x) {
        for(int i = 0; i < myTimesTable.length; i++){
            int z = (i + 1) * x;
            myTimesTable[i] = z;
        }
    }
    
    //print out the complete time table
    public void printTimesTable(){
        for(int i = 0; i < myTimesTable.length; i++){
            int x = myTimesTable[i];
            System.out.println((i+1) + " x " + x/(i+1) + " = " + x);
        }
    }
}
