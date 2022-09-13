package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06Cards_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        while (firstPlayer.size() > 0 && secondPlayer.size() > 0) {


            int firstPlayerCard=firstPlayer.remove(0);
            int secondPlayerCard=secondPlayer.remove(0);


            if(firstPlayerCard>secondPlayerCard){

                firstPlayer.add(firstPlayerCard);

                firstPlayer.add(secondPlayerCard);


            }else if(secondPlayerCard>firstPlayerCard){

                secondPlayer.add(secondPlayerCard);

                secondPlayer.add(firstPlayerCard);
            }

        }

        if (firstPlayer.size()>0)
            sumAndPrint(firstPlayer, "First");
        else if (secondPlayer.size()>0)
            sumAndPrint(secondPlayer, "Second");
    }
    private static void sumAndPrint(List<Integer> playerWiner, String player){
        int sum = 0;
        for (int element: playerWiner)
            sum+=element;
        System.out.println(player + " player wins! Sum: " + sum);
    }

    private static void compareCards(List<Integer> winnerList, List<Integer> loserList, boolean isCardSame){
        if (!isCardSame) winnerList.add(winnerList.get(0));
        if (!isCardSame) winnerList.add(loserList.get(0));
        winnerList.remove(0);
        loserList.remove(0);
    }
}