package day9;

public class primeNumber {
	
	
		
		private int num;

		public primeNumber(int num) {
			super();
			this.num = num;
		}
		
		public void prime() {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {

					System.out.println(num +" is not a prime number");
				} else {
					System.out.println(num);
				}
				

			}
			
		}

		@Override
		public String toString() {
			return "number "+num;
		}
		
		
	}
	

