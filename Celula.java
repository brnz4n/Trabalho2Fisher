package controller;

public class Celula {
	
	protected int id;
	protected int posicaox;
    protected int posicaoy;
    public boolean bug;
    public boolean dev;
    public Planeta planeta; 
    
    public Celula(int posicaoy, int posicaox,int id) {
    	
    	this.id = id;
        this.posicaox = posicaox;
        this.posicaoy = posicaoy;
        this.bug = false;
        this.dev = false;
        
    }
}
