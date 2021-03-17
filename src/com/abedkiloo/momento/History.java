package com.abedkiloo.momento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> editorStates = new ArrayList<>();

    public void push(EditorState editorState) {
        this.editorStates.add(editorState);
    }

    public EditorState pop() {
        var lastIndex = this.editorStates.size() - 1;
        var lastState = this.editorStates.get(lastIndex);
        this.editorStates.remove(lastState);
        return lastState;
    }

}
