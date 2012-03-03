class B extends A {
	double y = 12;

	public void setY(int y) {
//		this.y = y + x;	//非法操作，x是A类私有的
	}

	public double getY() {
		return y;
	}
}

