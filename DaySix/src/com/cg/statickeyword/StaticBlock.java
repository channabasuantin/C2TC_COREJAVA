package com.cg.statickeyword;


	public class StaticBlock {
		private int num1=10;
		private static int num2;
		
		
		
		
		static {
			System.out.println("welcome to static block:");
			num2=34;
			System.out.println(num2);
		}
		
		public StaticBlock() {
			System.out.println("object are invoked");
		}
		

	}

