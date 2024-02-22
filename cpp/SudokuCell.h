#include <iostream>
using namespace std;

class SudokuCell {
    private:
        int value;
        bool fixed;
    
    public:
        SudokuCell() {
            this->value = 0;
            this->fixed = true;
        }

        void setValue(int number) {
            this->value = number;
        }

        void setFixed() {
            this->fixed = false;
        }

        int getValue() {
            return this->value;
        }
};