package mih.me.SimpleSpringMVCProject;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	@Size(min=4, max=8, message = "����� 4 ��������")
	private String name;
	@Size(min=4, max=8, message = "����� 4 ��������")
	private String pwd;
	
	private boolean admin;
	
	@Override
	public String toString() {
		return "name:" + name + " password:" + pwd + " admin:" + admin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
}