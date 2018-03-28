
import java.util.Random;

/**
 *
 * @author Anthony
 */
public class RandomAI {
    private  static final int TAILLE = 3;
    public int board[][] = {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};

    public RandomAI(){
        
       /* for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j] = -1;
            }
        }*/
        
    }
   
    public void tourAI(){
        Random dice = new Random();
        int line,column;
        int tour = 0;
        
        do{
         line = dice.nextInt(3);
         column = dice.nextInt(3);
         
        /* System.out.println(line + "  "+column);
         System.out.println(this.board[line][column]);*/

        }while(this.board[line][column] != -1);
        
        if(tour%2 == 0)
            this.board[line][column] = 1;
        else
            this.board[line][column] = 0;
        
        tour++;
    }
    
    public void showBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(this.board[i][j]);
            }
        }
    }
    public static void main(String[] args){
        RandomAI test = new RandomAI();
        test.tourAI();
        test.showBoard();
        System.out.println("hall");
        
    }
}
