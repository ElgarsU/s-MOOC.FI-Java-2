
public class Program {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        // you may try out your class here
        Pipe<String> pipe = new Pipe<>();
        pipe.putIntoPipe("dibi");
        pipe.putIntoPipe("dab");
        pipe.putIntoPipe("dab");
        pipe.putIntoPipe("daa");
        System.out.println("printing results");
        while(pipe.isInPipe()) {
            System.out.println(pipe.takeFromPipe());
        }
        System.out.println("end of results");
        System.out.println("");
        System.out.println("printing results");
        Pipe<Integer> numberPipe = new Pipe<>();
        numberPipe.putIntoPipe(1);
        numberPipe.putIntoPipe(2);
        numberPipe.putIntoPipe(3);

        int sum = 0;
        while(numberPipe.isInPipe()) {
            sum = sum + numberPipe.takeFromPipe();
        }
        System.out.println(sum);
        System.out.println(numberPipe.takeFromPipe());
        System.out.println("end of results");
    }
}
