#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

int main() {
    int secret, guess;
    srand(time(0));
    secret = rand() % 100 + 1;

    cout << "Guess the number between 1 and 100" << endl;

    while (true) {
        cout <<"enter your guess"<<endl;
        cin >> guess;

    if (guess > secret) {
        cout << "too high, try again" << endl;

    }
    else if (guess > secret) {
        cout << "too low, try again" << endl;
    } else {
        cout << "correct! you win!" << endl;
        break;
    }
    }
    return 0;
}