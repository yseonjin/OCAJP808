package test;

public class ArrayMin {
	public static void main(String[] args) {
		        int[] arr = {3,4,1,5};
				int[] answer = {};
		        int min = arr[0];
		        int cnt = 0;
		        for(int i=0 ; i <arr.length;i++){
		            min = Math.min(min,arr[i]);
		        } 
		        if(arr.length == 1){
		            answer = new int[1];
		            answer[0] = -1;
		        }else{
		            answer = new int[arr.length-1];
		            for(int i=0 ; i <arr.length;i++){
		                if(arr[i]==min){
		                    continue;
		                }
		                answer[cnt++] = arr[i];
		            }
		}
	}
}
