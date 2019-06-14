package Assignment3;

public class EmployeeFeedback {

	public static void main(String[] args) {
		int [][] empInfo = {{1001,4,5}, {1002,2,4,5}};
		for(int i = 0; i < empInfo.length; i++)
		{
			for(int j = 0; j < empInfo[i].length; j++)
			{
				System.out.println(empInfo[i][j]);
			}
		}
	}
		
}
