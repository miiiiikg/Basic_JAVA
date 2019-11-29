package gugudan;

public class GuGuPrint {
	
	public void guGuDan(int dansu) {
		
		int result; // 변수선언, 초기화X
		System.out.printf("구구단 %d단 출력 :\n" , dansu);
		for(int i = 1; i <= 9; i++) {
			result = dansu * i;
			System.out.println(dansu + " x "  + i + " = " + result);
		}
	}

}
