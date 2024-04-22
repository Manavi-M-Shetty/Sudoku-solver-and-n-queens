import java.util.ArrayList;
import java.util.List;

import board.Board;
import player.Player;
import triple.Triple;
import game.Game;
import game.NQueenGame;
import board.Queenboard;

public class App {
    public static void main(String[] args) throws Exception {
        Player p=new Player(20,"Manavi");
        System.out.println(p.getPlayerName()+" ");
       /* Board b=new Board(9);
         b.setuoBoardConfig(0, 0, 3);
        b.setuoBoardConfig(0, 2, 6);
        b.setuoBoardConfig(0, 3, 5);
        b.setuoBoardConfig(0, 5, 8);
        b.setuoBoardConfig(0, 6, 4);
        List<Integer> col= new ArrayList<>();
        List<Integer> val= new ArrayList<>();

        col.add(0);
        col.add(1);

         val.add(5);
         val.add(6);

         b.setupColumnwise(1,col,val);

         List<Triple>triple=new ArrayList<>();
         triple.add(new Triple(2,1,8));
         triple.add(new Triple(2,2,7));
         triple.add(new Triple(2,7,3));
         triple.add(new Triple(2,8,1));
         triple.add(new Triple(3,2,3));
         triple.add(new Triple(3,4,1));
         triple.add(new Triple(3,7,8));
         triple.add(new Triple(4,0,9));
         triple.add(new Triple(4,3,8));
         triple.add(new Triple(4,4,6));
         triple.add(new Triple(4,5,3));
         triple.add(new Triple(4,8,5));
         triple.add(new Triple(5,1,5));
         triple.add(new Triple(5,4,9));
         triple.add(new Triple(5,6,6));
         triple.add(new Triple(6,0,1));
         triple.add(new Triple(6,1,3));
         triple.add(new Triple(6,6,2));
         triple.add(new Triple(6,7,5));
         triple.add(new Triple(7,7,7));
         triple.add(new Triple(7,8,4));
         triple.add(new Triple(8,2,5));
         triple.add(new Triple(8,3,2));
         triple.add(new Triple(8,5,6));
         triple.add(new Triple(8,6,3));

         b.setupBoard(triple);
         b.printBoard();

         Game game=new Game(b,p);
         game.play();*/
         Queenboard b=new Queenboard(3);
         NQueenGame game=new NQueenGame(b);
         game.play();


        


    }
}
