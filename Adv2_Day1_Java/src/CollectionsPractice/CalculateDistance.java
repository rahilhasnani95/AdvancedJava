package CollectionsPractice;

class Solution
{
	public static double solution(double[][] readings, long endTime)
	{
		double disttravelled = 0.0d;
		for(int i = 0; i < readings.length-1; i++)
		{	

			disttravelled += (readings[i][1] * (readings[i+1][0] - readings[i][0]))/3600;
	
		}
		disttravelled += ((endTime - readings[readings.length-1][0]) * readings[readings.length-1][1]) / 3600;
		
		return disttravelled;
	}
}

public class CalculateDistance {

	public static void main(String[] args) {
		
		double [][] array = {{0,90}, {300,80}};
		System.out.println(Solution.solution(array, 600));
		
	}
	
}

