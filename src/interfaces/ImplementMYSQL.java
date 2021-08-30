package interfaces;

public class ImplementMYSQL implements IDataAccess {

	@Override
	public void insert() {
		System.out.println("Insert data in MYSQL");
		
	}

	@Override
	public void read() {
		System.out.println("Read data in MYSQL");
		
	}

	@Override
	public void update() {
		System.out.println("update data in MYSQL");
		
	}

	@Override
	public void delete() {
		System.out.println("Delete data in MYSQL");
		
	}

	public void show() {
		System.out.println("Hello there");

	}
}
