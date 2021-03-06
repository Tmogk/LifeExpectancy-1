package StatisticsModels;

public class StatisticsModels {
	
	
	private static Integer bpm =75;
	public static int heartbeatsPerYear = 365*24*60*bpm;

	public static Integer getBpm() {
		return bpm;
	}

	public void setBpm(Integer bpm) {
		StatisticsModels.bpm = bpm;
		heartbeatsPerYear = 365*24*60*bpm;
	}

	public static int smokingBeatsReduced(int cigarettesPerDay, double yearsSmoked) {
		// This calculates how many beats are reduced based on cigarettes smoked per day
		// and how long in years user has
		// smoked. If the user is not a smoker, the beatsReduced is 0. If the user is a
		// smoker, the beats are
		// reduced by 770 per cigarette (11 minutes lost per cigarette * an average of
		// 70 beats per minute) * 365 days/year
		// * yearsSmoked.

		int beatsReduced = 0;

		if (cigarettesPerDay == 0) {
			beatsReduced = 0;
		} else if (cigarettesPerDay > 0) {
			beatsReduced = (int) ((cigarettesPerDay * 770) * (365 * yearsSmoked));
		}

		return beatsReduced;

	}

	public static long alcoholBeatsReduced(String drinksPerWeekCategory) {
		// This method calculates beats reduced over lifetime by drinking categories. 0
		// drinks per week reduces beats by 0.
		// 1-2 drinks per week reduces beats by 19440000 over lifetime, etc.

		long beatsReduced = 0;

		if (drinksPerWeekCategory == "none") {
			beatsReduced = 0;
		} else if (drinksPerWeekCategory != "none") {
			switch (drinksPerWeekCategory) {

			case "low": // 1-2 drinks per day
				beatsReduced = (long) (heartbeatsPerYear * 0.5);
				break;
			case "medium": // 2-3.5 drinks per day
				beatsReduced = (long) (heartbeatsPerYear * 1.5);
				break;
			case "high": // Greater than 3.5 drinks per day
				beatsReduced = (long) (heartbeatsPerYear * 4.5);
				break;
			}
		}

		return beatsReduced;

	}

	public static long educationBeatsReduced(String educationLevelCategory, String gender) { // this needs to be
																								// finished

		long beatsReduced = 0;

		if (educationLevelCategory == "bachelors") {
			switch (gender) {
			case "FMLE":
				beatsReduced = (long) (heartbeatsPerYear * -2.8);
				break;
			case "MLE":
				beatsReduced = (long) (heartbeatsPerYear * -1.9);
				break;
			}
		} else if (educationLevelCategory == "noHS") {
			switch (gender) {
			case "FMLE":
				beatsReduced = (long) (heartbeatsPerYear * 5.8);
				break;
			case "MLE":
				beatsReduced = (long) (heartbeatsPerYear * 7.4);
				break;
			}
		} else if (educationLevelCategory == "highSchool") {
			switch (gender) {
			case "FMLE":
				beatsReduced = (long) (heartbeatsPerYear * 2.8);
				break;
			case "MLE":
				beatsReduced = (long) (heartbeatsPerYear * -4.5);
				break;
			}
		} else if (educationLevelCategory == "none"){
			return beatsReduced;
		}
		return beatsReduced;
		
	}

	public static long bmiBeatsReduced(int height, int weight, String gender) {

		long beatsReduced = 0;

		double bmi = 703 * ((double)weight / (double)(height * height));

		if (bmi < 18.5) {
			switch (gender) {
			case "FMLE":
				beatsReduced = (long) (heartbeatsPerYear * 4.5);
				break;
			case "MLE":
				beatsReduced = (long) (heartbeatsPerYear * 4.3);
				break;
			}
		} else if (bmi < 25) {
			beatsReduced = 0;
		} else if (bmi < 30) {
			switch (gender) {
			case "FMLE":
				beatsReduced = (long) (heartbeatsPerYear * 0.8);
				break;
			case "MLE":
				beatsReduced = (long) (heartbeatsPerYear * 1.0);
			}
		} else if (bmi >= 30) {
			switch (gender) {
			case "FMLE":
				beatsReduced = (long) (heartbeatsPerYear * 3.5);
			case "MLE":
				beatsReduced = (long) (heartbeatsPerYear * 4.2);
			}
		}

		return beatsReduced;

	}

	public static long incomeBeatsLost(int income, String gender) {

		long beatsReduced = 0;

		if (income <= 25000) {
			switch (gender) {
			case "FMLE":
				beatsReduced = (long) (heartbeatsPerYear * 2.7);
				break;
			case "MLE":
				beatsReduced = (long) (heartbeatsPerYear * 0.7);
				break;
			}
		} else if (income <= 47500) {
			switch (gender) {
			case "FMLE":
				beatsReduced = (long) (heartbeatsPerYear * 1.3);
				break;
			case "MLE":
				beatsReduced = (long) (heartbeatsPerYear * -1.5);
			}
		} else if (income <= 77500) {
			switch (gender) {
			case "FMLE":
				beatsReduced = (long) (heartbeatsPerYear * -1.4);
				break;
			case "MLE":
				beatsReduced = (long) (heartbeatsPerYear * -6.6);
			}
		} else if (income <= 127000) {
			switch (gender) {
			case "FMLE":
				beatsReduced = (long) (heartbeatsPerYear * -2.1);
				break;
			case "MLE":
				beatsReduced = (long) (heartbeatsPerYear * -11.0);
				break;
			}
		} else {
			switch (gender) {
			case "FMLE":
				beatsReduced = (long) (heartbeatsPerYear * -10.9);
				break;
			case "MLE":
				beatsReduced = (long) (heartbeatsPerYear * -12.0);
				break;
			}
		}

		return beatsReduced;

	}

	public static long ethnicityBeatsLost(String ethnicity) {

		long beatsReduced = 0;

		switch (ethnicity) {
		case "Asian":
			beatsReduced = (long) (heartbeatsPerYear * -8.4);
			break;
		case "Hispanic":
			beatsReduced = (long) (heartbeatsPerYear * -4.6);
			break;
		case "White":
			beatsReduced = (long) (heartbeatsPerYear * -0.2);
			break;
		case "Native American":
			beatsReduced = (long) (heartbeatsPerYear * 1.8);
			break;
		case "African":
			beatsReduced = (long) (heartbeatsPerYear * 3.3);
			break;
		}

		return beatsReduced;

	}

}
