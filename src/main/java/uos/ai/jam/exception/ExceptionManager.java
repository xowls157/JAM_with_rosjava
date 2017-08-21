package uos.ai.jam.exception;

import java.util.List;

import uos.ai.jam.Interpreter;

/**
 * ExceptionManager interface
 * 
 * @author	Hyunju Shin <jetzt82@gmail.com>
 * @since	2.0
 * @update	2.0
 */
public interface ExceptionManager {
	/**
	 * ExceptionModel�� �����ϱ� ���� factory�� �����ϴ� �޼ҵ�.
	 * �ش� �޼ҵ尡 ȣ��Ǹ� ExceptionManager�� factory�� ����ؼ�
	 * ExceptionModel�� �����ϰ� ��ü�Ѵ�.
	 */
	public void setModelFactory(ExceptionModelFactory factory);
	
	/**
	 * Exception tree���� �ֻ���(root) Exception�� ��ȯ�ϴ� �޼ҵ�.
	 */
	public String getRootException();
	
	/**
	 * �־��� name(canonical-name)�� ������ exception�� ã��,
	 * �ش� exception�� �θ� exception�� ��ȯ�ϴ� �޼ҵ�.
	 * ���� �־��� name�� ������ exception�� ������ null�� ��ȯ.
	 */
	public String getParentException(String name);
	
	/**
	 * �־��� exception instance�κ��� exception (class)�� ã��,
	 * �ش� exception�� �θ� exception�� ��ȯ�ϴ� �޼ҵ�.
	 * ���� �־��� exception instance�� null�̰ų�
	 * �������� instance�̸� null�� ��ȯ.
	 */
	public String getParentException(AgentRuntimeException exception);
	
	/**
	 * �־��� name(canonical-name)�� ������ exception�� ã��,
	 * �ش� exception�� �ڽ� exceptions�� ��ȯ�ϴ� �޼ҵ�.
	 * ���� �־��� name�� ������ exception�� ������ ���̰� 0�� array�� ��ȯ.
	 */
	public String[] getChildrenExceptions(String name);
	
	/**
	 * �־��� exception instance�κ��� exception (class)�� ã��,
	 * �ش� exception�� �ڽ� exceptions�� ��ȯ�ϴ� �޼ҵ�.
	 * ���� �־��� exception instance�� null�̰ų�
	 * �������� instance�̸� ���̰� 0�� array�� ��ȯ.
	 */
	public String[] getChildrenExceptions(AgentRuntimeException exception);
	
	/**
	 * �־��� exception instance�κ��� exception (class)�� ã��,
	 * root�κ��� �ش� exception������ ��θ� ��ȯ�ϴ� �޼ҵ�.
	 */
	public String[] getPathToRoot(String name);
	
	/**
	 * �־��� name(canonical-name)�� ������ �� exception�� ã��,
	 * parent exception�� child exception�� �������� Ȯ���ϴ� �޼ҵ�.
	 */
	public boolean isAncestor(String parent, String child);
	
	/**
	 * parent exception�� child exception�� �������� Ȯ���ϴ� �޼ҵ�.
	 */
	public boolean isAncestor(AgentRuntimeException parent, String child);
	
	/**
	 * �־��� name(canonical-name)�� ������ �� exception�� ã��,
	 * child exception�� parent exception�� �ļ����� Ȯ���ϴ� �޼ҵ�.
	 */
	public boolean isDescendant(String child, String parent);
	public boolean isDescendantOrEqual(String child, String parent);
	
	
	/**
	 * child exception�� parent exception�� �ļ����� Ȯ���ϴ� �޼ҵ�.
	 */
	public boolean isDescendant(AgentRuntimeException child, String parent);
	public boolean isDescendantOrEqual(AgentRuntimeException child, String parent);
	
	
	/**
	 * �־��� child name�� ������ exception node�� ������ ��,
	 * �־��� parent name�� ������ exception node�� �߰��ϴ� �޼ҵ�.
	 */
	public boolean addNodeInto(String child, String parent);
	
	/**
	 * �־��� name�� ������ exception node��
	 * �θ� node�κ��� �����ϴ� �޼ҵ�.
	 */
	public boolean removeNodeFromParent(String child);
	
	/**
	 * �־��� name�� ������ exception node����
	 * ��� child node�� �����ϴ� �޼ҵ�.
	 */
	public boolean removeAllNode(String parent);
	
	/**
	 * Global exception �߻��� �˸��� �޼ҵ�.
	 * �ش� �޼ҵ尡 ȣ��Ǹ� ExceptionManager��
	 * ������ global exception ��Ͽ� exception�� �߰��ϰ� �����Ѵ�.
	 */
	public void throwException(AgentRuntimeException ex);
	
	/**
	 * ���� �����ǰ� �ִ�(���� ó������ ����) global exception ����� ��ȯ�ϴ� �޼ҵ�.
	 */
	public AgentRuntimeException[] getAllExceptions();
	
	/**
	 * ���� �����ǰ� �ִ�(���� ó������ ����) ��� global exception�� �����ϴ� �޼ҵ�.
	 * ��, �߻��� exception�� ó������ ������ �޼ҵ�.
	 */
	public void removeAllExceptions();
	
	/**
	 * �־��� GlobalCatch�� �߰��ϴ� �޼ҵ�.
	 */
	public void addGlobalCatch(GlobalCatch globalCatch);
	
	/**
	 * �־��� ��� GlobalCatch���� �߰��ϴ� �޼ҵ�.
	 */
	public void addAllGlobalCatch(List<GlobalCatch> list);
	
	/**
	 * �־��� ��� GlobalCatch���� �߰��ϴ� �޼ҵ�.
	 */
	public void addAllGlobalCatch(GlobalCatch[] list);
	
	/**
	 * �־��� GlobalCatch�� �����ϴ� �޼ҵ�.
	 */
	public void removeGlobalCatch(GlobalCatch globalCatch);
	
	/**
	 * ���� ���ο��� �����ǰ� �ִ� GlobalCatch ����� ��ȯ�ϴ� �޼ҵ�.
	 */
	public GlobalCatch[] getGlobalCatchs();
	
	/**
	 * Global exception�� ó���ϴ� �޼ҵ�
	 */
	public void execute(Interpreter interpreter);
}
