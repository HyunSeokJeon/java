package chap11.sec05.Exam04_getproperty;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	public static void main(String[] args) {
		
		// �ڹ� ����
		System.out.println(System.getProperty("java.version"));
		
		// JRE ���ϰ��
		System.out.println(System.getProperty("java.home"));
		
		// ����� OS�̸�
		System.out.println(System.getProperty("os.name"));
		
		
		System.out.println(System.getProperty("file.separator"));
		
		// ����� �̸�
		System.out.println(System.getProperty("user.name"));
		
		// Ȩ ���丮
		System.out.println(System.getProperty("user.home"));
		
		// ���� �۾� ���� ���丮 ���
		System.out.println(System.getProperty("user.dir"));
		
		System.out.println("-----------------------------------------------------------");
		
		// map �ڷᱸ��: {key:value} ��) {String : String} <-- Properties
		Properties prop = System.getProperties();
		
		// set �ڷᱸ��: ������ ����, �ڷᰡ �ߺ��� �� ����, null ���
		// set<Object> Properties���� keyset()�޼ҵ�� 
		// Object�� ����ִ� Set�� ������
		Set<Object> keys = prop.keySet();
		
		for(Object key : keys) {
			//				   String key �� 		   property�� ���
			System.out.println(key.toString() + " : " +prop.getProperty(key.toString()));
		}
	}
}
