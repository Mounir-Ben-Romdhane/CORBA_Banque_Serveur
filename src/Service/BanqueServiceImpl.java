package Service;

import corbaBanque.Compte;
import corbaBanque.IBanqueRemotePOA;

public class BanqueServiceImpl extends IBanqueRemotePOA {
	public Compte compte[] = new Compte[100];
	public int i = 0;

	@Override
	public double conv(double mt) {
		// TODO Auto-generated method stub
		return mt / 3.1;
	}

	@Override
	public Compte getCompte(int code) {
		// TODO Auto-generated method stub
		int j = 0;
		while (j < compte.length) {
			if (compte[j].getCode() == code) {
				return compte[j];

			} else {
				j++;
			}
		}
		return null;
	}

	@Override
	public Compte[] getComptes() {
		/*
		 * Compte c1[]=new Compte[10]; int j=0; while(j<compte.length) {
		 * c1[j]=compte[j]; j++; } return c1;
		 */
		Compte[] cptes = new Compte[3];
		try {

			int j = 0;
			while (j <= compte.length) {
				cptes[j] = compte[j];
				j++;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return cptes;
	}

	@Override
	public void creeCompte(Compte c) {
		// TODO Auto-generated method stub
		compte[i] = c;
		i++;
		System.out.println("Compte ajouter avec secces!");
	}

	@Override
	public void verser(int code, double mt) {
		// TODO Auto-generated method stub
		int j = 0;
		while (j < compte.length) {
			if (compte[j].getCode() == code) {
				compte[j].crediter(mt);
				break;
			} else {
				j++;
			}
		}
	}

	@Override
	public void retirer(int code, double mt) {
		// TODO Auto-generated method stub
		int j = 0;
		while (j < compte.length) {
			if (compte[j].getCode() == code) {
				compte[j].debiter(mt);
				break;
			} else {
				j++;
			}

		}
	}

}
