package one.modality.base.frontoffice.fx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.media.MediaPlayer;
import one.modality.base.frontoffice.entities.News;
import one.modality.base.frontoffice.entities.Podcast;

public class FXHome {
    public static final ObservableList<News> news = FXCollections.observableArrayList();
    public static final ObservableList<Podcast> podcasts = FXCollections.observableArrayList();
    public static MediaPlayer player;
}
