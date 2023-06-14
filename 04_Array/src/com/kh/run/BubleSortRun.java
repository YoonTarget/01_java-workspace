package com.kh.run;

public class BubleSortRun {

	public static void main(String[] args) {
		
		int[] arr = {22,99,30,68,87,1,13};
		// 임시 변수 => temp
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) { // 전체 사이클
			for(int j = 1; j < arr.length; j++) { // 안쪽 사이클
				if(arr[j - 1] > arr[j]) { // 앞에 숫자가 뒤에 숫자보다 큰 경우
					// 4 2 3
					temp = arr[j - 1]; // 4 // temp에 앞에 있는 숫자 보관
					arr[j - 1] = arr[j]; // 2 // 더 작은 숫자를 앞자리에 넣기
					arr[j] = temp; // temp에 보관한 숫자를 뒷자리에 넣기
				}
			}
			System.out.println("i : " + i + ", ");
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
		
		/*
		 * i = 0, 	22 	30	68	87	1	13	99
		 * i = 1, 	22	30 	68 	1	13	87	99
		 * i = 2, 	22 	30	1	13	68	87	99
		 * i = 3, 	22	1	13	30	68	87	99
		 * i = 4, 	1	13	22	30	68	87	99 
		 * i = 5, 	1	13	22	30	68	87	99 
		 * i = 6, 	1	13	22	30	68	87	99 
		 */
		
	}

}
