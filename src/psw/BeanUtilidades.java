package psw;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.beanutils.BeanUtils;

public class BeanUtilidades {
	
	public static void poblarBean(Object formBean, HttpServletRequest request) {
		poblarBean(formBean, request.getParameterMap());
	}
	/**
	 * 
	 * @param bean
	 * @param propertyMap
	 * 
	 * Rellena un bean basado en un Map: las keys del Map
	 * son los nobmres de propiedad del bean;
	 * Los valores de map son los valores de propiedad del bean.
	 * La conversiòn de tipo se realiza automàticamente
	 */
	
	public static void poblarBean(Object bean, Map propertyMap) {
		try {
			BeanUtils.populate(bean, propertyMap);
		} catch (Exception e) {

		}
	}

}
