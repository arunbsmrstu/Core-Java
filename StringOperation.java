class StringOperation{

	public static void main(String as[]){
		String str="Bangabandhu Sheikh Mujibur Rahman Science and Technology University";

		System.out.println("Use of length method :"+str.length());
		System.out.println("Use of charAt method :"+str.charAt(10));
		System.out.println("Use of codePointAt :"+str.codePointAt(10));

		// Comparing two string

		String anotherStr="bangabandhu Sheikh Mujibur Rahman Science and Technology University";
		System.out.println(str.equals(anotherStr));
		System.out.println(str.equalsIgnoreCase(anotherStr));

	}

}