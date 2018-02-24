package taufiq.com.ahmadtaufiqhidayat_1202152178_modul3.recyclerView;

/**
 * Created by taufiq on 25/02/18.
 */

public class ListItem {

    public String title;
    public String description;
    public int foto;


    public ListItem(String title, String description, int foto) {
        this.title = title;
        this.description = description;
        this.foto = foto;
    }


    public String getTitle() {
        return title;
    }

    public int getFoto() {
        return foto;
    }

    public String getDescription() {
        return description;

    }
}
