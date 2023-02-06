package AppSaveAs.Interface;

import AppSaveAs.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}


