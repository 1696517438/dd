package com.test;

import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args)  {
		Scanner sc= new Scanner(System.in);
		System.out.println("������һ�������У�");
		int rowNumber=sc.nextInt();
		if(rowNumber % 2 !=0 && rowNumber>=3){
			for(int i=1; i<=rowNumber/2;i++){
				for(int j=0; j<=rowNumber/2-i;j++){
					System.out.print(" ");
				}
				for(int j=1;j<=2*i-1;j++){
					System.out.print("*");
				}
				System.out.println("");
			}
			for(int i=rowNumber/2+1; i>0;i--){
				for(int j=0; j<=rowNumber/2-i;j++){
					System.out.print(" ");
				}
				for(int j=1;j<=2*i-1;j++){
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		
			
				for(int i=1;i<=9/2;i++){
					for(int j =0;j<=9/2-i;j++){
						System.out.print(" ");
					}
					for(int j =1;j<=2*i-1;j++){
						if(j != 1&& j!=2*i-1){
							System.out.print(" ");
						}
						else{
							System.out.print("*");
						}
					}
					System.out.println("");
				}
				for(int i=9/2+1;i>0;i--){
					for(int j =0;j<=9/2-i;j++){
						System.out.print(" ");
					}
					for(int j =1;j<=2*i-1;j++){
						if(j != 1&& j!=2*i-1){
							System.out.print(" ");
						}
						else{
							System.out.print("*");
						}
					}
					System.out.println("");
				}
	}	
}

			/*Scanner  sc = new Scanner(System.in);
	       System.out.println("��������ݣ�");
	       int year =sc.nextInt();
	       System.out.println("�������·ݣ�");
	       int 4 =sc.nextInt();

	       boolean isRn;
	       int day=0;
	       //�ж��Ƿ�������
	       if(year%4==0&&year%100!=0||year%400==0)
	       {
	    	   isRn= true;
	       }
	       else
	       {
	    	   isRn=false;
	       }

	       int total=0;//�������֮ǰ������
	       for (int i = 1900; i < year; i++) {
	    	   if(i%4==0&&i%100!=0||i%400==0)
	    	   {
	    	   total=total+366;
	    	   }
	    	   else
	    	   {
	    	   total=total+365;
	    	   }

	}
	       System.out.println(total);
	       int monthDay=0;//�����·�֮ǰ������
	       for(int i=1;i<=month;i++)
	       {
	       switch(i)
	       {
	       case 1:
	       case 3:
	       case 5:
	       case 7:
	       case 8:
	       case 10:
	       case 12:day=31;
	                 break;
	       case 4:
	       case 6:
	       case 9:
	       case 11:
	    	       day=30;
	    	       break;
	       case 2:
	    	   if(isRn)
	    	   {
	    	   day=29;
	    	   }
	    	   else
	    	   {
	    	   day=28;

	    	   }

	       }
	       if(i<month)
	       {
	    	   monthDay=monthDay+day;

	       }
	       }
	       System.out.println(monthDay);
	       total=total+monthDay;//����1900��1��1�յ�����
	       System.out.println(total);
	       
	       int firstDay;//�洢���µ�һ��
	       int temp = 1+total%7;
	       if(temp==7)
	       {
	    	   firstDay=0;
	       }
	       else
	       {
	    	   firstDay=temp;
	       }

	 ������� 
	System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������");
	for (int nullNo = 0; nullNo < firstDay; nullNo++) {
	System.out.print("\t"); // ����ո�
	}
	for (int i = 1; i <= day; i++) {
	System.out.print(i + "\t");
	if ((total + i) % 7 == 6) { // �������Ϊ�������������
	System.out.println();
	}
	}
		
	*/	
	

		/*String answer;
		Scanner input = new Scanner(System.in);
		System.out.println("��ô������y/n��");
		answer=input.next();
		while(!(answer.equals("y"))){
			System.out.println("������㿪ʼѧϰӢ�ﵥ��");
			System.out.println("����ѧϰ��ѧ");
			System.out.println("������ϰӢ��");
			System.out.println("��ô������y/n��");
			answer=input.next();
		}
		System.out.println("˳����ҵ��");
		}
	}
	
	}
	System.out.println("");
		System.out.println("�������ع������ϵͳ  > �������");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("*******************************");
		System.out.println("��ѡ������Ʒ��ţ�");
		System.out.println("1.T��   2.����Ь 3. ������");
		System.out.println("*******************************");
		double sum=0;
		Scanner sc=new Scanner(System.in);
		int come=0;
		while(come==0){
			System.out.println("��������Ʒ��ţ�");
			int str=sc.nextInt();
			System.out.println("��������Ʒ������");
			int quantity=sc.nextInt();
			switch(str){
			case 1:
				double price=245; 
				System.out.println("T�� \t��245.0"+"\t��"+price*quantity);
				sum+=price*quantity;
				break;
			case 2:double price1=570;
				System.out.println("����Ь \t��570.0"+"\t��"+price1*quantity);
				sum+=price1*quantity;
				break;
			case 3:double price2=325;
				System.out.println("������ \t��325.0"+"\t��"+price2*quantity);
				sum+=price2*quantity;
				break;
				default:
					System.out.println("�������������������롣");
					break;
			}
		
			 System.out.println("��ѡ��y/n");
			 String com=sc.next();
			 if(com.equals("y")){
				 come=1;
				 System.out.println("���ι��������");
				 double discount=0.8;
					System.out.println("�۸�"+(sum));
					System.out.println("�ۿۣ�"+discount);
					System.out.println("�����ۿۺ���ʵ�ʼ۸��ǣ�"+(sum*discount));
					System.out.println("��������Ҫ���Ľ�");
					double pay=sc.nextDouble();
					System.out.println("��������ǣ�"+(pay-sum*discount));
				 break;
			 }
			 
		}
		 	
			}
}
	*/

//			
//		}	
//		int  sum=0;
//		for (int j = 1;  j< 8; j++) {
//		int num=1;
//		for (int i = j; i >0; i--) {
//			num*=i;
//		}
//		sum=sum+num;
//	}
//		System.out.println(sum);
		
//		int  sum=0;
//		int i=1;
//		int j=i;
//		while(i<8){
//		i++;
//		int num=1;
//		while (j >0) {
//		num*=j;
//		j--;
//		}
//		sum=sum+num;
//		}
//	System.out.println(sum);
//		System.out.print("��²⡰�������綯���ļ۸�2000~10000��:");
//		Scanner sc=new Scanner(System.in);
//		boolean succ=false;
//		Random random=new Random();
//		int number=random.nextInt(2000)+8000;
//		int a=0;
//
//		while(!succ){
//			a++;
//			int input=sc.nextInt();
//			if(a>5){
//				System.out.println("�Բ�������ζ�û�в¶ԣ��´�Ŭ���ɣ�");
//				System.out.println("���������綯���ļ۸��ǣ�"+number);
//				break;
//			
//		}
//			if(input>number){
//				System.out.println("��С�㣡");
//				System.out.println("�㻹��"+(6-a)+"����");
//				System.out.println("�ٲ�һ�ΰɣ�");
//				}else if(input<number){
//					System.out.println("�ٴ�㣡");
//					System.out.println("�㻹��"+(6-a)+"����");
//					System.out.println("�ٲ�һ�ΰɣ�");
//			}
//			else {
//				System.out.println("��ϲ��¶��ˣ�");
//				break;
//			}
//	}
		
//	}
//}
/*int a =1;
		int sum=0;
		while(a<=100){
			
			System.out.println(a);
			
			sum=sum+a;
			a=a+3;
		}
		System.out.println(sum);
		int a=1;
		long c=10;
		long sum=0;
		while(a<11){
			System.out.println(c-1);
			sum=sum+c;
			c*=10;
			a++;
		}
		System.out.println(sum);

		System.out.println("������һ����ݣ�");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
			
			System.out.println(year+"��������");
		}else{
			System.out.println(year+"����ƽ��");
		}
		System.out.println("������һ���·�(1~12)");
		int month=sc.nextInt();

		 if(month%2 != 0 && month <=7){
			System.out.println(month+"����31��");
		}else if(month%2 ==0 && month >7){
			System.out.println(month+"����31��");
		}else if(month == 2 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
			System.out.println(month+"��ֻ��29��");
		}else if(month == 2 ){
			System.out.println(month+"��ֻ��28��");
		}else if(month<=0|| month>12){
			System.out.println("�Բ�����������·�����");
		}else{
			System.out.println(month+"��ֻ��30��");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ��������ֵ��");
		int num1=sc.nextInt();
		System.out.println("������ڶ���������ֵ��");
		int num2=sc.nextInt();
		System.out.println("�����������������ֵ��");
		int num3=sc.nextInt();
		if(num1>num2){
			if(num2>num3){
				System.out.println("num1 ="+num1+"  num2="+num2+"  num=3"+num3);
			}else{
				if(num1>num3){
				System.out.println("num1 ="+num1+"  num3="+num3+"  num=2"+num2);
			}
			else{
				System.out.println("num3 ="+num3+"  num1="+num1+"  num2="+num2);
			}
			}
		}else{
			if(num1>num3){
				System.out.println("num2 ="+num2+"  num1="+num1+"  num3"+num3);
			}else{
				if(num2>num3){
					System.out.println("num2  ="+num2+"  num3="+num3+"  num1="+num1);
				}
				else{
					System.out.println("num3 ="+num3+"  num2="+num2+"  num1="+num1);
				}
			}
		}
		
		char a = '��';
		if(97<=a && a<=122){
			a=(char) (a-32);
			System.out.println(a);
			
		}else if(a>=65 && a <=90){
			a=(char) (a+32);
			System.out.println(a);
			
		}
		else{
			a++;
			System.out.println(a);
		}


		 int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		
		 int newArr[]=new int[oldArr.length];
		 
		 for(int i = 0 ; i < oldArr.length; i++){
		 if(oldArr[i]==0){
		 continue;
		 }
		 else{	
			 int j;
		 for ( j = 0; j < oldArr.length; j++) {
		 newArr[j]=oldArr[i];
		 System.out.println(newArr[j]);
		}
		 
	}	
}
		
		*/
