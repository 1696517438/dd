package com.test;

import java.io.File;

public class Test1 {
	private static int level = 0;// ��ʾĿ¼�㼶

	public static void main(String[] args) {
		
		printDir(new File("d:\\����"));
	}

	/**
	 * �ݹ���ʾָ��Ŀ¼
	 * @param dir	ָ��Ŀ¼
	 */
	public static void printDir(File dir){
		// ��μ��
		if(dir == null){
			return ;
		}
		
		// ������ļ����߿�Ŀ¼��ֱ������ļ���
		if(dir.isFile() || dir.list().length == 0){
			System.out.println(dir.getName());
			return;
		}
		
		// ����������ݵ�Ŀ¼����ݹ����
		File[] fs = dir.listFiles();
		for (File f : fs) {
			if(f.isFile()){
				// ��ӡ�ո�
				System.out.print(getTab(level));
				// ��ӡ�ļ���
				System.out.println(f.getName());
			}else{
				// ��ӡ�ո�
				System.out.print(getTab(level));
				// ��ӡĿ¼��+\
				System.out.println(f.getName()+"\\");
				// �ݹ�
				level ++;// Ŀ¼�㼶 +1
				printDir(f);
				level --;
			}
		}
		
	}
	
	// ���Ŀ¼֮ǰ�Ŀհ�
	private static String getTab(int level){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < level; i++) {
			sb.append('\t');
		}
		return sb.toString();
	}
}

