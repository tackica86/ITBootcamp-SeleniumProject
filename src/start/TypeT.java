package start;

public enum TypeT {
	AutomaticRegistration(1), ManualRegistration(2), AutomaticLogin(3), ManualLogin(4), AutomaticCreatePost(
			5), ManualCreatePost(6), EditPost(7), DeletePost(8);

	private int value;

	TypeT(int val) {
		this.value = val;
	}

	public static TypeT valueOfType(int value) {
		if (value == 1) {
			return TypeT.AutomaticRegistration;
		} else if (value == 2) {
			return ManualRegistration;
		} else if (value == 3) {
			return TypeT.AutomaticLogin;
		} else if (value == 4) {
			return TypeT.ManualLogin;
		} else if (value == 5) {
			return TypeT.AutomaticCreatePost;
		} else if (value == 6) {
			return TypeT.ManualCreatePost;
		} else if (value == 7) {
			return TypeT.EditPost;
		} else if (value == 8) {
			return TypeT.DeletePost;
		} else {
		return null;
		}
	}

}