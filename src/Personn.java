
public class Personn {
	
	private int _personnNumber;
	private String  _personn_Code;
	private String  _personn_Name;
	private String  _personn_Bdate;
	private String  _personn_Adresse;
	private double  _salary;
	private boolean  _isActive;
	public int get_personnNumber() {
		return _personnNumber;
	}
	public void set_personnNumber(int _personnNumber) {
		this._personnNumber = _personnNumber;
	}
	public String get_personn_Code() {
		return _personn_Code;
	}
	public void set_personn_Code(String _personn_Code) {
		this._personn_Code = _personn_Code;
	}
	public String get_personn_Name() {
		return _personn_Name;
	}
	public void set_personn_Name(String _personn_Name) {
		this._personn_Name = _personn_Name;
	}
	public String get_personn_Bdate() {
		return _personn_Bdate;
	}
	public void set_personn_Bdate(String _personn_Bdate) {
		this._personn_Bdate = _personn_Bdate;
	}
	public String get_personn_Adresse() {
		return _personn_Adresse;
	}
	public void set_personn_Adresse(String _personn_Adresse) {
		this._personn_Adresse = _personn_Adresse;
	}
	public double get_salary() {
		return _salary;
	}
	public void set_salary(double _salary) {
		this._salary = _salary - (_salary* 0.10);
	}
	public boolean is_isActive() {
		return _isActive;
	}
	public void set_isActive(boolean _isActive) {
		this._isActive = _isActive;
	}
	

}
