package adapters;

import java.rmi.RemoteException;

import business.abstracts.GamerCheckService;
import entities.concretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {

		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		try {
			return proxy.TCKimlikNoDogrula(Long.valueOf(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(),
					gamer.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
