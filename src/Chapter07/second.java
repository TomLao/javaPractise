package Chapter07;

import java.util.HashSet;

import experiment06_1.Student;

class Person{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {}
		
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
		
	//重写hashcode方法,以name的hashcode作为判断重复的依据
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;	//判断是否为同一对象，是返回true
		
		if(!(obj instanceof Person))
			return false;	//判断对象是否为student对象，不是返回false
		
		Person stu=(Person) obj;				//强制转换类型为Student对象
		return this.name.equals(stu.getName());	//判断名字是否相同，String的equals()
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class second {
	public static void main(String[] args) {
		HashSet<Person> hashSet=new HashSet<Person>();	//用hashSet来存储，无序，不重复
														//要指定关键值
		Person p1=new Person("Lao",12);
		Person p2=new Person("He",15);
		Person p3=new Person("Ze",20);
		Person p4=new Person("Ze",10);
		Person p5=new Person("He",23);
		hashSet.add(p1);
		hashSet.add(p2);
		hashSet.add(p3);
		hashSet.add(p4);
		hashSet.add(p5);
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		for(Object obj:hashSet) {
			Person person=(Person)obj;
			System.out.println(person.getName()+" "+person.getAge());
		}
		
//		HashSet<Integer> hs=new HashSet<Integer>();
//		hs.add(3);
//		hs.add(3);
//		hs.add(3);
//		hs.add(333);
//		hs.add(3);
//		System.out.println(hs);
//		System.out.println(hs.size());
	}
}
