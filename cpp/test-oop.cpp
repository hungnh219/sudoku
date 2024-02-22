#include <iostream>
using namespace std;

// Định nghĩa lớp SudokuCell để đại diện cho mỗi ô trong bảng Sudoku
class SudokuCell {
private:
    int value; // Giá trị của ô Sudoku
    bool fixed; // Xác định xem ô này đã được điền sẵn hay không

public:
    // Constructor
    SudokuCell() {
        value = 0;
        fixed = false;
    }

    // Setter cho giá trị của ô Sudoku
    void setValue(int val) {
        if (!fixed) {
            value = val;
        }
    }

    // Getter cho giá trị của ô Sudoku
    int getValue() const {
        return value;
    }

    // Đánh dấu ô Sudoku là không thể thay đổi
    void setFixed() {
        fixed = true;
    }

    // Kiểm tra xem ô Sudoku có phải là ô đã được điền sẵn hay không
    bool isFixed() const {
        return fixed;
    }
};

// Định nghĩa lớp SudokuBoard để đại diện cho bảng Sudoku
class SudokuBoard {
private:
    SudokuCell cells[9][9]; // Mảng 2 chiều đại diện cho bảng Sudoku

public:
    // Phương thức để thiết lập trạng thái ban đầu của bảng Sudoku
    void initializeBoard(int initialBoard[9][9]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                cells[i][j].setValue(initialBoard[i][j]);
                if (initialBoard[i][j] != 0) {
                    cells[i][j].setFixed(); // Đánh dấu ô đã được điền sẵn
                }
            }
        }
    }

    // Phương thức để hiển thị bảng Sudoku
    void displayBoard() const {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                cout << cells[i][j].getValue() << " ";
                if ((j + 1) % 3 == 0 && j < 8) {
                    cout << "| ";
                }
            }
            cout << endl;
            if ((i + 1) % 3 == 0 && i < 8) {
                cout << "------+-------+------" << endl;
            }
        }
    }
};

int main() {
    // Một ví dụ về trạng thái ban đầu của bảng Sudoku
    int initialBoard[9][9] = {
        {5, 3, 0, 0, 7, 0, 0, 0, 0},
        {6, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 9, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 6, 0, 0, 0, 3},
        {4, 0, 0, 8, 0, 3, 0, 0, 1},
        {7, 0, 0, 0, 2, 0, 0, 0, 6},
        {0, 6, 0, 0, 0, 0, 2, 8, 0},
        {0, 0, 0, 4, 1, 9, 0, 0, 5},
        {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };

    SudokuBoard sudoku;
    sudoku.initializeBoard(initialBoard);
    sudoku.displayBoard();

    return 0;
}
