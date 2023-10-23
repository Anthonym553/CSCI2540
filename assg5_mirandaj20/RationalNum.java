/*
Anthony Miranda
RationalNum.java contains all of the constructs and methods that will be used to perform
various mathematical operations on the rational numbers given through the Demo
*/
package assg5_mirandaj20;

public class RationalNum {
	
	//Initialize private integer type numerator and denominator
	private int NUM; 
	private int DEN;

	
	//Will now begin with each constructor step by step starting with default
	
	/*
	 * Rational Number object is created with initial values 0 and 1 respectively
	 */
	public RationalNum() {
		NUM = 0;
		DEN = 1;
	}
	
	/*
	 * Constructor Receives one parameter and defines integers as rational numbers
	 * @param NUM
	 */
	public RationalNum(int NUM) {
		this.NUM = NUM;
		this.DEN = 1;
	}
	
	/*
	 * Constructor
	 * Receives 2 parameters 
	 * stores first as numerator and second as denominator if greater than 0
	 * if less than 0 will create a negative numerator
	 * if equal to zero will tell user that Zero cannot be a denominator
	 * @param NUM
	 * @param DEM
	 */
	public RationalNum(int NUM, int DEN) {
		if (DEN > 0) 
		{
			this.NUM = NUM;
			this.DEN = DEN;
		}
		else if (DEN < 0)
		{
			NUM = NUM * -1;
			DEN = DEN * -1;
			this.NUM = NUM;
			this.DEN = DEN;
		}
		else if (DEN == 0)
		{
			System.out.println("Zero cannot be in the denominator.");
		}
	}
		
		//The following are the overridden methods inherited from the object class
	
	/*
	 * First Overridden Method will return a string equivalent of the rational number object
	 */
		@Override
		public String toString() 
		{
			return (this.NUM + "/" + this.DEN);
		}
		
		@Override
		public boolean equals (Object obj) 
		{
			RationalNum rationalNum = (RationalNum)obj;
			
			int NUM1 = this.NUM;
			int DEN1 = this.DEN;
			int NUM2 = rationalNum.NUM;
			int DEN2 = rationalNum.DEN;
			NUM1 = (this.NUM * rationalNum.DEN);
			NUM2 = (rationalNum.NUM * this.DEN);
			DEN1 = (this.DEN * rationalNum.DEN);
			DEN2 = (rationalNum.DEN * this.DEN);
			
			if(NUM1 == NUM2 && DEN1 == DEN2)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
			
			//Following are the Public Methods
			/*
			 * @return NUM (numerator)
			 */
			public int getNUM()
			{
				return NUM;
			}
			
			/*
			 * @return DEN (denominator)
			 */
			public int getDEN()
			{
				return DEN;
			}
			
			/*
			 * adds two rational numbers
			 * @param origNum
			 * @return
			 */
			public RationalNum add(RationalNum origNum)
			{
				RationalNum newNum = new RationalNum();
				int NUM1 = this.NUM;
				int DEN1 = this.DEN;
				int NUM2 = origNum.NUM;
				int DEN2 = origNum.DEN;
				newNum.NUM = (NUM1 * DEN2 + NUM2 * DEN1);
				newNum.DEN = DEN1 * DEN2;
				
				return newNum;
			}
			
			/*
			 * Subtracts two rational numbers
			 * @param origNum
			 * @return
			 */
			public RationalNum sub(RationalNum origNum)
			{
				RationalNum newNum = new RationalNum();
				int NUM1 = this.NUM;
				int DEN1 = this.DEN;
				int NUM2 = origNum.NUM;
				int DEN2 = origNum.DEN;
				newNum.NUM = (NUM1 * DEN2 - NUM2 * DEN1);
				newNum.DEN = (DEN1 * DEN2);
				
				return newNum;
			}
			
			/*
			 * Multiplies two rational numbers
			 * @param origNum
			 * @return
			 */
			public RationalNum mul(RationalNum origNum)
			{
				RationalNum newNum = new RationalNum();
				int NUM1 = this.NUM;
				int DEN1 = this.DEN;
				int NUM2 = origNum.NUM;
				int DEN2 = origNum.DEN;
				newNum.NUM = (NUM1 * NUM2);
				newNum.DEN = (DEN1 * DEN2);
				
				return newNum;
			}
			
			/*
			 * divides two rational numbers
			 * @param origNum
			 * @return
			 */
			public RationalNum div(RationalNum origNum)
			{
				RationalNum newNum = new RationalNum();
				int NUM1 = this.NUM;
				int DEN1 = this.DEN;
				int NUM2 = origNum.NUM;
				int DEN2 = origNum.DEN;
				newNum.NUM = (NUM1 * DEN2);
				newNum.DEN = (DEN1 * NUM2);
				
				return newNum;
			}
			
			/*
			 * negates a given rational number
			 * @return
			 */
			public RationalNum neg()
			{
				RationalNum newNum = new RationalNum();
				
				int NUM1 = (this.NUM * -1);
				int DEN1 = this.DEN;
				newNum.NUM = NUM1;
				newNum.DEN = DEN1;
				
				return newNum;
			}
}
