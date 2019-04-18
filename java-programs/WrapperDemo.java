class WrapperDemo {
	public static void main(String[] args) {
		
		int i = 10;
		Integer it = new Integer(i);

		System.out.println(i);
		System.out.println(it);
		System.out.println(it.intValue());
		
		char ch = 'R';
		Character character = new Character(ch);
		System.out.println(ch);
		System.out.println(character);
		System.out.println(character.charValue());



	}
}