package com.cg.arrays;
import java.util.Scanner;
public class MainMethodArrays {

	public static void main(String[] args) {


	
				
				Scanner sc= new Scanner(System.in);
				// int size=sc.nextInt();
				Student[] s=new Student[2];//create Student array type
				System.out.println("welcome to Student board");
				for(int r=0;r<s.length;r++) {
					s[r]=new Student();//student array object
					System.out.println("Enter Information of Student"+(r+1));
					System.out.println("enter student name");
					String names=sc.nextLine();// 
				//	s[r].setName(names);
					System.out.println("enter Student rollnumber");
					int rollNumbers=sc.nextInt();
					//s[r].setRollNumber(rollNumbers);
					System.out.println("enter college name");
					String collegeNames=sc.nextLine();
				//	s[r].setCollegeName(collegeNames);
				//	sobjr.nextLine();
					System.out.println("enter college code");
					int collegeCodes=sc.nextInt();
					//s[r].setCollegeCode(collegeCode);
				//	sc.nextLine();
					s[r].setValue(names, rollNumbers, collegeNames, collegeCodes);
					//System.out.println("done"+r+1);
					sc.nextLine();
				}
				for(int r=0;r<s.length;r++) {
					s[r].getValue();
				}
				

			}

		
	}


