import com.google.gson.*;
import imo.repl.models.*;
import java.nio.file.*;
import java.io.*;

class Main {
  public static void main(String[] args) {
    try {
        var gson = getGson();
        var books = FetchAllBooks();
        var output = gson.toJson(books);
        System.out.println(output);
    } catch(Exception ex) {
      System.out.println(ex.toString());
    }
  }

  static Gson getGson() {
    var builder = new GsonBuilder();
    builder = builder.setPrettyPrinting();
    return builder.create();
  }

  static Book[] FetchAllBooks() throws IOException {
    var filepath = Paths.get("samples/data.json");
    var text = Files.readString(filepath);
    var gson = getGson();
    Book[] books = gson.fromJson(text, Book[].class);
    return books;    
  }
  
  /// Feature-Request: Clients want to be able to 
  ///  display the names of the Authors we support.
  ///
  static String[] GetAuthors() {
    return new String[0];
  }

  /// Feature-Request: Our support teams want to be able to
  ///  add new books we support to our data store.
  ///
  static void AddBook(/* Intentionally Blank */) {
    return;
  }

  /// Feature-Request: Clients want to be able to search for books
  ///  by a certain author.
  static Book[] GetBooksByAuthorName(/* Intentionally Blank */) {
    return new Book[0];
  }

  /// Feature-Request: Clients want to be able to search for books 
  ///  within a given genre
  static Book[] GetBooksByGenre(/* Intentionally Blank */) {
    return new Book[0];
  }
}