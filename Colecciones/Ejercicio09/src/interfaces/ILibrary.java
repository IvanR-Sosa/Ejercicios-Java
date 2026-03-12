package interfaces;

import java.util.HashSet;
import model.Library;

public interface ILibrary {
    Boolean lending (HashSet <Library> listBooks);
    Boolean bookReturn (HashSet <Library> listBooks);
}
