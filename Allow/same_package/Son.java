class Son extends Father {
	String hand;
	
	public void setHand(String hand) {
		this.hand = hand;
	}

	String getHand() {
		return hand;
	}

//	public int getMoney() {
//		return money;
//	} money是Father中私有的，所以不可继承
}
