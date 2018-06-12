package com.ogcg.singleton;

public class Singleton {
	
	// La palabra static significa que la variable pertenece a la clase, no a una instancia de un objeto
	// No se referencia con this. Sino con el nombre de la clase como tal.
	public static int num;
	
	private Singleton(){
		Singleton.num += 1;
	}
    
    private static class SingletonHelper{
        private static final Singleton INSTANCE = new Singleton();
    }
    
    public static Singleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
    
    public void readNum() {
    	System.out.println(num);
    }
    
    
}
