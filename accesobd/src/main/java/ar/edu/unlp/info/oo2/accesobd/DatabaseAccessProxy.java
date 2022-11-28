package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseAccessProxy implements DatabaseAccess {

	private String password;
	private Boolean authenticated;
	private DatabaseAccess dbAccess;

	public DatabaseAccessProxy(String password) {
		super();
		this.setPassword(password);
		this.setAuthenticated(false);
		this.setDbAccess(new DatabaseRealAccess());
	}

	/**
	 * Getters & setters
	 */
	private void setAuthenticated(Boolean authenticated) {
		this.authenticated = authenticated;
	}

	private void setPassword(String password) {
		this.password = password;
	}

	private void setDbAccess(DatabaseAccess dbAccess) {
		this.dbAccess = dbAccess;
	}

	private Boolean getAuthenticated() {
		return this.authenticated;
	}

	private String getPassword() {
		return this.password;
	}

	private DatabaseAccess getDbAccess() {
		return this.dbAccess;
	}

	// Chequear si está autenticado
	public Boolean isAuthenticated() {
		return this.getAuthenticated();
	}

	// Autenticar usuario
	public Boolean authenticate(String password) {
		if (this.getPassword().equals(password)) {
			this.setAuthenticated(true);
			return true;
		}
		return false;
	}

	// Autenticar usuario
	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.isAuthenticated()) {
			System.out.print("entro");
			return this.getDbAccess().insertNewRow(rowData);

		}
		return 0;

	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (this.isAuthenticated()) {
			return this.getDbAccess().getSearchResults(queryString);
		}
		return null;
	}

}
