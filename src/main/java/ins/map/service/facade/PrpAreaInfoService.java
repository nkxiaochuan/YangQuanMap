package ins.map.service.facade;

import ins.map.schema.model.PrpAreaInfo;

public interface PrpAreaInfoService {

	public abstract PrpAreaInfo findAreaInfoByComCode(String comCode);
}
