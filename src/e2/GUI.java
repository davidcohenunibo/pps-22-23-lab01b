package e2;

import e2.controller.Logics;
import e2.controller.LogicsImpl;
import e2.model.board.Board;
import e2.model.board.BoardImpl;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import javax.swing.event.MouseInputListener;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class GUI extends JFrame {
    
    private static final long serialVersionUID = -6218820567019985015L;
    private final Map<JButton,Pair<Integer,Integer>> buttons = new HashMap<>();
    private final Logics logics;

    private Board board;
    
    public GUI(int size, int mines) {
        this.board = new BoardImpl(size,mines);
        this.logics = new LogicsImpl(this.board);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(100*size, 100*size);
        
        JPanel panel = new JPanel(new GridLayout(size,size));
        this.getContentPane().add(BorderLayout.CENTER,panel);
        
        ActionListener onClick = (e)->{
            final JButton bt = (JButton)e.getSource();
            final Pair<Integer,Integer> pos = buttons.get(bt);
            boolean aMineWasFound = false; // call the logic here to tell it that cell at 'pos' has been seleced
            if (this.logics.isMine(pos)) {
                quitGame();
                JOptionPane.showMessageDialog(this, "You lost!!");
            } else {
                drawBoard();            	
            }
            boolean isThereVictory = false; // call the logic here to ask if there is victory
            if (/*this.logics.win()*/false){
                quitGame();
                JOptionPane.showMessageDialog(this, "You won!!");
                System.exit(0);
            }
        };

        MouseInputListener onRightClick = new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                final JButton bt = (JButton)e.getSource();
                if (bt.isEnabled()){
                    final Pair<Integer,Integer> pos = buttons.get(bt);
//                    logics.flag(pos);
                }
                drawBoard(); 
            }
        };
                
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                final JButton jb = new JButton(" ");
                jb.addActionListener(onClick);
                jb.addMouseListener(onRightClick);
                this.buttons.put(jb,new Pair<>(i,j));
                panel.add(jb);
            }
        }
        this.drawBoard();
        this.setVisible(true);
    }
    
    private void quitGame() {
        this.drawBoard();
    	for (var entry: this.buttons.entrySet()) {
            if(this.logics.isMine(entry.getValue())) {

            };
            // call the logic here
            // if this button is a mine, draw it "*"
            // disable the button
    	}
    }

    private void drawBoard() {
        for (var entry: this.buttons.entrySet()) {
            // call the logic here
//            if(this.logics.isCell(entry.getValue())) {
//                this.logics.getCellValue(entry.getValue());
//            };
            // if this button is a cell with counter, put the number
            // if this button has a flag, put the flag
    	}
    }
    
}
