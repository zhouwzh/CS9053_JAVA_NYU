package PartII;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Person {
	public static void main(String[] args){
		long a = 1000000000000L;
		// float b = (4E+38)F;
		int aa = Integer.MAX_VALUE;

		int[] mylist = {1,2,3};
		System.out.println(mylist.getClass());
		ArrayList<Person> people = new ArrayList<>();
		people.add(new Person("Don",28));
		people.add(new Person("Blake",25));
		people.add(new Person("Alan",22));
		people.add(new Person("Cindy",26));
		
		people.sort(Comparator.comparingInt(Person::getAge));
		people.sort((p1,p2) -> Integer.compare(p1.getAge(),p2.getAge()));
		System.out.println("Sort by age:");
		people.forEach(System.out::println);

		System.out.println();

		Predicate<Person> lambda_filter = person -> person.getAge() >25;
		ArrayList<Person> olderThan25 = people.stream().filter(lambda_filter).collect(Collectors.toCollection(ArrayList::new));
		// ArrayList<Person> = filtered = people.stream().filter(p->p.getAge()>25).collect(Collectors.toList());
		System.out.println("Person older than 25:");
		olderThan25.forEach(System.out::println);

	}

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	@Override
	public String toString(){
		return "[Name="+this.name+", Age=" + this.age+"]";
	}
}
