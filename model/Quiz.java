package model;

public class Quiz extends Contenu{
    private int nbQuestions;

    public Quiz (){

    }
    public Quiz(String titre,int duree,boolean estComplete,int nbQuestions){
        super(titre,duree,estComplete);
        set_nbQuestions(nbQuestions);
    }

    public void set_nbQuestions(int nbQuestions){
        this.nbQuestions=nbQuestions;
    }

    public int get_nbQuestions(){
       return nbQuestions;
    }

    public void afficherDetails(){
        System.out.println("titre : "+get_titre()+"| complete :"+get_estComplete()+" | duree: "+get_duree()+" | nbQuestions: "+get_nbQuestions());
    }
}