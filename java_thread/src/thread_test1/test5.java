package thread_test1;

public class test5 {
	
	public static void main(String[] args) {
		Runnable r = new myApp();
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
	}
}

class Bank{
	private int myMoney = 1000000;
	public int getMyMoney() {
		return myMoney;
	}
	public boolean withdraw(int money) {
		if( myMoney > money) {
			try { Thread.sleep(1000);
			}catch(Exception e){}
			myMoney -=money;
			return true;
		}
		return false;
	}
}

class myApp implements Runnable{
	Bank my = new Bank();
	
	@Override
	public void run() {
		
	}
}