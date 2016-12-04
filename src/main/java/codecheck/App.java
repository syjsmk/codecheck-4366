package codecheck;

public class App {
	public static void main(String[] args) {

		String[] firstArgs = new String[8];
		String[] secondArgs = null;
		String[] thirdArgs = null;

		for (int i = 0, l = args.length; i < l; i++) {
			System.out.println(args[i]);

			firstArgs = args[0].split(",");
			secondArgs = args[1].split(",");

			thirdArgs = null;
			if(i == 2) {
				thirdArgs = args[2].split(",");
			}
		}

		if(firstArgs.length < 9) {
			System.out.println("Invalid Length: <" + (9 - firstArgs.length) + "> more item(s) needed");
		} else if(firstArgs.length > 9) {
			String err = "Using first 9 items: <";

			for(int i = 0; i < firstArgs.length; i ++) {
				err += firstArgs[i] + ", ";

			}

			err += ">";
			System.out.println(err);
		}

		int[][] ma = new int[3][3];

		for(int i = 0; i < secondArgs.length; i ++) {
			System.out.println(secondArgs[i]);
			
		}

		int count = 0;
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j ++) {
				ma[i][j] = Integer.valueOf(firstArgs[count]);
				count ++;
			}
		}

		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j ++) {
				System.out.print(ma[i][j] + " ");
			}
			System.out.println("");
		}

		int firstRow = 0;
		int secondRow = 0;
		int thirdRow = 0;

		int firstl = 0;
		int secondl = 0;
		int thirdl = 0;

		for(int i = 0; i < 3; i ++) {
			firstRow += ma[0][i];
			secondRow += ma[1][i];
			thirdRow += ma[2][i];

			firstl += ma[i][0];
			secondl += ma[i][1];
			thirdl += ma[i][2];
		}

		System.out.println(firstRow);
		System.out.println(secondRow);
		System.out.println(thirdRow);

		System.out.println(firstl);
		System.out.println(secondl);
		System.out.println(thirdl);



	}
}
