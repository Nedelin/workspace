package imdb.picturetrailer;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import imdb.desktop.model.Movie;

public class Picture {

    public static void viewPic(Stage primaryStage, Movie movie,Scene scene) {
        primaryStage.setTitle(" View Picture");
        WebView browser = new WebView();
        WebEngine webEngine = browser.getEngine();
        try {
			String content1 = new String(Files.readAllBytes(Paths.get("movies.txt")));
			String lines1[] = content1.split("\\r?\\n");
			for (String line1 : lines1) {
				String[] split1 = line1.split("\\|");
				if(movie.getName().equals(split1[0])){
					String picUrl = split1[3];
					webEngine.load(picUrl);
					break;
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}


        Button back = new Button("Go to table");
        back.setOnAction(e -> primaryStage.setScene(scene));
        BorderPane root = new BorderPane();
        root.setPrefSize(1850,850);
        root.setBottom(back);
        VBox layout = new VBox();
        layout.getChildren().addAll(browser, back);

        Scene newScene = new Scene(layout, 1850, 630);
        primaryStage.setScene(newScene);
        primaryStage.show();

    }
}
