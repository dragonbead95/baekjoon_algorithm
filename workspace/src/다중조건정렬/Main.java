package 다중조건정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

		
	public static class Apple{
		private String color;
		private Integer weight;
		
		public Apple()
		{
			
		}
		
		public Apple(String color, Integer weight) {
			this.color = color;
			this.weight = weight;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public Integer getWeight() {
			return weight;
		}
		public void setWeight(Integer weight) {
			this.weight = weight;
		}
		@Override
		public String toString() {
			return "Apple [color=" + color + ", weight=" + weight + "]";
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Apple> inventory = Arrays.asList(new Apple("green",50),
												new Apple("gray",50),
												new Apple("pink",100),
												new Apple("red",50));
		
		// 무게 오름차순 정렬
		inventory.sort(Comparator.comparing(Apple::getWeight));
		System.out.println("무게(weight) 오름차순 정렬");
		for(Apple apple : inventory)
		{
			System.out.println(apple.toString());
		}
		System.out.println();
	
		// 무게 내림차순 정렬
		inventory.sort(Comparator.comparing(Apple::getWeight).reversed());
		System.out.println("무게(weight) 내림차순 정렬");
		for(Apple apple : inventory)
		{
			System.out.println(apple.toString());
		}
		System.out.println();
		
		// 무게 오름차순 정렬(무게가 같으면 색 오름차순 정렬)
		inventory.sort(Comparator.comparing(Apple::getWeight).thenComparing(Apple::getColor));
		System.out.println("무게(weight)->색(color) 오름차순 정렬");
		for(Apple apple : inventory)
		{
			System.out.println(apple.toString());
		}
		System.out.println();
		
		// 무게 오름차순 정렬(무게가 같으면 색 내림차순 정렬)
		Comparator<Apple> reversedColorComparator = Comparator.comparing(Apple::getColor).reversed();
		inventory.sort(Comparator.comparing(Apple::getWeight).thenComparing(reversedColorComparator));
		
		System.out.println("무게(weight) 오름차순 -> 색(color) 내림차순 정렬");
		for(Apple apple : inventory)
		{
			System.out.println(apple.toString());
		}
		System.out.println();
		
		// 색 오름차순 정렬
		inventory.sort(Comparator.comparing(Apple::getColor));
		System.out.println("색(color) 내림차순 정렬");
		for(Apple apple : inventory)
		{
			System.out.println(apple.toString());
		}
		System.out.println();
	}

}
