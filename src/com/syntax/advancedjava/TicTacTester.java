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

		String whoIsFirst;
		Scanner scan = new Scanner(System.in);
		System.out.println("Who is going first: player or computer?");
		whoIsFirst = scan.next();
		if (whoIsFirst.equalsIgnoreCase("player")) {

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

			// board.winnerCheck(gameBoard);

			board.playersTurnMethod(gameBoard);

			board.printGameBoard(gameBoard);

		} while (board.winnerCheck(gameBoard));

	} else if (whoIsFirst.equalsIgnoreCase("computer")){
		do {
			
			board.printGameBoard(gameBoard);

			if (!board.isGameBoardFull(gameBoard)) {
				break;
			}

			board.computerTurnMethod(gameBoard);

			board.printGameBoard(gameBoard);

			if (!board.winnerCheck(gameBoard)) {
				break;
			}

			// board.winnerCheck(gameBoard);

			board.playersTurnMethod(gameBoard);

			board.printGameBoard(gameBoard);

		} while (board.winnerCheck(gameBoard));
		
	} else {
		System.out.println("Wrong input of first player");
		
	}
	}
}
