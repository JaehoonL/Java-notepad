package ����;

public class Change {
	public static void main(String[] args) {
		
		
		int[] change = {500,100,50,10};
		int money =3540;
		System.out.println("�ݾ� :"  + money);
		for(int i =0; i<change.length;i++) {
			int res = money / change[i];
			if(res>0) {
				System.out.println(change[i] + "��:" + res);
				money %= change[i];
			}
		}
		
	}
}
	

	
