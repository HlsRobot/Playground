package com.playground.wordmachine;

import java.util.ArrayList;
import java.util.List;

public class WordMachineService {

    public int wordMachine(String S) {
        List<Integer> myStack = new ArrayList<>();
        try {
            for (String command : S.split(" ")) {
                switch (command){
                    case "+":
                        this.plus(myStack);
                        break;
                    case "-":
                        this.minus(myStack);
                        break;
                    case "POP":
                        this.pop(myStack);
                        break;
                    case "DUP":
                        this.dub(myStack);
                        break;
                    default:
                        myStack.add(Integer.parseInt(command));
                }
            }
        } catch (WordMachineException | NumberFormatException e) {
            return -1;
        }
        if (myStack.size() > 0) {
            return myStack.get(myStack.size() - 1);
        } else {
            return -1;
        }
    }

    private void plus(List<Integer> stuck) throws WordMachineException {
        if (stuck.size() > 2) {
            Integer temp = stuck.get(stuck.size() - 1) + stuck.get(stuck.size() - 2);
            this.pop(stuck);
            this.pop(stuck);
            stuck.add(temp);
        } else {
            throw new WordMachineException();
        }
    }

    private void minus(List<Integer> stuck) throws WordMachineException {
        if (stuck.size() > 2) {
            Integer temp = stuck.get(stuck.size() - 1) - stuck.get(stuck.size() - 2);
            if (temp < 0 ) {
                throw new WordMachineException();
            }
            this.pop(stuck);
            this.pop(stuck);
            stuck.add(temp);
        } else {
            throw new WordMachineException();
        }
    }

    private void pop(List<Integer> stuck) throws WordMachineException {
        if (stuck.size() > 0){
            stuck.remove(stuck.size() - 1);
        } else {
            throw new WordMachineException();
        }
    }

    private void dub(List<Integer> stuck) throws WordMachineException {
        if (stuck.size() > 0){
            stuck.add(stuck.get(stuck.size() - 1));
        } else {
            throw new WordMachineException();
        }
    }
}
