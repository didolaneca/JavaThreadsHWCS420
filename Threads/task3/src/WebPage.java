/* TODO
Imports will be filling up as you need them. */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WebPage {
    public List<String> dom; // this actually has the html document model.

    public WebPage(){
        dom = new LinkedList<>(); /* TODO
Initialize this to some kind of List */;
    }

    public void addTitle(String title){
        StringBuffer stringBuffer = new StringBuffer()
                .append("<h1>")
                .append(title)
                .append("</h1>");
        this.dom.add(stringBuffer.toString());
        /* TODO 
Add a title to the DOM*/
    }

    /* TODO 
implement addParagraph that receives a String and puts it in the dom 
surrounded by <p> and </p>*/
    public void addParagraph(String paragraph){
        StringBuffer stringBuffer = new StringBuffer()
                .append("<p>")
                .append(paragraph)
                .append("</p>");
        this.dom.add(stringBuffer.toString());
    }

    public String toString(){
        String html = "<html>\n<head>\n</head>\n<body>";
        /* TODO
Loop through the elemments of the dom and append them to html */
        StringBuffer stringBuffer = new StringBuffer(html);
        for (String el : dom) {
            stringBuffer.append(el);
        }
        return stringBuffer
                .append("</body>\n</html>")
                .toString();
    }

    public void save(String filename) {
        /* TODO 
Save a string representation of this webpage to the filename provided.*/
        File file = new File(filename);
        try(FileWriter fileWriter = new FileWriter(file)){
            fileWriter.append(filename);
        } catch (IOException ex) {
            System.out.println("Opps : " + ex.getMessage());
        }
    }
}
