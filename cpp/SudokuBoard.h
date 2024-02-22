#include <iostream>
#include "SudokuCell.h"
using namespace std;

class SudokuBoard {
    private:
        SudokuCell cells[9][9];

    public:
        SudokuBoard() {};

        void initSudokuBoard(int initBoard[9][9]) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    cells[i][j].setValue(initBoard[i][j]);

                    if (initBoard[i][j] != 0) {
                        cells[i][j].setFixed();
                    }
                }
            }
        };

        void displayBoard() {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    cout << cells[i][j].getValue() << " ";
                    if (j == 2 || j == 5) {
                        cout << "| ";
                    }

                    
                }
                if (i == 2 || i == 5) {
                    cout << "\n------+-------+------";
                }
                cout << endl;
            }
        };
};