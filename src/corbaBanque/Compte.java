package corbaBanque;

/**
 * corbaBanque/Compte.java . Generated by the IDL-to-Java compiler (portable),
 * version "3.2" from Banque.idl mercredi 1 d�cembre 2021 08 h 51 WAT
 */

public final class Compte implements org.omg.CORBA.portable.IDLEntity {
	public int code = (int) 0;
	public double solde = (double) 0;

	public Compte() {
	} // ctor

	public Compte(int _code, double _solde) {
		code = _code;
		solde = _solde;
	} // ctor

	public int getCode() {
		return this.code;
	}

	public double getSoulde() {
		return this.solde;
	}

	public String toString() {
		return "Code : " + code + " Soulde : " + solde;

	}

	public void crediter(double soulde) {

		this.solde += soulde;

	}

	public void debiter(double soulde) {

		this.solde -= soulde;

	}

} // class Compte
