package model;

public abstract class Contenu {
    private String titre;
    private boolean estComplete;
    private int duree;

    public Contenu(){

    }
    public Contenu(String titre,int duree,boolean estComplete){
        set_titre(titre);
        set_duree(duree);
        set_estComplete(estComplete);
    }
    
     
    public void set_titre(String titre){
        this.titre=titre;
    }
    public void set_estComplete(boolean estComplete){
        this.estComplete=estComplete;
    }
    public void set_duree(int duree){
        this.duree=duree;
    }

    public String get_titre(){
       return titre;
    }
    public boolean get_estComplete(){
        return estComplete;
    }
    public int get_duree(){
        return duree;
    }
    
    public abstract void afficherDetails();

}


