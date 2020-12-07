package org.stringcalculator;

public class StringCalculator {
		
	public static int add(String text){
		if(text.length()==0)
		{
			return 0;
		}
		else
		{
			String numList[] = splitNumbers(text, ",|\n");
			String delimiter = ",";
			if(text.matches("//(.*)\n(.*)")){
				delimiter = Character.toString(text.charAt(2));
				text = text.substring(4);
			}

			numList = splitNumbers(text, delimiter  + "|\n");
			return sum(numList);
		}
	}

	private static String[] splitNumbers(String numbers, String divider)
	{
	    return numbers.split(divider);
	}
	
	private static int sum(String[] numbers)
	{
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }
	
	private static int toInt(String number)
	{
		return Integer.parseInt(number);
	}
}
