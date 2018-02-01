package uniresolver.examples;
import uniresolver.did.DIDDocument;
import uniresolver.driver.did.btcr.DidBtcrDriver;
import uniresolver.driver.did.btcr.bitcoinconnection.BlockcypherAPIBitcoinConnection;

public class TestDriverDidBtcr {

	public static void main(String[] args) throws Exception {

		DidBtcrDriver driver = new DidBtcrDriver();
		driver.setBitcoinConnection(BlockcypherAPIBitcoinConnection.get());

		DIDDocument ddo = driver.resolve("did:btcr:xkrn-xzcr-qqlv-j6sl");
		System.out.println(ddo.serialize());
	}
}