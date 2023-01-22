package datastructure;

import java.util.ArrayList;
import java.util.List;

public class MyStackClass<T>{
    private List<T> list = new ArrayList<T>();

    void push(T value){
        list.add(value);
    }

    T pop() throws MyStackException{
        if (this.list.isEmpty()){
            throw new MyStackException("The stack is empty. Push a value before popping it");
        }
        T value = this.list.get(this.list.size() -1);
        this.list.remove(this.list.size() -1);
        return value;
    }

    public long size(){
        return this.list.size();
    }

    List<T> getStackAndEmpty(){
        List<T> stack = new ArrayList<T>(this.list);
        this.list.removeAll(stack);
        return stack;
    }

    void flush(){
        this.list = new ArrayList<>();
    }

    @Override
    public String toString(){
        StringBuffer returnString = new StringBuffer();
        returnString.append("[");
       for (int i = 0; i< list.size(); i++){
            returnString.append(list.get(i));
            if (i < list.size()-1) {
                returnString.append(", ");
            }
            else{
                returnString.append("]");
            }
       }
       return returnString.toString();
    }
}

class MyStackException extends Exception{
    public MyStackException(String message) {
        super(message);
    }
}