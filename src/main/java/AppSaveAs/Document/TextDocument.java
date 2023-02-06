package AppSaveAs.Document;

public class TextDocument {

    StringBuilder sb;
    public TextDocument(){
        sb = new StringBuilder();
    }

    public TextDocument(String data){
        this();
        addAllText(data);
    }

    public void addAllText(String text){
        sb.append(text + "\n");
    }
    public void addAllText(String[] lines){
        for (String line : lines){
            addAllText(line);
            //sb.append(line);
        }
    }

    public String getData(){
        return sb.toString();
    }
}
