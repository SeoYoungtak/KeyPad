import java.util.Arrays;

public class KeyPad {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String answer = "";
        String hand = "right";
        String right = "*", left = "#";

        System.out.println(Arrays.toString(numbers));
        System.out.println(hand);

        for(int i=0; i < numbers.length; i++){
            if(numbers[i] == 1 || 
               numbers[i] == 4 ||
               numbers[i] == 7 )
            {
                answer += "L";
                left = String.valueOf(numbers[i]);
            }

            if(numbers[i] == 3 ||
               numbers[i] == 6 ||
               numbers[i] == 9 )
            {
                answer += "R";   
                right = String.valueOf(numbers[i]);
            }

            if(numbers[i] == 2 ||
               numbers[i] == 4 ||
               numbers[i] == 8 ||
               numbers[i] == 0 )
            {
                
            }
        }

        System.out.println(answer);
    }

    String checkHand(int num, String right, String left)
    {
        String hand = "";

        if(num == 2)
        {
            
        }

        return hand;
    }
}