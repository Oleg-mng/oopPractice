package AppSaveAs;

import AppSaveAs.Applications.Notepad;
import AppSaveAs.Format.Doc;
import AppSaveAs.Format.Md;
import AppSaveAs.Format.Txt;

public class Program {
    public static void main(String[] args) {
        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.SaveAs("file1", new Txt());
        notes.SaveAs("file1", new Md());
        notes.SaveAs("file1", new Doc());
    }
}
