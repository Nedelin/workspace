package imdb.desktop.view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;

import imdb.desktop.model.Movie;
import imdb.desktop.model.Rating;
import imdb.picturetrailer.Picture;
import imdb.picturetrailer.Trailer;
import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;
import org.controlsfx.control.TextFields;

public class LoginScene extends Application {

	private Stage window;

	private Scene scene1, scene2;
	private TableView<Movie> table;
	private TextField searchField;

	private TextField nameInput, yearInput, avarageRatingInput, urlTrailerInput, directorInput, actorsInput;

    private ObservableList<Movie> data;

	private TextField urlPictureInput;

	public static void main(String[] args) {
		launch(args);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("CSS Customization");

		TableColumn<Movie, String> nameColumn = new TableColumn<>("Name");
		nameColumn.setMinWidth(200);
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

		TableColumn<Movie, Integer> yearColumn = new TableColumn<>("Year");
		yearColumn.setMinWidth(200);
		yearColumn.setCellValueFactory(new PropertyValueFactory<>("year"));

		TableColumn<Movie, String> avarageRatingColumn = new TableColumn<>("Rating");
		avarageRatingColumn.setMinWidth(200);
		avarageRatingColumn
				.setCellValueFactory(new Callback<CellDataFeatures<Movie, String>, ObservableValue<String>>() {
					@Override
					public ObservableValue<String> call(CellDataFeatures<Movie, String> movie) {
						return new SimpleStringProperty(
								String.valueOf(movie.getValue().getRating().getAverageRating()));
					}
				});

		TableColumn<Movie, String> picColumn = new TableColumn<>("Picture");
		picColumn.setMinWidth(45);
		picColumn.setCellFactory(col -> {
			Button editButton = new Button("Preview");
			TableCell<Movie, String> cell = new TableCell<Movie, String>() {

				@Override
				public void updateItem(String picUrl, boolean empty) {
					super.updateItem(picUrl, empty);
					if (empty) {
						setGraphic(null);
					} else {
						setGraphic(editButton);
					}
				}
			};

			editButton.setOnAction(
					e -> Picture.viewPic(primaryStage, table.getSelectionModel().getSelectedItem(), scene2));

			return cell;
		});

		TableColumn<Movie, String> trailerColumn = new TableColumn<>("Trailer");
		trailerColumn.setMinWidth(117);
		trailerColumn.setCellFactory(col -> {
			Button edit1Button = new Button("Watch Trailer");
			TableCell<Movie, String> cell = new TableCell<Movie, String>() {

				@Override
				public void updateItem(String picUrl, boolean empty) {
					super.updateItem(picUrl, empty);
					if (empty) {
						setGraphic(null);
					} else {
						setGraphic(edit1Button);
					}
				}
			};

			edit1Button.setOnAction(
					e -> Trailer.viewTrailer(primaryStage, table.getSelectionModel().getSelectedItem(), scene2));

			return cell;
		});

		TableColumn<Movie, String> directorColumn = new TableColumn<>("Director");
		directorColumn.setMinWidth(200);
		directorColumn.setCellValueFactory(new PropertyValueFactory<>("director"));

		TableColumn<Movie, String> actorsColumn = new TableColumn<>("Actors");
		actorsColumn.setMinWidth(200);
		actorsColumn.setCellValueFactory(new PropertyValueFactory<>("actors"));

		searchField = TextFields.createSearchField();
		searchField.setPromptText("Filter");
		searchField.textProperty().addListener(new InvalidationListener() {

			@Override
			public void invalidated(Observable o) {
				 if (searchField.textProperty().get().isEmpty()) {
	                    table.setItems(data);
	                    return;
	                }
	                ObservableList<Movie> tableItems = FXCollections.observableArrayList();
	                ObservableList<TableColumn<Movie, ?>> cols = table.getColumns();
	                for (int i = 0; i < data.size(); i++) {

	                    for (int j = 0; j < cols.size(); j++) {
	                        TableColumn col = cols.get(j);
	                        if (col.getCellData(data.get(i)) != null) {
	                            String cellValue = col.getCellData(data.get(i)).toString();
	                            cellValue = cellValue.toLowerCase();
	                            if (cellValue.contains(searchField.textProperty().get().toLowerCase())) {
	                                tableItems.add(data.get(i));
	                                break;
	                            }
	                        }
	                    }

	                }
	                table.setItems(tableItems);
			}
		});

		nameInput = new TextField();
		nameInput.setPromptText("Name");
		nameInput.setMinWidth(100);

		yearInput = new TextField();
		yearInput.setPromptText("Year");
		yearInput.setMinWidth(100);

		avarageRatingInput = new TextField();
		avarageRatingInput.setPromptText("Rating");
		avarageRatingInput.setMinWidth(100);

		urlPictureInput = new TextField();
		urlPictureInput.setPromptText("Picture");
		urlPictureInput.setMinWidth(100);
		Movie urlPic = new Movie();
		urlPic.setUrlPicture(urlPictureInput.getText());

		urlTrailerInput = new TextField();
		urlTrailerInput.setPromptText("Trailer");
		urlTrailerInput.setMinWidth(100);

		directorInput = new TextField();
		directorInput.setPromptText("Director");
		directorInput.setMinWidth(100);

		actorsInput = new TextField();
		actorsInput.setPromptText("Actors");
		actorsInput.setMinWidth(100);

		Button addButton = new Button("Add");
		addButton.setOnAction(e -> addButtonClicked());
		Button deleteButton = new Button("Delete");
		deleteButton.setOnAction(e -> deleteButtonClicked());

		// GridPane with 10px padding around edge
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(8);
		grid.setHgap(10);

		VBox vb = new VBox();
		vb.setPadding(new Insets(10, 0, 0, 10));
		vb.setSpacing(10);

		GridPane grid1 = new GridPane();
		grid1.setPadding(new Insets(20, 20, 20, 20));
		grid1.setAlignment(Pos.CENTER);
		grid1.setVgap(8);
		grid1.setHgap(10);
		HBox hBox = new HBox();
		hBox.setPadding(new Insets(10, 10, 10, 10));
		hBox.setSpacing(10);

		table = new TableView<>();
		table.setPrefSize(1850, 900);
		
		table.setItems(getMovie());
		
        data = getMovie();
        table.setItems(FXCollections.observableArrayList(data));
		table.getColumns().addAll(nameColumn, yearColumn, avarageRatingColumn, picColumn, trailerColumn, directorColumn,
				actorsColumn);

		VBox vBox = new VBox();
		vBox.getChildren().addAll(table, hBox);

		Scene scene = new Scene(grid, 1850, 900);
		scene1 = new Scene(grid1, 1850, 900);
		scene2 = new Scene(vBox, 1850, 900);
		window.setScene(scene);

		Button logOut = new Button("Logout");
		logOut.setOnAction(e -> primaryStage.setScene(scene));
		// Name Label - constrains use (child, column, row)
		Label nameLabel = new Label("Username:");
		nameLabel.setId("bold-label");
		GridPane.setConstraints(nameLabel, 0, 0);

		// Name Input
		TextField userName = new TextField();
		userName.setPromptText("username");
		GridPane.setConstraints(userName, 1, 0);

		// Password Label
		Label passLabel = new Label("Password:");

		GridPane.setConstraints(passLabel, 0, 1);
		final PasswordField passwordInput = new PasswordField();
		passwordInput.setPromptText("password");
		GridPane.setConstraints(passwordInput, 1, 1);

		// Login
		Button signInButton = new Button("Sign In");
		signInButton.getStyleClass().add("button-yellow");
		signInButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				String content;
				try {
					content = new String(Files.readAllBytes(Paths.get("users.txt")));
					String lines[] = content.split("\\r?\\n");
					boolean isValidUser = false;
					for (String line : lines) {
						String[] split = line.split("\\|");
						String username = split[0];
						if (userName.getText().equals(username)) {
							isValidUser = true;
						}
					}
					if (!isValidUser) {
						Alert alert1 = new Alert(Alert.AlertType.ERROR, "You entered wrong username or password",
								ButtonType.OK);
						alert1.showAndWait();
					} else {
						if (userName.getText().equals("admin") && passwordInput.getText().equals("admin")) {
							primaryStage.setScene(scene2);
							addButton.setDisable(false);
							deleteButton.setDisable(false);
							nameInput.setDisable(false);
							yearInput.setDisable(false);
							avarageRatingInput.setDisable(false);
							urlPictureInput.setDisable(false);
							urlTrailerInput.setDisable(false);
							directorInput.setDisable(false);
							actorsInput.setDisable(false);
						} else {
							addButton.setDisable(false);
							deleteButton.setDisable(true);
							nameInput.setDisable(true);
							yearInput.setDisable(true);
							avarageRatingInput.setDisable(false);
							urlPictureInput.setDisable(true);
							urlTrailerInput.setDisable(true);
							directorInput.setDisable(true);
							actorsInput.setDisable(true);
							primaryStage.setScene(scene2);
						}

					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				passwordInput.clear();
			}
		});

		GridPane.setConstraints(signInButton, 1, 2);

		// Create Acc
		Button createAcc = new Button("Create your IMDb account");
		Button createNewAcc = new Button("Create a New Account");
		createAcc.getStyleClass().add("button-createAcc");
		createNewAcc.setOnAction(e -> primaryStage.setScene(scene1));
		createAcc.setOnAction(e -> primaryStage.setScene(scene2));
		GridPane.setConstraints(createNewAcc, 1, 3);
		GridPane.setConstraints(createAcc, 1, 4);

		Label yourName = new Label("Your name");
		GridPane.setConstraints(yourName, 0, 0);

		TextField yourNameInput = new TextField();
		GridPane.setConstraints(yourNameInput, 1, 0);

		Label email = new Label("Email");
		GridPane.setConstraints(email, 0, 1);

		TextField emailInput = new TextField();
		GridPane.setConstraints(emailInput, 1, 1);

		Label createPassLabel = new Label("Password");
		GridPane.setConstraints(createPassLabel, 0, 2);

		final PasswordField createPassInput = new PasswordField();
		createPassInput.setPromptText("at least 6 characters");
		GridPane.setConstraints(createPassInput, 1, 2);

		Label recreatePassLabel = new Label("Re-enter password");
		GridPane.setConstraints(recreatePassLabel, 0, 3);

		final PasswordField recreatePassInput = new PasswordField();
		GridPane.setConstraints(recreatePassInput, 1, 3);

		createAcc.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {

				if (yourNameInput.getText().equals("admin")) {
					Alert alert = new Alert(AlertType.ERROR, "This username is already used!", ButtonType.OK);
					alert.showAndWait();
				} else if (emailInput.getText().equals("admin@abv.bg")) {
					Alert alert = new Alert(AlertType.ERROR, "This email address is already used!", ButtonType.OK);
					alert.showAndWait();
				} else if (!createPassInput.getText().equals(recreatePassInput.getText())) {
					Alert alert = new Alert(AlertType.ERROR, "The passwords are not similar!", ButtonType.OK);
					alert.showAndWait();
					createPassInput.clear();
					recreatePassInput.clear();
				} else if (createPassInput.getText().length() < 6 && createPassInput.getText().length() > 0) {
					Alert alert = new Alert(AlertType.ERROR, "Your password is weak!", ButtonType.OK);
					alert.showAndWait();
				} else if (yourNameInput.getText().length() == 0 || emailInput.getText().length() == 0
						|| createPassInput.getText().length() == 0) {
					Alert alert = new Alert(AlertType.ERROR, "Please fill all the fields", ButtonType.OK);
					alert.showAndWait();
				} else {

					try {
						String content = new String(Files.readAllBytes(Paths.get("users.txt")));
						PrintStream stream = new PrintStream("users.txt");
						String lines[] = content.split("\\r?\\n");
						boolean isValidUser2 = false;
						for (String line : lines) {
							String[] split = line.split("\\|");
							String username = split[0];
							if (yourNameInput.getText().equals(username)) {
								isValidUser2 = true;
							}
						}
						if (isValidUser2) {
							Alert alert = new Alert(AlertType.ERROR, "This username is already used!", ButtonType.OK);
							alert.showAndWait();
							primaryStage.setScene(scene1);
							String updatedString = content;
							stream.print(updatedString);
							stream.close();
							yourNameInput.clear();
						} else {
							String updatedString = content + System.lineSeparator() + yourNameInput.getText() + "|"
									+ createPassInput.getText();

							stream.print(updatedString);
							stream.close();
							primaryStage.setScene(scene2);
						}

					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();

					}

				}
			}
		});

		// Add everything to grid
		grid.getChildren().addAll(nameLabel, userName, passLabel, passwordInput, signInButton, createNewAcc);
		grid1.getChildren().addAll(yourName, yourNameInput, email, emailInput, createPassLabel, createPassInput,
				recreatePassLabel, recreatePassInput, createAcc);
		hBox.getChildren().addAll(nameInput, yearInput, avarageRatingInput, urlPictureInput, urlTrailerInput,
				directorInput, actorsInput, searchField, deleteButton, addButton, logOut);
		scene.getStylesheets().add("CSS.css");

		window.show();

	}

	public void addButtonClicked() {
		Movie movie = new Movie();
		if (nameInput.getText().length() > 0 && yearInput.getText().length() > 0
				&& avarageRatingInput.getText().length() > 0 && urlPictureInput.getText().length() > 0
				&& urlTrailerInput.getText().length() > 0 && directorInput.getText().length() > 0
				&& actorsInput.getText().length() > 0) {
			movie.setName(nameInput.getText());
			movie.setYear(Integer.parseInt(yearInput.getText()));
			Rating rating = new Rating(Double.parseDouble(avarageRatingInput.getText()));
			movie.setRating(rating);
			movie.setUrlPicture(urlPictureInput.getText());
			movie.setUrlTrailer(urlTrailerInput.getText());
			movie.setDirector(directorInput.getText());
			String[] actors = actorsInput.getText().split(",");
			HashSet<String> mySet = new HashSet<String>(Arrays.asList(actors));
			movie.setActors(mySet);
			try {
				String content = new String(Files.readAllBytes(Paths.get("movies.txt")));
				PrintStream stream = new PrintStream("movies.txt");
				String updatedString = content + System.lineSeparator() + nameInput.getText() + "|"
						+ yearInput.getText() + "|" + avarageRatingInput.getText() + "|" + urlPictureInput.getText()
						+ "|" + urlTrailerInput.getText() + "|" + directorInput.getText() + "|" + actorsInput.getText();
				stream.print(updatedString);
				stream.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
			table.getItems().add(movie);

			nameInput.clear();
			yearInput.clear();
			avarageRatingInput.clear();
			urlPictureInput.clear();
			urlTrailerInput.clear();
			directorInput.clear();
			actorsInput.clear();
		}
	}

	// Delete button clicked
	public void deleteButtonClicked() {
		ObservableList<Movie> movieSelected, allMovies;
		allMovies = table.getItems();
		movieSelected = table.getSelectionModel().getSelectedItems();

		for (Movie selectedMovie : movieSelected) {
			allMovies.remove(selectedMovie);
		}
	}

	public ObservableList<Movie> getMovie() {
		ObservableList<Movie> movies = FXCollections.observableArrayList();
		try {
			String content1 = new String(Files.readAllBytes(Paths.get("movies.txt")));
			String lines1[] = content1.split("\\r?\\n");
			for (String line1 : lines1) {
				String[] split1 = line1.split("\\|");
				String movieTitle = split1[0];
				String movieYear = split1[1];
				String movieRating = split1[2];
				String moviePicture = split1[3];
				String movieTrailer = split1[4];
				String movieDirector = split1[5];
				String movieActor = split1[6];
				Movie movie = new Movie();
				movie.setName(movieTitle);
				Rating rating = new Rating(Double.parseDouble(movieRating));
				movie.setRating(rating);
				movie.setYear(Integer.parseInt(movieYear));
				movie.setUrlPicture(moviePicture);
				movie.setUrlTrailer(movieTrailer);
				movie.setDirector(movieDirector);
				String[] actors = movieActor.split(",");
				HashSet<String> mySet = new HashSet<String>(Arrays.asList(actors));
				movie.setActors(mySet);
				movies.add(movie);

			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return movies;
	}

}
