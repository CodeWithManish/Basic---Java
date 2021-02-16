package prog.string.amitisoftware;

public class Solution 
{
	public static int maxBlock(String str)
	{
		int count=0;
		int max=0;
		for(int i=0; i<str.length(); i++)
		{
			if(i==0)
			{
				count++;
				max=count;
			}
			else{
				if(str.charAt(i)==str.charAt(i-1))
				{
					count++;
					if(max<count)
					{
						max=count;
					}
				}// end of if
				else{
					count=1;
				}
			}
		}
		return max;
	}

}
