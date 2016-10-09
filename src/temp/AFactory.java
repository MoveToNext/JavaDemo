package temp;

public class AFactory implements Factory{


	@Override
	public Product produce() {
		return new ProA();
	}

}
