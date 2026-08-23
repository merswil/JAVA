public class _03_Swap_Two_Variables {

    public void main(String[] args){

        String x = "fire";
        String y = "fly";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " +x);
        System.out.println("y: " +y);
    }
}
