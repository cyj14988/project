package F1_���ڿ�1_�˰���;

public class ���ڿ�1_�˰���_ä��_���� {
	/*
	 * ��ä���� �Ʒ��� ���� ����ϴµ� ,
	 * ö���� �������� ,
	 * ����� ���������ķ� ����غ���. 
	 */
	public static void main(String[] args) {
		
		String wordList [][]= {
				{"ö��", "����� �ȳ�"} , 
				{"����", "ö���� �ȳ�"} ,  
				{"ö��", "���� ���ɰ��� ������?"}, 
				{"����", "�ƴ� ����־�. ������ ����."} , 
				{"ö��", "�׷� ������ ����."}
			};
		
		/*
		 * 
		 * "����� �ȳ�"
		 * 					"ö���� �ȳ�"
		 * "���� ���ɰ��� ������?"
		 * 	   "�ƴ� ����־�. ������ ����."
		 * "�׷� ������ ����."
		 */
		
		for(int i = 0; i < wordList.length; i++) {
			if(i % 2 == 0) {
				System.out.printf("%-25s", wordList[i][1]);
				System.out.println();
			}else {
				System.out.printf("%25s", wordList[i][1]);
				System.out.println();
			}
		}
	}

}
