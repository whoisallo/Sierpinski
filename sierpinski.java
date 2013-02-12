/**
 * Sierpinski
 *
 * 		Recursively draws a sierpinski triangle
 * 		
 */

import java.awt.Graphics;

class sierpinski {
	
	private int x, y, size, depth;
	private Graphics g;

	public static final int MAX_DEPTH = 7;

	/**
	 * Constructor
	 *
	 * @param 
	 */
	public sierpinski(int x, int y, int size, int depth) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.depth = depth;
	}

	/**
	 *
	 * Getters and Setters
	 * 
	 */
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getSize() {
		return size;
	}

	public int getDepth() {
		return depth;
	}

	public void setX(int x) {
		this.x = x;
	}
	public void setY(int x) {
		this.y = x;
	}
	public void setSize(int x) {
		this.size = x;
	}
	//public void setDepth(int x) {
	//	this.depth = x;
	//}
	
	/**
	 * incrementDepth
	 *
	 * 		increment the depth by one, unless the depth is greater
	 * 		than MAX_DEPTH, in which case it should be set to one.
	 */
	public void incrementDepth() {
		this.depth++;
		if(this.depth == MAX_DEPTH) {
			this.depth = 1;
		}
	}

	/**
	 * draw
	 *
	 * 		draw the triangle to the screen
	 *
	 * 		this is an accessor method that calls the real private recursive method
	 *
	 * @param g - the Graphics object associated with the window
	 */
	public void draw(Graphics) {
		this.g = g;
		recursiveDraw(depth, x, y, size);
	}

	/**
	 * recursiveDraw
	 * 		actually draw the htree
	 *
	 * @param n - current depth of the triangle
	 * @param a, b - 
	 * @param s - size
	 */
	private void recursiveDraw(int n, int a, int b, int s) {
		g.setColor(Color.red); 

		//base case
		if ( n <= 0) {
			return;
		}

		//draw step
		
		//math to calculate new positions and sizes
		
	}


	private void drawTriangle(int[] pts) {
		
	}










}