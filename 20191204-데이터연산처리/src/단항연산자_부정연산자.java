/*
 *    단항 : 피연산자(연산대상) 1개일 경우 
 *    부정연산자 : !
 *    ========
 *     = boolean을 사용한다 
 *     = true=>false , false => true  => 오라클
 *     
 *     for(int i=1;i<=10;i++)
 *     for(int i=10;i>=0;i--)
 *     bCheck=false;
 *     while(!bCheck)
 *     
 *     if((year%4==0 && year%100!=0)||(year%400==0))
 *     
 *     int x=10;
 *     int y=9;
 *     
 *     //if((x>y) || (++y==x))  => x=?(10) , y=?(10)
 *     
 *     789 => 7 8 9
 *     
 *     형상관리 => 깃허브 ...
 
 fsfsfsfsfsfsfsfsfsfsfsfsfsf
 *     
 */
public class 단항연산자_부정연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean bCheck=false;
        System.out.println("bCheck 변경전:"+bCheck);
        bCheck=!bCheck;
        System.out.println("bCheck 변경후:"+bCheck);
        
	}

}





