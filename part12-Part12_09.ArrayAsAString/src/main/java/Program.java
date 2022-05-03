
public class Program {

    public static void main(String[] args) {
        // Test your method here
    }
    
    public static String arrayAsString(int[][] array) {
        StringBuilder arrayString = new StringBuilder();
        
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                arrayString.append(array[row][column]);
            }
            arrayString.append("\n");
        }
        
        return arrayString.toString();
    }

}
