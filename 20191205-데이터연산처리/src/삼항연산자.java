// ? :
// (���ǹ�?��1:��2) => ��(React => ���׿�����)
// ����(true) => ��1
// ����(false) => ��2 
/*
 *     <%
 *          int sex=1;
 *          if(sex==1)
 *          {
 *     %>
 *             ����
 *     <%
 *          }
 *          else
 *          {
 *     %>
 *             ���� 
 *     <%
 *          }
 *     %>
 *     ================================
 *     <%
 *         sex==1?"����":"����"
 *     %>
 */
import java.util.Scanner;
/*
 *   ����,����,���� ������ �Է¹޾Ƽ� ��� => ����� 60�̻��̸� pass ,nopass
 *   
 *   // ���̸� �Է� ==> 15���̻��̸�  (��ȭ��������) / ���� (��ȭ�����Ұ�)
 *   // �¼� => 1 2 3 4 5 => 1,2,4 => �¼����� �Ұ��� , 3,5 => �¼����Ű���
 */
public class ���׿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("���� ����:");
        // ���� 
        int kor=scan.nextInt();
        System.out.print("���� ����:");
        int eng=scan.nextInt();
        System.out.print("���� ����:");
        int math=scan.nextInt();
        
        int avg=(kor+eng+math)/3;
        
        String result=avg>=60?"Pass":"NonPass";
        // age>=15?"":""
        
        System.out.println("���:"+result);
        
        
        System.out.print("�¼��� �Է��ϼ���(1~5)?");
        int seat=scan.nextInt();
        
        result=(seat==3||seat==5)?"���Ű���":"���źҰ���";
        System.out.println(result);
        
              ���׿����� aa=new ���׿�����();
        aa.display();
        
	}

}








