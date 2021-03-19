/* TODO
Imports will be filling up as you need them. */

public class WebPage {
    public List<String> dom; // this actually has the html document model.

    public WebPage(){
        dom = /* TODO 
Initialize this to some kind of List */;
    }

    public void addTitle(String title){
        /* TODO 
Add a title to the DOM*/
    }

    /* TODO 
implement addParagraph that receives a String and puts it in the dom 
surrounded by <p> and </p>*/
    public String toString(){
        String html = "<html>\n<head>\n</head>\n<body>";
        /* TODO
Loop through the elemments of the dom and append them to html */
        return html+"</body>\n</html>";
    }

    public void save(String filename){
        /* TODO 
Save a string representation of this webpage to the filename provided.*/
    }
}
