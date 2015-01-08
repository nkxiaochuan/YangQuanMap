package ins.platform.service.facade;

import ins.framework.common.Page;
import ins.framework.common.QueryRule;
import ins.platform.schema.model.PrpDuser;
import ins.platform.schema.vo.PrpDuserVo;

import java.util.List;

public abstract interface UserService {
	public abstract PrpDuser findUserByUserCode(String paramString);

	public abstract PrpDuser getUser(String paramString);

	public abstract Page findUser(QueryRule paramQueryRule, int paramInt1,
			int paramInt2);

	public abstract PrpDuser getUserByUserCode(String paramString);

	public abstract void update(PrpDuser paramPrpDuser);

	public abstract void updateNothing();

	public abstract void changePassword(String paramString1,
			String paramString2, String paramString3);

	public abstract void save(PrpDuser paramPrpDuser);

	public abstract void delete(String paramString);

	public abstract void unvalidUser(String paramString);

	public abstract String getComCodeByUserCode(String paramString);

	public abstract Page findAllUser(String paramString1, String paramString2);

	public abstract List listUserCodeSelect(List<String> paramList);

	public abstract PrpDuser findByUserCode(String paramString);

	public abstract List<PrpDuser> findByUserCodeByQueryRule(String paramString);

	public abstract List<PrpDuser> findByPasswordSort(String paramString);

	public abstract Page findByPage(String paramString, int paramInt1,
			int paramInt2);

	public abstract List<PrpDuser> findByHqlByUserCode(String paramString);

	public abstract List<PrpDuser> findByHqlByComCode(String paramString);

	public abstract List<Object[]> findByHqlByAllStatus(String paramString1,
			String paramString2);

	public abstract List<String> findByHqlByValidStatus(String paramString);

	public abstract List<Object[]> findByHqlByArticleCode(String paramString);
	
}