//Program 5.4 Sorted list of students based on marks
import java.io.*;
public class student
{
String name;
int regdno, s1, s2;
float totalper;

public student()
	{
	name=" ";
	regdno=0;
	s1=0;
	s2=0;
	totalper=0;
	}
public void copy(student ob)
	{
	name =ob.name;
	regdno=ob.regdno;
	s1=ob.s1;
	s2=ob.s2;
	totalper=ob.totalper;
	}
public void getdata()
	{
	try
		{
		DataInputStream in;
		in=new DataInputStream(System.in);
		String s;
		System.out.println("Enter the student name:");
		name=in.readLine();
		System.out.println("Enter the student regdno:");
		s=in.readLine();
		regdno=Integer.parseInt(s);
		System.out.println("Enter the student marks(m1,m2):");
		s=in.readLine();
		s1=Integer.parseInt(s);
		s=in.readLine();
		s2=Integer.parseInt(s);
		totalper=((s1+s2)/2);
		}
	catch(Exception e)
		{
		System.out.println("I/O error"+e);
		System.exit(1);
		}
	}
public static void main(String args[])
	{
	student st[]=new student[10];
	int n=0;
	
	try
		{
		DataInputStream in;
		in=new DataInputStream(System.in);
		System.out.println("Enter the number of students:");
		String s = in.readLine();
		n=Integer.parseInt(s);
		}
	catch(Exception e)
		{
		System.out.println("I/O error"+e);
		System.exit(1);
		}
	for(int i=0;i<n;i++)
		{
		st[i]=new student();
		st[i].getdata();
		}
	student t=new student();
	for(int i=1;i<n;i++)
	for(int j=0;j<n-i;j++)
		if(st[j].totalper<st[j+1].totalper)
		{
		t=st[j];
		st[j]=st[j+1];
		st[j+1]=t;
		}
	for(int i=0;i<n;i++)
		{
		System.out.println("Name: "+st[i].name+" Regdno: "+st[i].regdno+" Totalpercentage: "+st[i].totalper);
		}
	}
}

Output:
Enter the number of students:
2
Enter the student name:
shankara
Enter the student regdno:
803
Enter the student marks(m1,m2):
91
88
Enter the student name:
venkata
Enter the student regdno:
811
Enter the student marks(m1,m2):
93
89
Name venkata Regdno 811 Totalpercentage 91.0
Name shankara Regdno 803 Totalpercentage 89.0
