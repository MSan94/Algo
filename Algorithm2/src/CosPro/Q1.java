package CosPro;
/*
#����1
��� �������� Ÿ�Ӹӽ��� Ÿ�� ���ŷ� ���� ���� 0�� ���� �� ü�踦 �����߽��ϴ�. ���簡 �ٲ�� ���� ������� �ǽ� �ӿ� 0�̶� ���ڰ� ��������ϴ�. ����, ������ �� ü��� 1, 2, 3, ..., 8, 9, 11, 12, ...�� ���� 0�� ���� �ٲ�����ϴ�.

0�� �������� ���� �ڿ��� num�� �Ű������� �־��� ��, �� ���� 1�� ���� ���� return �ϵ��� solution �޼ҵ带 �ϼ����ּ���.

---

#####�Ű����� ����
�ڿ��� num�� solution �޼ҵ��� �Ű������� �־����ϴ�.
* num�� 1 �̻� 999,999,999,999,999,999 ������ 0�� �������� �ʴ� �ڿ����Դϴ�.

---

#####return �� ����
�ڿ��� num�� 1�� ���� ���� return ���ּ���.

---

#####����

| num     | return |
|---------|---------|
| 9949999 | 9951111 |

#####���� ����

9,949,999�� 1�� ���ϸ� 9,950,000������ 0�� �������� �����Ƿ� 9,951,111�� �˴ϴ�.

*/

public class Q1 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		int num = 49494949;
		String tmp = String.valueOf(num+1);
		for(int i=0; i<tmp.length(); i++) {
			char check = tmp.charAt(i);
			if(check == '0') {
				sb.append("1");
			}else {
				sb.append(check);
			}
		}
		System.out.println(sb.toString());
	}
}
