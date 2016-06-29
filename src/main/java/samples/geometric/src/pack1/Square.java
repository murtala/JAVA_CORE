package samples.geometric.src.pack1;

import samples.geometric.pack.Shape;

public  class Square implements Shape {
	int height;
	int width;
	int area;
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int width, int height) {
		
		this.area = width*height;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return 0;
	}

}
