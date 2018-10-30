package pgkShape;

public class Cuboid extends Rectangle implements Comparable{
	
	private int iDepth;
	
	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
		this.iDepth = iDepth;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}

	
	public double volume() {
		return (super.area() * this.iDepth);
	}
	
	@Override
	public double area() {
		return (super.area() * 2) + (super.getiLength() * this.iDepth * 2) + (super.getiWidth() * this.iDepth * 2);
	}

	@Override
	public double perimeter() throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
	
	public class SortByArea {
		SortByArea () {}
		
		public int compare(Cuboid c1, Cuboid c2) {
			int ans;
			if (c1.area() > c2.area())
				ans = 1;
			else if (c1.area() < c2.area())
				ans = -1;
			else
				ans = 0;
			return ans;
		}
		
	}
	
	public class SortByVolume {
		SortByVolume () {}
		
		public int compare(Cuboid c1, Cuboid c2) {
			int ans;
			if (c1.volume() > c2.volume())
				ans = 1;
			else if (c1.volume() < c2.volume())
				ans = -1;
			else
				ans = 0;
			return ans;
		}
	}
	
}
