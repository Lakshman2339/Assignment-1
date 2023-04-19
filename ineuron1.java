public class Ineuron1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		
		for(int i=0;i<n; i++)
		{
		    ///I//
			for(int j=0 ; j<n; j++)
			{
			if((j==(3*n)/4))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			
			
			//N
				for(int j=0 ; j<n; j++)
			{
			if(i==j||j==0 || j==n-1)
			
			
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			
			
			
			//E
				for(int j=0 ; j<n; j++)
			{
			if(j==0||i==(n-1)/2 && j<(3*n)/4||i==n-1 && j<(3*n)/4 || i==0 && j<(3*n)/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			
			
			//U
			for(int j=0 ; j<n; j++)
			{
				if(j==0 || i==n-1 && j<(3*n)/4||j==(3*n)/4)
		
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			
			///R
			for(int j=0 ; j<n; j++)
			{
			if(j==0|| i==(n-1)/2 && j<(n-1)/1.7|| i==0 &&j<(n-1)/1.7|| j==(n-1)/2 && i<(n-1)/2||
				(i-j==(n-1)/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			
			
			///O
				for(int j=0 ; j<n; j++)
			{
			if((i==0 && j>0 && j<n-1)||
					(j==0 && i>0 && i<n-1)||
						
					i==n-1 && j>0 && j<n-1 || 
						(j==n-1 && i>0 && i<n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			
			//N
			
				for(int j=0 ; j<n; j++)
			{
			    
			if  (i==j||j==0 || j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			System.out.println();
		}
		

	}

}


/////2ns question//
public class Launch8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int n=4;
	for(int i=1; i<5; i++)   
{   
      for(int j=1; j<=4; j++)   
		{	
		   
				{
				System.out.print(i);
				}
			
			}
			System.out.println();
		}

	}

}

/////3 question///
public class Launch8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=14;
		// row=6;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			if((i==0)||(j==0)||(i==n-1)||(j==n-1)|| i==1&& j<6||i==1&& j>6||i==2&& j<5||i==2&& j>7 ||i==3&& j<4||i==3&& j>8 ||i==4&& j<3||i==4&& j>9||i==5&& j<2||i==5&& j>10||i==6&& j>11)
		//	if((i=0; i<row; i++)||(j=0; j<=i; j++))
			
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}

//////4 

public class Launch8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=14;
		// row=6;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			if((i==n-1)||j==0&& i>5||j==(n-1)&& i>5||i==n-2||i==n-3&&j<6 ||i==n-3&&j>7 ||i==n-4&&j<5 ||i==n-4&&j>8 ||i==n-5&&j<4 ||i==n-5&&j>9 ||i==n-6&&j<3 ||i==n-6&&j>10 ||i==n-7&&j<2 ||i==n-7&&j>11 )
			
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}


/////5


public class Launch8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=14;
		// row=6;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			if((i==n-1)||i==0||j==0 || i==1&&j<6 || i==2&&j<5 || i==3&&j<4 || i==4&&j<3 || i==3&&j<2 || i==6&&j<2 || i==7&&j<3 || i==8&&j<4 || i==9&&j<5 || i==10&&j<6 || i==11&&j<7 || i==12&&j<8)
			
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}