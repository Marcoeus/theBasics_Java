import java.util.LinkedList;

public class MazeSolver {
	
	static int[][] maze = { /*as static array you can access it 
	in main easy without creating an instance of that class*/
			{2, 0, 1, 1},
			{1, 1, 0, 1},
			{0, 1, 1, 1}
	};
	/*0 = wall
	 * 1 = path
	 * 2 = destination*/
	
	static LinkedList<Position> path = new LinkedList<Position>();
	
	public static void main(String[] args) {
		Position pos = new Position(3, 0);		
		path.push(pos); 
		
		/*peek- method craps the actual x and y- position of 
		 * the path (LinkedList) in the maze*/
		maze[path.peek().y][path.peek().x] = 0;

	}

}
