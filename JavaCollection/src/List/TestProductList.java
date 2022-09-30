package List;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

import static utils.ShopUtils.populateProductList;

import utils.Category;
import utils.Product;

public class TestProductList {

	public static void main(String[] args) throws Exception {
		List<Product> list = populateProductList();
		list.forEach(System.out::println);
		int [] arr = {1,2,3,4,5};
//		Arrays.stream(arr).forEach(System.out::println);
		Category cat = Category.valueOf(new Scanner(System.in).next().toUpperCase());
		double price = 100;
		list.stream()
		.filter(p -> p.getProductCategory() == cat)
		.filter(p -> p.getPrice() < price)
		.forEach(System.out::println);
		System.out.println();
		
		list.stream()
		.sorted()
		.forEach(System.out::println);
		double sum = list.stream().mapToDouble(p -> p.getPrice()).sum();
		System.out.println(sum);
		
		OptionalDouble optional = list.stream().mapToDouble(p-> p.getPrice())
		.average();
		if(optional.isPresent())
			System.out.println(optional.getAsDouble());
		
		double db = list.stream().mapToDouble(p -> p.getPrice())
				.average().orElseThrow(()-> new Exception("Not Found"));
		System.out.println(db);
	}

}
