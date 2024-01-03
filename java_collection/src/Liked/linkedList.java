package Liked;

public class linkedList {
	
	static int cnt=0;
	
	private node head=null;
	private node tail=null;
	//데이처 추가
	public void add(String name) {
		node temp = new node(name);
		temp.index=cnt;
		cnt++;
		if(head==null) {
			head=temp;
			tail=temp;
		}else {
			tail.setNext(temp);
			tail=temp;
		}
	}
	//데이터 출력
	public node get(int index) {
		node find = head;
		while(find != null) {
			if(find.index == index)
				return find;
		}
		return null;
	}
	public boolean remove(int index) {
		node find = head;
		if(head.index == index) {
			head = head.getNext();
			reindex();
			cnt--;
		}else {
			while(find.getNext() != null ) {
				if( find.getNext().index == index ) {
					node del = find.getNext();
					find.setNext(del.getNext());
					reindex();
					cnt--;
					return true;
				}
				find = find.getNext();
			}
		}
		return false;
	}
	
	public void add(int index, String name) {
		node temp = new node(name);
		cnt++;
		
		node find = head; // 첫번째 노드부터 시작
		
		if(index==0) {
			temp.setNext(head);
			head=temp;
		}else {
			//
			while(find.getNext()!=null) {
				if(find.getNext().index == index) {
					temp.setNext(find.getNext());
					find.setNext(temp);
					break;
				}
				find = find.getNext();
			}
		}
		reindex();
		
	}
	
	private void reindex() {
		node location = head;
		int i=0;
		while(location != null) {
			location.index = i++;
			location = location.getNext();
		}
	}
	//링크드 리스트 전체 출력
	@Override
	public String toString() {
		
		String out = "[";
		node move = head;//링크드리스트의 첫번째노드
		
		while(move != null) {// 마지막 노드의 next는 null이기 때문에
			out += move.getName() + "\n";
			move = move.getNext(); // 현재 노드에서 다음 노드로 이동
		}
		
		
		out +="]";
		
		
		return out;
	}
}
