/*
 *    대입연산자 (오른쪽 => 왼쪽)
 *      =>  =    => a=10; 10을 a메모리에 첨부 
 *      복합대입 연산자 
 *      =>  +=   
 *          int a=10;
 *          a+=10 ;     => 20
 *          =====
 *            a=a+10
 *            
 *          int a=10;
 *          a+=1  ===>  a=a+1 ==> 11
 *          
 *      => -=
 *         int a=10;
 *         a-=5;    =====> 5
 *         a=a-5;
 *         
 *      => *=
 *         int a=10;
 *         a*=3 ======> 30
 *         a=a*3 ==> 30
 *         
 *      => /=
 *         int a=10;
 *         a/=2 =======> 5
 *         a=a/2  => a=10/2 ==> 5
 *         
 *      => int a=10;
 *         a<<=2;  ==> 40
 *         
 *         a=a<<2  ==> 40
 *         
 *         int a=10;
 *         a>>=2   ==> 2  ==> 10/2^2 ==> 10/4 ==> 2
 *         
 *      => &=
 *         int a=10;
 *         a&=3;  
 *         
 *         a=a&3  
 *           1010
 *           0011
 *           =====
 *           0010  ==> 2
 *           
 *      => |=
 *         int a=10;
 *         a|=3;
 *         a=a|3   ===>  10|3
 *                       =====
 *                       1010
 *                       0011
 *                       =====
 *                       1011  ==> 11
 *      => ^=
 *         int a=10;
 *         a^=3;
 *         =====     1010
 *                   0011
 *                   =====
 *                   1001  ==> 9
 *                   
 *      ====>   = , +=  , -= 
 *      
 *      
 *      데이터형 
 *        byte : file,network
 *        int , long 
 *        double 
 *        String 
 *        boolean
 *        ====================
 *        연산자 
 *          ++ , --  , ! , (type)
 *          +,-,*,/,%
 *          && ||
 *          == , < ,> ,<= ,>=
 *          = , += ,-=
 *          ? :
 */
public class 이항연산자_대입연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10; // 10을 a에 대입 
        // 복합 대입 연산자 
        a+=1; // a에 1을 더한값을 대입 ==> a=a+1
        System.out.println("a="+a);
        
        // 한개 증가 ==> a++,++a,a+=1,a=a+1
        int b=10;
        b++;
        b++;
        b+=10;
        
	}

}









