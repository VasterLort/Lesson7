package by.it_academy.VasterLord.base_class;

public abstract class Base {
		private String name;
		private static int counter;
		private int id;
		
		static {
			counter = 1;
		}
		
		public Base(String name) {
			this.name = name;
			id = counter++;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int getId() {
			return id;
		}
		
		public void display() {
			System.out.println("ID ���� " + getId());
			System.out.println("�������� ����: " + getName());
		}
}
