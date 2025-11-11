package model;
public class Video extends Contenu{
    private String urlVideo;

    public Video(){

    }
    public Video(String titre,int duree,boolean estComplete, String urlVideo){
        super(titre,duree,estComplete);
        set_urlVideo(urlVideo);

    }

    public void set_urlVideo(String urlVideo){
        this.urlVideo=urlVideo;
    }

    public String get_urlVideo(){
       return urlVideo;
    }

    public void afficherDetails(){
        System.out.println("duree: "+get_duree()+" | urlVideo: "+get_urlVideo());
    }

}