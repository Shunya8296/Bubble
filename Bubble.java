public class Bubble{
	public static void main(String[] args){
		System.out.print("�f�[�^���𐮐��œ��͂��Ă��������B--->");
		int a = new java.util.Scanner(System.in).nextInt();
		int[] bubble =new int[a];
		System.out.println("-----�쐬���ꂽ�z��-----");
		
		for(int i=0;i<=a-1;i++){
			bubble[i]=new java.util.Random().nextInt(100);
			System.out.println(i+1+"�ԖځG"+bubble[i]);
		}
		
		System.out.print("�����Ȃ�P���A�~���Ȃ�Q����͂��Ă��������B--->");
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
		System.out.println("-----�o�u���\�[�g���ꂽ�z��-----");
		for(int i=0;i<=a-1;i++){
			System.out.println(i+1+"�ԖځG"+bubble[i]);
		}
	}
}
		