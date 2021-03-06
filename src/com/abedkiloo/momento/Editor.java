package com.abedkiloo.momento;

public class Editor {
    public String content;

    public EditorState createState() {
        return new EditorState(this.content);
    }

    public void restore(EditorState editorState) {
        this.content = editorState.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
