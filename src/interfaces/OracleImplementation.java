package interfaces;

public class OracleImplementation implements IDataAccess {
	@Override
	public void insert() {
		System.out.println("Insert data in Oracle");
		
	}

	@Override
	public void read() {
		System.out.println("Read data in Oracle");
		
	}

	@Override
	public void update() {
		System.out.println("update data in Oracle");
		
	}

	@Override
	public void delete() {
		System.out.println("Delete data in Oracle");
		
	}
	
	

}
