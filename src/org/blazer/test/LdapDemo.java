package org.blazer.test;


import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

public class LdapDemo {

	DirContext ctx = null;

	public LdapDemo() {
		init();
	}

	/**
	 * init ldap config
	 * 
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean init() {
		boolean flag = false;
		Hashtable env = new Hashtable();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, "ldap://10.100.102.14:1389");
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.SECURITY_PRINCIPAL, "uid=kk_bind,ou=Application,ou=People,dc=bizenit,dc=com");
		env.put(Context.SECURITY_CREDENTIALS, "K0G3x4Gyf93Q");
		env.put("com.sun.jndi.ldap.connect.pool", "true");
		try {
			ctx = new InitialDirContext(env);
			flag = true;
			// System.out.println("authentication success");
		} catch (javax.naming.AuthenticationException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * search
	 */
	public NamingEnumeration<SearchResult> search(String basedn, String s) {
		// 设置返回的属性，可以使用*来返回大部份的属性值，但如
		// ds-pwp-account-disabled/modifytimestamp/这些特殊属性需要明确写出来才会返回
		String[] attrs = { "cn", "departmentnumber", "*" };
		NamingEnumeration<SearchResult> en = null;
		try {
			SearchControls constraints = new SearchControls();
			constraints.setSearchScope(SearchControls.SUBTREE_SCOPE);
			constraints.setReturningAttributes(attrs);
			en = ctx.search(basedn, s, constraints);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return en;
	}

	public String getObjectsByFilter(String basedn, String filter) throws NamingException {
		NamingEnumeration<SearchResult> ne = search(basedn, filter);
		String dn = null;
		if (ne != null)
			while (ne.hasMoreElements()) {
				SearchResult sr = ne.nextElement();
				dn = sr.getNameInNamespace();
				System.out.println(dn);
//				// 获取cn属性
				Attributes attrs = sr.getAttributes();
//				Attribute cnAttr = attrs.get("cn");
//				Object cnobj = cnAttr.get();
//				if (cnobj != null) {
//					String cn = cnobj.toString();
//					System.out.println("cn=" + cn);
//				}
//				// 获取departmentnumber属性
//				Attribute deptAttr = attrs.get("departmentnumber");
//				if (deptAttr != null) {
//					Object deptobj = deptAttr.get();
//					if (cnobj != null) {
//						String dept = deptobj.toString();
//						System.out.println("dept=" + dept);
//					}
//				}
//				// 获取其他属性类似
				NamingEnumeration<String> ids = attrs.getIDs();
				while (ids.hasMore()) {
					System.out.println(ids.next() + "=" + attrs.get(ids.next()).get());
				}
				System.out.println("======================================================================");
			}
		return dn;
	}

	// 测试主方法
	public static void main(String[] args) {
		LdapDemo ldapDemo = new LdapDemo();
		// 查询用户，加“*”模糊查询
		String filter = "(smart-type=E1)";
		String basedn = "ou=People,dc=bizenit,dc=com";
		try {
			ldapDemo.getObjectsByFilter(basedn, filter);
		} catch (NamingException e) {
			e.printStackTrace();
		}

		// 查询组织，加“*”模糊查询
		String oufilter = "(smart-type=E1)";
		String oubasedn = "ou=Organizations,dc=bizenit,dc=com";
		try {
			ldapDemo.getObjectsByFilter(oubasedn, oufilter);
			// ldapDemo.ctx.close();
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
