package task;

	class bank{
		
		private int deposite;
		private int withdraw;
		
		public int getDeposite() {
			return deposite;
		}
		public void setDeposite(int deposite) {
			this.deposite = deposite;
		}
		public int getWithdraw() {
			return withdraw;
		}
		public void setWithdraw(int withdraw) {
			this.withdraw = withdraw;
		}
		
		
	}
	
	public class bankaccount {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		bank b= new bank();
		b.setDeposite(50);
		b.setWithdraw(40);
		
		System.out.println(b.getWithdraw()+" "+b.getDeposite());
	}

}
