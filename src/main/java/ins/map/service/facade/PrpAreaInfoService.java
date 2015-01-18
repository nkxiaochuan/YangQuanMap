package ins.map.service.facade;

import ins.framework.common.Page;
import ins.framework.common.QueryRule;
import ins.map.schema.model.PrpAreaInfo;

import java.util.List;

public interface PrpAreaInfoService {

	public abstract PrpAreaInfo findAreaInfoByComCode(String comCode);
	public abstract List<PrpAreaInfo> findAreaInfos();
	public abstract void updateAreaInfo(PrpAreaInfo info);
	public abstract void delete(String comCode);
	public abstract void addAreaInfo(PrpAreaInfo info);
	public Page findPrpAreaInfo(QueryRule queryRule, int pageNo, int pageSize);
	public abstract void save(PrpAreaInfo info);
}
