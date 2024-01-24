package thread_test1;

public class test5 {
	
	public static void main(String[] args) {
		Runnable r = new myApp();
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
		
		th1.setName("1번");
		th2.setName("2번");
		
		th1.start();
		th2.start();
		
	}
}

class Bank{
	private int myMoney = 1000000;
	public int getMyMoney() {
		return myMoney;
	}
	// 쓰레기 동기화 임계여역 설정과 락이 필요하다.
	// 임계영역 - 둘 이상의 쓰레드가 동시에 접근해서는 안되는 코드 부분
	// withdraw 메서드 임계영역 설정
	public synchronized boolean withdraw(int money) {
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
		while(my.getMyMoney() > 0) {
			int money = (int)(Math.random()*5+1)*10000;
			boolean fail = my.withdraw(money);
			String thName = Thread.currentThread().getName();
			if(fail) {
				System.out.printf("쓰레드 : %s 출금 : %d원  잔고 : %d원\n", thName, money, my.getMyMoney() );
			}else {
				System.out.println(thName + " : 잔액부족");
			}
		}
	}
}