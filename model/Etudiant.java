package model;

import java.util.ArrayList;
 

public class Etudiant {
    private String nom;
    private String prenom;
    private String CNE;
    private int age ;
    
    private ArrayList<Contenu> list_cont_complite=new ArrayList<>();
    private ArrayList<Contenu> list_cont_NOcomplite=new ArrayList<>();

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

    public int size_of_content_complet(){
        return list_cont_complite.size();
    }
    
    public void ajout_lis_cont_NOcomplete(Contenu c){
        list_cont_NOcomplite.add(c);
    }
    public void ajout_lis_cont_complete(Contenu c){
        list_cont_NOcomplite.remove(c);
        list_cont_complite.add(c);
    }
   
}
