public class Bubble{
	public static void main(String[] args){
		System.out.print("データ数を整数で入力してください。--->");
		int a = new java.util.Scanner(System.in).nextInt();
		int[] bubble =new int[a];
		System.out.println("-----作成された配列↓-----");
		
		for(int i=0;i<=a-1;i++){
			bubble[i]=new java.util.Random().nextInt(100);
			System.out.println(i+1+"番目；"+bubble[i]);
		}
		
		System.out.print("昇順なら１を、降順なら２を入力してください。--->");
		int b = new java.util.Scanner(System.in).nextInt();
		int k;
		if (b==1){
			for(int i=a-1;i>=0;i--){
				for(int j=0;j<=i-1;j++){
					if (bubble[j]>bubble[j+1]){
						k=bubble[j];
						bubble[j]=bubble[j+1];
						bubble[j+1]=k;
					}
				}
			}
		}else if(b==2){
			for(int i=a-1;i>=0;i--){
				for(int j=0;j<=i-1;j++){
					if (bubble[j]<bubble[j+1]){
						k=bubble[j];
						bubble[j]=bubble[j+1];
						bubble[j+1]=k;
					}
				}
			}
		}
		System.out.println("-----バブルソートされた配列↓-----");
		for(int i=0;i<=a-1;i++){
			System.out.println(i+1+"番目；"+bubble[i]);
		}
	}
}
		