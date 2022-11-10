package chapters.chapter_01.Exercise01;

public class Exercise01_11 {
	public static void main(String[] args) {
		System.out.println("Current population is = 312,032,486");
		System.out.print("1 year later population will be = ");
		System.out
				.println(312032486 + (365 * 24 * 60 * 60 / 7) - (365 * 24 * 60 * 60 / 13) + (365 * 24 * 60 * 60 / 45));
		System.out.print("2 years later population will be = ");
		System.out.println(
				312032486 + 2 *((365 * 24 * 60 * 60 / 7) - (365 * 24 * 60 * 60 / 13) + (365 * 24 * 60 * 60 / 45)));
		System.out.print("3 years later population will be = ");
		System.out.println(
				312032486 + 3 * ((365 * 24 * 60 * 60 / 7) - (365 * 24 * 60 * 60 / 13) + (365 * 24 * 60 * 60 / 45)));
		System.out.print("4 years later population will be = ");
		System.out.println(
				312032486 + 4 * ((365 * 24 * 60 * 60 / 7) - (365 * 24 * 60 * 60 / 13) + (365 * 24 * 60 * 60 / 45)));
		System.out.print("5 years later population will be = ");
		System.out.println(
				312032486 + 5 * ((365 * 24 * 60 * 60 / 7) - (365 * 24 * 60 * 60 / 13) + (365 * 24 * 60 * 60 / 45)));
	}
}
