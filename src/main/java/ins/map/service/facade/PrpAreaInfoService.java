package ins.map.service.facade;

import ins.map.schema.model.PrpAreaInfo;

import java.util.List;

public interface PrpAreaInfoService {

	public abstract PrpAreaInfo findAreaInfoByComCode(String comCode);
	public abstract List<PrpAreaInfo> findAreaInfos();
	public abstract void updateAreaInfo(PrpAreaInfo info);
	public abstract void deleteAreaInfo(PrpAreaInfo info);
	public abstract void addAreaInfo(PrpAreaInfo info);
}
