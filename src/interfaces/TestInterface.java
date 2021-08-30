package interfaces;

public class TestInterface {
	public static void main(String[] args) {
      //IDataAccess data=new IDataAccess()  //: this is impossible
		IDataAccess data=new ImplementMYSQL();
		//data.insert();
		print(data);
		data=new OracleImplementation();
		//data.insert();
		print(data);
	}
	
	public static void print(IDataAccess data) {
		data.insert();
	}
}
