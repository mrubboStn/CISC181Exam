package pgkShape;

public class Rectangle extends Shape implements Comparable{
	
	private int iWidth;
	private int iLength;
	
	
	public Rectangle(int iWidth, int iLength) {
		super();
		this.iWidth = iWidth;
		this.iLength = iLength;
	}

	
	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}

	
	@Override
	public double area() {
		return (double) (this.iLength * this.iWidth);
	}

	@Override
	public double perimeter() {
		return (double) (2*(this.iLength + this.iWidth));
	}



	@Override
	public int compareTo(Object arg0) {
		int ans;
		if (this.area() > ((Rectangle) arg0).area())
			ans = 1;
		else if (this.area() < ((Rectangle) arg0).area())
			ans = -1;
		else
			ans = 0;
		return ans;
	}
}
