/**
 * HTree
 *
 * 		Recursibely draws an HTree
 * 		
 */

import java.awt.Graphics;

class HTree {
	
	private int x, y, length, depth;
	private Graphics g;

	public static final int MAX_DEPTH = 20;

	/**
	 * Constructor
	 *
	 * 	@param x - center x position of the htree
	 * 	@param y - center y position of the htree
	 * 	@param length - how long the center h is
	 */
	public HTree(int x, int y, int length) {
		this.x = x;
		this.y = y;
		this.length = length;
		this.depth = 1;
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

	public int getLength() {
		return length;
	}

	public int getDepth() {
		return depth;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setLength(int length) {
		this.length = length;
	}

	// public void setDepth(int depth) {
	// 	this.depth = depth;
	// }

	/**
	 * incrementDepth
	 *
	 * 		increment the depth by one, unless the depth is greater than MAX_DEPTH, in which
	 * 		case it should be set to one.
	 */
	public void incrementDepth() {
		this.depth++;
		if(this.depth==MAX_DEPTH) {
			this.depth = 1;
		}
	}


	/**
	 * draw
	 *
	 * 		draw the htree to the screen
	 *
	 * 		this is an accessor method that calls the real private recursive method
	 *
	 * @param g - the Graphics obect associated with the window
	 */
	public void draw(Graphics g) {
		this.g = g;
		recursiveDraw(depth, x, y, length);
	}


	/**
	 * recursiveDraw
	 * 		actually draw the htree
	 *
	 * @param n - current depth of the htree
	 * @param a, b - center point of the htree
	 * @param s - length of a line at the current depth
	 *
	 * precondition - g must not be null
	 */
	private void recursiveDraw(int n, int a, int b, int s) {
		//base case
		if (n <= 0){
			return;
		}

		//draw step
		
		//math to calculate new positions and sizes
		int halfLength = s / 2;

		//horizontal line
		int x1 = a - halfLength;
		int y1 = b;
		int x2 = a + halfLength;
		int y2 = b;
		g.drawLine(x1, y1, x2, y2);

		//vertical left
		y1 = b - halfLength;
		x2 = x1;
		y2 = b + halfLength;
		g.drawLine(x1, y1, x2, y2);

		//reduction step
		recursiveDraw(n-1, x1, y1, halfLength);
		recursiveDraw(n-1, x2, y2, halfLength);
		
		//vertical right
		x1 = a + halfLength;
		x2 = x1;
		g.drawLine(x1, y1, x2, y2);

		//reduction step
		recursiveDraw(n-1, x1, y1, halfLength);
		recursiveDraw(n-1, x2, y2, halfLength);
		
	}














}