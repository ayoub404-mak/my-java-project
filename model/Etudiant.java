package model;

import java.util.ArrayList;
 

public class Etudiant {
    private String nom;
    private String prenom;
    private String CNE;
    private int age ;
    
    private ArrayList<Contenu> list_cont_complite=new ArrayList<>();

    public Etudiant(){}
    public Etudiant(String nom,String prenom,String CNE,int age){
        setNom(nom);
        setPrenom(prenom);
        setCNE(CNE);
        setAge(age);
    }

     public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCNE() {
        return CNE;
    }

    public void setCNE(String CNE) {
        this.CNE = CNE;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void  aff_list_cont_complite(){
         for (Contenu v : list_cont_complite){
            v.afficherDetails();
        }
    }
    public int size_of_content_complet(){
        return list_cont_complite.size();
    }
    
  
    public void ajout_lis_cont_complete(Contenu c){
        c.set_estComplete(true);
        list_cont_complite.add(c);
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())return false;

        Etudiant other = (Etudiant) obj;
        return CNE.equals(other.CNE);

   
}
 
@Override
public int hashCode() {
    return CNE != null ? CNE.hashCode() : 0;
}

}
