// ? :
// (조건문?값1:값2) => 웹(React => 삼항연산자)
// 조건(true) => 값1
// 조건(false) => 값2 
/*
 *     <%
 *          int sex=1;
 *          if(sex==1)
 *          {
 *     %>
 *             남자
 *     <%
 *          }
 *          else
 *          {
 *     %>
 *             여자 
 *     <%
 *          }
 *     %>
 *     ================================
 *     <%
 *         sex==1?"남자":"여자"
 *     %>
 */
import java.util.Scanner;
/*
 *   국어,영어,수학 점수를 입력받아서 평균 => 평균이 60이상이면 pass ,nopass
 *   
 *   // 나이를 입력 ==> 15세이상이면  (영화관람가능) / 이하 (영화관람불가)
 *   // 좌석 => 1 2 3 4 5 => 1,2,4 => 좌석예매 불가능 , 3,5 => 좌석예매가능
 */
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("국어 점수:");
        // 저장 
        int kor=scan.nextInt();
        System.out.print("영어 점수:");
        int eng=scan.nextInt();
        System.out.print("수학 점수:");
        int math=scan.nextInt();
        
        int avg=(kor+eng+math)/3;
        
        String result=avg>=60?"Pass":"NonPass";
        // age>=15?"":""
        
        System.out.println("결과:"+result);
        
        
        System.out.print("좌석을 입력하세요(1~5)?");
        int seat=scan.nextInt();
        
        result=(seat==3||seat==5)?"예매가능":"예매불가능";
        System.out.println(result);
        
              단항연산자 aa=new 단항연산자();
        aa.display();
        
	}

}








