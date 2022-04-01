package imo.repl.models;

import java.util.*;

public class Book {
  public String Title;
  public String Author;
  public List<String> Genres;

  public Book()
  {
      Genres = new ArrayList<String>();
  }
}