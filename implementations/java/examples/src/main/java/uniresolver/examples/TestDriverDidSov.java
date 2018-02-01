package uniresolver.examples;
import uniresolver.did.DIDDocument;
import uniresolver.driver.did.sov.DidSovDriver;

public class TestDriverDidSov {

	public static void main(String[] args) throws Exception {

		DidSovDriver driver = new DidSovDriver();
		driver.setLibIndyPath("./sovrin/lib/");
		driver.setPoolConfigName("live");
		driver.setPoolGenesisTxn("live.txn");

		DIDDocument ddo = driver.resolve("did:sov:WRfXPg8dantKVubE3HX8pw");
		System.out.println(ddo.serialize());
	}
}