public class TwoDArray {
    public static void main(String[] args) {
        
        // PART 1: Creating multiple 1D arrays and combining them
        // Create three separate int arrays representing student scores
        int[] scores1 = {99, 50, 80, 75};
        int[] scores2 = {55, 33, 44, 66};
        int[] scores3 = {45, 55, 65, 95};
        // Combine these arrays into a single 2D array called allScores
        int[][] mindBlowingCollectionOfScores = {scores1, scores2, scores3};
        

        // PART 2: Creating a 2D array directly with initialization
        int[][] differentCollection = new int[3][4];

        
        // Populate it with values (row * 10 + column)
        // .length is how tall the 2D array is
        // [0].length is how wide the array is
        for(int row = 0; row < differentCollection.length; row++){
            for(int col = 0; col < differentCollection[0].length; col++){
                differentCollection[row][col] = row * 10 + col;
            }
        }
        
        
        
        // PART 4: Traversing a 2D array
        // Print out all values in the grades array
        for(int[] row : differentCollection){
            for(int num : row){
                System.out.println(num);
            }
        }
        
        
        
        // PART 5: Display row-centric (standard approach)
        // Display each row on its own line
        System.out.println("\nRow-centric display:");
        for(int[] row2 : differentCollection){
            for(int num2 : row2){
                System.out.print(num2 + " ");
            }
            System.out.println();
        }
        

        //QUIZ PRACTICE
        //Traverse the first array and count how many grades were less than 60
        
        int count = 0;
        for(int[] loopy : mindBlowingCollectionOfScores){
            for(int score : loopy){
                if(score < 60) count++;
            }
        }
        System.out.println("FAIL COUNT: " + count);

        //SAME WAY, BUT TRY TO DO FOR EACH LOOP INSTEAD

        int count2 = 0;
        for(int row = 0; row < mindBlowingCollectionOfScores.length; row++){
            for(int col = 0; col < mindBlowingCollectionOfScores[0].length; col++){
                if(mindBlowingCollectionOfScores[row][col] < 60) count2++;
            }
        }
        System.out.println("FAIL COUNT: " + count2);
        
        
        
        // PART 6: Display column-centric (unusual - not recommended!)
        // WARNING: This is not the typical way to work with 2D arrays
        // Most 2D arrays are stored and accessed row-by-row
        System.out.println("\nColumn-centric display (unusual):");
        
        
        
    }
}