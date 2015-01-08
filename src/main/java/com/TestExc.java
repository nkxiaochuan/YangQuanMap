package com;

public class TestExc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			String a =null;
			String b= "asdf";
			if(a.equals(b)){
				System.out.println("asdf");
			}
		}catch(Exception e){
			System.out.println("asd");
			try {
				String a =null;
				String b= "asdf";
				if(a.equals(b)){
					System.out.println("asdf");
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println("Asdfasdf");
			}
		}

	}

}
