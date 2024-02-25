package Practice;

import java.util.Scanner;

public class 선택정렬2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int n = arr.length;

//        System.out.println("정렬전" + Arrays.toString(arr));
        System.out.print("숫자 입력 : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            for(int j =0; j<i;j++){
                if(arr[i] == arr[j]) {
                    System.out.println( arr[j]+"은 숫자가 중복 됩니다. 중복되지않는 다른 숫자를 입력해주세요.");
                    i -- ;
                    break;
        }
            }
        }

        for (int i = 0; i < n - 1; i++) {//한자리는 남겨둔다
            int min = i;// 최소값 저장
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
      }    
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
	}

}
