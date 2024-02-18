package com.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8 {

	public static void main(String[] args) {
		ProductInfo info=new ProductInfo("channu","123",2,10);
		ProductInfo info1=new ProductInfo("charlie","456",0.45,12);
		ProductInfo info2=new ProductInfo("ram","780",3,13);
		ProductInfo info3=new ProductInfo("shyam","343",0.33,19);
		
		List<ProductInfo> products=new ArrayList<>(
			Arrays.asList(new ProductInfo[]{info,info1,info2,info3})	
				);
		System.out.println(products);
		
		int sum=products.stream().filter((n)->n.getPrice()<1).map((n->n.getQuantity())).reduce(0,(n1,n2)->(n1+n2));
				System.out.println(sum);

	}

}





