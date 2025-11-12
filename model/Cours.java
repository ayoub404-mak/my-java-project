package model;

import java.util.*;

import service.Inscriptible;

public class Cours implements Inscriptible {
    private String nom;

    private ArrayList<Contenu> tout_Contenus=new ArrayList<>() ;
    private Map<Etudiant,Double> progress=new HashMap<>();

    public Cours(){}
    public Cours(String nom){
        this.nom=nom;
        //this.progress=new HashMap<>();
        
    }

    //public ArrayList getContenu(){
    //    return tout_Contenus;
    //}
    public void set_nom(String nom){
        this.nom=nom;
    }
    public String get_nom(){
        return nom;
    }
    public void ajout_Contenu(Contenu e){
        tout_Contenus.add(e);
    }
    public int get_size_tout_Contenus(){
        return tout_Contenus.size();
    }
    
    public void affich_Contenu(){
        for (Contenu v : tout_Contenus){
            v.afficherDetails();
        }
    }
    public double calc_progress(Etudiant e){
        if(tout_Contenus.size()!=0)
        return ((double)e.size_of_content_complet()/(tout_Contenus.size()))*100;
       else return 0;
    }
    public void updat_progress(Etudiant e){
        progress.put(e,calc_progress(e));
    }
    public void afficher_progress_conten(Etudiant e){
        System.out.println("Progresse de "+e.getNom()+" : "+calc_progress(e));
    }
    @Override
    public void inscrire(Etudiant etudiant){
        progress.put(etudiant, 0.0);
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())return false;

        Cours other = (Cours) obj;
        return nom==other.nom;
    }
   
}
