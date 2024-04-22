package board;

public class Queenboard {
    public int size;
    public char board[][];

    public Queenboard(int size)
    {
        this.size=size;
        this.board = new char[size][size];
    
    
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                board[i][j]='-';
            }
            
        }
    }
    
}
            
   