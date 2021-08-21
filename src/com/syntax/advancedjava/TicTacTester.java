package com.syntax.advancedjava;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TicTacTester {

	public static void main(String[] args) {

		char gameBoard[][] = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };

		TicTacMethods board = new TicTacMethods();

		// 1) Print board using method:
		
		board.printGameBoard(gameBoard);
		
		board.playersTurnMethod(gameBoard);

		board.printGameBoard(gameBoard);

		do {
			
			if (!board.isGameBoardFull(gameBoard)) {
				break;
			}

			board.computerTurnMethod(gameBoard);

			board.printGameBoard(gameBoard);
			
			if (!board.winnerCheck(gameBoard)) {
				break;
			}
			
			//board.winnerCheck(gameBoard);
				
			board.playersTurnMethod(gameBoard);

			board.printGameBoard(gameBoard);

		} while (board.winnerCheck(gameBoard));

		}

	}


