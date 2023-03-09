//package e1.controller;
//
//import e1.controller.logics.Logics;
//import e1.model.components.board.Board;
//import e1.model.components.pawn.Pawn;
//import e1.model.elements.Pair;
//import e1.model.elements.position.CartesianPosition;
//
//import java.util.*;
//
//public class LogicsImpl implements Logics {
//
//    private final Board board;
//
//    public LogicsImpl(Board board) {
//        this.board = board;
//    }
//
//    //	@Override
////	public boolean hit(int row, int col) {
////		if (row<0 || col<0 || row >= this.size || col >= this.size) {
////			throw new IndexOutOfBoundsException();
////		}
////		// Below a compact way to express allowed moves for the knight
////		int x = row-this.knight.getX();
////		int y = col-this.knight.getY();
////		if (x!=0 && y!=0 && Math.abs(x)+Math.abs(y)==3) {
////			this.knight = new Pair<>(row,col);
////			return this.pawn.equals(this.knight);
////		}
////		return false;
////	}
////
////	@Override
////	public boolean hasKnight(int row, int col) {
////		return this.knight.equals(new Pair<>(row,col));
////	}
////
////	@Override
////	public boolean hasPawn(int row, int col) {
////		return this.pawn.equals(new Pair<>(row,col));
////	}
//
//    @Override
//    public boolean hit(Pawn pawn, CartesianPosition<Integer> position) {
//        return this.board.getPawnByPosition()
//    }
//}
