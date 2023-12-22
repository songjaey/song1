package study122201;

import java.text.DecimalFormat;

public class buyer {
	int member_num;
	String member_name;
	int expend;
	mart[] basket;
	int cnt;
	
	buyer(){}
	buyer(int num, String name){
		this.member_name=name;
		this.member_num=num;
	}
	@Override
	public String toString() {
		String out = "\n============장바구니=============\n"+ 
				"회원번호 : "+member_num+"  회원명 : "+member_name+"\n"+
					 "장바구니 목록 \n";
		for(int i=0; i<basket.length; i++) {
			out += (i+1)+", "+basket[i] + "\n";
		}
		out +="총 결제 금액 : " + total_price();
		return out;
	}
	
	String total_price() {
		int total = 0;
		for(int i=0; i<basket.length;i++) {
			total += basket[i].price;
		}
		DecimalFormat df = new DecimalFormat("###,###");
		return df.format(total) + "원";
	}
	
	void basket_add(mart_item) {
		if( cnt >= 1 ) {
			mart[] temp = new mart[basket.length+1];
			for(int i=0; i<basket.length; i++) {
				temp[i] = basket[i];
			}
			basket = temp;
		}
		bascket[cnt] = item;
		cnt++;
	}
}
