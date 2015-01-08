package ins.platform.service.facade;

import ins.platform.schema.model.UtiLicense;
import java.util.List;

public abstract interface LicenseService {
	public abstract List<UtiLicense> findLocalLicense();

	public abstract void saveLicense(UtiLicense paramUtiLicense);

	public abstract boolean checkLocalLicense();

	public abstract UtiLicense findValidLicense();
}