package app;

import model.Contenu;
import model.Cours;
import model.Etudiant;
import model.Quiz;
import model.Video;

public class mainEtudent {
    public static void main(String[] args) {
        


        Cours courJAVA = new Cours("programmation java");
        Video v1 = new Video("into java",15,false,"http://welcom.com");
        courJAVA.ajout_Contenu(v1);
        Quiz q1 = new Quiz("quis des var", 10, false, 60);
        courJAVA.ajout_Contenu(q1); 

        Etudiant ali = new Etudiant("Ali", "samad", "bf34", 20);
        courJAVA.inscrire(ali);

        courJAVA.affich_Contenu();

        ali.ajout_lis_cont_complete(v1);
        ali.ajout_lis_cont_complete(q1);
        //ajoooooooooooooot
        courJAVA.calc_progress(ali);
        courJAVA.updat_progress(ali);
        courJAVA.afficher_progress_conten(ali);
    }
}
