/*
 *    ����ȯ (boolean�� ����)    (int)"10" Integer.parseInt("10")
 *                           (String)10 String.valueOf(10)
 *    =====
 *      Up     c>='A'  => c>=65
 *      Down   int => char
 *             (char)65
 *             double => int
 *             (int)10.5
 *             
 *             char,short,byte ==> ���� (int)
 *             
 *             (double)10
 *             
 *             byte<char,short<int<long<float<double
 *             
 *             
 *             && || !  ==> �� (true/false)
 *             => if
 */
public class ���׿�����_��������2 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ����� => boolean 
		boolean b1=(6<7) && (7==7); // true
		//         ture      true ==> &&
		System.out.println("b1="+b1);
		
		b1=(6>7) && (7==7); // false
		System.out.println("b1="+b1);
		
		b1=(6>7) || (7==7); //true
		System.out.println("b1="+b1);
		
		b1=(6<7) || (7==7); //true
		System.out.println("b1="+b1);
		
		b1=(6>7) || (7!=7); //false
		System.out.println("b1="+b1);
		// true true (&&)
		// true (||)
	}

}







