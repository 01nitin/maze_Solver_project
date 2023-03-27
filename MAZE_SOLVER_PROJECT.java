import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class MAZE_SOLVER_PROJECT extends JFrame {
    //the grid of the project
    private int[][] maze =
    {{1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,0,1,0,1,0,1,0,0,0,0,0,1},
            {1,0,1,0,0,0,1,0,1,1,1,0,1},
            {1,0,1,1,1,1,1,0,0,0,0,0,1},
            {1,0,1,1,1,1,1,0,0,0,0,0,1},
            {1,0,0,1,0,0,0,0,1,1,1,0,1},
            {1,0,1,0,1,1,1,0,1,0,0,0,1},
            {1,0,1,0,1,0,0,0,1,1,1,0,1},
            {1,0,1,0,1,1,1,0,1,0,1,0,1},
            {1,0,0,0,0,0,0,0,0,0,1,9,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
    public List<Integer> path = new ArrayList<>();

    //create the constructor
    public void MAZE_SOLVER_PROJECT(){
        setTitle("MAZE TITLE");
        setSize(640, 720); // its a grid of project
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    // we able to  perform graphics like color and all the thing's
    public void paint(Graphics g){
        g.translate(50,50); // give the grid in 50, 50 location
        for (int i= 0 ;i< maze.length; i++){
            for (int j= 0 ;j<maze[0].length ;j++){
                Color color ; // color objet is used to set the color

                switch (maze[i][j]){
                    case 1: color = Color.black ; break;
                    case 9 : color = Color.red ; break;
                    default: color = Color.white ; break;
                }
                g.setColor(color); // set the color in grid
// the rectangle define that what will be the path rect width height
                g.fillRect(30*j, 30*i, 30, 30);
                g.setColor(color.red);
                g.drawRect(30*j, 30*i, 30, 30);

            }
        }

    }

    public static void main(String[] args) {
        System.out.println("This is the project of the maze solver using graph 2D array  and finding the sortest path ");
        MAZE_SOLVER_PROJECT  view = new MAZE_SOLVER_PROJECT();
        view.setVisible(true);


    }
}
