package Bai1;

import java.util.Stack;

public class MedicalRecordHistory {
    Stack<EditAction>history=new Stack<>();
    void addEdit(EditAction action){
        history.push(action);
    }
    public EditAction undoEdit() {
        if (history.isEmpty()) {
            return null;
        }
        return history.pop();
    }
    public EditAction getLatestEdit() {
        if (history.isEmpty()) {
            return null;
        }
        return history.peek();
    }
    public boolean isEmpty() {
        return history.isEmpty();
    }


    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Không có lịch sử chỉnh sửa.");
            return;
        }
        for (EditAction action : history) {
            System.out.println(action);
        }
    }
}
