package taufiq.com.ahmadtaufiqhidayat_1202152178_modul3.recyclerView;

/**
 * Created by taufiq on 25/02/18.
 */

public class ListItem {

    //inisiasi variabel
    public String title;
    public String description;
    public int foto;


    //create constructor
    public ListItem(String title, String description, int foto) {
        this.title = title;
        this.description = description;
        this.foto = foto;
    }


    //get title
    public String getTitle() {
        return title;
    }

    //get foto
    public int getFoto() {
        return foto;
    }

    //get description
    public String getDescription() {
        return description;

    }
}
