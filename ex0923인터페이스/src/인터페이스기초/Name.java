package 인터페이스기초;

public class Name extends Person implements Codable{

	@Override
	public void coding() {
		System.out.println("바뀌었나?");
	}

}
